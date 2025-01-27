/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MAIN_PROJECT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class driver_route extends javax.swing.JFrame {
    Connection con = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
    /**
     * Creates new form driver_route
     */
    public driver_route() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lbl_name = new javax.swing.JLabel();
        lbl_name3 = new javax.swing.JLabel();
        lbl_name2 = new javax.swing.JLabel();
        lbl_name1 = new javax.swing.JLabel();
        lbl_name6 = new javax.swing.JLabel();
        lbl_name5 = new javax.swing.JLabel();
        lbl_name4 = new javax.swing.JLabel();
        btn_join = new javax.swing.JToggleButton();
        btn_update = new javax.swing.JToggleButton();
        txtf_dname = new javax.swing.JTextField();
        txtf_pname = new javax.swing.JTextField();
        txtf_proute = new javax.swing.JTextField();
        txtf_deptime = new javax.swing.JTextField();
        txtf_pno = new javax.swing.JTextField();
        txtf_arrivetime = new javax.swing.JTextField();
        txtf_dcontact = new javax.swing.JTextField();
        btn_remove = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        btn_home = new javax.swing.JToggleButton();
        btn_main = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btn_search = new javax.swing.JToggleButton();
        txtf_id = new javax.swing.JTextField();
        btn_srchupdate = new javax.swing.JToggleButton();
        lbl_name7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Point Route");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(51, 255, 255));
        lbl_name.setText("Name ");
        jPanel3.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 98, 30));

        lbl_name3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name3.setForeground(new java.awt.Color(51, 255, 255));
        lbl_name3.setText("Point Name");
        jPanel3.add(lbl_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 98, 30));

        lbl_name2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name2.setForeground(new java.awt.Color(51, 255, 255));
        lbl_name2.setText("Route ");
        jPanel3.add(lbl_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 98, 30));

        lbl_name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name1.setForeground(new java.awt.Color(51, 255, 255));
        lbl_name1.setText("Point Name");
        jPanel3.add(lbl_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 98, 34));

        lbl_name6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name6.setForeground(new java.awt.Color(51, 255, 255));
        lbl_name6.setText("Contact ");
        jPanel3.add(lbl_name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 98, 30));

        lbl_name5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name5.setForeground(new java.awt.Color(51, 255, 255));
        lbl_name5.setText("Point No");
        jPanel3.add(lbl_name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 98, 30));

        lbl_name4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name4.setForeground(new java.awt.Color(51, 255, 255));
        lbl_name4.setText("Arrival Time ");
        jPanel3.add(lbl_name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 98, -1));

        btn_join.setBackground(new java.awt.Color(0, 102, 51));
        btn_join.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_join.setText("JOIN");
        btn_join.setToolTipText("CLICK TO ADD");
        btn_join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_joinActionPerformed(evt);
            }
        });
        jPanel3.add(btn_join, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 100, -1));

        btn_update.setBackground(new java.awt.Color(0, 102, 102));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.setToolTipText("CLICK TO UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel3.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 100, -1));

        txtf_dname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_dnameActionPerformed(evt);
            }
        });
        jPanel3.add(txtf_dname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 257, 32));
        jPanel3.add(txtf_pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 257, 32));
        jPanel3.add(txtf_proute, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 257, 32));
        jPanel3.add(txtf_deptime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 257, 31));
        jPanel3.add(txtf_pno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 257, 31));
        jPanel3.add(txtf_arrivetime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 257, 30));
        jPanel3.add(txtf_dcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 257, 30));

        btn_remove.setBackground(new java.awt.Color(255, 102, 0));
        btn_remove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_remove.setText("REMOVE");
        btn_remove.setToolTipText("CLICK TO REMOVE");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        jPanel3.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 420, 110, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_home.setText("VIEW");
        btn_home.setToolTipText("CLICK TO GO HOME PAGE");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 70, 104, 33));

        btn_main.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_main.setText("BACK");
        btn_main.setToolTipText("CLICK TO GO MAIN MENU");
        btn_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainActionPerformed(evt);
            }
        });
        jPanel1.add(btn_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 30, 104, 31));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("DRIVER ROUTE INFORMATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_search.setText("Search");
        btn_search.setToolTipText("CLICK TO SEARCH");
        btn_search.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_search.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        txtf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_idActionPerformed(evt);
            }
        });
        jPanel1.add(txtf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 210, 33));

        btn_srchupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_srchupdate.setText("Search Driver");
        btn_srchupdate.setToolTipText("Search Driver to Update");
        btn_srchupdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_srchupdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_srchupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_srchupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_srchupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        lbl_name7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_name7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BUS DRIVER.png"))); // NOI18N
        jPanel1.add(lbl_name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACK GROUND IMAGES/ROUTE TO SCHOOL.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(122, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MAIN_MENU().setVisible(true);
    }//GEN-LAST:event_btn_mainActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new driver_view_duty().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void txtf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_idActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        try {
            int tchId = Integer.parseInt(txtf_id.getText());
            String sql = "SELECT * FROM driver_info WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, tchId);

            rs = pst.executeQuery();
            if (rs.next()) {
                txtf_dname.setText(rs.getString("Driver Name"));
                txtf_dcontact.setText(rs.getString("Mobile No"));
            } else {
                JOptionPane.showMessageDialog(this, "Sorry! Record Not Found, Try Again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(tch_join_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_joinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_joinActionPerformed
         try {
        pst = con.prepareStatement("INSERT INTO driver_duty (`Driver Name`,`Mobile No`, `Point Name`, `Point No`, `Route`, `Arrival Time`, `Departure Time`) VALUES (?, ?, ?, ?, ?, ?, ?)");

        pst.setString(1, txtf_dname.getText());
        pst.setString(2, txtf_dcontact.getText());
        pst.setString(3, txtf_pname.getText());
        pst.setString(4, txtf_pno.getText());
        pst.setString(5, txtf_proute.getText());
        pst.setString(6, txtf_arrivetime.getText());
        pst.setString(7, txtf_deptime.getText());
        pst.executeUpdate(); // Use executeUpdate() for INSERT queries

        JOptionPane.showMessageDialog(this, "Driver Duty Assigned Successfully");

        txtf_dname.setText("");
        txtf_dcontact.setText("");
        txtf_pname.setText("");
        txtf_pno.setText("");
        txtf_proute.setText("");
        txtf_arrivetime.setText("");
        txtf_deptime.setText("");
        txtf_dname.requestFocus();

    } catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace();
}
    }//GEN-LAST:event_btn_joinActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        try {
            int ID = Integer.parseInt(txtf_id.getText());
            String sql = "DELETE FROM driver_duty WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, ID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record deleted successfully");
            txtf_dname.setText("");
            txtf_dcontact.setText("");
            txtf_pname.setText("");
            txtf_pno.setText("");
            txtf_proute.setText("");
            txtf_arrivetime.setText("");
            txtf_deptime.setText("");
            txtf_dname.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(tch_join_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
        String sql = "UPDATE driver_duty SET `Driver Name` = ?, `Mobile No` = ?, `Point Name` = ?, `Point No` = ?, Route = ?, `Arrival Time` = ?, `Departure Time` = ? WHERE ID = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, txtf_dname.getText());
        pst.setString(2, txtf_dcontact.getText());
        pst.setString(3, txtf_pname.getText());
        pst.setString(4, txtf_pno.getText());
        pst.setString(5, txtf_proute.getText());
        pst.setString(6, txtf_arrivetime.getText());
        pst.setString(7, txtf_deptime.getText());
        pst.setString(8, txtf_id.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Successfully Updated");

        txtf_dname.setText("");
        txtf_dcontact.setText("");
        txtf_pname.setText("");
        txtf_pno.setText("");
        txtf_proute.setText("");
        txtf_arrivetime.setText("");
        txtf_deptime.setText("");
        txtf_dname.requestFocus();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void txtf_dnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_dnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_dnameActionPerformed

    private void btn_srchupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_srchupdateActionPerformed
        // TODO add your handling code here:
        try {
            int tchId = Integer.parseInt(txtf_id.getText());
            String sql = "SELECT * FROM driver_duty WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, tchId);

            rs = pst.executeQuery();
            if (rs.next()) {
                txtf_dname.setText(rs.getString("Driver Name"));
                txtf_dcontact.setText(rs.getString("Mobile No"));
                txtf_pname.setText(rs.getString("Point Name"));
                txtf_pno.setText(rs.getString("Point No"));
                txtf_proute.setText(rs.getString("Route"));
                txtf_arrivetime.setText(rs.getString("Arrival Time"));
                txtf_deptime.setText(rs.getString("Departure Time"));
            } else {
                JOptionPane.showMessageDialog(this, "Sorry! Record Not Found, Try Again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(tch_join_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_srchupdateActionPerformed

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
            java.util.logging.Logger.getLogger(driver_route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(driver_route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(driver_route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(driver_route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new driver_route().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_home;
    private javax.swing.JToggleButton btn_join;
    private javax.swing.JToggleButton btn_main;
    private javax.swing.JToggleButton btn_remove;
    private javax.swing.JToggleButton btn_search;
    private javax.swing.JToggleButton btn_srchupdate;
    private javax.swing.JToggleButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_name2;
    private javax.swing.JLabel lbl_name3;
    private javax.swing.JLabel lbl_name4;
    private javax.swing.JLabel lbl_name5;
    private javax.swing.JLabel lbl_name6;
    private javax.swing.JLabel lbl_name7;
    private javax.swing.JTextField txtf_arrivetime;
    private javax.swing.JTextField txtf_dcontact;
    private javax.swing.JTextField txtf_deptime;
    private javax.swing.JTextField txtf_dname;
    private javax.swing.JTextField txtf_id;
    private javax.swing.JTextField txtf_pname;
    private javax.swing.JTextField txtf_pno;
    private javax.swing.JTextField txtf_proute;
    // End of variables declaration//GEN-END:variables
}
