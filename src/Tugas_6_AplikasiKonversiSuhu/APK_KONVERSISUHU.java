/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas_6_AplikasiKonversiSuhu;

/**
 *
 * @author rizan
 */
public class APK_KONVERSISUHU extends javax.swing.JFrame {

    /**
     * Creates new form APK_KONVERSISUHU
     */
    public APK_KONVERSISUHU() {
        initComponents();
        reset();
    }

    void reset() {
        tf_SuhuAsal.setText("");
        lb_hasil.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tf_SuhuAsal = new javax.swing.JTextField();
        cb_SekalaAsal = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        cb_SekalaTujuan = new javax.swing.JComboBox<>();
        bt_Konversi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lb_hasil = new javax.swing.JLabel();
        bt_Close = new javax.swing.JButton();
        bt_Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APLIKASI KONVERSI SUHU");

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KONVERSI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        cb_SekalaAsal.setBackground(new java.awt.Color(51, 51, 255));
        cb_SekalaAsal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cb_SekalaAsal.setForeground(new java.awt.Color(255, 255, 255));
        cb_SekalaAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Farenheit" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_SuhuAsal)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cb_SekalaAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tf_SuhuAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_SekalaAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KONVERSI KE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        cb_SekalaTujuan.setBackground(new java.awt.Color(51, 255, 51));
        cb_SekalaTujuan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cb_SekalaTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Farenheit" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_SekalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cb_SekalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bt_Konversi.setBackground(new java.awt.Color(0, 0, 255));
        bt_Konversi.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        bt_Konversi.setForeground(new java.awt.Color(255, 255, 255));
        bt_Konversi.setText("KONVERSI");
        bt_Konversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_KonversiActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        lb_hasil.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lb_hasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_hasil, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );

        bt_Close.setBackground(new java.awt.Color(0, 0, 204));
        bt_Close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_Close.setForeground(new java.awt.Color(255, 255, 255));
        bt_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_6_AplikasiKonversiSuhu/close (1).png"))); // NOI18N
        bt_Close.setText("CLOSE");
        bt_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CloseActionPerformed(evt);
            }
        });

        bt_Reset.setBackground(new java.awt.Color(255, 0, 0));
        bt_Reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_Reset.setForeground(new java.awt.Color(255, 255, 255));
        bt_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_6_AplikasiKonversiSuhu/refresh-action2.png"))); // NOI18N
        bt_Reset.setText("RESET");
        bt_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_Konversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_Reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_Close)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_Konversi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Reset)
                    .addComponent(bt_Close))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ResetActionPerformed
        reset();
    }//GEN-LAST:event_bt_ResetActionPerformed

    private void bt_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CloseActionPerformed
        dispose();
    }//GEN-LAST:event_bt_CloseActionPerformed

    private void bt_KonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_KonversiActionPerformed
        double SuhuAsal = Double.parseDouble(tf_SuhuAsal.getText());
        String SekalaAsal = cb_SekalaAsal.getSelectedItem().toString();
        String SekalaTujuan = cb_SekalaTujuan.getSelectedItem().toString();
        double Hasil = 0;
        if(SekalaAsal.equals("Celcius")&&SekalaTujuan.equals("Celcius")){
            Hasil = SuhuAsal;
        }else if(SekalaAsal.equals("Celcius")&&SekalaTujuan.equals("Kelvin")){
            Hasil = SuhuAsal + 273.15;
        }else if(SekalaAsal.equals("Celcius")&&SekalaTujuan.equals("Farenheit")){
            Hasil = (SuhuAsal * 1.8) + 32;
        }else if(SekalaAsal.equals("Kelvin")&&SekalaTujuan.equals("Celcius")){
            Hasil = SuhuAsal - 273.15;
        }else if(SekalaAsal.equals("Kelvin")&&SekalaTujuan.equals("Kelvin")){
            Hasil = SuhuAsal;
        }else if(SekalaAsal.equals("Kelvin")&&SekalaTujuan.equals("Farenheit")){
            Hasil = (SuhuAsal - 273.15) * 1.8 + 32;
        }else if(SekalaAsal.equals("Farenheit")&&SekalaTujuan.equals("Celcius  ")){
            Hasil = SuhuAsal - 32;
        }else if(SekalaAsal.equals("Farenheit")&&SekalaTujuan.equals("Kelvin")){
            Hasil = (SuhuAsal - 32) * 5/9 + 273.15;
        }else if(SekalaAsal.equals("Farenheit")&&SekalaTujuan.equals("Farenheit")){
            Hasil = SuhuAsal;
        }
        String Sekala = SekalaTujuan.substring(0,1);
        lb_hasil.setText(String.format("%.2f",Hasil) + "\u00B0" + Sekala);
    }//GEN-LAST:event_bt_KonversiActionPerformed

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
            java.util.logging.Logger.getLogger(APK_KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APK_KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APK_KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APK_KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APK_KONVERSISUHU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Close;
    private javax.swing.JButton bt_Konversi;
    private javax.swing.JButton bt_Reset;
    private javax.swing.JComboBox<String> cb_SekalaAsal;
    private javax.swing.JComboBox<String> cb_SekalaTujuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_hasil;
    private javax.swing.JTextField tf_SuhuAsal;
    // End of variables declaration//GEN-END:variables
}
