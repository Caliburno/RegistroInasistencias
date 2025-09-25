package com.mycompany.registroinasistencias.GUI;

public class TeacherRegistry extends javax.swing.JFrame {

    private MainMenu mainMenu;
    private Display display;
    
    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
    
    public void setDisplay(Display display) {
        this.display = display;
    }
    
    
    /**
     * Creates new form MainFrame
     */
    public TeacherRegistry() {
    initComponents();
    this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        headerTeacherRegistry = new javax.swing.JLabel();
        headerAddTeacher = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();
        labelCI = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTeachers = new javax.swing.JTable();
        textFieldCI = new javax.swing.JTextField();
        buttonAddTeacher = new javax.swing.JButton();
        textFieldSubjectName = new javax.swing.JTextField();
        headerAddSubject = new javax.swing.JLabel();
        labelSubjectName = new javax.swing.JLabel();
        labelWeekDays = new javax.swing.JLabel();
        textFieldSubjectName1 = new javax.swing.JTextField();
        textFieldSubjectName2 = new javax.swing.JTextField();
        labelTeacherDropdown = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSubjects = new javax.swing.JTable();
        labelGroup = new javax.swing.JLabel();
        dropdownTeachers = new javax.swing.JComboBox<>();
        buttonReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        headerTeacherRegistry.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        headerTeacherRegistry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerTeacherRegistry.setText("Fichas Docentes");

        headerAddTeacher.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        headerAddTeacher.setText("Agregar Docente Nuevo");

        labelName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelName.setText("Nombre");

        labelCI.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelCI.setText("Cédula");

        tableTeachers.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        tableTeachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "CI", "Asignaturas"
            }
        ));
        jScrollPane1.setViewportView(tableTeachers);

        buttonAddTeacher.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonAddTeacher.setText("Agregar");

        headerAddSubject.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        headerAddSubject.setText("Agregar Asignatura");

        labelSubjectName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelSubjectName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubjectName.setText("Materia");

        labelWeekDays.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelWeekDays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWeekDays.setText("Dias");

        labelTeacherDropdown.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelTeacherDropdown.setText("Docente");

        tableSubjects.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tableSubjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Asignatura", "Grupo", "Profesor", "Dias"
            }
        ));
        jScrollPane2.setViewportView(tableSubjects);

        labelGroup.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelGroup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGroup.setText("Grupo");

        dropdownTeachers.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        dropdownTeachers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelCI, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldCI, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(headerAddTeacher))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(buttonAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelTeacherDropdown)
                                    .addGap(288, 288, 288)
                                    .addComponent(dropdownTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelSubjectName)
                                        .addComponent(labelWeekDays)
                                        .addComponent(labelGroup))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textFieldSubjectName1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                                        .addComponent(textFieldSubjectName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textFieldSubjectName2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(headerAddSubject)
                                .addGap(179, 179, 179))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(headerTeacherRegistry, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerTeacherRegistry)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelName)
                            .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(headerAddSubject)
                            .addComponent(headerAddTeacher))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSubjectName)
                            .addComponent(textFieldSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldSubjectName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelWeekDays)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCI))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldSubjectName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGroup)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(buttonAddTeacher)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTeacherDropdown)
                    .addComponent(dropdownTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 32, 0, 13);
        getContentPane().add(jPanel1, gridBagConstraints);

        buttonReturn.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        buttonReturn.setText("Volver");
        buttonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReturnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 87;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 837, 15, 13);
        getContentPane().add(buttonReturn, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed
        mainMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonReturnActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddTeacher;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JComboBox<String> dropdownTeachers;
    private javax.swing.JLabel headerAddSubject;
    private javax.swing.JLabel headerAddTeacher;
    private javax.swing.JLabel headerTeacherRegistry;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCI;
    private javax.swing.JLabel labelGroup;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelSubjectName;
    private javax.swing.JLabel labelTeacherDropdown;
    private javax.swing.JLabel labelWeekDays;
    private javax.swing.JTable tableSubjects;
    private javax.swing.JTable tableTeachers;
    private javax.swing.JTextField textFieldCI;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldSubjectName;
    private javax.swing.JTextField textFieldSubjectName1;
    private javax.swing.JTextField textFieldSubjectName2;
    // End of variables declaration//GEN-END:variables
}
