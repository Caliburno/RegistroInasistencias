package com.mycompany.registroinasistencias.GUI;

public class AbsenceRegistry extends javax.swing.JFrame {

    private MainMenu mainMenu;
    private Display display;
    
    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
    
    public void setDisplay(Display display) {
        this.display = display;
    }
    
    public AbsenceRegistry() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerAbsenceRegistry = new javax.swing.JLabel();
        textFieldTeacher = new javax.swing.JTextField();
        textFieldFrom = new javax.swing.JTextField();
        textFieldTo = new javax.swing.JTextField();
        labelTeacher = new javax.swing.JLabel();
        labelFrom = new javax.swing.JLabel();
        labelTo = new javax.swing.JLabel();
        buttonAddTeacher = new javax.swing.JButton();
        buttonReturn = new javax.swing.JButton();
        buttonShowDisplay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAbsenceRegistryMain = new javax.swing.JTable();
        buttonCloseDisplay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerAbsenceRegistry.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        headerAbsenceRegistry.setText("Registro de Inasistencias");

        labelTeacher.setText("Docente");

        labelFrom.setText("Desde");

        labelTo.setText("Hasta");

        buttonAddTeacher.setText("Agregar");

        buttonReturn.setText("Volver");
        buttonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReturnActionPerformed(evt);
            }
        });

        buttonShowDisplay.setText("Mostrar");
        buttonShowDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowDisplayActionPerformed(evt);
            }
        });

        tableAbsenceRegistryMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableAbsenceRegistryMain);

        buttonCloseDisplay.setText("Cerrar Display");
        buttonCloseDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTeacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(labelTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAddTeacher)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldTeacher)
                                .addComponent(textFieldFrom)
                                .addComponent(textFieldTo, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                        .addGap(0, 216, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonShowDisplay)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCloseDisplay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonReturn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(headerAbsenceRegistry)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerAbsenceRegistry)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTeacher))
                        .addGap(18, 18, 18)
                        .addComponent(textFieldFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelFrom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTo))
                .addGap(18, 18, 18)
                .addComponent(buttonAddTeacher)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonReturn)
                    .addComponent(buttonShowDisplay)
                    .addComponent(buttonCloseDisplay))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonShowDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowDisplayActionPerformed
        display.setVisible(true);
    }//GEN-LAST:event_buttonShowDisplayActionPerformed

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed
        mainMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonReturnActionPerformed

    private void buttonCloseDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseDisplayActionPerformed
        display.setVisible(false);
    }//GEN-LAST:event_buttonCloseDisplayActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddTeacher;
    private javax.swing.JButton buttonCloseDisplay;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JButton buttonShowDisplay;
    private javax.swing.JLabel headerAbsenceRegistry;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFrom;
    private javax.swing.JLabel labelTeacher;
    private javax.swing.JLabel labelTo;
    private javax.swing.JTable tableAbsenceRegistryMain;
    private javax.swing.JTextField textFieldFrom;
    private javax.swing.JTextField textFieldTeacher;
    private javax.swing.JTextField textFieldTo;
    // End of variables declaration//GEN-END:variables
}
