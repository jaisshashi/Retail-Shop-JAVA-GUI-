/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jais
 */
public class ShopHome extends javax.swing.JFrame {

    /**
     * Creates new form ShopHomePage
     */
    public ShopHome() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        purchase = new javax.swing.JButton();
        stock = new javax.swing.JButton();
        sale = new javax.swing.JButton();
        report = new javax.swing.JButton();
        vendor = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        closed = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 150));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\java\\netbeans\\MedicalShopManagement\\img\\rsz_qualityguarantee_icon.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 160));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("   Dashboard");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 180, 40));

        purchase.setBackground(new java.awt.Color(51, 51, 51));
        purchase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purchase.setForeground(new java.awt.Color(255, 204, 255));
        purchase.setText("Purchase");
        purchase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        purchase.setBorderPainted(false);
        purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseMouseClicked(evt);
            }
        });
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });
        jPanel1.add(purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 110, 40));

        stock.setBackground(new java.awt.Color(51, 51, 51));
        stock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stock.setForeground(new java.awt.Color(255, 204, 255));
        stock.setText("Item/Stock");
        stock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stock.setBorderPainted(false);
        stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockMouseClicked(evt);
            }
        });
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        jPanel1.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 110, 40));

        sale.setBackground(new java.awt.Color(51, 51, 51));
        sale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sale.setForeground(new java.awt.Color(255, 204, 255));
        sale.setText("Sales");
        sale.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sale.setBorderPainted(false);
        sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saleMouseClicked(evt);
            }
        });
        jPanel1.add(sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 110, 40));

        report.setBackground(new java.awt.Color(51, 51, 51));
        report.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        report.setForeground(new java.awt.Color(255, 204, 255));
        report.setText("Report");
        report.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        report.setBorderPainted(false);
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        jPanel1.add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 110, 40));

        vendor.setBackground(new java.awt.Color(51, 51, 51));
        vendor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vendor.setForeground(new java.awt.Color(255, 204, 255));
        vendor.setText("Vendor");
        vendor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vendor.setBorderPainted(false);
        vendor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendorMouseClicked(evt);
            }
        });
        jPanel1.add(vendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 110, 40));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 153, 153));
        logout.setText("Log_Out");
        logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 340, 70, 20));

        closed.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        closed.setForeground(new java.awt.Color(51, 51, 51));
        closed.setText("X");
        closed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closedMouseClicked(evt);
            }
        });
        jPanel1.add(closed, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        min.setFont(new java.awt.Font("Felix Titling", 1, 56)); // NOI18N
        min.setForeground(new java.awt.Color(51, 51, 51));
        min.setText("-");
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        jPanel1.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 20, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\wamp\\www\\ShopManagement\\img\\shopback5.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 540, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
       HomePage hp=new HomePage();
       hp.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseActionPerformed

    private void closedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closedMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closedMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void purchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseMouseClicked
        Purchase p=new Purchase();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        this.dispose();
        
        
    }//GEN-LAST:event_purchaseMouseClicked

    private void saleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleMouseClicked
        Sales s=new Sales();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_saleMouseClicked

    private void stockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockMouseClicked
      /*  Stock s=new Stock();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        this.dispose();
        */
    }//GEN-LAST:event_stockMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void vendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendorMouseClicked
       Vendor v=new Vendor();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        this.dispose();        
        
        
    }//GEN-LAST:event_vendorMouseClicked

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
       Report r=new Report();
       r.setVisible(true);
       r.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_reportActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
        Stock s=new Stock();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_stockActionPerformed

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
            java.util.logging.Logger.getLogger(ShopHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closed;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel min;
    private javax.swing.JButton purchase;
    private javax.swing.JButton report;
    private javax.swing.JButton sale;
    private javax.swing.JButton stock;
    private javax.swing.JButton vendor;
    // End of variables declaration//GEN-END:variables
}
