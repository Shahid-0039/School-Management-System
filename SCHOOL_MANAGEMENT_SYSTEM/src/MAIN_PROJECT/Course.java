package MAIN_PROJECT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Course extends javax.swing.JFrame {
    Connection con = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
    public Course() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_backhome1 = new javax.swing.JToggleButton();
        btn_coursesrch = new javax.swing.JToggleButton();
        txtf_id = new javax.swing.JTextField();
        btn_tchsearch = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        btn_backhome2 = new javax.swing.JToggleButton();
        lbl_name1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtf_tchname = new javax.swing.JTextField();
        btn_add = new javax.swing.JToggleButton();
        btn_remove = new javax.swing.JToggleButton();
        btn_update = new javax.swing.JToggleButton();
        lbl_name = new javax.swing.JLabel();
        com_section = new javax.swing.JComboBox<>();
        com_class = new javax.swing.JComboBox<>();
        chckbox_eng = new java.awt.Checkbox();
        chckbox_science = new java.awt.Checkbox();
        chckbox_sind = new java.awt.Checkbox();
        chckbox_sst = new java.awt.Checkbox();
        chckbox_isl = new java.awt.Checkbox();
        chckbox_urdu = new java.awt.Checkbox();
        chckbox_math = new java.awt.Checkbox();
        chckbox_comp = new java.awt.Checkbox();
        lbl_name2 = new javax.swing.JLabel();
        lbl_name3 = new javax.swing.JLabel();
        lbl_name4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COURSE ADDING FORM");
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 120));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("COURSE ADD FORM");

        btn_backhome1.setBackground(new java.awt.Color(153, 0, 0));
        btn_backhome1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_backhome1.setText("BACK");
        btn_backhome1.setToolTipText("GO TO MAIN MENU");
        btn_backhome1.setMargin(new java.awt.Insets(2, 14, 2, 1));
        btn_backhome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backhome1ActionPerformed(evt);
            }
        });

        btn_coursesrch.setBackground(new java.awt.Color(102, 0, 51));
        btn_coursesrch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_coursesrch.setText("SEARCH COURSE");
        btn_coursesrch.setToolTipText("Click to Search Course");
        btn_coursesrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coursesrchActionPerformed(evt);
            }
        });

        txtf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_idActionPerformed(evt);
            }
        });

        btn_tchsearch.setBackground(new java.awt.Color(0, 51, 102));
        btn_tchsearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_tchsearch.setText("SEARCH");
        btn_tchsearch.setToolTipText("Click to Search Teacher");
        btn_tchsearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_tchsearch.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_tchsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tchsearchActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Courses-icon.png"))); // NOI18N

        btn_backhome2.setBackground(new java.awt.Color(102, 51, 0));
        btn_backhome2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_backhome2.setText("VIEW");
        btn_backhome2.setToolTipText("GO TO VIEW COURSES DATA");
        btn_backhome2.setMargin(new java.awt.Insets(2, 14, 2, 1));
        btn_backhome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backhome2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_coursesrch)
                        .addGap(18, 18, 18)
                        .addComponent(btn_tchsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_backhome1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btn_backhome2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_coursesrch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_tchsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_backhome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_backhome2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 100));

        lbl_name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(lbl_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 610, 160, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtf_tchname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_tchnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtf_tchname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 360, 32));

        btn_add.setBackground(new java.awt.Color(0, 102, 51));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_add.setText("ADD");
        btn_add.setToolTipText("CLICK TO ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 422, 90, 30));

        btn_remove.setBackground(new java.awt.Color(255, 102, 0));
        btn_remove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_remove.setText("REMOVE");
        btn_remove.setToolTipText("CLICK TO REMOVE");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 422, 100, 30));

        btn_update.setBackground(new java.awt.Color(0, 0, 255));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.setToolTipText("CLICK TO UPDATE");
        btn_update.setAutoscrolls(true);
        btn_update.setBorderPainted(false);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 423, 100, -1));

        lbl_name.setBackground(new java.awt.Color(204, 153, 0));
        lbl_name.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(0, 51, 51));
        lbl_name.setText("Courses");
        jPanel2.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 179, 130, 29));

        com_section.setBackground(new java.awt.Color(102, 102, 0));
        com_section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECT ONE---", "A", "B", "C", "D" }));
        jPanel2.add(com_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 360, 35));

        com_class.setBackground(new java.awt.Color(102, 102, 0));
        com_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECT ONE---", "KG", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT" }));
        com_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_classActionPerformed(evt);
            }
        });
        jPanel2.add(com_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 360, 35));

        chckbox_eng.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        chckbox_eng.setLabel("English");
        jPanel2.add(chckbox_eng, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 232, 90, 32));

        chckbox_science.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        chckbox_science.setLabel("Science");
        jPanel2.add(chckbox_science, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 322, -1, 32));

        chckbox_sind.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        chckbox_sind.setLabel("Sindhi");
        jPanel2.add(chckbox_sind, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 272, 80, 32));

        chckbox_sst.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        chckbox_sst.setLabel("Social Study");
        jPanel2.add(chckbox_sst, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 272, 140, 32));

        chckbox_isl.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        chckbox_isl.setLabel("Islamiat");
        jPanel2.add(chckbox_isl, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 362, 110, 32));

        chckbox_urdu.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        chckbox_urdu.setLabel("Urdu");
        jPanel2.add(chckbox_urdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 362, 80, 32));

        chckbox_math.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        chckbox_math.setLabel("Mathematics");
        jPanel2.add(chckbox_math, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 232, 150, 32));

        chckbox_comp.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        chckbox_comp.setLabel("Computer");
        jPanel2.add(chckbox_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 322, 111, 32));

        lbl_name2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lbl_name2.setText("Section");
        jPanel2.add(lbl_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 98, 29));

        lbl_name3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lbl_name3.setText("Class");
        jPanel2.add(lbl_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 98, 29));

        lbl_name4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lbl_name4.setText("Name ");
        jPanel2.add(lbl_name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 86, 29));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 600, 510));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACK GROUND IMAGES/homew.png"))); // NOI18N
        jLabel4.setMinimumSize(new java.awt.Dimension(1250, 700));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtf_tchnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_tchnameActionPerformed

    }//GEN-LAST:event_txtf_tchnameActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       try {
        pst = con.prepareStatement("INSERT INTO course (`Name`, `Class`, `Section`, `Course`) VALUES (?, ?, ?, ?)");
        pst.setString(1, txtf_tchname.getText());
        pst.setString(2, (String) com_class.getSelectedItem());
        pst.setString(3, (String) com_section.getSelectedItem());
        StringBuilder courses = new StringBuilder();
        if (chckbox_eng.getState()) {
            courses.append("English, ");
        }
        if (chckbox_sind.getState()) {
            courses.append("Sindhi, ");
        }
        if (chckbox_math.getState()) {
            courses.append("Math, ");
        }
        if (chckbox_science.getState()) {
            courses.append("Science, ");
        }
        if (chckbox_isl.getState()) {
            courses.append("Islamiat, ");
        }
        if (chckbox_sst.getState()) {
            courses.append("Social Study, ");
        }
        if (chckbox_urdu.getState()) {
            courses.append("Urdu, ");
        }
        if (chckbox_comp.getState()) {
            courses.append("Computer, ");
        }        
        if (courses.length() > 0) {
            courses.deleteCharAt(courses.length() - 1);
            courses.deleteCharAt(courses.length() - 1);
        }
        pst.setString(4, courses.toString());
        pst.executeUpdate(); 
        JOptionPane.showMessageDialog(this, "Joined Successfully");
        
        txtf_tchname.setText("");
        com_class.setSelectedIndex(0);
        com_section.setSelectedIndex(0);
        chckbox_eng.setState(false);
        chckbox_sind.setState(false);
        chckbox_math.setState(false);
        chckbox_science.setState(false);
        chckbox_isl.setState(false);
        chckbox_sst.setState(false);
        chckbox_urdu.setState(false);
        chckbox_comp.setState(false);
        txtf_tchname.requestFocus();

    } catch (SQLException ex) {
        Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        try {
            int ID = Integer.parseInt(txtf_id.getText());
            String sql = "DELETE FROM course WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, ID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record deleted successfully");
        txtf_tchname.setText("");
        com_class.setSelectedIndex(0);
        com_section.setSelectedIndex(0);
        chckbox_eng.setState(false);
        chckbox_sind.setState(false);
        chckbox_math.setState(false);
        chckbox_science.setState(false);
        chckbox_isl.setState(false);
        chckbox_sst.setState(false);
        chckbox_urdu.setState(false);
        chckbox_comp.setState(false);
        txtf_tchname.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(tch_join_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
      try {
        String sql = "UPDATE course SET Name = ?, Class = ?, Section = ?, Course = ? WHERE ID = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, txtf_tchname.getText());
        pst.setString(2, (String) com_class.getSelectedItem());
        pst.setString(3, (String) com_section.getSelectedItem());
        StringBuilder courses = new StringBuilder();
        if (chckbox_eng.getState()) {
            courses.append("English, ");
        }
        if (chckbox_sind.getState()) {
            courses.append("Sindhi, ");
        }
        if (chckbox_math.getState()) {
            courses.append("Math, ");
        }       
        if (chckbox_science.getState()) {
            courses.append("Science, ");
        }      
        if (chckbox_isl.getState()) {
            courses.append("Islamiat, ");
        }
        if (chckbox_sst.getState()) {
            courses.append("Social Study, ");
        }        
        if (chckbox_urdu.getState()) {
            courses.append("Urdu, ");
        }
        if (chckbox_comp.getState()) {
            courses.append("Computer, ");
        }        
        if (courses.length() > 0) {
            courses.deleteCharAt(courses.length() - 1);
            courses.deleteCharAt(courses.length() - 1);
        }
        pst.setString(4, courses.toString());
        pst.setInt(5, Integer.parseInt(txtf_id.getText()));
        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            con.commit();
        } else {
            JOptionPane.showMessageDialog(null, "No record updated. Please check the ID.");
        }
        clearFields();
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        try{
            con.rollback();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Rollback Error: " + ex.getMessage());
        }
    }
}
    private void clearFields() {
    txtf_tchname.setText("");
    com_class.setSelectedIndex(0);
    com_section.setSelectedIndex(0);
    chckbox_eng.setState(false);
    chckbox_sind.setState(false);
     chckbox_math.setState(false);
        chckbox_science.setState(false);
        chckbox_isl.setState(false);
        chckbox_sst.setState(false);
        chckbox_urdu.setState(false);
        chckbox_comp.setState(false);
    // Clear other checkboxes here...
    txtf_tchname.requestFocus();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_tchsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tchsearchActionPerformed
        // TODO add your handling code here:
        try {
            int tchId = Integer.parseInt(txtf_id.getText());
            String sql = "SELECT * FROM teacher_info WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, tchId);

            rs = pst.executeQuery();
            if (rs.next()) {
                txtf_tchname.setText(rs.getString("Name"));
            } else {
                JOptionPane.showMessageDialog(this, "Sorry! Record Not Found, Try Again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(tch_join_form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_tchsearchActionPerformed

    private void txtf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_idActionPerformed

    private void com_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_classActionPerformed

    private void btn_coursesrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coursesrchActionPerformed
        try {
            int tchId = Integer.parseInt(txtf_id.getText());
            String sql = "SELECT * FROM course WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, tchId);

            rs = pst.executeQuery();
            if (rs.next()) {
                txtf_tchname.setText(rs.getString("Name"));
            } else {
                JOptionPane.showMessageDialog(this, "Sorry! Record Not Found, Try Again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(tch_join_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_coursesrchActionPerformed

    private void btn_backhome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backhome1ActionPerformed
        this.setVisible(false);
        new MAIN_MENU().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backhome1ActionPerformed

    private void btn_backhome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backhome2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new courses_view_data().setVisible(true);
    }//GEN-LAST:event_btn_backhome2ActionPerformed
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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Course().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_add;
    private javax.swing.JToggleButton btn_backhome1;
    private javax.swing.JToggleButton btn_backhome2;
    private javax.swing.JToggleButton btn_coursesrch;
    private javax.swing.JToggleButton btn_remove;
    private javax.swing.JToggleButton btn_tchsearch;
    private javax.swing.JToggleButton btn_update;
    private java.awt.Checkbox chckbox_comp;
    private java.awt.Checkbox chckbox_eng;
    private java.awt.Checkbox chckbox_isl;
    private java.awt.Checkbox chckbox_math;
    private java.awt.Checkbox chckbox_science;
    private java.awt.Checkbox chckbox_sind;
    private java.awt.Checkbox chckbox_sst;
    private java.awt.Checkbox chckbox_urdu;
    private javax.swing.JComboBox<String> com_class;
    private javax.swing.JComboBox<String> com_section;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_name2;
    private javax.swing.JLabel lbl_name3;
    private javax.swing.JLabel lbl_name4;
    private javax.swing.JTextField txtf_id;
    private javax.swing.JTextField txtf_tchname;
    // End of variables declaration//GEN-END:variables
}
