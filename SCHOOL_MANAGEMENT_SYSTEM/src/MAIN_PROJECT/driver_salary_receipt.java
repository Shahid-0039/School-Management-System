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
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;

/**
 *
 * @author user
 */
public class driver_salary_receipt extends javax.swing.JFrame {
      Connection con = null;
      PreparedStatement pst = null;
      ResultSet rs = null; 
    /**
     * Creates new form driver_salary_receipt
     */
    public driver_salary_receipt() {
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
        jPanel2 = new javax.swing.JPanel();
        txtf_amount = new javax.swing.JTextField();
        btn_print = new javax.swing.JToggleButton();
        txtf_drmobile = new javax.swing.JTextField();
        txtf_date = new com.toedter.calendar.JDateChooser();
        btn_record = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtf_dname = new javax.swing.JTextField();
        month = new com.toedter.calendar.JMonthChooser();
        jLabel6 = new javax.swing.JLabel();
        btn_receipt = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_name7 = new javax.swing.JLabel();
        txtf_idsrch = new javax.swing.JTextField();
        btn_idsearch = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btn_main = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DRIVER SALARY");
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtf_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 240, 29));

        btn_print.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_print.setText("PRINT");
        btn_print.setToolTipText("CLICK TO PRINT THE RECEIPT");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel2.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 83, 30));
        jPanel2.add(txtf_drmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 240, 29));
        jPanel2.add(txtf_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 240, 29));

        btn_record.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_record.setText("SAVE RECORD");
        btn_record.setToolTipText("CLICK TO SAVE RECORD");
        btn_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recordActionPerformed(evt);
            }
        });
        jPanel2.add(btn_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Driver Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 122, 29));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Salary");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 122, 29));
        jPanel2.add(txtf_dname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 240, 29));
        jPanel2.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Date");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 122, 29));

        btn_receipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_receipt.setText("RECEIPT");
        btn_receipt.setToolTipText("CLICK TO TAKE RECEIPT");
        btn_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_receiptActionPerformed(evt);
            }
        });
        jPanel2.add(btn_receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 100, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Mobile No");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 122, 29));

        btn_reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reset.setText("RESET");
        btn_reset.setToolTipText("CLICK TO RESET ALL");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 96, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Salary Amount");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 122, 29));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_name7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_name7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BUS DRIVER.png"))); // NOI18N
        jPanel1.add(lbl_name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 80));
        jPanel1.add(txtf_idsrch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 162, 28));

        btn_idsearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_idsearch.setText("SEARCH");
        btn_idsearch.setToolTipText("CLICK TO SEARCH");
        btn_idsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_idsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_idsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 103, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DRIVER RECEIPT FORM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 441, 35));

        btn_main.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_main.setText("BACK");
        btn_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainActionPerformed(evt);
            }
        });
        jPanel1.add(btn_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recordActionPerformed
        // TODO add your handling code here:
        try {
            pst = con.prepareStatement("INSERT INTO driver_salary (`Driver Name`,`Mobile No`, `Date`, `Salary`, `Month`) VALUES (?, ?, ?, ?, ?)");

            pst.setString(1, txtf_dname.getText());
            pst.setString(2, txtf_drmobile.getText());
            java.sql.Date sqlBirthDate = new java.sql.Date(txtf_date.getDate().getTime());
            pst.setDate(3, sqlBirthDate);
            pst.setString(4, txtf_amount.getText());
            // Get the index of the selected month
            int monthIndex = month.getMonth();
            // Map the index to the corresponding month name
            String monthName = getMonthName(monthIndex);
            pst.setString(5, monthName);

            pst.executeUpdate(); // Use executeUpdate() for INSERT queries

            JOptionPane.showMessageDialog(this, "Record Save Successfully");

            //        txtf_tchname.setText("");
            //        txtf_tchmobile.setText("");
            //        txtf_date.setDate(null);
            //        txtf_amount.setText("");
            //        month.setName("");
            //        txtf_tchname.requestFocus();

        } catch (SQLException ex) {
            Logger.getLogger(Std_reg_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_recordActionPerformed
private String getMonthName(int monthIndex) {
        String[] monthNames = new DateFormatSymbols().getMonths();
        return monthNames[monthIndex]; }
    private void btn_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_receiptActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // TODO add your handling code here:
        txta.setText("********************************************************************************************************\n");
        txta.append("****************************************SALARY Receipt**********************************************\n");
        txta.append("****************************************------------ ----------**********************************************\n");
        txta.append("********************************************************************************************************\n\n\n");
        txta.append("\t\t\tStudent Name : \t\t" + txtf_dname.getText() + "\n\n");
        txta.append("\t\t\tMobile No  : \t\t" + txtf_drmobile.getText() + "\n\n");
        txta.append("\t\t\tDate \t: \t\t" + sdf.format(txtf_date.getDate()) + "\n\n");
        txta.append("\t\t\tSalary \t: \t\t" + txtf_amount.getText() + "\n\n"); // Use getSelectedItem instead of getItemAt
        txta.append("\t\t\tMonth \t: \t\t" + getMonthName(month.getMonth()) + "\n\n");

        txta.append("\n\n\n\n\n\n\n\n\n\n------------ -------------\t\t\t\t\t\t\t----------- -------------\n");
        txta.append("Principle Signature\t\t\t\t\t\t\tDriver Signature");
    }//GEN-LAST:event_btn_receiptActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        txta.setText("");
        txtf_dname.setText("");
        txtf_drmobile.setText("");
        txtf_date.setDateFormatString("");
        txtf_amount.setText("");
        month.setName("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
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

    private void btn_idsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_idsearchActionPerformed
        // TODO add your handling code here:
        try {
            if (!txtf_idsrch.getText().isEmpty()) {
                int stdId = Integer.parseInt(txtf_idsrch.getText());
                String sql = "SELECT * FROM driver_info WHERE ID = ?";
                pst = con.prepareStatement(sql);
                pst.setInt(1, stdId);

                rs = pst.executeQuery();
                if(rs.next()){
                    txtf_dname.setText(rs.getString("Driver Name"));
                    txtf_drmobile.setText(rs.getString("Mobile No"));
                    txtf_amount.setText(rs.getString("Salary"));
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

    private void btn_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MAIN_MENU().setVisible(true);
    }//GEN-LAST:event_btn_mainActionPerformed

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
            java.util.logging.Logger.getLogger(driver_salary_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(driver_salary_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(driver_salary_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(driver_salary_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new driver_salary_receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_idsearch;
    private javax.swing.JToggleButton btn_main;
    private javax.swing.JToggleButton btn_print;
    private javax.swing.JToggleButton btn_receipt;
    private javax.swing.JToggleButton btn_record;
    private javax.swing.JToggleButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_name7;
    private com.toedter.calendar.JMonthChooser month;
    private java.awt.TextArea txta;
    private javax.swing.JTextField txtf_amount;
    private com.toedter.calendar.JDateChooser txtf_date;
    private javax.swing.JTextField txtf_dname;
    private javax.swing.JTextField txtf_drmobile;
    private javax.swing.JTextField txtf_idsrch;
    // End of variables declaration//GEN-END:variables
}