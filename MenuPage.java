/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package foodcafeproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Dhruv Gala
 */
public class MenuPage extends javax.swing.JFrame {
    int k=0,m=0,c=0,v=0;
        
    /**
     * Creates new form MenuPage
     */
    public MenuPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        MargheritaCart = new javax.swing.JButton();
        VeggieParadiseCart = new javax.swing.JButton();
        CheeseNCornCart = new javax.swing.JButton();
        removeMargherita = new javax.swing.JButton();
        removeVeggieParadise = new javax.swing.JButton();
        removeCheeseNCorn = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Margherita.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/VeggieParadise.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cheeseNdcorn.jpg"))); // NOI18N
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 380, 300));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 490, 140, 40));

        MargheritaCart.setBackground(new java.awt.Color(0, 255, 0));
        MargheritaCart.setText("Add To Cart");
        MargheritaCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MargheritaCartActionPerformed(evt);
            }
        });
        getContentPane().add(MargheritaCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 730, -1, -1));

        VeggieParadiseCart.setBackground(new java.awt.Color(0, 255, 0));
        VeggieParadiseCart.setText("Add To Cart");
        VeggieParadiseCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeggieParadiseCartActionPerformed(evt);
            }
        });
        getContentPane().add(VeggieParadiseCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, -1, -1));

        CheeseNCornCart.setBackground(new java.awt.Color(0, 255, 0));
        CheeseNCornCart.setText("Add To Cart");
        CheeseNCornCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheeseNCornCartActionPerformed(evt);
            }
        });
        getContentPane().add(CheeseNCornCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 340, -1, -1));

        removeMargherita.setBackground(new java.awt.Color(255, 51, 51));
        removeMargherita.setText("Remove");
        removeMargherita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMargheritaActionPerformed(evt);
            }
        });
        getContentPane().add(removeMargherita, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 730, -1, -1));

        removeVeggieParadise.setBackground(new java.awt.Color(255, 51, 51));
        removeVeggieParadise.setText("Remove");
        removeVeggieParadise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeVeggieParadiseActionPerformed(evt);
            }
        });
        getContentPane().add(removeVeggieParadise, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, -1, -1));

        removeCheeseNCorn.setBackground(new java.awt.Color(255, 51, 51));
        removeCheeseNCorn.setText("Remove");
        removeCheeseNCorn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCheeseNCornActionPerformed(evt);
            }
        });
        getContentPane().add(removeCheeseNCorn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 340, -1, -1));

        btnCheckout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCheckout.setText("CHECKOUT");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 560, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homepic.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close application","select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VeggieParadiseCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeggieParadiseCartActionPerformed
        // TODO add your handling code here:
        k=k+259;
        v++;
        System.out.println(k);
    }//GEN-LAST:event_VeggieParadiseCartActionPerformed

    private void CheeseNCornCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheeseNCornCartActionPerformed
        // TODO add your handling code here:
        k=k+209;
        c++;
        System.out.println(k);
    }//GEN-LAST:event_CheeseNCornCartActionPerformed

    private void MargheritaCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MargheritaCartActionPerformed
        // TODO add your handling code here:
        k=k+239;
        m++;
        System.out.println(k);
    }//GEN-LAST:event_MargheritaCartActionPerformed

    private void removeVeggieParadiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeVeggieParadiseActionPerformed
        // TODO add your handling code here:
        if(k>=259){
            k=k-259;
            v--;
            System.out.println(k);
        }
    }//GEN-LAST:event_removeVeggieParadiseActionPerformed

    private void removeCheeseNCornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCheeseNCornActionPerformed
        // TODO add your handling code here:
        if(k>=209){
            k=k-209;
            c--;
            System.out.println(k);
        }
    }//GEN-LAST:event_removeCheeseNCornActionPerformed

    private void removeMargheritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMargheritaActionPerformed
        // TODO add your handling code here:
        if(k>=239){
            k=k-239;
            m--;
            System.out.println(k);
        }
    }//GEN-LAST:event_removeMargheritaActionPerformed

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
        new BillingPage(k,c,v,m).setVisible(true);
    }//GEN-LAST:event_btnCheckoutActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheeseNCornCart;
    private javax.swing.JButton MargheritaCart;
    private javax.swing.JButton VeggieParadiseCart;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton removeCheeseNCorn;
    private javax.swing.JButton removeMargherita;
    private javax.swing.JButton removeVeggieParadise;
    // End of variables declaration//GEN-END:variables
}
