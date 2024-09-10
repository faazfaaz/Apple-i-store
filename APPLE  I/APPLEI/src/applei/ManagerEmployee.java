/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applei;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ManagerEmployee extends javax.swing.JFrame {

    /**
     * Creates new form ManagerEmployee
     */
    public ManagerEmployee() {
        initComponents();
       
    }
    
    
    
    public  void SelectSeler() {
        try {
            // Open the file for reading (you can specify your desired file path)
            FileReader fileReader = new FileReader("Employee_data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Clear the existing table data
            DefaultTableModel model = (DefaultTableModel) JMEmployeeTable.getModel();
            model.setRowCount(0);

            // Read data from the file and add to the table
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(new Object[]{
                        data[0], // Employee ID
                        data[1], // Employee Name
                        data[2], // Contact Detail
                        data[3], // Job Role
                        data[4],  // Gender
                        data[5]
                });
            }

            // Close the file
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading data from file!");
        }
    }  
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        JMEmployeeID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JMEmployeeName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        JMEmployeeGenderCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        JMEmployeeContact = new javax.swing.JTextField();
        JMEmployeeRole = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JMEmployeeDOB = new javax.swing.JTextField();
        JMEmployeeAddButton = new javax.swing.JButton();
        JMEmployeeDeleteButton = new javax.swing.JButton();
        JMEmployeeEditButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JMEmployeeTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jCheckBox1.setText("jCheckBox1");

        jRadioButton1.setText("jRadioButton1");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JMEmployeeID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(JMEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 100, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Employee ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Employee Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        JMEmployeeName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(JMEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gender");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 50, 30));

        JMEmployeeGenderCombo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JMEmployeeGenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(JMEmployeeGenderCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 84, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Management");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 220, -1));

        JMEmployeeContact.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(JMEmployeeContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 130, -1));

        JMEmployeeRole.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(JMEmployeeRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 130, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contact Details");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Job Role");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DOB");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        JMEmployeeDOB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(JMEmployeeDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 130, -1));

        JMEmployeeAddButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JMEmployeeAddButton.setText("ADD");
        JMEmployeeAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMEmployeeAddButtonMouseClicked(evt);
            }
        });
        JMEmployeeAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMEmployeeAddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(JMEmployeeAddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        JMEmployeeDeleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JMEmployeeDeleteButton.setText("DELETE");
        JMEmployeeDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMEmployeeDeleteButtonMouseClicked(evt);
            }
        });
        JMEmployeeDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMEmployeeDeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(JMEmployeeDeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        JMEmployeeEditButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JMEmployeeEditButton.setText("EDIT");
        JMEmployeeEditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMEmployeeEditButtonMouseClicked(evt);
            }
        });
        JMEmployeeEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMEmployeeEditButtonActionPerformed(evt);
            }
        });
        getContentPane().add(JMEmployeeEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        JMEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Role", "Contact", "DOB", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JMEmployeeTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 630, 110));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee List");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 74, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 12, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/404757.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -50, 950, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMEmployeeAddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMEmployeeAddButtonMouseClicked
        if (JMEmployeeID.getText().isEmpty() || JMEmployeeName.getText().isEmpty() || JMEmployeeContact.getText().isEmpty() || JMEmployeeRole.getText().isEmpty()||JMEmployeeDOB.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        } else {
            try {
                // Open the file for writing (you can specify your desired file path)
                FileWriter fileWriter = new FileWriter("Employee_data.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Write the data into the file
                String dataToWrite = JMEmployeeID.getText() + "," +
                JMEmployeeName.getText() + "," +
                JMEmployeeContact.getText() + "," +
                JMEmployeeRole.getText() + "," +
                JMEmployeeDOB.getText() + "," +
                JMEmployeeGenderCombo.getSelectedItem().toString();
                bufferedWriter.write(dataToWrite);
                bufferedWriter.newLine();

                // Close the file
                bufferedWriter.close();

                // Display a success message
                JOptionPane.showMessageDialog(this, "Employee Added Successfully!");

                // Clear the input fields
                JMEmployeeID.setText("");
                JMEmployeeName.setText("");
                JMEmployeeContact.setText("");
                JMEmployeeRole.setText("");
                JMEmployeeDOB.setText("");

                // Update the table
                SelectSeler(); // This is the corrected call to the method.

            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving data to file!");
            }
        }

    }//GEN-LAST:event_JMEmployeeAddButtonMouseClicked

    private void JMEmployeeAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMEmployeeAddButtonActionPerformed

    }//GEN-LAST:event_JMEmployeeAddButtonActionPerformed

    private void JMEmployeeDeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMEmployeeDeleteButtonMouseClicked
        if (JMEmployeeID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Employee ID to be Deleted");
        } else {
            try {
                // Open the file for reading and writing
                FileReader fileReader = new FileReader("Employee_data.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String productID = JMEmployeeID.getText();
                String line;
                StringBuilder data = new StringBuilder();
                boolean found = false; // Flag to check if the ID is found

                // Read data from the file and remove the matching product ID
                while ((line = bufferedReader.readLine()) != null) {
                    String[] productData = line.split(",");
                    if (!productData[0].equals(productID)) {
                        data.append(line).append("\n");
                    } else {
                        found = true; // Employee ID found
                    }
                }

                // Close the file
                bufferedReader.close();

                // If Employee ID was not found, display a message
                if (!found) {
                    JOptionPane.showMessageDialog(this, "Employee ID not found!");
                } else {
                    // Write the updated data back to the file
                    FileWriter fileWriter = new FileWriter("Employee_data.txt");
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(data.toString());
                    bufferedWriter.close();

                    // Display a success message
                    JOptionPane.showMessageDialog(this, "Employee Deleted Successfully");

                    // Clear the input fields
                    JMEmployeeID.setText("");
                    JMEmployeeName.setText("");
                    JMEmployeeContact.setText("");
                    JMEmployeeRole.setText("");
                    JMEmployeeDOB.setText("");

                    // Update the table
                    SelectSeler();
                }

            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error deleting data from file!");
            }
        }
    }//GEN-LAST:event_JMEmployeeDeleteButtonMouseClicked

    private void JMEmployeeDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMEmployeeDeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMEmployeeDeleteButtonActionPerformed

    private void JMEmployeeEditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMEmployeeEditButtonMouseClicked

    }//GEN-LAST:event_JMEmployeeEditButtonMouseClicked

    private void JMEmployeeEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMEmployeeEditButtonActionPerformed
        if (JMEmployeeID.getText().isEmpty() || JMEmployeeName.getText().isEmpty() || JMEmployeeContact.getText().isEmpty() || JMEmployeeRole.getText().isEmpty() || JMEmployeeGenderCombo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        } else {
            try {
                // Open the file for reading and writing
                FileReader fileReader = new FileReader("Employee_data.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String productID = JMEmployeeID.getText();
                String line;
                StringBuilder data = new StringBuilder();

                // Read data from the file and modify the matching product ID
                while ((line = bufferedReader.readLine()) != null) {
                    String[] productData = line.split(",");
                    if (productData[0].equals(productID)) {
                        // Modify the data
                        String newData = productID + "," +
                        JMEmployeeName.getText() + "," +
                        JMEmployeeContact.getText() + "," +
                        JMEmployeeContact.getText() + "," +
                        JMEmployeeDOB.getText() + "," +
                        JMEmployeeGenderCombo.getSelectedItem().toString();

                        data.append(newData).append("\n");
                    } else {
                        // Keep the existing data unchanged
                        data.append(line).append("\n");
                    }
                }

                // Close the file
                bufferedReader.close();

                // Write the updated data back to the file
                FileWriter fileWriter = new FileWriter("Employee_data.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(data.toString());
                bufferedWriter.close();

                // Display a success message
                JOptionPane.showMessageDialog(this, "Employee Updated!");

                // Clear the input fields
                JMEmployeeID.setText("");
                JMEmployeeName.setText("");
                JMEmployeeContact.setText("");
                JMEmployeeRole.setText("");
                JMEmployeeDOB.setText("");

                // Update the table
                SelectSeler();

            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error updating data in file!");
            }
        }
    }//GEN-LAST:event_JMEmployeeEditButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ManagerUI managerUI = new ManagerUI();
        managerUI.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JMEmployeeAddButton;
    private javax.swing.JTextField JMEmployeeContact;
    private javax.swing.JTextField JMEmployeeDOB;
    private javax.swing.JButton JMEmployeeDeleteButton;
    private javax.swing.JButton JMEmployeeEditButton;
    private javax.swing.JComboBox<String> JMEmployeeGenderCombo;
    private javax.swing.JTextField JMEmployeeID;
    private javax.swing.JTextField JMEmployeeName;
    private javax.swing.JTextField JMEmployeeRole;
    private javax.swing.JTable JMEmployeeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
