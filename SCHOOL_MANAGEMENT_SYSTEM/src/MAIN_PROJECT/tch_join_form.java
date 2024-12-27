
package MAIN_PROJECT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class tch_join_form extends javax.swing.JFrame {
    Connection con = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
    public tch_join_form() {
        initComponents();
         try {
            // Establish the database connection in the constructor
            con = DriverManager.getConnection("jdbc:mysql://localhost/school_info", "root", "");
            if (con == null) {
                JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(tch_join_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Failed to connect to the database: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_menu = new javax.swing.JToggleButton();
        btn_home = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        btn_search = new javax.swing.JToggleButton();
        txtf_id = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl_name6 = new javax.swing.JLabel();
        lbl_name3 = new javax.swing.JLabel();
        txtf_name = new javax.swing.JTextField();
        txtf_contact = new javax.swing.JTextField();
        txtf_salary = new javax.swing.JTextField();
        join_date = new com.toedter.calendar.JDateChooser();
        btn_join = new javax.swing.JToggleButton();
        lbl_name1 = new javax.swing.JLabel();
        btn_remove = new javax.swing.JToggleButton();
        lbl_name4 = new javax.swing.JLabel();
        btn_update = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEACHER REGISTRATION FORM");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setMinimumSize(new java.awt.Dimension(1220, 120));
        jPanel2.setPreferredSize(new java.awt.Dimension(1220, 120));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TEACHER REGISTRATION FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 640, -1));

        btn_menu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_menu.setText("BACK");
        btn_menu.setToolTipText("CLICK TO GO MAIN MENU");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        jPanel2.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 100, 30));

        btn_home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_home.setText("VIEW");
        btn_home.setToolTipText("CLICK TO GO HOME PAGE");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Teacher-icon.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.setToolTipText("CLICK TO SEARCH");
        btn_search.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_search.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel2.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 90, -1));

        txtf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_idActionPerformed(evt);
            }
        });
        jPanel2.add(txtf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 180, 30));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_name6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name6.setText("Contact :");
        jPanel1.add(lbl_name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 127, -1, -1));

        lbl_name3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name3.setText("Joining Date ");
        jPanel1.add(lbl_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 193, 98, -1));

        txtf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txtf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 66, 257, 32));
        jPanel1.add(txtf_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 123, 257, 30));
        jPanel1.add(txtf_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 253, 257, 32));
        jPanel1.add(join_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 193, 257, 32));

        btn_join.setBackground(new java.awt.Color(0, 102, 51));
        btn_join.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_join.setText("JOIN");
        btn_join.setToolTipText("CLICK TO ADD");
        btn_join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_joinActionPerformed(evt);
            }
        });
        jPanel1.add(btn_join, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 82, -1));

        lbl_name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name1.setText("Name ");
        jPanel1.add(lbl_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 71, 66, -1));

        btn_remove.setBackground(new java.awt.Color(255, 102, 0));
        btn_remove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_remove.setText("REMOVE");
        btn_remove.setToolTipText("CLICK TO REMOVE");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        lbl_name4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name4.setText("Salary");
        jPanel1.add(lbl_name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 258, 59, -1));

        btn_update.setBackground(new java.awt.Color(0, 0, 255));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.setToolTipText("CLICK TO UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACK GROUND IMAGES/LAPTOP.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_nameActionPerformed

    private void btn_joinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_joinActionPerformed
    try {
            pst = con.prepareStatement("INSERT INTO teacher_info (`Name`,`Contact`, `Joining Date`, `Salary`) VALUES (?, ?, ?, ?)");

            pst.setString(1, txtf_name.getText());
            pst.setString(2, txtf_contact.getText());
            java.sql.Date sqlJoinDate = new java.sql.Date(join_date.getDate().getTime());
            pst.setDate(3, sqlJoinDate);
            pst.setString(4, txtf_salary.getText());

            pst.executeUpdate(); // Use executeUpdate() for INSERT queries

            JOptionPane.showMessageDialog(this, "Joined Successfully");

            txtf_name.setText("");
            txtf_contact.setText("");
            join_date.setDateFormatString("");
            txtf_salary.setText("");
            txtf_name.requestFocus();

        } catch (SQLException ex) {
            Logger.getLogger(tch_join_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_joinActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       try {
            String sql = "UPDATE teacher_info SET Name = ?,Contact = ?, Salary = ? WHERE ID = ?";
            pst = con.prepareStatement(sql);
             pst.setString(1, txtf_name.getText());
              pst.setString(2, txtf_contact.getText());
            pst.setString(3, txtf_salary.getText());
            pst.setString(4, txtf_id.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            
            txtf_name.setText("");
            txtf_contact.setText("");
            join_date.setDateFormatString("");
            txtf_salary.setText("");
            txtf_name.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
       try {
            int ID = Integer.parseInt(txtf_id.getText());
            String sql = "DELETE FROM teacher_info WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, ID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record deleted successfully");
            txtf_name.setText("");
            txtf_contact.setText("");
            txtf_salary.setText("");
            txtf_name.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(tch_join_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void txtf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_idActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        try {
            int tchId = Integer.parseInt(txtf_id.getText());
            String sql = "SELECT * FROM teacher_info WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, tchId);

            rs = pst.executeQuery();
            if (rs.next()) {
                txtf_name.setText(rs.getString("Name"));
                txtf_contact.setText(rs.getString("Contact"));
                txtf_salary.setText(rs.getString("Salary"));
            } else {
                JOptionPane.showMessageDialog(this, "Sorry! Record Not Found, Try Again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(tch_join_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MAIN_MENU().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        this.setVisible(false);
        new tch_view_data().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_homeActionPerformed

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
            java.util.logging.Logger.getLogger(tch_join_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tch_join_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tch_join_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tch_join_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tch_join_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_home;
    private javax.swing.JToggleButton btn_join;
    private javax.swing.JToggleButton btn_menu;
    private javax.swing.JToggleButton btn_remove;
    private javax.swing.JToggleButton btn_search;
    private javax.swing.JToggleButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser join_date;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_name3;
    private javax.swing.JLabel lbl_name4;
    private javax.swing.JLabel lbl_name6;
    private javax.swing.JTextField txtf_contact;
    private javax.swing.JTextField txtf_id;
    private javax.swing.JTextField txtf_name;
    private javax.swing.JTextField txtf_salary;
    // End of variables declaration//GEN-END:variables
}
