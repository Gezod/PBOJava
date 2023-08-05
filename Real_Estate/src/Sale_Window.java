
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Sale_Window extends javax.swing.JFrame {

    /**
     * Creates new form Sale_Window
     */
    public Sale_Window() {
        initComponents();

        fillJtableProperties();
        fillJtableClients();
        fillJtableSales();

        jTable_Client.setRowHeight(40);
        jTable_Properties.setRowHeight(40);
        jTable_Sales.setRowHeight(40);
        jTable_Client.setSelectionBackground(Color.green);
        jTable_Properties.setSelectionBackground(Color.green);
        jTable_Sales.setSelectionBackground(Color.green);
    }

    public void fillJtableProperties() {
        P_Property property = new P_Property();
        ArrayList<P_Property> propertyList = property.propertiesList();
        // 	id														

        // the jtable columns
        String[] colnames = {"ID", "Owner ID", "Price"};

        //the jtable row
        //ownerList.size()= the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[propertyList.size()][3];

        // add data form the list to the rows
        for (int i = 0; i < propertyList.size(); i++) {
            rows[i][0] = propertyList.get(i).getId();
            rows[i][1] = propertyList.get(i).getOwnerId();
            rows[i][2] = propertyList.get(i).getPrice();

        }
        DefaultTableModel model = new DefaultTableModel(rows, colnames);
        jTable_Properties.setModel(model);
    }

    public void fillJtableClients() {
        P_Client client = new P_Client();
        ArrayList<P_Client> clientList = client.clientList();

        // the jtable columns
        String[] colnames = {"ID", "First Name", "Last Name"};

        //the jtable row
        //ownerList.size()= the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[clientList.size()][3];

        // add data form the list to the rows
        for (int i = 0; i < clientList.size(); i++) {
            rows[i][0] = clientList.get(i).getId();
            rows[i][1] = clientList.get(i).getFName();
            rows[i][2] = clientList.get(i).getLName();

        }
        DefaultTableModel model = new DefaultTableModel(rows, colnames);
        jTable_Client.setModel(model);

    }

    public void fillJtableSales() {
        P_Sale sale = new P_Sale();
        ArrayList<P_Sale> salesList = sale.salesList();

        // the jtable columns
        String[] colnames = {"ID", "Property", "Client", "Price", "Date"};

        //the jtable row
        //ownerList.size()= the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[salesList.size()][5];

        // add data form the list to the rows
        for (int i = 0; i < salesList.size(); i++) {
            rows[i][0] = salesList.get(i).getId();
            rows[i][1] = salesList.get(i).getPropertyId();
            rows[i][2] = salesList.get(i).getClientId();
            rows[i][3] = salesList.get(i).getFinalPrice();
            rows[i][4] = salesList.get(i).getSellingDate();

        }
        DefaultTableModel model = new DefaultTableModel(rows, colnames);
        jTable_Sales.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Tittle6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Email = new javax.swing.JLabel();
        jTextField_ClientID = new javax.swing.JTextField();
        jButton_Edit_Sale = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jButton_Add_Sale = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Properties = new javax.swing.JTable();
        jLabel_FName = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_PropertiesID = new javax.swing.JTextField();
        jTextField_FinalPrice = new javax.swing.JTextField();
        jLabel_LName = new javax.swing.JLabel();
        jButton_Remove_Sale = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Client = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser_Sale = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_Sales = new javax.swing.JTable();
        jButton_Refresh_Client = new javax.swing.JButton();
        jButton_Add_New_Client = new javax.swing.JButton();
        jButton_Refresh2 = new javax.swing.JButton();
        jButton_Add_New_Properties = new javax.swing.JButton();
        jButton_Refresh_Properties = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sale Window");

        jPanel_Tittle6.setBackground(new java.awt.Color(255, 204, 153));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sale");

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
        jLabel_Email.setText("Date:");

        jTextField_ClientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ClientIDActionPerformed(evt);
            }
        });

        jButton_Edit_Sale.setBackground(new java.awt.Color(255, 255, 102));
        jButton_Edit_Sale.setText("Edit");
        jButton_Edit_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_SaleActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("ID:");

        jLabel_Phone.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Phone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Phone.setText("Final Price");

        jButton_Add_Sale.setBackground(new java.awt.Color(51, 255, 51));
        jButton_Add_Sale.setText("Add");
        jButton_Add_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_SaleActionPerformed(evt);
            }
        });

        jTable_Properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Properties.setShowGrid(true);
        jTable_Properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_PropertiesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Properties);

        jLabel_FName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_FName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_FName.setText("Property ID:");

        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });

        jTextField_FinalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FinalPriceActionPerformed(evt);
            }
        });

        jLabel_LName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_LName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_LName.setText("Client ID:");

        jButton_Remove_Sale.setBackground(new java.awt.Color(255, 102, 102));
        jButton_Remove_Sale.setText("Remove");
        jButton_Remove_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_SaleActionPerformed(evt);
            }
        });

        jTable_Client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Client.setShowGrid(true);
        jTable_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ClientMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_Client);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Client List");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Properties List");

        jDateChooser_Sale.setDateFormatString("dd/MM/yyyy");
        jDateChooser_Sale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Sales List");

        jTable_Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Sales.setShowGrid(true);
        jTable_Sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SalesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_Sales);

        jButton_Refresh_Client.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Refresh_Client.setText("Refresh");
        jButton_Refresh_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_ClientActionPerformed(evt);
            }
        });

        jButton_Add_New_Client.setBackground(new java.awt.Color(51, 255, 51));
        jButton_Add_New_Client.setText("Add New Client");
        jButton_Add_New_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_New_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_New_ClientActionPerformed(evt);
            }
        });

        jButton_Refresh2.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Refresh2.setText("Refresh");
        jButton_Refresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh2ActionPerformed(evt);
            }
        });

        jButton_Add_New_Properties.setBackground(new java.awt.Color(51, 255, 51));
        jButton_Add_New_Properties.setText("Add New Properties");
        jButton_Add_New_Properties.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_New_Properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_New_PropertiesActionPerformed(evt);
            }
        });

        jButton_Refresh_Properties.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Refresh_Properties.setText("Refresh");
        jButton_Refresh_Properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_PropertiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Email)
                    .addComponent(jButton_Add_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Edit_Sale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Remove_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton_Refresh2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Add_New_Client)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Refresh_Client)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton_Add_New_Properties)
                        .addGap(43, 43, 43)
                        .addComponent(jButton_Refresh_Properties))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_FName)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Phone)
                        .addComponent(jLabel_LName))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField_ClientID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jTextField_PropertiesID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jTextField_FinalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addContainerGap(812, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(221, 221, 221)
                                        .addComponent(jDateChooser_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Add_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Edit_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Remove_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Add_New_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Refresh_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Refresh_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Add_New_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Refresh2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_PropertiesID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_ClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_FinalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(208, Short.MAX_VALUE)))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ClientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ClientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ClientIDActionPerformed

    private void jButton_Edit_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_SaleActionPerformed
        try {
            // edit Sale
            int id = Integer.valueOf(jTextField_id.getText());
            int propertyId = Integer.valueOf(jTextField_PropertiesID.getText());
            int clientId = Integer.valueOf(jTextField_ClientID.getText());
            String finalPrice = jTextField_FinalPrice.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String sellingdate = dateFormat.format(jDateChooser_Sale.getDate());

            P_Sale sale = new P_Sale(id, propertyId, clientId, finalPrice, sellingdate);
            if (new P_Sale().editSaleData(sale)) {
                JOptionPane.showMessageDialog(null, "Edited Sucessfully", "Edit Sale", 1);

            } else {
                JOptionPane.showMessageDialog(null, "Sale Cannot Edited", "Edit Sale", 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selected The Edited Data", "Edit Sale Error", 2);
        }
    }//GEN-LAST:event_jButton_Edit_SaleActionPerformed

    private void jButton_Add_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_SaleActionPerformed
        try {
            // add new Sale
            //int id = Integer.valueOf(jTextField_id.getText());
            int propertyId = Integer.valueOf(jTextField_PropertiesID.getText());
            int clientId = Integer.valueOf(jTextField_ClientID.getText());
            String finalPrice = jTextField_FinalPrice.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String sellingdate = dateFormat.format(jDateChooser_Sale.getDate());

            P_Sale sale = new P_Sale(0, propertyId, clientId, finalPrice, sellingdate);
            if (new P_Sale().addNewSale(sale)) {
                JOptionPane.showMessageDialog(null, "Added Successfully", "Add Sale", 1);

            } else {
                JOptionPane.showMessageDialog(null, "Cannot Added", "Add Sale", 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select The Property ID and The Client Id", "Add Sale Error", 2);
        }
    }//GEN-LAST:event_jButton_Add_SaleActionPerformed

    private void jTable_PropertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_PropertiesMouseClicked
        int selectedRowIndex = jTable_Properties.getSelectedRow();
        jTextField_PropertiesID.setText(jTable_Properties.getValueAt(selectedRowIndex, 1).toString());
        jTextField_FinalPrice.setText(jTable_Properties.getValueAt(selectedRowIndex, 2).toString());
    }//GEN-LAST:event_jTable_PropertiesMouseClicked

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jTextField_FinalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FinalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FinalPriceActionPerformed

    private void jButton_Remove_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_SaleActionPerformed
        // Delete Sale
        try {
            int id = Integer.valueOf(jTextField_id.getText());
            if (new P_Sale().deleteSale(id)) {
                JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete Sale", 1);

            } else {
                JOptionPane.showMessageDialog(null, "Delete Sale", "Delete Sale", 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Choose Data to Delete", "Delete Sale Error", 2);
        }
    }//GEN-LAST:event_jButton_Remove_SaleActionPerformed

    private void jTable_ClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClientMouseClicked
        int selectedRowIndex = jTable_Client.getSelectedRow();
        jTextField_ClientID.setText(jTable_Client.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_jTable_ClientMouseClicked

    private void jTable_SalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SalesMouseClicked
        // display the selected data
        int selectedRowIndex = jTable_Sales.getSelectedRow();
        jTextField_id.setText(jTable_Sales.getValueAt(selectedRowIndex, 0).toString());
        jTextField_PropertiesID.setText(jTable_Sales.getValueAt(selectedRowIndex, 1).toString());
        jTextField_ClientID.setText(jTable_Sales.getValueAt(selectedRowIndex, 2).toString());
        jTextField_FinalPrice.setText(jTable_Sales.getValueAt(selectedRowIndex, 3).toString());

        // display the date in jdatechooser
        Date saleDate;
        try {
            saleDate = new SimpleDateFormat("yyyy-MM-dd").parse(jTable_Sales.getValueAt(selectedRowIndex, 4).toString());
            jDateChooser_Sale.setDate(saleDate);
        } catch (ParseException ex) {
            Logger.getLogger(Sale_Window.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTable_SalesMouseClicked

    private void jButton_Refresh_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_ClientActionPerformed
        // refresh the jtable properties
        fillJtableClients();
    }//GEN-LAST:event_jButton_Refresh_ClientActionPerformed

    private void jButton_Add_New_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_New_ClientActionPerformed
        // Open the Clients form
        Client_Window clientform = new Client_Window();
        clientform.setVisible(true);
        clientform.setExtendedState(JFrame.MAXIMIZED_BOTH);
        clientform.pack();
        clientform.setLocationRelativeTo(null);
        clientform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_Add_New_ClientActionPerformed

    private void jButton_Refresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh2ActionPerformed
         fillJtableSales();
    }//GEN-LAST:event_jButton_Refresh2ActionPerformed

    private void jButton_Add_New_PropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_New_PropertiesActionPerformed
        // Open the property types form
        Property_Window propertyform = new Property_Window();
        propertyform.setVisible(true);
        propertyform.setExtendedState(JFrame.MAXIMIZED_BOTH);
        propertyform.pack();
        propertyform.setLocationRelativeTo(null);
        propertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_Add_New_PropertiesActionPerformed

    private void jButton_Refresh_PropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_PropertiesActionPerformed
        // refresh the jtable properties
        fillJtableProperties();
    }//GEN-LAST:event_jButton_Refresh_PropertiesActionPerformed

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
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_New_Client;
    private javax.swing.JButton jButton_Add_New_Properties;
    private javax.swing.JButton jButton_Add_Sale;
    private javax.swing.JButton jButton_Edit_Sale;
    private javax.swing.JButton jButton_Refresh2;
    private javax.swing.JButton jButton_Refresh_Client;
    private javax.swing.JButton jButton_Refresh_Properties;
    private javax.swing.JButton jButton_Remove_Sale;
    private com.toedter.calendar.JDateChooser jDateChooser_Sale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_FName;
    private javax.swing.JLabel jLabel_LName;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Tittle6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable_Client;
    private javax.swing.JTable jTable_Properties;
    private javax.swing.JTable jTable_Sales;
    private javax.swing.JTextField jTextField_ClientID;
    private javax.swing.JTextField jTextField_FinalPrice;
    private javax.swing.JTextField jTextField_PropertiesID;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}
