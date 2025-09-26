package com.mycompany.registroinasistencias.GUI;

public class RegistroInasistencias extends javax.swing.JFrame {

    private MenuPrincipal mainMenu;
    private Display display;
    
    public void setMainMenu(MenuPrincipal mainMenu) {
        this.mainMenu = mainMenu;
    }
    
    public void setDisplay(Display display) {
        this.display = display;
    }
    
    public RegistroInasistencias() {
    initComponents();
    this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        headerAbsenceRegistry = new javax.swing.JLabel();
        labelTeacher = new javax.swing.JLabel();
        labelFrom = new javax.swing.JLabel();
        labelTo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAbsenceRegistryMain = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();
        botonCerrarDisplay = new javax.swing.JButton();
        textoDocente = new javax.swing.JTextField();
        textoDesde = new javax.swing.JTextField();
        textoHasta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        headerAbsenceRegistry.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        headerAbsenceRegistry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerAbsenceRegistry.setText("Registro de Inasistencias");

        labelTeacher.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelTeacher.setText("Docente");

        labelFrom.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelFrom.setText("Desde");

        labelTo.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelTo.setText("Hasta");

        tableAbsenceRegistryMain.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        tableAbsenceRegistryMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tableAbsenceRegistryMain.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableAbsenceRegistryMain);

        jButton2.setText("Mostrar");

        jButton4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jButton4.setText("Agregar");

        botonVolver.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonMostrar.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        botonMostrar.setText("Mostrar");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

        botonCerrarDisplay.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        botonCerrarDisplay.setText("Cerrar Display");
        botonCerrarDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarDisplayActionPerformed(evt);
            }
        });

        textoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDocenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textoDocente)
                                    .addComponent(textoDesde, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                                    .addComponent(textoHasta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(botonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonCerrarDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(headerAbsenceRegistry, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTeacher)
                        .addGap(18, 18, 18)
                        .addComponent(labelFrom)
                        .addGap(18, 18, 18)
                        .addComponent(labelTo)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(headerAbsenceRegistry)
                        .addGap(91, 91, 91)
                        .addComponent(textoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(textoHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jButton4)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMostrar)
                    .addComponent(botonCerrarDisplay)
                    .addComponent(botonVolver))
                .addGap(645, 645, 645)
                .addComponent(jButton2)
                .addGap(7, 7, 7))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = -446;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 6, 21);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        if (mainMenu == null) {    } else {
            mainMenu.setVisible(true); 
        }
    this.setVisible(false);       
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
         display.setVisible(true);
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void textoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDocenteActionPerformed

    private void botonCerrarDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarDisplayActionPerformed
        display.setVisible(false);
    }//GEN-LAST:event_botonCerrarDisplayActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarDisplay;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel headerAbsenceRegistry;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFrom;
    private javax.swing.JLabel labelTeacher;
    private javax.swing.JLabel labelTo;
    private javax.swing.JTable tableAbsenceRegistryMain;
    private javax.swing.JTextField textoDesde;
    private javax.swing.JTextField textoDocente;
    private javax.swing.JTextField textoHasta;
    // End of variables declaration//GEN-END:variables
}
