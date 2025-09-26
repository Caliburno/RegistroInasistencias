package com.mycompany.registroinasistencias.GUI;

public class MenuPrincipal extends javax.swing.JFrame {

    private RegistroInasistencias absenceRegistry;
    private OpcionesDeCuenta accountOptions;
    private RegistroDocentes teacherRegistry;
    private Display display;
    
    public void setAbsenceRegistry(RegistroInasistencias abasenceRegistry) {
        this.absenceRegistry = abasenceRegistry;
    }
    
    public void setAccountOptions(OpcionesDeCuenta accountOptions) {
        this.accountOptions = accountOptions;
    }
    
    public void setTeacherRegistry(RegistroDocentes teacherRegistry) {
        this.teacherRegistry = teacherRegistry;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
    
    public MenuPrincipal() {
    initComponents();
    
    this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        mainMenuHeader = new javax.swing.JLabel();
        buttonTeacherRegistry = new javax.swing.JButton();
        buttonAbsenceRegistry = new javax.swing.JButton();
        buttonAccountOptions = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        mainMenuHeader.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        mainMenuHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainMenuHeader.setText("  Menú Principal");

        buttonTeacherRegistry.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonTeacherRegistry.setText("Fichas Docentes");
        buttonTeacherRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTeacherRegistryActionPerformed(evt);
            }
        });

        buttonAbsenceRegistry.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonAbsenceRegistry.setText("Registro Inasistencias");
        buttonAbsenceRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAbsenceRegistryActionPerformed(evt);
            }
        });

        buttonAccountOptions.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonAccountOptions.setText("Opciones de Cuenta");
        buttonAccountOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAccountOptionsActionPerformed(evt);
            }
        });

        buttonExit.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonExit.setText("Salir");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buttonAbsenceRegistry, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonTeacherRegistry, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonAccountOptions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(mainMenuHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(mainMenuHeader)
                .addGap(97, 97, 97)
                .addComponent(buttonTeacherRegistry)
                .addGap(18, 18, 18)
                .addComponent(buttonAbsenceRegistry)
                .addGap(18, 18, 18)
                .addComponent(buttonAccountOptions)
                .addGap(18, 18, 18)
                .addComponent(buttonExit)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 89, 0, 0);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void buttonTeacherRegistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTeacherRegistryActionPerformed
        teacherRegistry.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonTeacherRegistryActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAbsenceRegistry;
    private javax.swing.JButton buttonAccountOptions;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonTeacherRegistry;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mainMenuHeader;
    // End of variables declaration//GEN-END:variables

                   
public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            MenuPrincipal ventana = new MenuPrincipal();
            ventana.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            ventana.setVisible(true);
        }
    });
}
}
