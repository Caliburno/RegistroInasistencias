package com.mycompany.registroinasistencias.GUI;

public class AccountOptions extends javax.swing.JFrame {

    private MainMenu mainMenu;
    private CreateAccount createAccount;
    
    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
    
    public void setCreateAccount(CreateAccount createAccount) {
        this.createAccount = createAccount;
    }
    
    public AccountOptions() {
    initComponents();
    this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelCurrentPassword = new javax.swing.JLabel();
        labelNewPassword = new javax.swing.JLabel();
        labelRepeatPassword = new javax.swing.JLabel();
        passwordFieldCurrent = new javax.swing.JPasswordField();
        passwordFieldNew = new javax.swing.JPasswordField();
        passwordFieldNewRepeat = new javax.swing.JPasswordField();
        buttonCHangePassword = new javax.swing.JButton();
        buttonCreateAccountOptions = new javax.swing.JButton();
        buttonReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Opciones de Cuenta");

        labelCurrentPassword.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelCurrentPassword.setText("Contraseña actual");

        labelNewPassword.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelNewPassword.setText("Nueva contraseña");

        labelRepeatPassword.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelRepeatPassword.setText("Repita contraseña");

        buttonCHangePassword.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonCHangePassword.setText("Cambiar");

        buttonCreateAccountOptions.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonCreateAccountOptions.setText("Crear cuenta");
        buttonCreateAccountOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateAccountOptionsActionPerformed(evt);
            }
        });

        buttonReturn.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonReturn.setText("Volver");
        buttonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonCHangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordFieldNew))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1)
                        .addGap(182, 182, 182))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNewPassword)
                            .addComponent(labelRepeatPassword))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(passwordFieldCurrent))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonCreateAccountOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(passwordFieldNewRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCurrentPassword)
                    .addComponent(passwordFieldNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNewPassword)
                    .addComponent(passwordFieldCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRepeatPassword)
                    .addComponent(passwordFieldNewRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(buttonCHangePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCreateAccountOptions)
                    .addComponent(buttonReturn))
                .addGap(220, 220, 220))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 119;
        gridBagConstraints.ipady = 103;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(72, 25, 0, 0);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed
        mainMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonReturnActionPerformed

    private void buttonCreateAccountOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateAccountOptionsActionPerformed
        createAccount.setVolverToAccountOptions(true);
        createAccount.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_buttonCreateAccountOptionsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCHangePassword;
    private javax.swing.JButton buttonCreateAccountOptions;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCurrentPassword;
    private javax.swing.JLabel labelNewPassword;
    private javax.swing.JLabel labelRepeatPassword;
    private javax.swing.JPasswordField passwordFieldCurrent;
    private javax.swing.JPasswordField passwordFieldNew;
    private javax.swing.JPasswordField passwordFieldNewRepeat;
    // End of variables declaration//GEN-END:variables
}
