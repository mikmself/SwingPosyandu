package Form.Master;

import Form.Bayi;
import Form.Bidan;
import Form.Kader;
import Form.Pelayanan;

public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBayi = new javax.swing.JButton();
        btnBidan = new javax.swing.JButton();
        btnKader = new javax.swing.JButton();
        btnPelayanan = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnManual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("APLIKASI POSYANDU AUDY");

        btnBayi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBayi.setText("DATA BAYI");
        btnBayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayiActionPerformed(evt);
            }
        });

        btnBidan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBidan.setText("DATA BIDAN");
        btnBidan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBidanActionPerformed(evt);
            }
        });

        btnKader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKader.setText("DATA KADER");
        btnKader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaderActionPerformed(evt);
            }
        });

        btnPelayanan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPelayanan.setText("DATA PELAYANAN");
        btnPelayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelayananActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProfile.setText("PROFILE TEAM");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnAbout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAbout.setText("ABOUT");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        btnManual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManual.setText("MANUAL BOOK");
        btnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 673, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBayi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBidan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKader, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPelayanan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAbout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManual, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnBayi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBidan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKader, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPelayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManual, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayiActionPerformed
        this.dispose();
        Bayi bayi = new Bayi();
        bayi.setVisible(true);
    }//GEN-LAST:event_btnBayiActionPerformed

    private void btnBidanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBidanActionPerformed
        this.dispose();
        Bidan bidan = new Bidan();
        bidan.setVisible(true);
    }//GEN-LAST:event_btnBidanActionPerformed

    private void btnKaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaderActionPerformed
        this.dispose();
        Kader kader = new Kader();
        kader.setVisible(true);
    }//GEN-LAST:event_btnKaderActionPerformed

    private void btnPelayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelayananActionPerformed
        this.dispose();
        Pelayanan pelayanan = new Pelayanan();
        pelayanan.setVisible(true);
    }//GEN-LAST:event_btnPelayananActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        this.dispose();
        About about = new About();
        about.setVisible(true);
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        this.dispose();
        Profile profile = new Profile();
        profile.setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualActionPerformed
        this.dispose();
        Manual manual = new Manual();
        manual.setVisible(true);
    }//GEN-LAST:event_btnManualActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnBayi;
    private javax.swing.JButton btnBidan;
    private javax.swing.JButton btnKader;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManual;
    private javax.swing.JButton btnPelayanan;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
