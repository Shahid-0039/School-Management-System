package MAIN_PROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;          // Import SQLException
import java.util.Date;
import java.util.logging.Level;       // Import Level for logging
import java.util.logging.Logger;      // Import Logger for logging exceptions

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class std_view_data extends javax.swing.JFrame {
    Connection con;
    /**
     * Creates new form std_view_data
     */
    public std_view_data() {
        initComponents();
        String url = "jdbc:mysql://localhost/school_info";
        String user = "root";
        String pass = "";
        try {
            // Establishing database connection
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
    // Log the exception at SEVERE level for debugging
    Logger.getLogger(std_view_data.class.getName()).log(Level.SEVERE, "SQL Exception occurred", ex);

    // Show a dialog with the exception message
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_menu = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        lbl_name1 = new javax.swing.JLabel();
        select_class = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtf_id = new javax.swing.JTextField();
        search_id = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_student = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Data View");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 120));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT DATA VIEW");

        btn_menu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_menu.setText("BACK");
        btn_menu.setToolTipText("CLICK TO GO MAIN MENU");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton1.setText("CLEAR");
        jToggleButton1.setToolTipText("CLICK TO CLEAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        lbl_name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/student Register.png"))); // NOI18N

        select_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Class--", "KG", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight" }));
        select_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_classActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("SEARCH BY CLASS");

        txtf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_idActionPerformed(evt);
            }
        });

        search_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_id.setText("SEARCH ID");
        search_id.setToolTipText("CLICK TO SEARCH ID");
        search_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(select_class, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtf_id)))
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(select_class, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btn_menu, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(search_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 100));

        tbl_student.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Reg No", "Student Name", "Father  Name", "Father Mobile No", "Date of Birth", "Gender", "Class", "Section", "Admission Date", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_student);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1240, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Std_reg_form().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_menuActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbl_student.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void select_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_classActionPerformed
        
    String selectedClass = (String) select_class.getSelectedItem();

    // SQL query to get students for the selected class
    String query = "SELECT * FROM student_info WHERE class = ?";

    try {
        // Prepare the statement
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, selectedClass);  // Set the selected class as the parameter

        // Execute the query and get the result set
        ResultSet rs = pst.executeQuery();

        // Assuming a JTable named 'tbl_student' for displaying the data
        DefaultTableModel model = (DefaultTableModel) tbl_student.getModel();
        model.setRowCount(0);  // Clear the table before adding new data

        // Iterate through the result set and add each student's data to the table
        while (rs.next()) {
            // Retrieve the student's data from the result set
            int id = rs.getInt("ID");
            String regNo = rs.getString("Reg_No");
            String studentName = rs.getString("Student Name");
            String fatherName = rs.getString("Father Name");
            String fatherMobile = rs.getString("Father Mobile No");
            Date dob = rs.getDate("Date of Birth");
            String gender = rs.getString("Gender");
            String className = rs.getString("Class");
            String section = rs.getString("Section");
            Date admissionDate = rs.getDate("Admission Date");
            String address = rs.getString("Address");

            // Add data to the table model
            model.addRow(new Object[]{id, regNo, studentName, fatherName, fatherMobile, dob, gender, className, section, admissionDate, address});
        }

        // Close resources
        rs.close();
        pst.close();
    } catch (SQLException ex) {
        // Handle any SQL exceptions
        Logger.getLogger(std_view_data.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_select_classActionPerformed

    private void txtf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_idActionPerformed

    private void search_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_idActionPerformed
                                         
    // Get the student ID from the text field
    String studentId = txtf_id.getText().trim(); // Assuming txtf_id is the text field for ID input

    if (studentId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a student ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the selected class from the combo box (if you need to filter by class as well)
    String selectedClass = (String) select_class.getSelectedItem();

    // Call the method to search for the student
    searchStudentById(selectedClass, studentId);

    }//GEN-LAST:event_search_idActionPerformed
private void searchStudentById(String selectedClass, String studentId) {
    try {
        // SQL query to search for a student by ID in the selected class
        String query = "SELECT * FROM student_info WHERE class = ? AND ID = ?";

        // Prepare the statement
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, selectedClass);  // Set the selected class as the parameter
        pst.setInt(2, Integer.parseInt(studentId));  // Set the student ID from the text field

        // Execute the query and get the result set
        ResultSet rs = pst.executeQuery();

        // Assuming a JTable named 'tbl_student' for displaying the data
        DefaultTableModel model = (DefaultTableModel) tbl_student.getModel();
        model.setRowCount(0);  // Clear the table before adding new data

        // Check if the student is found
        if (rs.next()) {
            // Retrieve the student's data from the result set
            int id = rs.getInt("ID");
            String regNo = rs.getString("Reg_No");
            String studentName = rs.getString("Student Name");
            String fatherName = rs.getString("Father Name");
            String fatherMobile = rs.getString("Father Mobile No");
            Date dob = rs.getDate("Date of Birth");
            String gender = rs.getString("Gender");
            String className = rs.getString("Class");
            String section = rs.getString("Section");
            Date admissionDate = rs.getDate("Admission Date");
            String address = rs.getString("Address");

            // Add the found student's data to the table model
            model.addRow(new Object[]{id, regNo, studentName, fatherName, fatherMobile, dob, gender, className, section, admissionDate, address});
        } else {
            JOptionPane.showMessageDialog(this, "No student found with the given ID.", "Not Found", JOptionPane.INFORMATION_MESSAGE);
        }

        // Close resources
        rs.close();
        pst.close();
    } catch (SQLException ex) {
        // Handle any SQL exceptions
        Logger.getLogger(std_view_data.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
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
            java.util.logging.Logger.getLogger(std_view_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(std_view_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(std_view_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(std_view_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new std_view_data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JToggleButton search_id;
    private javax.swing.JComboBox<String> select_class;
    private javax.swing.JTable tbl_student;
    private javax.swing.JTextField txtf_id;
    // End of variables declaration//GEN-END:variables
}
