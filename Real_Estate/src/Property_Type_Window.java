
import java.awt.Color;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
public class Property_Type_Window extends javax.swing.JFrame {

    /**
     * Creates new form Property_Type_Window
     */
    public Property_Type_Window() {
        initComponents();

        Border panel_border = BorderFactory.createMatteBorder(0, 0, 3, 0, Color.black);
        jPanel_Tittle.setBorder(panel_border);
        
        // populate the list
        fillTypeList();
    }

    
    
    
    // createa function to populate the JList using the Type HashMap
    
    public void fillTypeList()
    {
        P_Type type = new P_Type();
        
        HashMap<String, Integer> map = type.getTypesMap();
        
        DefaultListModel listmodel = new DefaultListModel();
        
        int i = 0;
        
        for(String typeName: map.keySet())
        {
            listmodel.add(i, typeName);
            i++;
        }
        jList1.setModel(listmodel);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Tittle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_name = new javax.swing.JTextField();
        jButton_Edit_Type = new javax.swing.JButton();
        jButton_Remove_Type = new javax.swing.JButton();
        jButton_Refresh_Type = new javax.swing.JButton();
        jButton_Add_Type = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_description = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Type");

        jPanel_Tittle.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Property Type");

        javax.swing.GroupLayout jPanel_TittleLayout = new javax.swing.GroupLayout(jPanel_Tittle);
        jPanel_Tittle.setLayout(jPanel_TittleLayout);
        jPanel_TittleLayout.setHorizontalGroup(
            jPanel_TittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TittleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanel_TittleLayout.setVerticalGroup(
            jPanel_TittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TittleLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Description:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name:");

        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });

        jButton_Edit_Type.setBackground(new java.awt.Color(255, 255, 102));
        jButton_Edit_Type.setText("Edit");
        jButton_Edit_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_TypeActionPerformed(evt);
            }
        });

        jButton_Remove_Type.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Type.setText("Remove");
        jButton_Remove_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_TypeActionPerformed(evt);
            }
        });

        jButton_Refresh_Type.setBackground(new java.awt.Color(153, 0, 204));
        jButton_Refresh_Type.setText("Refresh");
        jButton_Refresh_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_TypeActionPerformed(evt);
            }
        });

        jButton_Add_Type.setBackground(new java.awt.Color(102, 255, 102));
        jButton_Add_Type.setText("Add");
        jButton_Add_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_TypeActionPerformed(evt);
            }
        });

        jTextArea_description.setColumns(20);
        jTextArea_description.setRows(5);
        jScrollPane3.setViewportView(jTextArea_description);

        jList1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Edit_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(jButton_Remove_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jButton_Refresh_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton_Add_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Remove_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Edit_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Add_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Refresh_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jButton_Add_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_TypeActionPerformed
        // add new type
        String name = jTextField_name.getText();
        String description = jTextArea_description.getText();

        P_Type type = new P_Type(0, name, description);

        if (!name.trim().equals("")) // if the type name is not empty
        {
            if (type.execTypeQuery("add", type)) {
                JOptionPane.showMessageDialog(null, "New Type Added", "Add Type", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Operation Failed", "Add Type", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter The Type Name", "Empty Name", 2);
        }
    }//GEN-LAST:event_jButton_Add_TypeActionPerformed

    private void jButton_Edit_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_TypeActionPerformed
        try {
            // edit selected type
            Integer id = Integer.valueOf(jTextField_id.getText());
            String name = jTextField_name.getText();
            String description = jTextArea_description.getText();

            P_Type type = new P_Type(id, name, description);

            if (!name.trim().equals("")) // if the type name is not empty
            {
                if (type.execTypeQuery("edit", type)) {
                    JOptionPane.showMessageDialog(null, "Type Updated", "Edit Type", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Operation Failed", "Add Type", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter The Type Name", "Empty Name", 2);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "Enter Valid Type ID", "Invalid ID", 0);
        }
    }//GEN-LAST:event_jButton_Edit_TypeActionPerformed

    private void jButton_Remove_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_TypeActionPerformed
        try {
            //Delete the selected type

            Integer id = Integer.valueOf(jTextField_id.getText());

            P_Type type = new P_Type(id, "", "");

            if (!jTextField_id.getText().trim().equals("")) // if the type ID is not empty
            {
                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you Want to Delete This Type", "Deleted Type", JOptionPane.YES_OPTION);

                if (yes_or_no == JOptionPane.YES_OPTION) {
                    if (type.execTypeQuery("remove", type)) {
                        JOptionPane.showMessageDialog(null, "Type Deleted", "Delete Type", 1);
                        
                        // clear the fields after the delete
                        jTextField_id.setText("");
                        jTextField_name.setText("");
                        jTextArea_description.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Operation Failed", "Add Type", 2);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Enter The Type ID", "Empty ID", 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Enter Valid Type ID", "Invalid ID", 0);
        }
    }//GEN-LAST:event_jButton_Remove_TypeActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        P_Type type = new P_Type();
        HashMap<String, Integer> map = type.getTypesMap();
        Integer typeId = map.get(jList1.getSelectedValue().toString());
        type = type.getTypeById(typeId);
        jTextField_id.setText(type.getId().toString());
        jTextField_name.setText(type.getName());
        jTextArea_description.setText(type.getDescription());
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton_Refresh_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_TypeActionPerformed
        fillTypeList();
    }//GEN-LAST:event_jButton_Refresh_TypeActionPerformed

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
            java.util.logging.Logger.getLogger(Property_Type_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Property_Type_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Property_Type_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Property_Type_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property_Type_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Type;
    private javax.swing.JButton jButton_Edit_Type;
    private javax.swing.JButton jButton_Refresh_Type;
    private javax.swing.JButton jButton_Remove_Type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel_Tittle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_description;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_name;
    // End of variables declaration//GEN-END:variables
}
