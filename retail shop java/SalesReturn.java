
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jais
 */
public class SalesReturn extends javax.swing.JFrame {

    /**
     * Creates new form PurchaseReturn
     */
    public SalesReturn() {
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
        jLabel1 = new javax.swing.JLabel();
        tot = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        sale = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        custnm = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        closed = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        itemnm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        item = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 150));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 0));
        jLabel1.setText("Return Item to Shop");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 240, -1));

        tot.setEditable(false);
        jPanel1.add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 60, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 0));
        jLabel2.setText("Sale Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));
        jPanel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 50, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 0));
        jLabel4.setText("Total Amount");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 130, -1));
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 50, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 0));
        jLabel6.setText("Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 50, 30));
        jPanel1.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 60, 30));

        sale.setText("Sales");
        sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saleMouseClicked(evt);
            }
        });
        jPanel1.add(sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 70, -1));

        jButton5.setText("Cancel");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jButton1.setText("Home");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 360, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 0));
        jLabel7.setText("Customer Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, -1));

        custnm.setEditable(false);
        jPanel1.add(custnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 0));
        jLabel9.setText("Quantity");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 197, -1, 20));

        closed.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        closed.setForeground(new java.awt.Color(255, 204, 255));
        closed.setText("X");
        closed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closedMouseClicked(evt);
            }
        });
        jPanel1.add(closed, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 20, 20));

        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 204, 51));
        search.setText("Find");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        itemnm.setEditable(false);
        jPanel1.add(itemnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 180, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 0));
        jLabel8.setText("Item Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, 30));

        item.setIcon(new javax.swing.ImageIcon("C:\\java\\netbeans\\MedicalShopManagement\\img\\brown back.jpg")); // NOI18N
        item.setText("jLabel5");
        jPanel1.add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void closedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closedMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closedMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Sales s=new Sales();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ShopHome s=new ShopHome();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void saleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleMouseClicked
        Sales s=new Sales();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_saleMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
         int id=Integer.parseInt(sid.getText());
            int log=0;
          try {
             Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop","root","");
             Statement s=con.createStatement();
            String query="select * from sale";
            ResultSet rs=s.executeQuery(query);
            while(rs.next())
                if(rs.getInt("sid")==id){
                itemnm.setText(rs.getString("item"));
                custnm.setText(rs.getString("customer"));
                qty.setText(rs.getString("quantity"));
                price.setText(rs.getString("price"));
                int qtt=Integer.parseInt(rs.getString("quantity"));
                float pr=Float.parseFloat(rs.getString("price"));
                float total=qtt*pr;
                tot.setText(String.valueOf(total));
                log++;
                break;
                }
                else{
                    log=0;
                }
            if(log==0){
                JOptionPane.showMessageDialog(null, "Inavlid Id...","",JOptionPane.ERROR_MESSAGE);
                item.setText("");
                custnm.setText("");
                qty.setText("");
                price.setText("");
                tot.setText("");
            }
                    }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Purchase ID"+e,"",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      int id=Integer.parseInt(sid.getText());
        String nm="";
        try {
             Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop","root","");
             Statement s=con.createStatement();
             ResultSet rs;
              String stckquery="select * from stock";
              rs=s.executeQuery(stckquery);
         //   String query="select * from sale";
          //   r=s.executeQuery(query);
               nm=itemnm.getText();
          /*   while(r.next()){
                if(id==r.getInt("sid")){
                   nm=r.getString("item");
                    break;
                }
            }
          */  
          
          boolean flag=false;
          while(rs.next()){
            if(nm.equalsIgnoreCase(rs.getString("itemname"))){
                int quant=rs.getInt("quantity");
                if(quant>=Integer.parseInt(qty.getText()))
                {
                quant=quant+Integer.parseInt(qty.getText());
                PreparedStatement stmt=con.prepareStatement("UPDATE stock SET itemname=?,quantity=?,price=? WHERE itemname=? ");
               stmt.setString(4, nm);
               stmt.setString(1, nm);
               stmt.setInt(2, quant);
               stmt.setFloat(3,Float.parseFloat(price.getText()));
               stmt.executeUpdate();
               JOptionPane.showMessageDialog(null, "Stock Updated Succeessfully...","", JOptionPane.ERROR_MESSAGE);
               quant=0;
               flag=true;
               break;
                }
                else
                {
                   JOptionPane.showMessageDialog(null,"Stock for this item is "+quant +" only...");
                   break;
                }
            }
            
            }
          
            
        }
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Please Fill the Details...","",JOptionPane.ERROR_MESSAGE);
        }
        sid.setText("");
        custnm.setText("");
        itemnm.setText("");
        qty.setText("");
        price.setText("");
        tot.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(SalesReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesReturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closed;
    private javax.swing.JTextField custnm;
    private javax.swing.JLabel item;
    private javax.swing.JTextField itemnm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qty;
    private javax.swing.JButton sale;
    private javax.swing.JLabel search;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField tot;
    // End of variables declaration//GEN-END:variables
}
