package com.mycompany.registroinasistencias.GUI;

public class CreateAccount extends javax.swing.JFrame {

    private MainMenu mainMenu;
    private AccountOptions accountOptions;
    private Login login;
    private boolean volverToAccountOptions = false;
    
    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
    
    public void setAccountOptions(AccountOptions accountOptions) {
        this.accountOptions = accountOptions;
    }
    
    public void setLogin(Login login) {
        this.login = login;
    }

    public void setVolverToAccountOptions(boolean volverToAccountOptions) {
        this.volverToAccountOptions = volverToAccountOptions;
    }
   
    public CreateAccount() {
    initComponents();
    this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelCI = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        textFieldUsername = new javax.swing.JTextField();
        labelCI1 = new javax.swing.JLabel();
        labelRepeatPassword = new javax.swing.JLabel();
        buttonCreateAccount = new javax.swing.JButton();
        buttonReturn = new javax.swing.JButton();
        textFieldUsername2 = new javax.swing.JTextField();
        textFieldUsername3 = new javax.swing.JTextField();
        textFieldUsername4 = new javax.swing.JTextField();
        textFieldUsername5 = new javax.swing.JTextField();
        textFieldUsername6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelName.setText("Nombre");

        labelCI.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelCI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCI.setText("Número de Cédula");

        labelUsername.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsername.setText("Usuario");
        labelUsername.setToolTipText("");

        labelPassword.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPassword.setText("Contraseña");

        labelCI1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelCI1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCI1.setText("Número de Cédula");

        labelRepeatPassword.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelRepeatPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRepeatPassword.setText("Repita la contraseña");

        buttonCreateAccount.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonCreateAccount.setText("Crear");
        buttonCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateAccountActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCI1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRepeatPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUsername4, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUsername5, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUsername6, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(416, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonReturn)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCI1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldUsername4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldUsername5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(textFieldUsername6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelRepeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(buttonCreateAccount)
                .addGap(65, 65, 65)
                .addComponent(buttonReturn)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed
        if (volverToAccountOptions) {
            accountOptions.setVisible(true);
            this.setVisible(false);
        } else {
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_buttonReturnActionPerformed

    private void buttonCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateAccountActionPerformed
        login.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_buttonCreateAccountActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreateAccount;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCI;
    private javax.swing.JLabel labelCI1;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRepeatPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JTextField textFieldUsername;
    private javax.swing.JTextField textFieldUsername2;
    private javax.swing.JTextField textFieldUsername3;
    private javax.swing.JTextField textFieldUsername4;
    private javax.swing.JTextField textFieldUsername5;
    private javax.swing.JTextField textFieldUsername6;
    // End of variables declaration//GEN-END:variables
}
