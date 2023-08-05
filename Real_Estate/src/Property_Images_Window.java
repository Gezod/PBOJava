
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
public class Property_Images_Window extends javax.swing.JFrame {

    /**
     * Creates new form Property_Images_Window
     */
    public Property_Images_Window() {
        initComponents();
        bindCombo();
        fillJtableWithPropertiesData();
        jTable_properties.setRowHeight(40);
        jTable_properties.setSelectionBackground(Color.green);

        jTable_properties.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable_properties.getColumnModel().getColumn(1).setPreferredWidth(250);
    }

    P_Type type = new P_Type();
    HashMap<String, Integer> map = type.getTypesMap();
    String property_image_path = "";
    int propertyId = 0;

    // create a function to populate the jcombobox with types data
    public void bindCombo() {

        for (String s : map.keySet()) {
            jComboBox_types.addItem(s);
        }
    }

    public void fillJtableWithPropertiesData() {
        P_Property property = new P_Property();
        ArrayList<P_Property> propertyList = property.propertiesList();
        // 	id														

        // the jtable columns
        String[] colnames = {"ID", "Address"};

        //the jtable row
        //ownerList.size()= the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[propertyList.size()][2];

        // add data form the list to the rows
        for (int i = 0; i < propertyList.size(); i++) {
            rows[i][0] = propertyList.get(i).getId();
            rows[i][1] = propertyList.get(i).getAddress();

        }
        DefaultTableModel model = new DefaultTableModel(rows, colnames);
        jTable_properties.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_Remove_Images = new javax.swing.JButton();
        jButton_Add_Image = new javax.swing.JButton();
        jPanel_Tittle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Show_Image = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_types = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_properties = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Images = new javax.swing.JLabel();
        jButton_Browse_Image = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Images Window");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jButton_Remove_Images.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Images.setText("Remove");
        jButton_Remove_Images.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Images.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_ImagesActionPerformed(evt);
            }
        });

        jButton_Add_Image.setBackground(new java.awt.Color(102, 255, 102));
        jButton_Add_Image.setText("Add");
        jButton_Add_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ImageActionPerformed(evt);
            }
        });

        jPanel_Tittle.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Property Images");

        javax.swing.GroupLayout jPanel_TittleLayout = new javax.swing.GroupLayout(jPanel_Tittle);
        jPanel_Tittle.setLayout(jPanel_TittleLayout);
        jPanel_TittleLayout.setHorizontalGroup(
            jPanel_TittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TittleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        jPanel_TittleLayout.setVerticalGroup(
            jPanel_TittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TittleLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton_Show_Image.setBackground(new java.awt.Color(255, 255, 102));
        jButton_Show_Image.setText("Show This Property Images");
        jButton_Show_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Show_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Show_ImageActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select a Type");

        jComboBox_types.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_typesActionPerformed(evt);
            }
        });

        jTable_properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_propertiesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_properties);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select An Images");

        jLabel_Images.setBackground(new java.awt.Color(255, 204, 204));
        jLabel_Images.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Images.setOpaque(true);

        jButton_Browse_Image.setBackground(new java.awt.Color(153, 255, 204));
        jButton_Browse_Image.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Browse_Image.setText("Browse");
        jButton_Browse_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Browse_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Browse_ImageActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>*this table contains the properties id and address<BR>"
            + "              Click on the button showthe image slider</html>");

        //make a multiple label
        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html>* select an item from the list to display <BR> "
            + "Or Browser an image from your computer.</html> ");

        //make a multiple label
        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html>*this list contains the images id<BR> of the selected<BR>(select the property form the table).</html> ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_types, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_Show_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jButton_Remove_Images, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton_Browse_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton_Add_Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel_Images, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Browse_Image)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Images, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox_types))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Show_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Remove_Images, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_typesActionPerformed
        // show properties in the jtable depending on the selected type
        int typeId = map.get(jComboBox_types.getSelectedItem().toString());
        P_Property property = new P_Property();
        ArrayList<P_Property> propertyList = property.propertiesListbyType(typeId);
        // 	id														

        // the jtable columns
        String[] colnames = {"ID", "Address"};

        //the jtable row
        //ownerList.size()= the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[propertyList.size()][2];

        // add data form the list to the rows
        for (int i = 0; i < propertyList.size(); i++) {
            rows[i][0] = propertyList.get(i).getId();
            rows[i][1] = propertyList.get(i).getAddress();

        }
        DefaultTableModel model = new DefaultTableModel(rows, colnames);
        jTable_properties.setModel(model);
    }//GEN-LAST:event_jComboBox_typesActionPerformed

    private void jButton_Show_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Show_ImageActionPerformed

        try {
            // show image

            //set the property Id
            int rowIndex = jTable_properties.getSelectedRow();
            int id = Integer.valueOf(jTable_properties.getValueAt(rowIndex, 0).toString());

            if (jList1.getModel().getSize() > 0) {
                Property_Images_Slider imagesSliderform = new Property_Images_Slider(id);
                imagesSliderform.setVisible(true);
                imagesSliderform.setExtendedState(JFrame.MAXIMIZED_BOTH);
                imagesSliderform.pack();
                imagesSliderform.setLocationRelativeTo(null);
                imagesSliderform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            } else {
                JOptionPane.showMessageDialog(null, "This Property Doesn't Have Any Image To Show", "No Image Found", 2);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select The Property First", "Property Not Selected", 2);
        }


    }//GEN-LAST:event_jButton_Show_ImageActionPerformed

    private void jButton_Add_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ImageActionPerformed
        // add image
        P_Property property = new P_Property();

        if (propertyId != 0) {
            if (property.addImage(propertyId, property_image_path)) {
                JOptionPane.showMessageDialog(null, "Image Added To This Property", "Add Image", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Image Not Added To This Property", "Add Image", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select The Property First", "Property Not Selected", 2);
        }

    }//GEN-LAST:event_jButton_Add_ImageActionPerformed

    private void jButton_Remove_ImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_ImagesActionPerformed
        // remove image
        try {
            String selectedListItem = String.valueOf(jList1.getSelectedValue());
            Integer imageId = Integer.valueOf(selectedListItem);
            int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you ReallyWant To Delete This Property", "Deleted Property", JOptionPane.YES_OPTION);
            if (yes_or_no == JOptionPane.YES_OPTION) {
                if (new P_Property().removePropertyImage(imageId)) {
                    JOptionPane.showMessageDialog(null, "Property Image Deleted", "Delete Image", 1);
                    jLabel_Images.setIcon(null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operation Failed", "Delte Client", 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Image Selected", "Delte Image", 2);

        }

    }//GEN-LAST:event_jButton_Remove_ImagesActionPerformed

    //create a function to resize the image to the jlabel
    // make thisfunction allow byte[] param
    public ImageIcon resizeImage(String path, byte[] byteImage) {
        ImageIcon pic;
        if (byteImage != null) {
            pic = new ImageIcon(byteImage);
        } else {
            pic = new ImageIcon(path);
        }

        Image img = pic.getImage().getScaledInstance(jLabel_Images.getWidth(), jLabel_Images.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img);
        return image;
    }

    private void jButton_Browse_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Browse_ImageActionPerformed
        // browse image
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select The Property Image");
        fileChooser.setCurrentDirectory(new File("D:\\images"));

        // file extension
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Images", ".jpg", ".png", "jpeg");
        fileChooser.addChoosableFileFilter(fileFilter);

        int fileState = fileChooser.showSaveDialog(null);

        if (fileState == JFileChooser.APPROVE_OPTION) {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            jLabel_Images.setIcon(resizeImage(path, null));
            property_image_path = path;
        }

    }//GEN-LAST:event_jButton_Browse_ImageActionPerformed

    private void jTable_propertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_propertiesMouseClicked
        // get the property id
        int rowIndex = jTable_properties.getSelectedRow();
        propertyId = Integer.valueOf(jTable_properties.getValueAt(rowIndex, 0).toString());

        // display the selected propertyimage list in the jlist
        fillTypeList();
    }//GEN-LAST:event_jTable_propertiesMouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

        try {
            String selectedListItem = String.valueOf(jList1.getSelectedValue());
            Integer imageId = Integer.valueOf(selectedListItem);
            byte[] image = new P_Property().getImageById(imageId);
            jLabel_Images.setIcon(resizeImage("", image));
        } catch (Exception e) {
        }

        // display the selected image from the list to jlabel
        // we can use the hashmap if we want like in the "property window"
        // but here instead will create a function to image by id

    }//GEN-LAST:event_jList1MouseClicked

    //create a function to populate the JList with the selected Property Images ID
    public void fillTypeList() {
        HashMap<byte[], Integer> ImageListMap = new P_Property().propertityImagesList(propertyId);

        DefaultListModel listmodel = new DefaultListModel();

        int i = 0;

        for (Integer id : ImageListMap.values()) {
            listmodel.add(i, id);
            i++;
        }
        jList1.setModel(listmodel);
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
            java.util.logging.Logger.getLogger(Property_Images_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Property_Images_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Property_Images_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Property_Images_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property_Images_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Image;
    private javax.swing.JButton jButton_Browse_Image;
    private javax.swing.JButton jButton_Remove_Images;
    private javax.swing.JButton jButton_Show_Image;
    private javax.swing.JComboBox<String> jComboBox_types;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Images;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Tittle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_properties;
    // End of variables declaration//GEN-END:variables
}
