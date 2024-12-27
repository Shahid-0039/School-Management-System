package MAIN_PROJECT;
import MAIN_PROJECT.std_view_data;
public class MAIN_MENU extends javax.swing.JFrame {
    public MAIN_MENU() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JToggleButton();
        mainmenu1 = new javax.swing.JLabel();
        mainmenu2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        com_teacherinfo = new javax.swing.JComboBox<>();
        com_fininfo = new javax.swing.JComboBox<>();
        com_crsinfo = new javax.swing.JComboBox<>();
        com_stdinfo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        com_transportinfo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MAIN MENU");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setBackground(new java.awt.Color(0, 102, 102));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 0, 51));
        btn_back.setText("HOME");
        btn_back.setToolTipText("CLICK TO GO HOME PAGE");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 110, 40));

        mainmenu1.setBackground(new java.awt.Color(102, 255, 204));
        mainmenu1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        mainmenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainmenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Main Interface.png"))); // NOI18N
        jPanel1.add(mainmenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 100, 80));

        mainmenu2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        mainmenu2.setForeground(new java.awt.Color(255, 255, 255));
        mainmenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainmenu2.setText("MAIN MENU");
        jPanel1.add(mainmenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 160, 40));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("SCHOOL MANAGEMENT SYSTEM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 72));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 110));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        com_teacherinfo.setBackground(new java.awt.Color(102, 102, 0));
        com_teacherinfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        com_teacherinfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<- Teacher Information ->", "Register", "View All Info" }));
        com_teacherinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        com_teacherinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_teacherinfoActionPerformed(evt);
            }
        });
        jPanel2.add(com_teacherinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 230, 40));

        com_fininfo.setBackground(new java.awt.Color(102, 102, 0));
        com_fininfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        com_fininfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<- Finane Information ->", "Student Fees", "Teacher Salary", "Driver Salary", " " }));
        com_fininfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_fininfoActionPerformed(evt);
            }
        });
        jPanel2.add(com_fininfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 230, 40));

        com_crsinfo.setBackground(new java.awt.Color(102, 102, 0));
        com_crsinfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        com_crsinfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<- Course Information ->", "Course Registration", "View All Courses" }));
        com_crsinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        com_crsinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_crsinfoActionPerformed(evt);
            }
        });
        jPanel2.add(com_crsinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 230, 40));

        com_stdinfo.setBackground(new java.awt.Color(102, 102, 0));
        com_stdinfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        com_stdinfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<- Student Information ->", "Register", "View All Info", " ", " " }));
        com_stdinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        com_stdinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_stdinfoActionPerformed(evt);
            }
        });
        jPanel2.add(com_stdinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 230, 40));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, 170));

        com_transportinfo.setBackground(new java.awt.Color(102, 102, 0));
        com_transportinfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        com_transportinfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<- Driver Information ->", "Driver Registration", "Driver view info", "Driver Duty", "Driver view duty", "Driver view salary" }));
        com_transportinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_transportinfoActionPerformed(evt);
            }
        });
        jPanel2.add(com_transportinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 230, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 360, 480));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACK GROUND IMAGES/art-welcome-back-to-school-banner-school-supplies-tumblr-GK6E82.png"))); // NOI18N
        jLabel4.setMinimumSize(new java.awt.Dimension(1250, 700));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.setVisible(false);
        new Main_Interface().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void com_transportinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_transportinfoActionPerformed
        // TODO add your handling code here:
        if(com_transportinfo.getSelectedItem()=="Driver Registration"){
            this.setVisible(false);
            new driver_reg_form().setVisible(true);
        }else if(com_transportinfo.getSelectedItem()=="Driver view info"){
            this.setVisible(false);
            new driver_view_info().setVisible(true);
        }else if(com_transportinfo.getSelectedItem()=="Driver Duty"){
            this.setVisible(false);
            new driver_route().setVisible(true);
        }else if(com_transportinfo.getSelectedItem()=="Driver view duty"){
            this.setVisible(false);
            new driver_view_duty().setVisible(true);
        }else if(com_transportinfo.getSelectedItem()=="Driver view salary"){
            this.setVisible(false);
            new driver_view_salary().setVisible(true);
        }
    }//GEN-LAST:event_com_transportinfoActionPerformed

    private void com_stdinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_stdinfoActionPerformed

        if(com_stdinfo.getSelectedItem()=="Register"){
            this.setVisible(false);
            new Std_reg_form().setVisible(true);
        }else if(com_stdinfo.getSelectedItem()=="View All Info"){
            this.setVisible(false);
            new std_view_data().setVisible(true);
        }
    }//GEN-LAST:event_com_stdinfoActionPerformed

    private void com_crsinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_crsinfoActionPerformed
        // TODO add your handling code here:
        if(com_crsinfo.getSelectedItem()=="Course Registration"){
            this.setVisible(false);
            new Course().setVisible(true);
        }else if(com_crsinfo.getSelectedItem()=="View All Courses"){
            this.setVisible(false);
            new courses_view_data().setVisible(true);
        }
    }//GEN-LAST:event_com_crsinfoActionPerformed

    private void com_fininfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_fininfoActionPerformed
        if(com_fininfo.getSelectedItem()=="Student Fees"){
            this.setVisible(false);
            new std_fees_receipt().setVisible(true);
        }else if(com_fininfo.getSelectedItem()=="Teacher Salary"){
            this.setVisible(false);
            new tch_salary_receipt().setVisible(true);
        }else if(com_fininfo.getSelectedItem()=="Teacher Salary Record"){
            this.setVisible(false);
            new tch_view_salary().setVisible(true);
        }else if(com_fininfo.getSelectedItem()=="Student Fees Record"){
            this.setVisible(false);
            new std_view_fees().setVisible(true);
        }else if(com_fininfo.getSelectedItem()=="Driver Salary"){
            this.setVisible(false);
            new driver_salary_receipt().setVisible(true);
        }else if(com_fininfo.getSelectedItem()=="Driver Salary Record"){
            this.setVisible(false);
            new driver_view_salary().setVisible(true);
        }
    }//GEN-LAST:event_com_fininfoActionPerformed

    private void com_teacherinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_teacherinfoActionPerformed
        // TODO add your handling code here:
        if(com_teacherinfo.getSelectedItem()=="Register"){
            this.setVisible(false);
            new tch_join_form().setVisible(true);
        }else if(com_teacherinfo.getSelectedItem()=="View All Info"){
            this.setVisible(false);
            new tch_view_data().setVisible(true);
        }
    }//GEN-LAST:event_com_teacherinfoActionPerformed

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
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN_MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_back;
    private javax.swing.JComboBox<String> com_crsinfo;
    private javax.swing.JComboBox<String> com_fininfo;
    private javax.swing.JComboBox<String> com_stdinfo;
    private javax.swing.JComboBox<String> com_teacherinfo;
    private javax.swing.JComboBox<String> com_transportinfo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mainmenu1;
    private javax.swing.JLabel mainmenu2;
    // End of variables declaration//GEN-END:variables
}
