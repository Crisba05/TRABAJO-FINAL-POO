package Gstore.vista;
import Gstore.config.SQLdata;
import java.awt.Color;
import javax.swing.JOptionPane;

public class MainLogin extends javax.swing.JFrame {

    int mouseX, mouseY;
    String buscar;
    
    Register registrar = new Register();
    MenuFrame main = new MenuFrame();
    SQLdata metodo = new SQLdata();
    
    
    
    public MainLogin() {
        initComponents();
        icPass.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PPiniciar = new javax.swing.JPanel();
        btnLogin = new javax.swing.JLabel();
        txtRegistrar = new javax.swing.JLabel();
        pued = new javax.swing.JLabel();
        txtversion = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        icPassView = new javax.swing.JLabel();
        icPass = new javax.swing.JLabel();
        icUser = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblPass = new javax.swing.JLabel();
        SPPass = new javax.swing.JSeparator();
        SPUser = new javax.swing.JSeparator();
        txtUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        bckMain = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnMin = new javax.swing.JLabel();
        block = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PPiniciar.setBackground(new java.awt.Color(102, 102, 255));
        PPiniciar.setForeground(new java.awt.Color(102, 153, 255));

        btnLogin.setBackground(new java.awt.Color(102, 153, 255));
        btnLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("log in");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PPiniciarLayout = new javax.swing.GroupLayout(PPiniciar);
        PPiniciar.setLayout(PPiniciarLayout);
        PPiniciarLayout.setHorizontalGroup(
            PPiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        PPiniciarLayout.setVerticalGroup(
            PPiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(PPiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 130, 30));

        txtRegistrar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtRegistrar.setForeground(new java.awt.Color(0, 102, 204));
        txtRegistrar.setText("Registrarte aquí");
        txtRegistrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        txtRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegistrarMouseClicked(evt);
            }
        });
        getContentPane().add(txtRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        pued.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        pued.setForeground(new java.awt.Color(0, 102, 255));
        pued.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pued.setText(" O puedes");
        pued.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pued.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(pued, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 50, -1));

        txtversion.setForeground(new java.awt.Color(197, 204, 235));
        txtversion.setText("v. 2.1.2");
        getContentPane().add(txtversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gstore/images/logoSiluet.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 170, 240));

        icPassView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gstore/images/passView.png"))); // NOI18N
        icPassView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icPassViewMouseClicked(evt);
            }
        });
        getContentPane().add(icPassView, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, -1, -1));

        icPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gstore/images/pass.png"))); // NOI18N
        icPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icPassMouseClicked(evt);
            }
        });
        getContentPane().add(icPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, -1, -1));

        icUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gstore/images/user.png"))); // NOI18N
        getContentPane().add(icUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, -1, -1));

        txtPass.setBackground(new java.awt.Color(232, 237, 247));
        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setText("**************");
        txtPass.setToolTipText("");
        txtPass.setBorder(null);
        txtPass.setOpaque(false);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 220, 30));

        lblPass.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(51, 153, 255));
        lblPass.setText("CONTRASEÑA:");
        getContentPane().add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        SPPass.setBackground(new java.awt.Color(0, 153, 255));
        SPPass.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(SPPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 220, 20));

        SPUser.setBackground(new java.awt.Color(102, 153, 255));
        SPUser.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(SPUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 220, 20));

        txtUser.setBackground(new java.awt.Color(232, 237, 247));
        txtUser.setFont(new java.awt.Font("GeoSlab703 Md BT", 2, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setText(" Ingrese su nombre de usuario");
        txtUser.setToolTipText("");
        txtUser.setBorder(null);
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUser.setOpaque(false);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 220, 30));

        lblUser.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(51, 153, 255));
        lblUser.setText("USERNAME:");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        lblLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 122, 188));
        lblLogin.setText("LOGIN");
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 110, 40));

        bckMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gstore/images/bckMain.png"))); // NOI18N
        bckMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bckMainMousePressed(evt);
            }
        });
        getContentPane().add(bckMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 790, 480));

        btnClose.setBackground(new java.awt.Color(0, 102, 255));
        btnClose.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(102, 153, 255));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 30));

        btnMin.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnMin.setForeground(new java.awt.Color(102, 153, 255));
        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMin.setText("-");
        btnMin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMouseExited(evt);
            }
        });
        getContentPane().add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 30));

        block.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/login/block.png"))); // NOI18N
        block.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                blockMouseDragged(evt);
            }
        });
        block.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                blockMousePressed(evt);
            }
        });
        getContentPane().add(block, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gstore/images/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void bckMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckMainMousePressed

    }//GEN-LAST:event_bckMainMousePressed

    private void blockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blockMousePressed
        mouseX = evt.getX();
        mouseX = evt.getY();
    }//GEN-LAST:event_blockMousePressed

    private void blockMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blockMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        
        this.setLocation(xx - mouseX, yy - mouseY);
    }//GEN-LAST:event_blockMouseDragged

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setExtendedState(1); //ICONIFIED
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setForeground(Color.red);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        btnMin.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_btnMinMouseExited

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        btnMin.setForeground(Color.gray);
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        PPiniciar.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        PPiniciar.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_btnLoginMouseExited

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserMouseClicked

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        if (txtUser.getText().equals(" Ingrese su nombre de usuario")) {
                txtUser.setText ("");
                txtUser.setForeground(Color.black);}
        if (String.valueOf(txtPass.getPassword()).isEmpty()) 
                {txtPass.setText("**************");
                txtPass.setForeground(new Color(204,204,204));}
    }//GEN-LAST:event_txtUserMousePressed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
 
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        if (txtPass.getText().equals("**************")) {
                txtPass.setText ("");
                txtPass.setForeground(Color.black);}
        if (txtUser.getText().isEmpty()) 
                {txtUser.setText(" Ingrese su nombre de usuario");
                txtUser.setForeground(new Color(204,204,204));}
    }//GEN-LAST:event_txtPassMousePressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegistrarMouseClicked
        registrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtRegistrarMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        
        if(txtUser.getText().equals("admin") && txtPass.getText().equals("admin")) { JOptionPane.showMessageDialog(this, "Bienvenido iniciaste sesion como root (Administrador)");
            main.lblUsername.setText("Admin");
            main.setVisible(true);
            this.dispose();
            
        }else{ if(buscar.equals("usuario existente")){
                main.lblUsername.setText(txtUser.getText());
                main.setVisible(true);
            this.dispose ();
        }else{
            JOptionPane.showMessageDialog(null, "Usuario no encontrado, Necesita registrarse");
        }}
    }//GEN-LAST:event_btnLoginMouseClicked

    private void icPassViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icPassViewMouseClicked
        icPass.setVisible(true);
        icPassView.setVisible(false);
        txtPass.setEchoChar((char)0);
    }//GEN-LAST:event_icPassViewMouseClicked

    private void icPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icPassMouseClicked
        icPass.setVisible(false);
        icPassView.setVisible(true);
        txtPass.setEchoChar('*');
    }//GEN-LAST:event_icPassMouseClicked

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
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PPiniciar;
    private javax.swing.JSeparator SPPass;
    private javax.swing.JSeparator SPUser;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bckMain;
    private javax.swing.JLabel block;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnMin;
    private javax.swing.JLabel icPass;
    private javax.swing.JLabel icPassView;
    private javax.swing.JLabel icUser;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel pued;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JLabel txtRegistrar;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel txtversion;
    // End of variables declaration//GEN-END:variables
}
