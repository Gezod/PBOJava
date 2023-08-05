
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
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
public class Owner_Window extends javax.swing.JFrame {

    /**
     * Creates new form Owner_Window
     */
    public Owner_Window() {
        initComponents();
        fillJtableWithOwnersData();
    }

    // populatethe jtable with owners data
    //we will create a function to populate the jtable withall the owner table using arraylist
    // after that whenthe users select an owner form the jtable all the information will be dislayed in textfileds
    public void fillJtableWithOwnersData() {
        P_Owner owner = new P_Owner();
        ArrayList<P_Owner> ownerList = owner.ownerList();

        // the jtable columns
        String[] colnames = {"ID", "First Name", "Last Name", "Phone", "Email", "Address",};

        //the jtable row
        //ownerList.size()= the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[ownerList.size()][6];

        // add data form the list to the rows
        for (int i = 0; i < ownerList.size(); i++) {
            rows[i][0] = ownerList.get(i).getId();
            rows[i][1] = ownerList.get(i).getFName();
            rows[i][2] = ownerList.get(i).getLName();
            rows[i][3] = ownerList.get(i).getPhone();
            rows[i][4] = ownerList.get(i).getEmail();
            rows[i][5] = ownerList.get(i).getAddress();
        }
        DefaultTableModel model = new DefaultTableModel(rows, colnames);
        jTable1.setModel(model);

        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(Color.blue);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Tittle3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Email = new javax.swing.JLabel();
        jTextField_LName = new javax.swing.JTextField();
        jButton_Edit_Owner = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton_Refresh_Owner = new javax.swing.JButton();
        jLabel_Phone = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_address = new javax.swing.JTextArea();
        jButton_Add_Owner = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_FName = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_FName = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel_LName = new javax.swing.JLabel();
        jButton_Remove_Owner = new javax.swing.JButton();
        jButton_Owner_Properties = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Owner Window");
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel_Tittle3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Owner Type");

        javax.swing.GroupLayout jPanel_Tittle3Layout = new javax.swing.GroupLayout(jPanel_Tittle3);
        jPanel_Tittle3.setLayout(jPanel_Tittle3Layout);
        jPanel_Tittle3Layout.setHorizontalGroup(
            jPanel_Tittle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Tittle3Layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_Tittle3Layout.setVerticalGroup(
            jPanel_Tittle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Tittle3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel_Email.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Email.setText("Email:");

        jTextField_LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LNameActionPerformed(evt);
            }
        });

        jButton_Edit_Owner.setBackground(new java.awt.Color(255, 255, 102));
        jButton_Edit_Owner.setText("Edit");
        jButton_Edit_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_OwnerActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ID:");

