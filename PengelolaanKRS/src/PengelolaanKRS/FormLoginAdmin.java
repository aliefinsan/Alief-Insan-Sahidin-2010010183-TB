/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PengelolaanKRS;

import javax.swing.JOptionPane;

/**
 *
 * @author alief
 */
public class FormLoginAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Form3
     */
    public FormLoginAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelLoginAdmin = new javax.swing.JPanel();
        LabelUsernameAdmin = new javax.swing.JLabel();
        LabelPasswordAdmin = new javax.swing.JLabel();
        TextFieldUsernameAdmin = new javax.swing.JTextField();
        PasswordFieldPasswordAdmin = new javax.swing.JPasswordField();
        ButtonMasukAdmin = new javax.swing.JButton();
        ButtonKembaliAdmin = new javax.swing.JButton();
        PanelGambarLoginAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Admin");
        setBackground(new java.awt.Color(51, 255, 51));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        PanelLoginAdmin.setBackground(new java.awt.Color(102, 255, 255));
        PanelLoginAdmin.setPreferredSize(new java.awt.Dimension(292, 348));
        PanelLoginAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelUsernameAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LabelUsernameAdmin.setText("Username");
        PanelLoginAdmin.add(LabelUsernameAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 243, -1, -1));

        LabelPasswordAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LabelPasswordAdmin.setText("Password");
        PanelLoginAdmin.add(LabelPasswordAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 274, -1, -1));
        PanelLoginAdmin.add(TextFieldUsernameAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 175, -1));
        PanelLoginAdmin.add(PasswordFieldPasswordAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 271, 175, -1));

        ButtonMasukAdmin.setBackground(new java.awt.Color(51, 255, 51));
        ButtonMasukAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonMasukAdmin.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMasukAdmin.setText("Masuk");
        ButtonMasukAdmin.setBorder(null);
        ButtonMasukAdmin.setMargin(new java.awt.Insets(2, 3, 2, 3));
        ButtonMasukAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMasukAdminActionPerformed(evt);
            }
        });
        PanelLoginAdmin.add(ButtonMasukAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 309, 60, 25));

        ButtonKembaliAdmin.setBackground(new java.awt.Color(255, 255, 0));
        ButtonKembaliAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonKembaliAdmin.setForeground(new java.awt.Color(51, 51, 51));
        ButtonKembaliAdmin.setText("Kembali");
        ButtonKembaliAdmin.setBorder(null);
        ButtonKembaliAdmin.setMargin(new java.awt.Insets(2, 3, 2, 3));
        ButtonKembaliAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKembaliAdminActionPerformed(evt);
            }
        });
        PanelLoginAdmin.add(ButtonKembaliAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 309, 70, 25));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarDanIcon/adminOk.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout PanelGambarLoginAdminLayout = new javax.swing.GroupLayout(PanelGambarLoginAdmin);
        PanelGambarLoginAdmin.setLayout(PanelGambarLoginAdminLayout);
        PanelGambarLoginAdminLayout.setHorizontalGroup(
            PanelGambarLoginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        PanelGambarLoginAdminLayout.setVerticalGroup(
            PanelGambarLoginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, Short.MAX_VALUE)
        );

        PanelLoginAdmin.add(PanelGambarLoginAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 292, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("LOGIN ADMIN");
        PanelLoginAdmin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 110, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(PanelLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLoginAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonKembaliAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKembaliAdminActionPerformed
    FormMenu formMenu = new FormMenu();
        formMenu.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonKembaliAdminActionPerformed

    private void ButtonMasukAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMasukAdminActionPerformed
    if (TextFieldUsernameAdmin.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Username Jangan Lupa Di isi ya!");
        TextFieldUsernameAdmin.requestFocus();
    }
    else if (PasswordFieldPasswordAdmin.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Password Jangan Lupa Di isi ya!");
        PasswordFieldPasswordAdmin.requestFocus(); }
        
        else if (TextFieldUsernameAdmin.getText().contains("admin")&& PasswordFieldPasswordAdmin.getText().contains("12345")){
                new FormHalamanUtamaAdmin().show();
                this.dispose();
                }
                else{
                JOptionPane.showMessageDialog(null,"Username atau Password tidak sesuai");
                }
        
        /** FormHalamanUtamaAdmin formHalamanUtamaAdmin = new FormHalamanUtamaAdmin();
    formHalamanUtamaAdmin.setVisible(true);
    this.dispose();**/         // TODO add your handling code here:
    }//GEN-LAST:event_ButtonMasukAdminActionPerformed

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
            java.util.logging.Logger.getLogger(FormLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonKembaliAdmin;
    private javax.swing.JButton ButtonMasukAdmin;
    private javax.swing.JLabel LabelPasswordAdmin;
    private javax.swing.JLabel LabelUsernameAdmin;
    private javax.swing.JPanel PanelGambarLoginAdmin;
    private javax.swing.JPanel PanelLoginAdmin;
    private javax.swing.JPasswordField PasswordFieldPasswordAdmin;
    private javax.swing.JTextField TextFieldUsernameAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}