package MAIN_PROJECT;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
public class Std_reg_form extends javax.swing.JFrame {
      Connection con = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
    public Std_reg_form() {
        initComponents();
         try {
        // Establish the database connection in the constructor
        con = DriverManager.getConnection("jdbc:mysql://localhost/school_info", "root", "");
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Std_reg_form.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Failed to connect to the database: " + ex.getMessage());
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_backhome = new javax.swing.JToggleButton();
        btn_search = new javax.swing.JToggleButton();
        txtf_id = new javax.swing.JTextField();
        lbl_name1 = new javax.swing.JLabel();
        btn_backhome1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_name3 = new javax.swing.JLabel();
        lbl_name4 = new javax.swing.JLabel();
        txtf_stdRegNo1 = new javax.swing.JTextField();
        txtf_stdname1 = new javax.swing.JTextField();
        lbl_fathername1 = new javax.swing.JLabel();
        txtf_fname1 = new javax.swing.JTextField();
        lbl_fphone1 = new javax.swing.JLabel();
        txtf_phone1 = new javax.swing.JTextField();
        lbl_address1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_address1 = new javax.swing.JTextArea();
        lbl_class1 = new javax.swing.JLabel();
        com_class1 = new javax.swing.JComboBox<>();
        lbl_section1 = new javax.swing.JLabel();
        com_section1 = new javax.swing.JComboBox<>();
        lbl_gender1 = new javax.swing.JLabel();
        com_gender1 = new javax.swing.JComboBox<>();
        lbl_dob1 = new javax.swing.JLabel();
        birth_date1 = new com.toedter.calendar.JDateChooser();
        lbl_adddate1 = new javax.swing.JLabel();
        add_date1 = new com.toedter.calendar.JDateChooser();
        btn_add2 = new javax.swing.JToggleButton();
        btn_update1 = new javax.swing.JToggleButton();
        btn_delete1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENT REGISTRATION FORM");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("STUDENT REGISTRATION FORM");

        btn_backhome.setBackground(new java.awt.Color(204, 51, 0));
        btn_backhome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_backhome.setText("BACK");
        btn_backhome.setToolTipText("CLICK TO GO HOME PAGE");
        btn_backhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backhomeActionPerformed(evt);
            }
        });

        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.setToolTipText("CLICK TO SEARCH ANY STUDENT");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        txtf_id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        lbl_name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/student Register.png"))); // NOI18N

        btn_backhome1.setBackground(new java.awt.Color(102, 51, 0));
        btn_backhome1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_backhome1.setText("VIEW");
        btn_backhome1.setToolTipText("CLICK TO VIEW STUDENT DATA");
        btn_backhome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backhome1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_backhome, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_backhome1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_backhome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_backhome1)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbl_name3.setBackground(new java.awt.Color(255, 255, 255));
        lbl_name3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name3.setText("Student Reg No:");

        lbl_name4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name4.setText("Student Name");

        txtf_stdRegNo1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        txtf_stdRegNo1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtf_stdRegNoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtf_stdRegNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_stdRegNoActionPerformed(evt);
            }
        });

        txtf_stdname1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        txtf_stdname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_stdnameActionPerformed(evt);
            }
        });

        lbl_fathername1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_fathername1.setText("Father Name");

        txtf_fname1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N

        lbl_fphone1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_fphone1.setText("Father Phone No#");

        txtf_phone1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N

        lbl_address1.setBackground(new java.awt.Color(204, 204, 204));
        lbl_address1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_address1.setText("Address");

        txta_address1.setColumns(20);
        txta_address1.setRows(5);
        jScrollPane2.setViewportView(txta_address1);

        lbl_class1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_class1.setText("Class");

        com_class1.setBackground(new java.awt.Color(102, 102, 0));
        com_class1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECT ONE---", "KG", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT" }));

        lbl_section1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_section1.setText("Section");

        com_section1.setBackground(new java.awt.Color(102, 102, 0));
        com_section1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECT ONE---", "A", "B", "C", "D" }));

        lbl_gender1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_gender1.setText("Gender");

        com_gender1.setBackground(new java.awt.Color(102, 102, 0));
        com_gender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECT ONE---", "MALE", "FEMALE" }));
        com_gender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_genderActionPerformed(evt);
            }
        });

        lbl_dob1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_dob1.setText("Date of Birth");

        lbl_adddate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_adddate1.setText("Admission Date");

        btn_add2.setBackground(new java.awt.Color(0, 102, 51));
        btn_add2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_add2.setText("ENROLL");
        btn_add2.setToolTipText("CLICK TO ENROLL");
        btn_add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });

        btn_update1.setBackground(new java.awt.Color(0, 102, 102));
        btn_update1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_update1.setText("UPDATE");
        btn_update1.setToolTipText("CLICK TO UPDATE");
        btn_update1.setAutoscrolls(true);
        btn_update1.setBorderPainted(false);
        btn_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete1.setBackground(new java.awt.Color(255, 102, 0));
        btn_delete1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_delete1.setText("REMOVE");
        btn_delete1.setToolTipText("CLICK TO REMOVE");
        btn_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txtf_stdRegNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_name4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txtf_stdname1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_fathername1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtf_fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_fphone1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtf_phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_address1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_class1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(com_class1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_section1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(com_section1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(com_gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_dob1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(birth_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_adddate1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(add_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btn_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btn_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_stdRegNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_stdname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_fathername1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtf_fname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_fphone1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_phone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_address1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_class1)
                    .addComponent(com_class1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_section1)
                    .addComponent(com_section1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com_gender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_dob1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birth_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_adddate1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(add_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update1)
                    .addComponent(btn_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 560, 580));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACK GROUND IMAGES/BACK G1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1210, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backhomeActionPerformed
        this.setVisible(false);
        new MAIN_MENU().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backhomeActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
      try {
    if (!txtf_id.getText().isEmpty()) {
        int stdId = Integer.parseInt(txtf_id.getText());
        String sql = "SELECT * FROM student_info WHERE ID = ?";
        pst = con.prepareStatement(sql);
        pst.setInt(1, stdId);

        rs = pst.executeQuery();
        if(rs.next()){
            txtf_stdname.setText(rs.getString("Student Name"));
            txtf_fname.setText(rs.getString("Father Name")); // Set the father's name
            com_class.setSelectedItem(rs.getString("Class"));
            com_section.setSelectedItem(rs.getString("Section"));
        } else {
            JOptionPane.showMessageDialog(this, "Sorry! Record Not Found, Try Again");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please enter a valid ID");
    }
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Please enter a valid ID");
} catch (SQLException ex) {
    Logger.getLogger(Std_reg_form.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_backhome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backhome1ActionPerformed
        this.setVisible(false);
        new std_view_data().setVisible(true);
        dispose();        
    }//GEN-LAST:event_btn_backhome1ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try {
            int ID = Integer.parseInt(txtf_id.getText());
            String sql = "DELETE FROM student_info WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, ID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record deleted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(Std_reg_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try{
            String sql = "UPDATE student_info SET Class = ?, Section = ? WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, (String) com_class.getSelectedItem());
            pst.setString(2, (String) com_section.getSelectedItem());
            pst.setInt(3, Integer.parseInt(txtf_id.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            txtf_stdname.setText("");
            txtf_fname.setText("");
            txtf_phone.setText("");
            birth_date.setDate(null);
            birth_date.setDate(null);
            txta_address.setText("");
            txtf_stdname.requestFocus();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        try {
            // Corrected SQL query with placeholders
            pst = con.prepareStatement("INSERT INTO student_info (`Reg_No`, `Student Name`, `Father Name`, `Father Mobile No`, `Date of Birth`, `Gender`, `Class`, `Section`, `Admission Date`, `Address`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            // Set parameter values
            pst.setString(1, txtf_stdRegNo.getText());
            pst.setString(2, txtf_stdname.getText());
            pst.setString(3, txtf_fname.getText());
            pst.setString(4, txtf_phone.getText());

            // Convert birth_date to SQL Date
            java.sql.Date sqlBirthDate = new java.sql.Date(birth_date.getDate().getTime());
            pst.setDate(5, sqlBirthDate);

            pst.setString(6, (String) com_gender.getSelectedItem());
            pst.setString(7, (String) com_class.getSelectedItem());
            pst.setString(8, (String) com_section.getSelectedItem());

            // Convert admission_date to SQL Date
            java.sql.Date sqlAdmissionDate = new java.sql.Date(add_date.getDate().getTime());
            pst.setDate(9, sqlAdmissionDate);

            pst.setString(10, txta_address.getText());

            // Execute the query
            pst.executeUpdate();

            // Notify the user
            JOptionPane.showMessageDialog(this, "Registered Successfully");

            // Clear input fields after successful registration
            txtf_stdRegNo.setText("");
            txtf_stdname.setText("");
            txtf_fname.setText("");
            txtf_phone.setText("");
            birth_date.setDate(null);
            add_date.setDate(null);
            txta_address.setText("");
            txtf_stdRegNo.requestFocus();
        } catch (SQLException ex) {
            // Log the exception for debugging
            Logger.getLogger(Std_reg_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void com_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_genderActionPerformed

    private void txtf_stdnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_stdnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_stdnameActionPerformed

    private void txtf_stdRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_stdRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_stdRegNoActionPerformed

    private void txtf_stdRegNoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtf_stdRegNoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_stdRegNoAncestorAdded

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Std_reg_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser add_date;
    private com.toedter.calendar.JDateChooser add_date1;
    private com.toedter.calendar.JDateChooser birth_date;
    private com.toedter.calendar.JDateChooser birth_date1;
    private javax.swing.JToggleButton btn_add1;
    private javax.swing.JToggleButton btn_add2;
    private javax.swing.JToggleButton btn_backhome;
    private javax.swing.JToggleButton btn_backhome1;
    private javax.swing.JToggleButton btn_delete;
    private javax.swing.JToggleButton btn_delete1;
    private javax.swing.JToggleButton btn_search;
    private javax.swing.JToggleButton btn_update;
    private javax.swing.JToggleButton btn_update1;
    private javax.swing.JComboBox<String> com_class;
    private javax.swing.JComboBox<String> com_class1;
    private javax.swing.JComboBox<String> com_gender;
    private javax.swing.JComboBox<String> com_gender1;
    private javax.swing.JComboBox<String> com_section;
    private javax.swing.JComboBox<String> com_section1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_adddate;
    private javax.swing.JLabel lbl_adddate1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_address1;
    private javax.swing.JLabel lbl_class;
    private javax.swing.JLabel lbl_class1;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_dob1;
    private javax.swing.JLabel lbl_fathername;
    private javax.swing.JLabel lbl_fathername1;
    private javax.swing.JLabel lbl_fphone;
    private javax.swing.JLabel lbl_fphone1;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_gender1;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_name2;
    private javax.swing.JLabel lbl_name3;
    private javax.swing.JLabel lbl_name4;
    private javax.swing.JLabel lbl_section;
    private javax.swing.JLabel lbl_section1;
    private javax.swing.JTextArea txta_address;
    private javax.swing.JTextArea txta_address1;
    private javax.swing.JTextField txtf_fname;
    private javax.swing.JTextField txtf_fname1;
    private javax.swing.JTextField txtf_id;
    private javax.swing.JTextField txtf_phone;
    private javax.swing.JTextField txtf_phone1;
    private javax.swing.JTextField txtf_stdRegNo;
    private javax.swing.JTextField txtf_stdRegNo1;
    private javax.swing.JTextField txtf_stdname;
    private javax.swing.JTextField txtf_stdname1;
    // End of variables declaration//GEN-END:variables
}
