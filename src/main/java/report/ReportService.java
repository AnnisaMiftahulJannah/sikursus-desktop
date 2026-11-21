package report;

import config.Database;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class ReportService {

    public static void tampilkanLaporanPeserta() {
        String reportPath = "/report/laporan_peserta.jasper";

        try (Connection conn = Database.getConnection();
             InputStream reportStream = ReportService.class.getResourceAsStream(reportPath)) {

            if (conn == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Koneksi database gagal. Pastikan MySQL/XAMPP sudah aktif dan database db_sikursus tersedia.",
                        "Error Koneksi",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            if (reportStream == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "File laporan tidak ditemukan di classpath: " + reportPath
                                + "\nPastikan laporan_peserta.jasper ada di src/main/resources/report/ lalu Clean and Build.",
                        "Error Report",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    reportStream,
                    new HashMap<>(),
                    conn
            );

            // Parameter kedua 'false' agar menutup JasperViewer tidak mematikan aplikasi utama
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Gagal menampilkan laporan: " + ex.getMessage(),
                    "Error Cetak",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}