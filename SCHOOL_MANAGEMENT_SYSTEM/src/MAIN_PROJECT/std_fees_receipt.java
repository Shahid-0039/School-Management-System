/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MAIN_PROJECT;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author user
 */
public class std_fees_receipt extends javax.swing.JFrame {
      Connection con = null;
      PreparedStatement pst = null;
      ResultSet rs = null; 
    /**
     * Creates new form std_fees_receipt
     */
    public std_fees_receipt() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txta = new java.awt.TextArea();
        txtf_fname = new javax.swing.JTextField();
        txtf_stdname = new javax.swing.JTextField();
        txtf_amount = new javax.swing.JTextField();
        curdate = new com.toedter.calendar.JDateChooser();
        btn_reset = new javax.swing.JToggleButton();
        btn_receipt = new javax.swing.JToggleButton();
        btn_print = new javax.swing.JToggleButton();
        com_section = new javax.swing.JComboBox<>();
        com_class = new javax.swing.JComboBox<>();
        btn_record = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        btn_main1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        lbl_name1 = new javax.swing.JLabel();
        btn_idsearch = new javax.swing.JToggleButton();
        txtf_idsrch = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENT FEES RECEIPT");
        setResizable(false);

        txtf_stdname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_stdnameActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reset.setText("RESET");
        btn_reset.setToolTipText("CLICK TO RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_receipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_receipt.setText("RECEIPT");
        btn_receipt.setToolTipText("CLICK TO MAKE RECEIPT");
        btn_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_receiptActionPerformed(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_print.setText("PRINT");
        btn_print.setToolTipText("CLICK TO PRINT RECEIPT");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        com_section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECT SECTION---", "A", "B", "C", "D" }));

        com_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECT CLASS---", "KG", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT" }));

        btn_record.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_record.setText("SAVE RECORD");
        btn_record.setToolTipText("CLICK TO SAVE RECORD");
        btn_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recordActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 120));

        btn_main1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_main1.setText("BACK");
        btn_main1.setToolTipText("CLICK TO GO MAIN MENU");
        btn_main1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_main1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("STUDENT FEES RECEIPT FORM");

        lbl_name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/student Register.png"))); // NOI18N

        btn_idsearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_idsearch.setText("SEARCH");
        btn_idsearch.setToolTipText("CLICK TO SEARCH");
        btn_idsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_idsearchActionPerformed(evt);
            }
        });

        txtf_idsrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_idsrchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lbl_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtf_idsrch, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_idsearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(133, 133, 133)
                .addComponent(btn_main1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtf_idsrch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn_idsearch))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_main1)
                                .addComponent(lbl_name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Student Name");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Father Name");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Class");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Fees Amount");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Date");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Section");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_record)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtf_stdname, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(com_class, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(com_section, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(curdate, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_receipt)
                                .addGap(26, 26, 26)
                                .addComponent(btn_print)
                                .addGap(32, 32, 32)
                                .addComponent(btn_reset)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_stdname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(com_class, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(com_section, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(curdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_record)
                            .addComponent(btn_receipt)
                            .addComponent(btn_print)
                            .addComponent(btn_reset)))
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_idsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_idsearchActionPerformed
        // TODO add your handling code here:
        try {
    if (!txtf_idsrch.getText().isEmpty()) {
        int stdId = Integer.parseInt(txtf_idsrch.getText());
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
    }//GEN-LAST:event_btn_idsearchActionPerformed

    private void btn_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_receiptActionPerformed
        // TODO add your handling code here:
    txta.setText("********************************************************************************************************\n");
    txta.append("****************************************FEES Receipt*************************************************\n");
    txta.append("****************************************-------- ----------*************************************************\n");
    txta.append("********************************************************************************************************\n\n\n");        
    txta.append("\t\t\tStudent Name : \t\t" + txtf_stdname.getText() + "\n\n");
    txta.append("\t\t\tFather Name  : \t\t" + txtf_fname.getText() + "\n\n");
    txta.append("\t\t\tClass \t: \t\t" + com_class.getSelectedItem() + "\n\n"); // Use getSelectedItem instead of getAction
    txta.append("\t\t\tSection \t: \t\t" + com_section.getSelectedItem() + "\n\n"); // Use getSelectedItem instead of getItemAt
    txta.append("\t\t\tDate \t: \t\t" + curdate.getDate() + "\n\n"); // Use getDate method to get the date
    txta.append("\t\t\tFees Amount  : \t\t" + txtf_amount.getText() + "\n\n");

    txta.append("\n\n\n\n\n\n\n\n\n\n------------ -------------\t\t\t\t\t\t\t----------- -------------\n");
    txta.append("Principle Signature\t\t\t\t\t\t\tTeacher Signature");
    }//GEN-LAST:event_btn_receiptActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed

   try {
        // Create a PrinterJob
        PrinterJob job = PrinterJob.getPrinterJob();

        // Create a Printable object for the TextArea content
        Printable printable = new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                // Check if the page index is within the range
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                // Get the Graphics2D object
                Graphics2D g2d = (Graphics2D) graphics;

                // Set the translation to fit the TextArea content within the page
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                // Print the TextArea content
                txta.printAll(g2d);

                // Return that the page is printable
                return Printable.PAGE_EXISTS;
            }
        };

        // Set the Printable object for the PrinterJob
        job.setPrintable(printable);

        // Show print dialog to allow user to choose printer and set print options
        if (job.printDialog()) {
            // If user selects OK in the print dialog, print the document
            job.print();
        }
    } catch (PrinterException ex) {
        JOptionPane.showMessageDialog(this, "Printing failed: " + ex.getMessage(), "Print Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
       txta.setText("");
       txtf_stdname.setText("");
       txtf_fname.setText("");
       com_class.setActionCommand("");
       com_section.setActionCommand("");
       curdate.setDateFormatString("");
       txtf_amount.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recordActionPerformed
        // TODO add your handling code here:
        try {
        pst = con.prepareStatement("INSERT INTO student_fees (`Student Name`,`Father Name`, `Class`, `Section`, `Pay Date`, `Fees`) VALUES (?, ?, ?, ?, ?, ?)");
        
        pst.setString(1, txtf_stdname.getText());
        pst.setString(2, txtf_fname.getText());
        pst.setString(3, (String) com_class.getSelectedItem());
        pst.setString(4, (String) com_section.getSelectedItem());
        java.sql.Date sqlBirthDate = new java.sql.Date(curdate.getDate().getTime());
        pst.setDate(5, sqlBirthDate);
        pst.setString(6, txtf_amount.getText());     

        pst.executeUpdate(); // Use executeUpdate() for INSERT queries
        
        JOptionPane.showMessageDialog(this, "Record Save Successfully");
//        
//        txtf_stdname.setText("");
//        txtf_fname.setText("");
//        com_class.setActionCommand("");
//        com_section.setActionCommand("");
//        curdate.setDate(null);
//        txtf_amount.setText("");
//        txtf_stdname.requestFocus();
    } catch (SQLException ex) {
        Logger.getLogger(Std_reg_form.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btn_recordActionPerformed

    private void btn_main1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_main1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MAIN_MENU().setVisible(true);
    }//GEN-LAST:event_btn_main1ActionPerformed

    private void txtf_stdnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_stdnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_stdnameActionPerformed

    private void txtf_idsrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_idsrchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_idsrchActionPerformed

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
            java.util.logging.Logger.getLogger(std_fees_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(std_fees_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(std_fees_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(std_fees_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new std_fees_receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_idsearch;
    private javax.swing.JToggleButton btn_main1;
    private javax.swing.JToggleButton btn_print;
    private javax.swing.JToggleButton btn_receipt;
    private javax.swing.JToggleButton btn_record;
    private javax.swing.JToggleButton btn_reset;
    private javax.swing.JComboBox<String> com_class;
    private javax.swing.JComboBox<String> com_section;
    private com.toedter.calendar.JDateChooser curdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_name1;
    private java.awt.TextArea txta;
    private javax.swing.JTextField txtf_amount;
    private javax.swing.JTextField txtf_fname;
    private javax.swing.JTextField txtf_idsrch;
    private javax.swing.JTextField txtf_stdname;
    // End of variables declaration//GEN-END:variables
}
