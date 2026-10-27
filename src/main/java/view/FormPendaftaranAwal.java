/*
 * SIKURSUS Desktop - Form Pendaftaran Kursus
 * Lanjutan Praktikum PBO Pertemuan 4.
 * Layout responsif untuk Apache NetBeans 8.2 / Java Swing.
 */
package view;

public class FormPendaftaranAwal extends javax.swing.JFrame {

    public FormPendaftaranAwal() {
        initComponents();
    }
public double hitungTotal() {
    double biaya = Double.parseDouble(txtBiaya.getText());
    int jumlah = Integer.parseInt(txtDiskon.getText());
    return biaya * jumlah;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnproses = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        cmbKursus = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtKodeKursus = new javax.swing.JTextField();
        txtBiaya = new javax.swing.JTextField();
        txtDiskon = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbLevel = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Diskon %");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText(" Nama Kursus");

        btnproses.setBackground(new java.awt.Color(0, 0, 204));
        btnproses.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnproses.setForeground(new java.awt.Color(255, 255, 255));
        btnproses.setText("Proses");
        btnproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprosesActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(255, 0, 0));
        btnreset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        cmbKursus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbKursus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "Data Science", "UI/UX" }));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Kode Kursus");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Biaya Kursus");

        txtKodeKursus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtKodeKursus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeKursusActionPerformed(evt);
            }
        });

        txtBiaya.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBiayaActionPerformed(evt);
            }
        });

        txtDiskon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Form Pendaftaran");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(26, 26, 26))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Level");

        cmbLevel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BASIC", "INTERMEDIATE" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtKodeKursus, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel6))
                                        .addGap(7, 7, 7))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(173, 173, 173)
                                        .addComponent(cmbKursus, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(172, 172, 172)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(btnproses)
                        .addGap(108, 108, 108)
                        .addComponent(btnreset)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtKodeKursus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbKursus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnproses)
                    .addComponent(btnreset))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiayaActionPerformed
                                        
    try {
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Biaya dan Jumlah harus berupa angka!",
            "Input Tidak Valid",
            javax.swing.JOptionPane.ERROR_MESSAGE
        );                 
    }//GEN-LAST:event_txtBiayaActionPerformed
    }
    private void btnprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprosesActionPerformed
      try {
        String kodeKursus = txtKodeKursus.getText();
        String namaKursus = cmbKursus.getSelectedItem().toString();
        double biaya = Double.parseDouble(txtBiaya.getText());
        double diskon = Double.parseDouble(txtDiskon.getText());   
        double nominalDiskon = biaya * (diskon / 100);
        double totalBiaya = biaya - nominalDiskon;
       
        String hasil = "HASIL PENDAFTARAN KURSUS\n"
                     + "============================\n"
                     + "Kode Kursus  : " + kodeKursus + "\n"
                     + "Nama Kursus  : " + namaKursus + "\n"
                     + "Level: INTERMEDIATE\n"
                     + "Biaya Kursus : Rp " + biaya + "\n"
                     + "Diskon (%)   : " + diskon + "%\n"
                     + "Biaya akhir  : Rp " + totalBiaya;

        javax.swing.JOptionPane.showMessageDialog(this, hasil, "Hasil Pendaftaran Kursus", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Biaya dan Diskon harus diisi dengan angka!",
            "Input Tidak Valid",
            javax.swing.JOptionPane.ERROR_MESSAGE
        );
    }//GEN-LAST:event_btnprosesActionPerformed
    }
    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
    txtKodeKursus.setText("");
    txtBiaya.setText("");
    txtDiskon.setText("");
    cmbKursus.setSelectedIndex(0);
    txtKodeKursus.requestFocus();
    }//GEN-LAST:event_btnresetActionPerformed

    private void txtKodeKursusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeKursusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeKursusActionPerformed

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiskonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPendaftaranAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnproses;
    private javax.swing.JButton btnreset;
    private javax.swing.JComboBox<String> cmbKursus;
    private javax.swing.JComboBox<String> cmbLevel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtKodeKursus;
    // End of variables declaration//GEN-END:variables

    private int hitungtotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
