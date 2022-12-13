package Gstore.vista;
import Gstore.config.*;
import java.awt.Color;
import javax.swing.JOptionPane;
public class Register extends javax.swing.JFrame{

    int mouseX, mouseY;
    boolean term=false;
    
    Entries metodo = new Entries();
    
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConfPass = new javax.swing.JLabel();
        txtConfPass = new javax.swing.JPasswordField();
        SPConfPass = new javax.swing.JSeparator();
        PPiniciar = new javax.swing.JPanel();
        txtLogin = new javax.swing.JLabel();
        txtCondition = new javax.swing.JLabel();
        PTerminos = new javax.swing.JPanel();
        txtCondition1 = new javax.swing.JLabel();
        txtCondition2 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        SPMail = new javax.swing.JSeparator();
        lblMail = new javax.swing.JLabel();
        txtFirstN = new javax.swing.JTextField();
        lblFirstN = new javax.swing.JLabel();
        SPFirstN = new javax.swing.JSeparator();
        txtversion = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblPass = new javax.swing.JLabel();
        SPPass = new javax.swing.JSeparator();
        txtPhone = new javax.swing.JTextField();
        txtLastN = new javax.swing.JTextField();
        SPLastN = new javax.swing.JSeparator();
        lblLastN = new javax.swing.JLabel();
        SPUser = new javax.swing.JSeparator();
        txtUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        bckMain = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnMin = new javax.swing.JLabel();
        block = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        lblConfPass.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblConfPass.setForeground(new java.awt.Color(51, 153, 255));
        lblConfPass.setText("CONFIRMA CONTRASEÑA:");