        jButton_Refresh_Owner.setBackground(new java.awt.Color(153, 0, 204));
        jButton_Refresh_Owner.setText("Refresh");
        jButton_Refresh_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_OwnerActionPerformed(evt);
            }
        });

        jLabel_Phone.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Phone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Phone.setText("Phone:");

        jTextArea_address.setColumns(20);
        jTextArea_address.setRows(5);
        jScrollPane3.setViewportView(jTextArea_address);

        jButton_Add_Owner.setBackground(new java.awt.Color(102, 255, 102));
        jButton_Add_Owner.setText("Add");
        jButton_Add_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_OwnerActionPerformed(evt);
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

        jButton_Remove_Owner.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Owner.setText("Remove");
        jButton_Remove_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_OwnerActionPerformed(evt);
            }
        });

        jButton_Owner_Properties.setBackground(new java.awt.Color(204, 255, 255));
        jButton_Owner_Properties.setText("Owner Properties");
        jButton_Owner_Properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Owner_PropertiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_Owner_Properties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Add_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton_Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(jButton_Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(jButton_Refresh_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_Address)
                        .addComponent(jLabel_FName)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(468, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refresh_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_Owner_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addContainerGap(177, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Tittle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Tittle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LNameActionPerformed

    private void jButton_Edit_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_OwnerActionPerformed
        // edit the owner data

        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String email = jTextField_Email.getText();
        String address = jTextArea_address.getText();

        P_Owner owner = new P_Owner();
        try {
            int ownerId = Integer.valueOf(jTextField_id.getText());
            // before editing a new ownerwe need check if the required data are empty
            // required data -> first name to address
            if (fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("") || address.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter The Required Owner Informatio[first name , last name , phone , email , address]", "Edit Owner", 2);
            } else {
                if (owner.editOwnerData(new P_Owner(ownerId, fname, lname, phone, email, address))) {
                    JOptionPane.showMessageDialog(null, "New Owner Edited", "Edit Owner", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Owner Data NOT Edited ", "Edit Owner", 2);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a valid Type ID", "Ivalid ID", 0);
        }
    }//GEN-LAST:event_jButton_Edit_OwnerActionPerformed

    private void jButton_Refresh_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_OwnerActionPerformed
        fillJtableWithOwnersData();
    }//GEN-LAST:event_jButton_Refresh_OwnerActionPerformed

    private void jButton_Add_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_OwnerActionPerformed
        //add a new owner

        //get the owner data
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String email = jTextField_Email.getText();
        String address = jTextArea_address.getText();

        P_Owner owner = new P_Owner();

        // before inserting a new ownerwe need check if the required data are empty
        // required data -> first name to address
        if (fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("") || address.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter The Required Owner Informatio[first name , last name , phone , email , address]", "Add Owner", 2);
        } else {
            if (owner.addNewOwner(new P_Owner(0, fname, lname, phone, email, address))) {
                JOptionPane.showMessageDialog(null, "New Owner Added To The System", "Add Owner", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Owner NOT Added To The System", "Add Owner", 2);
            }
        }
    }//GEN-LAST:event_jButton_Add_OwnerActionPerformed

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

    private void jButton_Remove_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_OwnerActionPerformed
        try {
            int ownerId = Integer.valueOf(jTextField_id.getText());

            P_Owner owner = new P_Owner();
            if (jTextField_id.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the Owner ID", "Empty ID", 2);
            } else {
                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you Want to Delete This Owner", "Deleted Owner", JOptionPane.YES_OPTION);

                if (yes_or_no == JOptionPane.YES_OPTION) {
                    if (owner.deleteOwner(ownerId)) {
                        JOptionPane.showMessageDialog(null, "Owner Deleted", "Delete Owner", 1);

                        //clear textfields after delete
                        jTextField_id.setText("");
                        jTextField_FName.setText("");
                        jTextField_LName.setText("");
                        jTextField_Phone.setText("");
                        jTextField_Email.setText("");
                        jTextArea_address.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "Operation Failed", "Delte Owner", 2);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Enter a Valid ID", "Invalid ID", 2);
        }

        //delete the selected owner from the system
    }//GEN-LAST:event_jButton_Remove_OwnerActionPerformed

    private void jButton_Owner_PropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Owner_PropertiesActionPerformed
        
        try {
            
            int selectedRowIndex = jTable1.getSelectedRow();
            int id = Integer.valueOf(jTable1.getValueAt(selectedRowIndex, 0).toString());
            Owner_Properties_Form ownerpropertiesform = new Owner_Properties_Form(id);
            ownerpropertiesform.setVisible(true);
            ownerpropertiesform.setExtendedState(JFrame.MAXIMIZED_BOTH);
            ownerpropertiesform.pack();
            ownerpropertiesform.setLocationRelativeTo(null);
            ownerpropertiesform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select Owner From Table First", "No Owner Selected", 2);
        }


    }//GEN-LAST:event_jButton_Owner_PropertiesActionPerformed

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
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Owner;
    private javax.swing.JButton jButton_Edit_Owner;
    private javax.swing.JButton jButton_Owner_Properties;
    private javax.swing.JButton jButton_Refresh_Owner;
    private javax.swing.JButton jButton_Remove_Owner;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_FName;
    private javax.swing.JLabel jLabel_LName;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Tittle3;
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
