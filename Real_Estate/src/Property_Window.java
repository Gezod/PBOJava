
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
public class Property_Window extends javax.swing.JFrame {

    P_Type type = new P_Type();
    HashMap<String, Integer> map = type.getTypesMap();

    public Property_Window() {
        initComponents();
        bindCombo();
    }

    // create a function to populate the jcombobox with types data
    public void bindCombo() {

        for (String s : map.keySet()) {
            jComboBox_Type.addItem(s);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Tittle3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Email = new javax.swing.JLabel();
        jTextField_Size = new javax.swing.JTextField();
        jButton_Edit_Property = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_desc_com = new javax.swing.JTextArea();
        jButton_Add_Property = new javax.swing.JButton();
        jLabel_FName = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_Price = new javax.swing.JTextField();
        jTextField_Owner_Id = new javax.swing.JTextField();
        jLabel_LName = new javax.swing.JLabel();
        jButton_Remove_Property = new javax.swing.JButton();
        jButton_search = new javax.swing.JButton();
        jComboBox_Type = new javax.swing.JComboBox<>();
        jLabel_LName1 = new javax.swing.JLabel();
        jSpinner_bedrooms = new javax.swing.JSpinner();
        jLabel_LName2 = new javax.swing.JLabel();
        jSpinner_age_house = new javax.swing.JSpinner();
        jLabel_LName3 = new javax.swing.JLabel();
        jSpinner_Bathrooms = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel_LName4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_addresss = new javax.swing.JTextArea();
        jCheckBox_Balcony = new javax.swing.JCheckBox();
        jCheckBox_Pool = new javax.swing.JCheckBox();
        jCheckBox_Backyard = new javax.swing.JCheckBox();
        jCheckBox_Garage = new javax.swing.JCheckBox();
        jButton_Show_Property = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Window");

        jPanel1.setBackground(new java.awt.Color(204, 0, 102));

        jPanel_Tittle3.setBackground(new java.awt.Color(153, 255, 102));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Property");

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

        jPanel2.setBackground(new java.awt.Color(102, 255, 0));

        jLabel_Email.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Email.setText("Price(usd):");

        jTextField_Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SizeActionPerformed(evt);
            }
        });

        jButton_Edit_Property.setBackground(new java.awt.Color(255, 255, 102));
        jButton_Edit_Property.setText("Edit");
        jButton_Edit_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_PropertyActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ID:");

        jLabel_Phone.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Phone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Phone.setText("Owner Id:");

        jTextArea_desc_com.setColumns(20);
        jTextArea_desc_com.setRows(5);
        jScrollPane3.setViewportView(jTextArea_desc_com);

        jButton_Add_Property.setBackground(new java.awt.Color(102, 102, 255));
        jButton_Add_Property.setText("Add");
        jButton_Add_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_PropertyActionPerformed(evt);
            }
        });

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

        jTextField_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PriceActionPerformed(evt);
            }
        });

        jTextField_Owner_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Owner_IdActionPerformed(evt);
            }
        });

        jLabel_LName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_LName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_LName.setText("Square Feet:");

        jButton_Remove_Property.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Property.setText("Remove");
        jButton_Remove_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_PropertyActionPerformed(evt);
            }
        });

        jButton_search.setBackground(new java.awt.Color(102, 255, 204));
        jButton_search.setText("Search");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jComboBox_Type.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TypeActionPerformed(evt);
            }
        });

        jLabel_LName1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_LName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_LName1.setText("Bedrooms:");

        jSpinner_bedrooms.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSpinner_bedrooms.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel_LName2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_LName2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_LName2.setText("Description/Comment:");

        jSpinner_age_house.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSpinner_age_house.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel_LName3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_LName3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_LName3.setText("Bathrooms:");

        jSpinner_Bathrooms.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSpinner_Bathrooms.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel1.setText("*0 mean brand new");

        jLabel_LName4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_LName4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_LName4.setText("Age Of The House:");

        jTextArea_addresss.setColumns(20);
        jTextArea_addresss.setRows(5);
        jScrollPane4.setViewportView(jTextArea_addresss);

        jCheckBox_Balcony.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jCheckBox_Balcony.setText("Balcony");

        jCheckBox_Pool.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jCheckBox_Pool.setText("Pool");

        jCheckBox_Backyard.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jCheckBox_Backyard.setText("Backyard");

        jCheckBox_Garage.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jCheckBox_Garage.setText("Garage");

        jButton_Show_Property.setBackground(new java.awt.Color(255, 204, 204));
        jButton_Show_Property.setText("Show Properties");
        jButton_Show_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Show_PropertyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_Address)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Add_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_Edit_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton_Remove_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton_Show_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_LName2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_LName1)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_bedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_LName3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner_Bathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_LName4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_age_house, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_Backyard)
                            .addComponent(jCheckBox_Garage)
                            .addComponent(jCheckBox_Pool)
                            .addComponent(jCheckBox_Balcony))))
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_FName)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Phone)
                        .addComponent(jLabel_Email)
                        .addComponent(jLabel_LName))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Owner_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                        .addComponent(jTextField_Price, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                        .addComponent(jTextField_Size, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                    .addContainerGap(688, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton_search)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Edit_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Remove_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Add_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Show_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_LName1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_bedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_Balcony))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_LName3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_Bathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_Pool))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_LName4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_Backyard))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinner_age_house, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox_Garage, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_LName2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Owner_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(361, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Tittle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Tittle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_TypeActionPerformed

    private void jButton_Remove_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_PropertyActionPerformed
        try {
            int id = Integer.valueOf(jTextField_id.getText());

            P_Property property = new P_Property();
            if (jTextField_id.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the Remove ID", "Empty ID", 2);
            } else {
                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you Want to Delete This Property", "Deleted Client", JOptionPane.YES_OPTION);

                if (yes_or_no == JOptionPane.YES_OPTION) {
                    if (property.removeProperty(id)) {
                        JOptionPane.showMessageDialog(null, "Property Deleted", "Delete Property", 1);
                        // clear all fields values after deleting the property

                        jTextField_id.setText("");
                        jTextArea_addresss.setText("");
                        jTextArea_desc_com.setText("");
                        jTextField_Price.setText("");
                        jTextField_Size.setText("");
                        jTextField_Owner_Id.setText("");

                        jComboBox_Type.setSelectedIndex(0);

                        jSpinner_Bathrooms.setValue(0);
                        jSpinner_bedrooms.setValue(0);
                        jSpinner_age_house.setValue(0);

                        jCheckBox_Balcony.setSelected(false);

                        jCheckBox_Backyard.setSelected(false);

                        jCheckBox_Pool.setSelected(false);

                        jCheckBox_Garage.setSelected(false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Operation Failed", "Delte Client", 2);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Enter a Valid ID", "Invalid ID", 2);
        }

    }//GEN-LAST:event_jButton_Remove_PropertyActionPerformed

    private void jTextField_Owner_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Owner_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Owner_IdActionPerformed

    private void jTextField_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PriceActionPerformed

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jButton_Add_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_PropertyActionPerformed
        // add a new property to the system
        // get the property data from text
        try {
            // we need to populate the jcombobox with the type data
            // and get value (the value associated with the string)
            int type = map.get(jComboBox_Type.getSelectedItem().toString());
            int ownerId = Integer.valueOf(jTextField_Owner_Id.getText());
            int squarefeet = Integer.valueOf(jTextField_Size.getText());
            int bedrooms = Integer.valueOf(jSpinner_bedrooms.getValue().toString());
            int bathrooms = Integer.valueOf(jSpinner_Bathrooms.getValue().toString());
            int age = Integer.valueOf(jSpinner_age_house.getValue().toString());
            boolean haveBalcony = false;
            boolean havePool = false;
            boolean haveBackyard = false;
            boolean haveGarage = false;

            if (jCheckBox_Balcony.isSelected()) {
                haveBalcony = true;
            }
            if (jCheckBox_Backyard.isSelected()) {
                haveBackyard = true;
            }
            if (jCheckBox_Pool.isSelected()) {
                havePool = true;
            }
            if (jCheckBox_Garage.isSelected()) {
                haveGarage = true;
            }

            String price = jTextField_Price.getText();
            String address = jTextArea_addresss.getText();
            String description = jTextArea_desc_com.getText();

            P_Property property = new P_Property(0, type, squarefeet, ownerId, price, address, bedrooms, bathrooms, age, haveBalcony, havePool, haveBackyard, haveGarage, description);
            if (new P_Property().addNewProperty(property)) {
                JOptionPane.showMessageDialog(null, "New Property Added The System", "Add Property", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Property NOT addedTo The System", "Add Property", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error", "Error", 0);
        }
        // we need to populate the jcombobox with the type names


    }//GEN-LAST:event_jButton_Add_PropertyActionPerformed

    private void jButton_Edit_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_PropertyActionPerformed
        try {
            // we need to populate the jcombobox with the type data
            // and get value (the value associated with the string)
            int id = Integer.valueOf(jTextField_id.getText());
            int type = map.get(jComboBox_Type.getSelectedItem().toString());
            int ownerId = Integer.valueOf(jTextField_Owner_Id.getText());
            int squarefeet = Integer.valueOf(jTextField_Size.getText());
            int bedrooms = Integer.valueOf(jSpinner_bedrooms.getValue().toString());
            int bathrooms = Integer.valueOf(jSpinner_Bathrooms.getValue().toString());
            int age = Integer.valueOf(jSpinner_age_house.getValue().toString());
            boolean haveBalcony = false;
            boolean havePool = false;
            boolean haveBackyard = false;
            boolean haveGarage = false;

            if (jCheckBox_Balcony.isSelected()) {
                haveBalcony = true;
            }
            if (jCheckBox_Backyard.isSelected()) {
                haveBackyard = true;
            }
            if (jCheckBox_Pool.isSelected()) {
                havePool = true;
            }
            if (jCheckBox_Garage.isSelected()) {
                haveGarage = true;
            }

            String price = jTextField_Price.getText();
            String address = jTextArea_addresss.getText();
            String description = jTextArea_desc_com.getText();

            P_Property property = new P_Property(id, type, squarefeet, ownerId, price, address, bedrooms, bathrooms, age, haveBalcony, havePool, haveBackyard, haveGarage, description);
            if (new P_Property().editProperty(property)) {
                JOptionPane.showMessageDialog(null, "Property Edited Updated", "Edit Property", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Property NOT Edited The System", "Edit Property", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error", "Error", 0);
        }
        // we need to populate the jcombobox with the type names


    }//GEN-LAST:event_jButton_Edit_PropertyActionPerformed

    private void jTextField_SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SizeActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        // search propertyby id
        // and displaythe property data

        try {
            int propertyId = Integer.valueOf(jTextField_id.getText());

            P_Property property = new P_Property().findProperty(propertyId);

            if (property != null) {
                jTextArea_addresss.setText(property.getAddress());
                jTextArea_desc_com.setText(property.getAddress());
                jTextField_Price.setText(property.getPrice());
                jTextField_Size.setText(String.valueOf(property.getSize()));
                jTextField_Owner_Id.setText(String.valueOf(property.getOwnerId()));

                jComboBox_Type.setSelectedItem(map.get(property.getType()));

                // displaying he property type in the combobox
                for (Object type : map.keySet()) {
                    if (map.get(type).equals(property.getType())) {
                        jComboBox_Type.setSelectedItem(type);
                    }
                }

                jSpinner_Bathrooms.setValue(property.getBathrooms());
                jSpinner_bedrooms.setValue(property.getBedrooms());
                jSpinner_age_house.setValue(property.getAge());

                if (property.isBalcone()) {
                    jCheckBox_Balcony.setSelected(true);
                }
                if (property.isBackyard()) {
                    jCheckBox_Backyard.setSelected(true);
                }
                if (property.isPool()) {
                    jCheckBox_Pool.setSelected(true);
                }
                if (property.isGarage()) {
                    jCheckBox_Garage.setSelected(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Property Not Found", "Error", 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error", "Error", 0);
        }
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_Show_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Show_PropertyActionPerformed
        Show_Properties showpropertiesform = new Show_Properties();
        showpropertiesform.setVisible(true);
        showpropertiesform.setExtendedState(JFrame.MAXIMIZED_BOTH);
        showpropertiesform.pack();
        showpropertiesform.setLocationRelativeTo(null);
        showpropertiesform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_Show_PropertyActionPerformed

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
            java.util.logging.Logger.getLogger(Property_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Property_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Property_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Property_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Property;
    private javax.swing.JButton jButton_Edit_Property;
    private javax.swing.JButton jButton_Remove_Property;
    private javax.swing.JButton jButton_Show_Property;
    private javax.swing.JButton jButton_search;
    private javax.swing.JCheckBox jCheckBox_Backyard;
    private javax.swing.JCheckBox jCheckBox_Balcony;
    private javax.swing.JCheckBox jCheckBox_Garage;
    private javax.swing.JCheckBox jCheckBox_Pool;
    private javax.swing.JComboBox<String> jComboBox_Type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_FName;
    private javax.swing.JLabel jLabel_LName;
    private javax.swing.JLabel jLabel_LName1;
    private javax.swing.JLabel jLabel_LName2;
    private javax.swing.JLabel jLabel_LName3;
    private javax.swing.JLabel jLabel_LName4;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Tittle3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner_Bathrooms;
    private javax.swing.JSpinner jSpinner_age_house;
    private javax.swing.JSpinner jSpinner_bedrooms;
    private javax.swing.JTextArea jTextArea_addresss;
    private javax.swing.JTextArea jTextArea_desc_com;
    private javax.swing.JTextField jTextField_Owner_Id;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Size;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}
