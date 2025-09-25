package com.mycompany.registroinasistencias.GUI;

public class Login extends javax.swing.JFrame {

    private MainMenu mainMenu;
    private CreateAccount createAccount;
    private Display display;
    
    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
    
    public void setCreateAccount(CreateAccount createAccount) {
        this.createAccount = createAccount;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
    
    /**
     * Creates new form Login
     */
    public Login() {
    initComponents();
    this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelUsernameLogin = new javax.swing.JLabel();
        textfieldUsernameLogin = new javax.swing.JTextField();
        labelUsernameLogin1 = new javax.swing.JLabel();
        textfieldUsernameLogin1 = new javax.swing.JTextField();
        buttonLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        butonExitLogin = new javax.swing.JButton();
        buttonCreateAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido a AusentApp");

        labelUsernameLogin.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelUsernameLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsernameLogin.setText("Usuario");

        textfieldUsernameLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldUsernameLoginActionPerformed(evt);
            }
        });

        labelUsernameLogin1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelUsernameLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsernameLogin1.setText("Contraseña");

        textfieldUsernameLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldUsernameLogin1ActionPerformed(evt);
            }
        });

        buttonLogin.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonLogin.setText("Ingresar");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("No tienes una cuenta?");
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        butonExitLogin.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        butonExitLogin.setText("Salir");
        butonExitLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonExitLoginActionPerformed(evt);
            }
        });

        buttonCreateAccount.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonCreateAccount.setText("Crear");
        buttonCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(butonExitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                                .addComponent(buttonCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textfieldUsernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfieldUsernameLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(labelUsernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(labelUsernameLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(labelUsernameLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldUsernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelUsernameLogin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldUsernameLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butonExitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldUsernameLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldUsernameLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldUsernameLoginActionPerformed

    private void buttonCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateAccountActionPerformed
        createAccount.setVolverToAccountOptions(false);
        createAccount.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_buttonCreateAccountActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        mainMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void butonExitLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonExitLoginActionPerformed
        display.dispose();
        this.dispose();
        
    }//GEN-LAST:event_butonExitLoginActionPerformed

    private void textfieldUsernameLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldUsernameLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldUsernameLogin1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonExitLogin;
    private javax.swing.JButton buttonCreateAccount;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelUsernameLogin;
    private javax.swing.JLabel labelUsernameLogin1;
    private javax.swing.JTextField textfieldUsernameLogin;
    private javax.swing.JTextField textfieldUsernameLogin1;
    // End of variables declaration//GEN-END:variables
}