        txtConfPass.setBackground(new java.awt.Color(232, 237, 247));
        txtConfPass.setForeground(new java.awt.Color(102, 153, 255));
        txtConfPass.setToolTipText("");
        txtConfPass.setBorder(null);
        txtConfPass.setOpaque(false);
        txtConfPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtConfPassMousePressed(evt);
            }
        });
        txtConfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfPassActionPerformed(evt);
            }
        });
        txtConfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfPassKeyPressed(evt);
            }
        });

        SPConfPass.setBackground(new java.awt.Color(0, 153, 255));
        SPConfPass.setForeground(new java.awt.Color(51, 153, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PPiniciar.setBackground(new java.awt.Color(102, 102, 255));
        PPiniciar.setForeground(new java.awt.Color(102, 153, 255));

        txtLogin.setBackground(new java.awt.Color(102, 153, 255));
        txtLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLogin.setText("Sing up");
        txtLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtLoginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PPiniciarLayout = new javax.swing.GroupLayout(PPiniciar);
        PPiniciar.setLayout(PPiniciarLayout);
        PPiniciarLayout.setHorizontalGroup(
            PPiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPiniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PPiniciarLayout.setVerticalGroup(
            PPiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPiniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(PPiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 130, 30));

        txtCondition.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        txtCondition.setForeground(new java.awt.Color(0, 51, 153));
        txtCondition.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCondition.setText(" en la Política de Privacidad.");
        txtCondition.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtCondition.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(txtCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 100, 10));

        PTerminos.setBackground(new java.awt.Color(255, 255, 255));
        PTerminos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PTerminos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PTerminosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PTerminosLayout = new javax.swing.GroupLayout(PTerminos);
        PTerminos.setLayout(PTerminosLayout);
        PTerminosLayout.setHorizontalGroup(
            PTerminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        PTerminosLayout.setVerticalGroup(
            PTerminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(PTerminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 10, 10));

        txtCondition1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        txtCondition1.setForeground(new java.awt.Color(0, 51, 153));
        txtCondition1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCondition1.setText(" al tratamiento y a la transferencia de mis datos personales conforme a lo dispuesto");
        txtCondition1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtCondition1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(txtCondition1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 280, 10));

        txtCondition2.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        txtCondition2.setForeground(new java.awt.Color(0, 51, 153));
        txtCondition2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCondition2.setText("Sí, he leído y presto mi consentimiento a los Términos de Uso del sitio y al procesamiento,");
        txtCondition2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtCondition2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(txtCondition2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 310, 10));

        txtMail.setBackground(new java.awt.Color(232, 237, 247));
        txtMail.setFont(new java.awt.Font("GeoSlab703 Md BT", 2, 12)); // NOI18N
        txtMail.setForeground(new java.awt.Color(102, 153, 255));
        txtMail.setToolTipText("");
        txtMail.setBorder(null);
        txtMail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMail.setOpaque(false);
        txtMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMailMousePressed(evt);
            }
        });
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 350, 20));

        SPMail.setBackground(new java.awt.Color(102, 153, 255));
        SPMail.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(SPMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 350, 20));

        lblMail.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblMail.setForeground(new java.awt.Color(51, 153, 255));
        lblMail.setText("MAIL:");
        getContentPane().add(lblMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        txtFirstN.setBackground(new java.awt.Color(232, 237, 247));
        txtFirstN.setFont(new java.awt.Font("GeoSlab703 Md BT", 2, 12)); // NOI18N
        txtFirstN.setForeground(new java.awt.Color(102, 153, 255));
        txtFirstN.setToolTipText("");
        txtFirstN.setBorder(null);
        txtFirstN.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFirstN.setOpaque(false);
        txtFirstN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFirstNMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFirstNMousePressed(evt);
            }
        });
        txtFirstN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNActionPerformed(evt);
            }
        });
        getContentPane().add(txtFirstN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 160, 20));

        lblFirstN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblFirstN.setForeground(new java.awt.Color(51, 153, 255));
        lblFirstN.setText("NOMBRE:");
        getContentPane().add(lblFirstN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, 20));

        SPFirstN.setBackground(new java.awt.Color(102, 153, 255));
        SPFirstN.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(SPFirstN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 160, 20));

        txtversion.setForeground(new java.awt.Color(197, 204, 235));
        txtversion.setText("v. 1.0.1.2");
        getContentPane().add(txtversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, -1));

        txtPass.setBackground(new java.awt.Color(232, 237, 247));
        txtPass.setForeground(new java.awt.Color(102, 153, 255));
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
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 160, 20));

        lblPass.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblPass.setForeground(new java.awt.Color(51, 153, 255));
        lblPass.setText("CONTRASEÑA:");
        getContentPane().add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        SPPass.setBackground(new java.awt.Color(0, 153, 255));
        SPPass.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(SPPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 160, 20));

        txtPhone.setBackground(new java.awt.Color(232, 237, 247));
        txtPhone.setFont(new java.awt.Font("GeoSlab703 Md BT", 2, 12)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(102, 153, 255));
        txtPhone.setToolTipText("");
        txtPhone.setBorder(null);
        txtPhone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPhone.setOpaque(false);
        txtPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPhoneMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPhoneMousePressed(evt);
            }
        });
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 150, 20));

        txtLastN.setBackground(new java.awt.Color(232, 237, 247));
        txtLastN.setFont(new java.awt.Font("GeoSlab703 Md BT", 2, 12)); // NOI18N
        txtLastN.setForeground(new java.awt.Color(102, 153, 255));
        txtLastN.setToolTipText("");
        txtLastN.setBorder(null);
        txtLastN.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLastN.setOpaque(false);
        txtLastN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLastNMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLastNMousePressed(evt);
            }
        });
        txtLastN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNActionPerformed(evt);
            }
        });
        getContentPane().add(txtLastN, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 160, 20));

        SPLastN.setBackground(new java.awt.Color(102, 153, 255));
        SPLastN.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(SPLastN, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 160, 20));

        lblLastN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblLastN.setForeground(new java.awt.Color(51, 153, 255));
        lblLastN.setText("APELLIDO:");
        getContentPane().add(lblLastN, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, 20));

        SPUser.setBackground(new java.awt.Color(102, 153, 255));
        SPUser.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(SPUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 180, 20));

        txtUser.setBackground(new java.awt.Color(232, 237, 247));
        txtUser.setFont(new java.awt.Font("GeoSlab703 Md BT", 2, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(102, 153, 255));
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
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 180, 20));

        lblUser.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(51, 153, 255));
        lblUser.setText("USERNAME:");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        lblLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 122, 188));
        lblLogin.setText("SIGN UP");
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 140, 40));

        bckMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gstore/images/bckReg.png"))); // NOI18N
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

    private void txtLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoginMouseEntered
        PPiniciar.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_txtLoginMouseEntered

    private void txtLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoginMouseExited
        PPiniciar.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_txtLoginMouseExited

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserMouseClicked

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        
    }//GEN-LAST:event_txtUserMousePressed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
 
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        
    }//GEN-LAST:event_txtPassMousePressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailMouseClicked

    private void txtMailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailMousePressed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtFirstNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFirstNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNMouseClicked

    private void txtFirstNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFirstNMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNMousePressed

    private void txtFirstNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNActionPerformed

    private void txtLastNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLastNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNMouseClicked

    private void txtLastNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLastNMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNMousePressed

    private void txtLastNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNActionPerformed

    private void txtPhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhoneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneMouseClicked

    private void txtPhoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhoneMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneMousePressed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void PTerminosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PTerminosMouseClicked
        if(term==false){
        term=true;
        PTerminos.setBackground(new Color(0,0,102));
        }else{
        term=false;
        PTerminos.setBackground(Color.white);}
    }//GEN-LAST:event_PTerminosMouseClicked

    private void txtLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoginMouseClicked
        if(term==true){
        metodo.guardar(txtUser.getText(),txtFirstN.getText(),txtLastN.getText(),txtMail.getText(),txtPass.getText());
        JOptionPane.showMessageDialog(null,"Usuario Registrado");
        this.dispose();}
        else{JOptionPane.showMessageDialog(null,"Debe aceptar los terminos de uso");}
    }//GEN-LAST:event_txtLoginMouseClicked

    private void txtConfPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfPassKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfPassKeyPressed

    private void txtConfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfPassActionPerformed

    private void txtConfPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfPassMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfPassMousePressed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PPiniciar;
    private javax.swing.JPanel PTerminos;
    private javax.swing.JSeparator SPConfPass;
    private javax.swing.JSeparator SPFirstN;
    private javax.swing.JSeparator SPLastN;
    private javax.swing.JSeparator SPMail;
    private javax.swing.JSeparator SPPass;
    private javax.swing.JSeparator SPUser;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bckMain;
    private javax.swing.JLabel block;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMin;
    private javax.swing.JLabel lblConfPass;
    private javax.swing.JLabel lblFirstN;
    private javax.swing.JLabel lblLastN;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel txtCondition;
    private javax.swing.JLabel txtCondition1;
    private javax.swing.JLabel txtCondition2;
    private javax.swing.JPasswordField txtConfPass;
    private javax.swing.JTextField txtFirstN;
    private javax.swing.JTextField txtLastN;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel txtversion;
    // End of variables declaration//GEN-END:variables
}
