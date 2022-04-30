import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ordonez
 */
public class loginForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public loginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextFieldUsername = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        ButtonLogin = new javax.swing.JButton();
        NewUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginClose = new javax.swing.JLabel();
        loginMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 350));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextFieldUsername.setText("Username");
        TextFieldUsername.setToolTipText("");
        TextFieldUsername.setName(""); // NOI18N
        jPanel1.add(TextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 180, 30));

        jPasswordField1.setText("Password");
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, 30));

        ButtonLogin.setBackground(new java.awt.Color(255, 204, 204));
        ButtonLogin.setFont(new java.awt.Font("Swansea", 1, 11)); // NOI18N
        ButtonLogin.setText("Login");
        ButtonLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        ButtonLogin.setBorderPainted(false);
        ButtonLogin.setFocusPainted(false);
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 60, 23));

        NewUser.setBackground(new java.awt.Color(255, 255, 255));
        NewUser.setFont(new java.awt.Font("Swansea", 1, 14)); // NOI18N
        NewUser.setForeground(new java.awt.Color(255, 255, 255));
        NewUser.setText("Sign Up Here.");
        NewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewUserMouseClicked(evt);
            }
        });
        jPanel1.add(NewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 120, 30));

        jLabel3.setFont(new java.awt.Font("Swansea", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ordonez\\Desktop\\Java_Contact_App\\Images\\logo90.png")); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, 90));

        loginClose.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        loginClose.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ordonez\\Desktop\\Java_Contact_App\\Images\\icon40.png")); // NOI18N
        loginClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginCloseMouseClicked(evt);
            }
        });
        jPanel1.add(loginClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

        loginMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginMin.setForeground(new java.awt.Color(255, 255, 255));
        loginMin.setText("-");
        loginMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMinMouseClicked(evt);
            }
        });
        jPanel1.add(loginMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>                        

    private void loginMinMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }                                     

    private void loginCloseMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        System.exit(0);
    }                                       

    private void NewUserMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        signupForm supf = new signupForm();
        supf.setVisible(true);
        supf.pack();
        supf.setLocationRelativeTo(null);
        supf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }                                    

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try{
        ps = con.prepareStatement("SELECT `username`, `pass`, `pic` FROM `user` WHERE `username` = ? AND `pass` = ?");
        ps.setString(1, TextFieldUsername.getText());
        ps.setString(2, String.valueOf(jPasswordField1.getPassword()));
        rs = ps.executeQuery();
        
        if(rs.next()){
        
            MyContactsForm mcf = new MyContactsForm();
            mcf.setVisible(true);
            mcf.pack();
            mcf.setLocationRelativeTo(null);
            mcf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //Profile pic user
            mcf.jLabelUserPic.setIcon(new Function().resizePic(null,rs.getBytes (3), mcf.jLabelUserPic.getWidth(), mcf.jLabelUserPic.getHeight()));
            
            mcf.jLabelUsername.setText(rs.getString(1));
            this.dispose();
            
            
        }else{
        JOptionPane.showMessageDialog(null,"Login Error");
        
        
        }
        }catch (SQLException ex){
        Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JLabel NewUser;
    private javax.swing.JTextField TextFieldUsername;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel loginClose;
    private javax.swing.JLabel loginMin;
    // End of variables declaration                   
}
