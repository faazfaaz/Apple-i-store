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




/**
 *
 * @author FAYAZ
 */
public class ManageProduct extends javax.swing.JFrame {
 

    /**
     * Creates new form ManageProduct
     */
    public ManageProduct() {
        initComponents();
        
       
        
    }
    
     public DefaultTableModel getJMPTableModel() {
        return (DefaultTableModel) JMPTable.getModel();
    }
    
 public  void SelectSeler() {
        try {
            // Open the file for reading (you can specify your desired file path)
            FileReader fileReader = new FileReader("Product_data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Clear the existing table data
            DefaultTableModel model = (DefaultTableModel) JMPTable.getModel();
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
                        data[4]  // Gender
                });
            }

            // Close the file
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading data from file!");
        }
    }
    
    

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        JMPAddbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JMPDeletebutton = new javax.swing.JButton();
        JMProductID = new javax.swing.JTextField();
        JMPEditbutton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JMPTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        JMProductName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JMProductQty = new javax.swing.JTextField();
        JMPCatogorieCombobox = new javax.swing.JComboBox<>();
        JMPrice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Catogorie");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 70, 30));

        JMPAddbutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JMPAddbutton.setText("ADD");
        JMPAddbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMPAddbuttonMouseClicked(evt);
            }
        });
        JMPAddbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMPAddbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(JMPAddbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product Management");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 12, -1, -1));

        JMPDeletebutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JMPDeletebutton.setText("DELETE");
        JMPDeletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMPDeletebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(JMPDeletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));
        getContentPane().add(JMProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, 30));

        JMPEditbutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JMPEditbutton.setText("EDIT");
        JMPEditbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMPEditbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(JMPEditbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Product ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        JMPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Product Qty", "Product Price", "Catogorie"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JMPTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMPTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JMPTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 570, 170));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Product Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 146, -1, -1));
        getContentPane().add(JMProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product List");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 130, 50));
        getContentPane().add(JMProductQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 100, 30));

        JMPCatogorieCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "i Phone", "i Watch.Apple TV", "i Pad", "Mac", "Air Pods" }));
        JMPCatogorieCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMPCatogorieComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(JMPCatogorieCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));
        getContentPane().add(JMPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 100, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Quantity");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Price");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/404757.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 940, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMPAddbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMPAddbuttonMouseClicked

    }//GEN-LAST:event_JMPAddbuttonMouseClicked

    private void JMPAddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMPAddbuttonActionPerformed
        if (JMProductID.getText().isEmpty() || JMProductName.getText().isEmpty() || JMProductQty.getText().isEmpty() || JMPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        } else {
            try {
                // Open the file for writing (you can specify your desired file path)
                FileWriter fileWriter = new FileWriter("product_data.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Write the data into the file
                String dataToWrite = JMProductID.getText() + "," +
                JMProductName.getText() + "," +
                JMProductQty.getText() + "," +
                JMPrice.getText() + "," +
                JMPCatogorieCombobox.getSelectedItem().toString();
                bufferedWriter.write(dataToWrite);
                bufferedWriter.newLine();

                // Close the file
                bufferedWriter.close();

                // Display a success message
                JOptionPane.showMessageDialog(this, "Product Added Successfully!");

                // Clear the input fields
                JMProductID.setText("");
                JMProductName.setText("");
                JMProductQty.setText("");
                JMPrice.setText("");

                // Update the table
                SelectSeler(); // This is the corrected call to the method.

            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving data to file!");
            }
        }
    }//GEN-LAST:event_JMPAddbuttonActionPerformed

    private void JMPDeletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMPDeletebuttonActionPerformed
        if (JMProductID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Product ID to be Deleted");
        } else {
            try {
                String productID = JMProductID.getText();
                boolean productFound = false; // Flag to keep track of whether the product was found or not
                StringBuilder data = new StringBuilder();

                // Open the file for reading and writing
                FileReader fileReader = new FileReader("product_data.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;

                // Read data from the file and remove the matching product ID
                while ((line = bufferedReader.readLine()) != null) {
                    String[] productData = line.split(",");
                    if (!productData[0].equals(productID)) {
                        data.append(line).append("\n");
                    } else {
                        productFound = true; // Product found in the file
                    }
                }

                // Close the file
                bufferedReader.close();

                if (!productFound) {
                    // Product ID not found, display message and return
                    JOptionPane.showMessageDialog(this, "Product ID not found!");
                    return;
                }

                // Write the updated data back to the file
                FileWriter fileWriter = new FileWriter("product_data.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(data.toString());
                bufferedWriter.close();

                // Display a success message
                JOptionPane.showMessageDialog(this, "Product Deleted Successfully");

                // Clear the input fields
                JMProductID.setText("");
                JMProductName.setText("");
                JMProductQty.setText("");
                JMPrice.setText("");

                // Update the table
                SelectSeler();

            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error deleting data from file!");
            }
        }
    }//GEN-LAST:event_JMPDeletebuttonActionPerformed

    private void JMPEditbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMPEditbuttonActionPerformed
        if (JMProductID.getText().isEmpty() || JMProductName.getText().isEmpty() || JMProductQty.getText().isEmpty() || JMPrice.getText().isEmpty() || JMPCatogorieCombobox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        } else {
            try {
                // Open the file for reading and writing
                FileReader fileReader = new FileReader("product_data.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String productID = JMProductID.getText();
                String line;
                StringBuilder data = new StringBuilder();

                // Read data from the file and modify the matching product ID
                while ((line = bufferedReader.readLine()) != null) {
                    String[] productData = line.split(",");
                    if (productData[0].equals(productID)) {
                        // Modify the data
                        String newData = productID + "," +
                        JMProductName.getText() + "," +
                        JMProductQty.getText() + "," +
                        JMPrice.getText() + "," +
                        JMPCatogorieCombobox.getSelectedItem().toString();
                        data.append(newData).append("\n");
                    } else {
                        // Keep the existing data unchanged
                        data.append(line).append("\n");
                    }
                }

                // Close the file
                bufferedReader.close();

                // Write the updated data back to the file
                FileWriter fileWriter = new FileWriter("product_data.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(data.toString());
                bufferedWriter.close();

                // Display a success message
                JOptionPane.showMessageDialog(this, "Product Updated!");

                // Clear the input fields
                JMProductID.setText("");
                JMProductName.setText("");
                JMProductQty.setText("");
                JMPrice.setText("");

                // Update the table
                SelectSeler();

            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error updating data in file!");
            }
        }
    }//GEN-LAST:event_JMPEditbuttonActionPerformed

    private void JMPTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMPTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JMPTableMouseClicked

    private void JMPCatogorieComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMPCatogorieComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMPCatogorieComboboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ManagerUI ml = new ManagerUI();
        ml.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    





     
    
    
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
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JMPAddbutton;
    private javax.swing.JComboBox<String> JMPCatogorieCombobox;
    private javax.swing.JButton JMPDeletebutton;
    private javax.swing.JButton JMPEditbutton;
    private javax.swing.JTable JMPTable;
    private javax.swing.JTextField JMPrice;
    private javax.swing.JTextField JMProductID;
    private javax.swing.JTextField JMProductName;
    private javax.swing.JTextField JMProductQty;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
