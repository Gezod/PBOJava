
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
public class Property_Images_Slider extends javax.swing.JFrame {

    // get the property id
    static int propertyId;

    // image list
    ArrayList<byte[]> imagesList;
    
    //the image index
    int index=0;
    
    
    public Property_Images_Slider(int pId) {
        initComponents();
        this.propertyId = pId;
        Border jlabel_nav_border = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(0, 255, 0));
        jLabel_Next.setBorder(jlabel_nav_border);
        jLabel_Prev.setBorder(jlabel_nav_border);

        // get the images using the hashmap
        HashMap<byte[], Integer> map = new P_Property().propertityImagesList(propertyId);
        imagesList = new ArrayList<>(map.keySet());
        displayImage(index);
    }
    
    public void displayImage(int imageIndex) {
        Image img = new ImageIcon(imagesList.get(imageIndex)).getImage().getScaledInstance(jLabel_Images.getWidth(), jLabel_Images.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img);  
        jLabel_Images.setIcon(image);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Images = new javax.swing.JLabel();
        jLabel_Next = new javax.swing.JLabel();
        jLabel_Prev = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Image Slider");

        jLabel_Images.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Images.setOpaque(true);

        jLabel_Next.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel_Next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Next.setText(">");
        jLabel_Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Next.setOpaque(true);
        jLabel_Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_NextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_NextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_NextMouseExited(evt);
            }
        });

        jLabel_Prev.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel_Prev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Prev.setText("<");
        jLabel_Prev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Prev.setOpaque(true);
        jLabel_Prev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PrevMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PrevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PrevMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Prev, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_Images, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel_Images, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Prev, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NextMouseClicked
        // show the next image
        
        index++;
        
        if(index>=imagesList.size()) index = imagesList.size() - 1;
        
        displayImage(index);
    }//GEN-LAST:event_jLabel_NextMouseClicked

    private void jLabel_NextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NextMouseEntered
        // TODO add your handling code here:
        jLabel_Next.setBackground(Color.ORANGE);
        jLabel_Next.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_NextMouseEntered

    private void jLabel_NextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NextMouseExited
        // TODO add your handling code here:
        
        jLabel_Next.setBackground(Color.white);
        jLabel_Next.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_NextMouseExited

    private void jLabel_PrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PrevMouseClicked
        // TODO add your handling code here:
       index--;
       
       if(index < 0) index =0;
        displayImage(index);
        
    }//GEN-LAST:event_jLabel_PrevMouseClicked

    private void jLabel_PrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PrevMouseEntered
        // TODO add your handling code here:
        jLabel_Prev.setBackground(Color.ORANGE);
        jLabel_Prev.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_PrevMouseEntered

    private void jLabel_PrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PrevMouseExited
        // TODO add your handling code here:
        jLabel_Prev.setBackground(Color.white);
        jLabel_Prev.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_PrevMouseExited

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
            java.util.logging.Logger.getLogger(Property_Images_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Property_Images_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Property_Images_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Property_Images_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property_Images_Slider(propertyId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Images;
    private javax.swing.JLabel jLabel_Next;
    private javax.swing.JLabel jLabel_Prev;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
