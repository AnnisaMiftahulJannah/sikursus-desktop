package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class PendaftaranFrame extends JFrame {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_sikursus";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
    private static final String REPORT_PATH = "/report/laporan_pendaftaran.jasper";

    private final Color warnaLatar = new Color(255, 204, 221);
    private final Color warnaHeader = new Color(136, 14, 79);
    private final Color warnaCetak = new Color(216, 27, 96);
    private final Color warnaRefresh = new Color(211, 47, 47);

    private JTable tblPendaftaran;
    private DefaultTableModel tableModel;
    private JButton btnRefresh;
    private JButton btnCetakTerpilih;

    public PendaftaranFrame() {
        initComponents();
        loadDataPendaftaran();
    }

    private void initComponents() {
        setTitle("SIKURSUS Desktop - Data Pendaftaran");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panelUtama = new JPanel(new BorderLayout());
        panelUtama.setBackground(warnaLatar);

        JPanel panelHeader = new JPanel(new BorderLayout());
        panelHeader.setBackground(warnaHeader);
        panelHeader.setPreferredSize(new Dimension(100, 68));

        JLabel lblJudul = new JLabel("Data Pendaftaran Kursus", SwingConstants.CENTER);
        lblJudul.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblJudul.setForeground(Color.WHITE);
        panelHeader.add(lblJudul, BorderLayout.CENTER);

        tableModel = new DefaultTableModel(
                new Object[]{"ID", "Tanggal Daftar", "Status", "NIM", "Peserta", "Kelas", "Kursus", "Biaya"},
                0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tblPendaftaran = new JTable(tableModel);
        tblPendaftaran.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblPendaftaran.setRowHeight(24);
        tblPendaftaran.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        tblPendaftaran.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));

        JScrollPane scrollPane = new JScrollPane(tblPendaftaran);
        scrollPane.setPreferredSize(new Dimension(880, 340));

        JPanel panelKonten = new JPanel(new BorderLayout(0, 16));
        panelKonten.setBackground(warnaLatar);
        panelKonten.setBorder(BorderFactory.createEmptyBorder(20, 24, 20, 24));
        panelKonten.add(scrollPane, BorderLayout.CENTER);

        btnCetakTerpilih = new JButton("Cetak Terpilih");
        btnCetakTerpilih.setBackground(warnaCetak);
        btnCetakTerpilih.setForeground(Color.WHITE);
        btnCetakTerpilih.setFocusPainted(false);
        btnCetakTerpilih.setPreferredSize(new Dimension(145, 38));
        btnCetakTerpilih.addActionListener(this::btnCetakTerpilihActionPerformed);

        btnRefresh = new JButton("Refresh");
        btnRefresh.setBackground(warnaRefresh);
        btnRefresh.setForeground(Color.WHITE);
        btnRefresh.setFocusPainted(false);
        btnRefresh.setPreferredSize(new Dimension(120, 38));
        btnRefresh.addActionListener(evt -> loadDataPendaftaran());

        JPanel panelTombol = new JPanel(new FlowLayout(FlowLayout.CENTER, 18, 0));
        panelTombol.setBackground(warnaLatar);
        panelTombol.add(btnCetakTerpilih);
        panelTombol.add(btnRefresh);

        panelKonten.add(panelTombol, BorderLayout.SOUTH);

        panelUtama.add(panelHeader, BorderLayout.NORTH);
        panelUtama.add(panelKonten, BorderLayout.CENTER);
        setContentPane(panelUtama);

        pack();
        setMinimumSize(new Dimension(780, 480));
        setLocationRelativeTo(null);
    }

    private void loadDataPendaftaran() {
        tableModel.setRowCount(0);

        String sql = "SELECT p.id_pendaftaran, p.tanggal_daftar, p.status, "
                   + "ps.nim, ps.nama AS nama_peserta, kls.nama_kelas, "
                   + "krs.nama_kursus, krs.biaya "
                   + "FROM pendaftaran p "
                   + "INNER JOIN peserta ps ON p.id_peserta = ps.id_peserta "
                   + "INNER JOIN kelas kls ON p.id_kelas = kls.id_kelas "
                   + "INNER JOIN kursus krs ON kls.id_kursus = krs.id_kursus "
                   + "ORDER BY p.id_pendaftaran";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                tableModel.addRow(new Object[]{
                    rs.getInt("id_pendaftaran"),
                    rs.getDate("tanggal_daftar"),
                    rs.getString("status"),
                    rs.getString("nim"),
                    rs.getString("nama_peserta"),
                    rs.getString("nama_kelas"),
                    rs.getString("nama_kursus"),
                    rs.getBigDecimal("biaya")
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                    "Gagal memuat data pendaftaran: " + ex.getMessage(),
                    "Error Database",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnCetakTerpilihActionPerformed(java.awt.event.ActionEvent evt) {
        int row = tblPendaftaran.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this,
                    "Pilih satu data pendaftaran terlebih dahulu.");
            return;
        }

        int idPendaftaran = Integer.parseInt(
                tblPendaftaran.getValueAt(row, 0).toString()
        );
        System.out.println("ID terpilih: " + idPendaftaran);

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             InputStream reportStream = getClass().getResourceAsStream(REPORT_PATH)) {

            if (reportStream == null) {
                JOptionPane.showMessageDialog(this,
                        "File " + REPORT_PATH + " tidak ditemukan di resources.",
                        "Error Report",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Map<String, Object> params = new HashMap<>();
            params.put("P_ID_PENDAFTARAN", idPendaftaran);

            JasperPrint jasperPrint = JasperFillManager.fillReport(reportStream, params, conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Gagal menampilkan laporan: " + ex.getMessage(),
                    "Error Cetak",
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PendaftaranFrame().setVisible(true));
    }
}