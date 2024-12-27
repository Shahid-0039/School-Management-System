package MAIN_PROJECT;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Login_page extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public Login_page() {
        initComponents();
        try {
              con = DriverManager.getConnection("jdbc:mysql://localhost/school_info", "root", "");
            if (con == null) {
                JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_page.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Failed to connect to the database: " + ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtf_username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtf_password = new javax.swing.JPasswordField();
        chckbox_password = new javax.swing.JCheckBox();
        btn_login = new javax.swing.JToggleButton();
        btn_signup = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        btn_forget = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Page");
        setMinimumSize(new java.awt.Dimension(541, 526));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Forget.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 0));
        jLabel16.setText("LOGIN FORM");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel16)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel16)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        txtf_username.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtf_username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtf_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 280, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("User Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 30));

        txtf_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtf_password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txtf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 280, 30));

        chckbox_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chckbox_password.setText("Show Password");
        chckbox_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.yellow, java.awt.Color.darkGray, java.awt.Color.blue, java.awt.Color.magenta));
        chckbox_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckbox_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(chckbox_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 140, 30));

        btn_login.setBackground(new java.awt.Color(255, 153, 0));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setText("LOGIN");
        btn_login.setToolTipText("CLICK TO LOGIN");
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 90, 30));

        btn_signup.setBackground(java.awt.Color.blue);
        btn_signup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_signup.setText("SIGN UP");
        btn_signup.setToolTipText("CLICK TO SIGNUP");
        btn_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        getContentPane().add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 90, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("I haven't an Account:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, 30));

        btn_forget.setBackground(new java.awt.Color(0, 51, 51));
        btn_forget.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_forget.setText("FPRGET PASSWORD");
        btn_forget.setToolTipText("CLICK TO FORGET PASSWORD");
        btn_forget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_forgetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_forget, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACK GROUND IMAGES/LOGIN 01.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new admin_signup().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_signupActionPerformed

    private void chckbox_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckbox_passwordActionPerformed
        // TODO add your handling code here:
        if(chckbox_password.isSelected()){
            txtf_password.setEchoChar((char)0);
        }else{
            txtf_password.setEchoChar('*');
        }
    }//GEN-LAST:event_chckbox_passwordActionPerformed

    private void btn_forgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forgetActionPerformed

        this.setVisible(false);
        new ForgetPassword().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_forgetActionPerformed

    private void txtf_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_usernameActionPerformed

    }//GEN-LAST:event_txtf_usernameActionPerformed

    private void txtf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_passwordActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String email = txtf_username.getText();
        String password = txtf_password.getText();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your email address.");
            return;
        }
        try {
            String sql = "SELECT * FROM admin_login WHERE Email = ? AND Password = ?";  // **SECURITY RISK**
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login successful!");
                this.setVisible(false);
                new MAIN_MENU().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid email address or password.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_forget;
    private javax.swing.JToggleButton btn_login;
    private javax.swing.JToggleButton btn_signup;
    private javax.swing.JCheckBox chckbox_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField txtf_password;
    private javax.swing.JTextField txtf_username;
    // End of variables declaration//GEN-END:variables
}
