package com.mycompany.registroinasistencias.GUI;

public class MainMenu extends javax.swing.JFrame {

    private AbsenceRegistry absenceRegistry;
    private AccountOptions accountOptions;
    private TeacherRegistry teacherRegistry;
    private Display display;
    
    public void setAbsenceRegistry(AbsenceRegistry abasenceRegistry) {
        this.absenceRegistry = abasenceRegistry;
    }
    
    public void setAccountOptions(AccountOptions accountOptions) {
        this.accountOptions = accountOptions;
    }
    
    public void setTeacherRegistry(TeacherRegistry teacherRegistry) {
        this.teacherRegistry = teacherRegistry;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
    
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenuHeader = new javax.swing.JLabel();
        buttonTeacherRegistry = new javax.swing.JButton();
        buttonAbsenceRegistry = new javax.swing.JButton();
        buttonAccountOptions = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainMenuHeader.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        mainMenuHeader.setText("Menú Principal");

        buttonTeacherRegistry.setText("Fichas Docentes");
        buttonTeacherRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTeacherRegistryActionPerformed(evt);
            }
        });

        buttonAbsenceRegistry.setText("Ingreso Inasistencias");
        buttonAbsenceRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAbsenceRegistryActionPerformed(evt);
            }
        });

        buttonAccountOptions.setText("Opciones de Cuenta");
        buttonAccountOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAccountOptionsActionPerformed(evt);
            }
        });

        buttonExit.setText("Salir");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mainMenuHeader)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonExit)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonAbsenceRegistry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonTeacherRegistry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAccountOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(mainMenuHeader)
                .addGap(43, 43, 43)
                .addComponent(buttonTeacherRegistry)
                .addGap(18, 18, 18)
                .addComponent(buttonAbsenceRegistry)
                .addGap(18, 18, 18)
                .addComponent(buttonAccountOptions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(buttonExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTeacherRegistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTeacherRegistryActionPerformed
        teacherRegistry.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonTeacherRegistryActionPerformed

    private void buttonAbsenceRegistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAbsenceRegistryActionPerformed
        absenceRegistry.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonAbsenceRegistryActionPerformed

    private void buttonAccountOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAccountOptionsActionPerformed
        accountOptions.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonAccountOptionsActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        display.dispose();
        this.dispose();
    }//GEN-LAST:event_buttonExitActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAbsenceRegistry;
    private javax.swing.JButton buttonAccountOptions;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonTeacherRegistry;
    private javax.swing.JLabel mainMenuHeader;
    // End of variables declaration//GEN-END:variables
}
