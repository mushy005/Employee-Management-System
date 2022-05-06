
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ordonez
 */
public class signupForm extends javax.swing.JFrame {

    /**
     * Creates new form signupForm
     */
    String imagePth = null; 
    
    public signupForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabelClose = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelClose1 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFName = new javax.swing.JTextField();
        jTextFieldLName = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelCreateAccount = new javax.swing.JLabel();
        jLabelPic = new javax.swing.JLabel();
        jButtonBrowseImage = new javax.swing.JButton();
        jButtonCreate = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        jLabelClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelClose.setText("x");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ordonez\\Desktop\\Java_Contact_App\\images\\logo.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelClose1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelClose1.setText("x");
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabelClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMin.setText("-");
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 20, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("SIGN UP");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 23, -1, -1));

        jLabel3.setText("First Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setText("Last Name:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 125, -1, -1));

        jLabel5.setText("Username:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 170, -1, -1));

        jLabel6.setText("Password:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 215, -1, -1));

        jLabel7.setText("Retype Password:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel8.setText("Picture:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));
        jPanel2.add(jTextFieldFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 183, -1));
        jPanel2.add(jTextFieldLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 183, -1));
        jPanel2.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 183, -1));

        jLabelCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCreateAccount.setText("Login Here");
        jLabelCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCreateAccountMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        jLabelPic.setOpaque(true);
        jPanel2.add(jLabelPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 150, 152));

        jButtonBrowseImage.setText("Browse");
        jButtonBrowseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowseImageActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBrowseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jButtonCreate.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCreate.setText("Create");
        jButtonCreate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButtonCreate.setBorderPainted(false);
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 80, 30));

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, 30));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 180, -1));
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        //CLOSE UI
        System.exit(0);
    }                                        

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        //CLOSE UI
        System.exit(0);
    }                                         

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        
        //MINIMIZE UI
        this.setState(JFrame.ICONIFIED);
    }                                      

    private void jLabelCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        // TODO add your handling code here:
        
        //MOVE TO LOG UP FORM
        loginForm logf = new loginForm();
        logf.setVisible(true);
        logf.pack();
        logf.setLocationRelativeTo(null);
        logf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }                                                
    
    public boolean isUserNameExist(String un)
    {
        
        
     //VALIDATION OF USERNAME AND PASSWORD FROM DATABASE
        boolean uExist = false;
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try
        {
            
        //FETCH DATA FROM DATABASE
            
            ps = con.prepareStatement("SELECT * FROM `user` WHERE `username` = ? AND `pass`=?");
            ps.setString(1, jTextFieldUsername.getText());
            ps.setString(2, String.valueOf(jPasswordField1.getPassword()));
            rs = ps.executeQuery();
            
            if(rs.next())
        {
            uExist = true;
        }
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         return uExist;
        }
    
    
        //IMAGE RESIZE TO BE FIT IN UPLOAD FRAME
//    public ImageIcon resizePic(String picPath){
//        ImageIcon myImg = new ImageIcon(picPath);
//        Image img = myImg.getImage().getScaledInstance(jLabelPic.getWidth(),jLabelPic.getHeight(),Image.SCALE_SMOOTH);
//        ImageIcon myPicture = new ImageIcon(img);
//        return myPicture;
//    }
    
    
        
    private void jButtonBrowseImageActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        
       Myfunc mf = new Myfunc();
       imagePth = mf.browseImage(jLabelPic);
  
      
    }                                                  

    public boolean verifData(){
        
        //CHECKS IF ALL FIELDS ARE FILLED
        
        if(jTextFieldFName.getText().equals("") && jTextFieldLName.getText().equals("") || jTextFieldUsername.getText().equals("")
        || String.valueOf(jPasswordField1.getPassword()).equals(""))
        {
         JOptionPane.showMessageDialog(null, "SOME FIELDS ARE EMPTY");   
         return false;
        }
        
        //CHECKS IF PASSWORD AND RETYPE PASSWORD FIELDS HAVE IDENTICAL DATA
        else if(!String.valueOf(jPasswordField1.getPassword()).equals(String.valueOf(jPasswordField2.getPassword())))
        { 
         JOptionPane.showMessageDialog(null, "PASSWORDS ARE DIFFERENT");      
         return false;
        }
        
        // IF NO IMAGE UPLOADED
            else if(imagePth == null)
        {
         JOptionPane.showMessageDialog(null, "PLEASE UPLOAD AN IMAGE");   
         return false;
        }
            
        // ALL FIELDS AND IMAGE WERE FILLED
            else
        {
            return true; 
        }
    
    
    }
    
    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        if(verifData())
        {
        //Performing Connection
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        
            try {
                ps = con.prepareStatement("INSERT INTO `user`(`fname`, `lname`, `username`, `pass`, `pic`) VALUES (?,?,?,?,?)");
                
                ps.setString(1, jTextFieldFName.getText());
                ps.setString(2, jTextFieldLName.getText());
                ps.setString(3, jTextFieldUsername.getText());
                ps.setString(4, String.valueOf(jPasswordField1.getPassword()));
              
                InputStream img = new FileInputStream(new File(imagePth));
                
                ps.setBlob(5, img);
        //CHECK IF USERNAME IS AVAILABLE TO USE       
                if(isUserNameExist(jTextFieldUsername.getText()))
                {
                    JOptionPane.showMessageDialog(null, "USERNAME ALREADY IN USE");
                }
                else
                {
                    if(ps.executeUpdate()  !=0)
                     {
                        JOptionPane.showMessageDialog(null, "Account Successfully Created");
                    
                     }
                    else
                    {
                    JOptionPane.showMessageDialog(null, "Incorrect Credentials");
                    }
                }
                
                
            } catch (Exception ex) {
                Logger.getLogger(signupForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }                                             

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
         System.exit(0);
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
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonBrowseImage;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelCreateAccount;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelPic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextFieldFName;
    private javax.swing.JTextField jTextFieldLName;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration                   
}
