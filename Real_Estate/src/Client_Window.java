
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
public class Client_Window extends javax.swing.JFrame {

    /**
     * this window and the owner are identical we can use the window if we want
     * and even the same class but we will use different ones to make it easy to
     * understand
     */
    public Client_Window() {
        initComponents();
        fillJtableWithClientsData();
    }

    public void fillJtableWithClientsData() {
        P_Client client = new P_Client();
        ArrayList<P_Client> clientList = client.clientList();

        // the jtable columns
        String[] colnames = {"ID", "First Name", "Last Name", "Phone", "Email", "Address",};

        //the jtable row
        //ownerList.size()= the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[clientList.size()][6];

        // add data form the list to the rows
        for (int i = 0; i < clientList.size(); i++) {
            rows[i][0] = clientList.get(i).getId();
            rows[i][1] = clientList.get(i).getFName();
            rows[i][2] = clientList.get(i).getLName();
            rows[i][3] = clientList.get(i).getPhone();
            rows[i][4] = clientList.get(i).getEmail();
            rows[i][5] = clientList.get(i).getAddress();
        }
        DefaultTableModel model = new DefaultTableModel(rows, colnames);
        jTable1.setModel(model);

        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(Color.green);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Tittle6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Email = new javax.swing.JLabel();
        jTextField_LName = new javax.swing.JTextField();
        jButton_Edit_Client = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton_Refresh_Client = new javax.swing.JButton();
        jLabel_Phone = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_address = new javax.swing.JTextArea();
        jButton_Add_Client = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_FName = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_FName = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel_LName = new javax.swing.JLabel();
        jButton_Remove_Client = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client Window");

        jPanel_Tittle6.setBackground(new java.awt.Color(255, 204, 153));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Client");

        javax.swing.GroupLayout jPanel_Tittle6Layout = new javax.swing.GroupLayout(jPanel_Tittle6);
        jPanel_Tittle6.setLayout(jPanel_Tittle6Layout);
        jPanel_Tittle6Layout.setHorizontalGroup(
            jPanel_Tittle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Tittle6Layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_Tittle6Layout.setVerticalGroup(
            jPanel_Tittle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Tittle6Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel_Email.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Email.setText("Email:");

        jTextField_LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LNameActionPerformed(evt);
            }
        });

        jButton_Edit_Client.setBackground(new java.awt.Color(255, 255, 102));
        jButton_Edit_Client.setText("Edit");
        jButton_Edit_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ClientActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("ID:");

        jButton_Refresh_Client.setBackground(new java.awt.Color(153, 0, 204));
        jButton_Refresh_Client.setText("Refresh");
        jButton_Refresh_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_ClientActionPerformed(evt);
            }
        });

        jLabel_Phone.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Phone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Phone.setText("Phone:");

        jTextArea_address.setColumns(20);
        jTextArea_address.setRows(5);
        jScrollPane3.setViewportView(jTextArea_address);

        jButton_Add_Client.setBackground(new java.awt.Color(102, 255, 102));
        jButton_Add_Client.setText("Add");
        jButton_Add_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ClientActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel_FName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_FName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_FName.setText("First Name:");

        jLabel_Address.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Address.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Address.setText("Address:");

        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });

        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
            }
        });

        jTextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneActionPerformed(evt);
            }
        });

        jLabel_LName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_LName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_LName.setText("Last Name:");

        jButton_Remove_Client.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Client.setText("Remove");
        jButton_Remove_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_ClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Add_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton_Edit_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton_Remove_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(jButton_Refresh_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_Address)
                        .addComponent(jLabel_FName)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Phone)
                        .addComponent(jLabel_Email)
                        .addComponent(jLabel_LName))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(483, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Remove_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refresh_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(192, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Tittle6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Tittle6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LNameActionPerformed

    private void jButton_Edit_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ClientActionPerformed
        // edit the owner data

        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String email = jTextField_Email.getText();
        String address = jTextArea_address.getText();

        P_Client client = new P_Client();
        try {
            int ownerId = Integer.valueOf(jTextField_id.getText());
            // before editing a new ownerwe need check if the required data are empty
            // required data -> first name to address
            if (fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("") || address.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter The Required Owner Informatio[first name , last name , phone , email , address]", "Edit Client", 2);
            } else {
                if (client.editClientData(new P_Client(ownerId, fname, lname, phone, email, address))) {
                    JOptionPane.showMessageDialog(null, "New Owner Edited", "Edit Owner", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Owner Data NOT Edited ", "Edit Owner", 2);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a valid Type ID", "Ivalid ID", 0);
        }
    }//GEN-LAST:event_jButton_Edit_ClientActionPerformed

    private void jButton_Refresh_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_ClientActionPerformed
        fillJtableWithClientsData();
    }//GEN-LAST:event_jButton_Refresh_ClientActionPerformed

    private void jButton_Add_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ClientActionPerformed
        //add a new client

        //get the owner data
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String email = jTextField_Email.getText();
        String address = jTextArea_address.getText();

        P_Client client = new P_Client();

        // before inserting a new ownerwe need check if the required data are empty
        // required data -> first name to address
        if (fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("") || address.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter The Required Owner Informatio[first name , last name , phone , email , address]", "Add Client", 2);
        } else {
            if (client.addNewClient(new P_Client(0, fname, lname, phone, email, address))) {
                JOptionPane.showMessageDialog(null, "New Client Added To The System", "Add Client", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Client NOT Added To The System", "Add Client", 2);
            }
        }
    }//GEN-LAST:event_jButton_Add_ClientActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // get owner data on jtable mouse click

        int selectedRowIndex = jTable1.getSelectedRow();
        jTextField_id.setText(jTable1.getValueAt(selectedRowIndex, 0).toString());
        jTextField_FName.setText(jTable1.getValueAt(selectedRowIndex, 1).toString());
        jTextField_LName.setText(jTable1.getValueAt(selectedRowIndex, 2).toString());
        jTextField_Phone.setText(jTable1.getValueAt(selectedRowIndex, 3).toString());
        jTextField_Email.setText(jTable1.getValueAt(selectedRowIndex, 4).toString());
        jTextArea_address.setText(jTable1.getValueAt(selectedRowIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jButton_Remove_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_ClientActionPerformed
        try {
            int clientId = Integer.valueOf(jTextField_id.getText());

            P_Client client = new P_Client();
            if (jTextField_id.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the Client ID", "Empty ID", 2);
            } else {
                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you Want to Delete This Client", "Deleted Client", JOptionPane.YES_OPTION);

                if (yes_or_no == JOptionPane.YES_OPTION) {
                    if (client.deleteClient(clientId)) {
                        JOptionPane.showMessageDialog(null, "Client Deleted", "Delete Client", 1);

                        //clear the textfields after the delete
                        jTextField_id.setText("");
                        jTextField_FName.setText("");
                        jTextField_LName.setText("");
                        jTextField_Phone.setText("");
                        jTextField_Email.setText("");
                        jTextArea_address.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "Operation Failed", "Delte Client", 2);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Enter a Valid ID", "Invalid ID", 2);
        }

        //delete the selected owner from the system
    }//GEN-LAST:event_jButton_Remove_ClientActionPerformed

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
            java.util.logging.Logger.getLogger(Client_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Client;
    private javax.swing.JButton jButton_Edit_Client;
    private javax.swing.JButton jButton_Refresh_Client;
    private javax.swing.JButton jButton_Remove_Client;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_FName;
    private javax.swing.JLabel jLabel_LName;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Tittle6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_address;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}
