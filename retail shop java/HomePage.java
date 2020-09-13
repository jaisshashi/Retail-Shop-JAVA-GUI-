
import java.awt.event.WindowStateListener;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;


public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loginid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loginpassword = new javax.swing.JPasswordField();
        otp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        otplabel = new javax.swing.JLabel();
        submitbtn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(250, 0), new java.awt.Dimension(250, 0), new java.awt.Dimension(250, 32767));
        otptext = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        closed = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 150));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setAlignmentX(10.0F);
        jPanel1.setAlignmentY(10.0F);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("LOG IN");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 80, 31));

        loginid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        loginid.setOpaque(true);
        loginid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginidActionPerformed(evt);
            }
        });
        jPanel2.add(loginid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 255));
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 80, 30));

        loginpassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginpassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        loginpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(loginpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 150, 30));

        otp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        otp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        otp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                otpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                otpFocusLost(evt);
            }
        });
        jPanel2.add(otp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));
        jLabel3.setText("Admin Id");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 47, 74, 30));

        loginbtn.setBackground(new java.awt.Color(51, 51, 51));
        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 204, 255));
        loginbtn.setText("Log In");
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel2.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 80, -1));

        otplabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        otplabel.setForeground(new java.awt.Color(255, 204, 255));
        otplabel.setText("Captcha code");
        jPanel2.add(otplabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, -1));

        submitbtn.setBackground(new java.awt.Color(51, 51, 51));
        submitbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 204, 255));
        submitbtn.setText("Submit");
        submitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitbtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submitbtnMousePressed(evt);
            }
        });
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        jPanel2.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 263, 130, -1));

        filler1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255), 3));
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 43, 190, 140));

        otptext.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        otptext.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(otptext, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 90, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\java\\netbeans\\MedicalShopManagement\\img\\back brown3d.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 360, 310));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 55, 360, 310));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\java\\netbeans\\MedicalShopManagement\\img\\rsz_qualityguarantee_icon.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 160));

        min.setFont(new java.awt.Font("Felix Titling", 1, 56)); // NOI18N
        min.setForeground(new java.awt.Color(51, 51, 51));
        min.setText("-");
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        jPanel1.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 20, 20));

        closed.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        closed.setForeground(new java.awt.Color(51, 51, 51));
        closed.setText("X");
        closed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closedMouseClicked(evt);
            }
        });
        jPanel1.add(closed, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 20, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\wamp\\www\\ShopManagement\\img\\shopback6.jpg")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 636, 386));

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
    static String otpGenerate()
    {
        String numbers="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
                Random r=new Random();
                char[] otptxt = new char[6];
                
                for(int p=0;p<6;p++)
                    otptxt[p]=numbers.charAt(r.nextInt(numbers.length()));
                    //otptxt[i]=numbers.charAt(r.nextInt(numbers.length()));
                String otp=new String(otptxt); 
                return otp;
    }
    
    private void submitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitbtnMouseClicked
      
         
    }//GEN-LAST:event_submitbtnMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
       this.setState(ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void closedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closedMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closedMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        otplabel.setVisible(false);
        otp.setVisible(false);
        submitbtn.setVisible(false);
       otptext.setVisible(false);
        
    }//GEN-LAST:event_formWindowActivated

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
     String userid=loginid.getText();
     String password=loginpassword.getText();
     
     if(userid.equals("saurav") && password.equals("saurav")){
         otplabel.setVisible(true);
         otp.setVisible(true);
         otptext.setVisible(true);
         otp.setText("Enter Captcha code");
         submitbtn.setVisible(true);
 
         String otp=otpGenerate();
         otptext.setText(otp);
         
     }
     else{
         JOptionPane.showMessageDialog(null, "User Id or Password is Incorrect...");
         loginid.setText("");
         loginpassword.setText("");
     }
                
                   
    }//GEN-LAST:event_loginbtnMouseClicked

    private void submitbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitbtnMousePressed
        
        
        
    }//GEN-LAST:event_submitbtnMousePressed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
       
       String id=loginid.getText();
       String pass=loginpassword.getText();
       
       
       
    }//GEN-LAST:event_loginbtnActionPerformed

    private void otpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otpFocusLost
       
    }//GEN-LAST:event_otpFocusLost

    private void otpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otpFocusGained
        otp.setText("");
    }//GEN-LAST:event_otpFocusGained

    private void loginidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginidActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        String otptxt=otptext.getText();
        if(otp.getText().equals(otptxt)){
        JOptionPane.showMessageDialog(null, "Login Successfull...");
        ShopHome s=new ShopHome();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(null,"Invalid Captcha","",JOptionPane.WARNING_MESSAGE);
            loginid.setText("");
            loginpassword.setText("");
            otp.setText("");
        }
    }//GEN-LAST:event_submitbtnActionPerformed

    private void loginpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closed;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JTextField loginid;
    private javax.swing.JPasswordField loginpassword;
    private javax.swing.JLabel min;
    private javax.swing.JTextField otp;
    private javax.swing.JLabel otplabel;
    private javax.swing.JLabel otptext;
    private javax.swing.JButton submitbtn;
    // End of variables declaration//GEN-END:variables
}
