
package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascotas;
import javax.swing.JDialog;
import javax.swing.JOptionPane;



public class ModificarDatos extends javax.swing.JFrame {

    
    Controladora control = null;
    int num_Cliente;
    Mascotas masco;
    
    public ModificarDatos(int num_Cliente) {
        control = new Controladora(); 
        //this.num_Cliente = num_Cliente;
        initComponents(); 
        
        cargarDatos(num_Cliente);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtNombreDuenio = new javax.swing.JTextField();
        txtCelDuenio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        cmbAlergico = new javax.swing.JComboBox<>();
        cmbAtencion = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("MODIFICACIÓN DATOS");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Villa\\Downloads\\perro (1).png")); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Nombre: ");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Raza:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Color:");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Alergico:");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Atención Especial:");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Nombre Dueño: ");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Cel. Dueño: ");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Observaciones: ");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));

        txtRaza.setBackground(new java.awt.Color(255, 255, 255));
        txtRaza.setForeground(new java.awt.Color(102, 102, 102));

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setForeground(new java.awt.Color(102, 102, 102));

        txtNombreDuenio.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreDuenio.setForeground(new java.awt.Color(102, 102, 102));

        txtCelDuenio.setBackground(new java.awt.Color(255, 255, 255));
        txtCelDuenio.setForeground(new java.awt.Color(102, 102, 102));

        txtObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        txtObservaciones.setColumns(20);
        txtObservaciones.setForeground(new java.awt.Color(102, 102, 102));
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        cmbAlergico.setBackground(new java.awt.Color(255, 255, 255));
        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        cmbAtencion.setBackground(new java.awt.Color(255, 255, 255));
        cmbAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        btnLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpiar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar Cambios");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Villa\\Downloads\\flecha-izquierda (1).png")); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText(""); 
        txtRaza.setText("");
        txtColor.setText("");
        txtNombreDuenio.setText("");
        txtCelDuenio.setText("");
        txtObservaciones.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtencion.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        //Datos de la Mascota
        String nombreMasco = txtNombre.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText(); 
        String nombreDue = txtNombreDuenio.getText();
        String celDuenio = txtCelDuenio.getText();
        String observaciones = txtObservaciones.getText();
        
        //Datos del Dueño 
        String alergico = (String) cmbAlergico.getSelectedItem();
        String atencion = (String) cmbAtencion.getSelectedItem();
        
        
        control.modificarMascota(masco,nombreMasco, raza, color, nombreDue, celDuenio, observaciones, alergico, atencion);  
        
        //Mensaje  
        
        mostrarMensaje("Edición realizada correctamente", "Info", "Edición Correcta");
        
        
        VerDatos pantalla = new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose(); 
        
        
        
            
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCelDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_Cliente) {
        
        this.masco = control.traerMascota(num_Cliente); 
        
        txtNombre.setText(masco.getNombre()); 
        txtRaza.setText(masco.getRaza());
        txtColor.setText(masco.getColor());
        txtNombreDuenio.setText(masco.getUnDuenio().getNombre());
        txtCelDuenio.setText(masco.getUnDuenio().getCelDuenio());
        txtObservaciones.setText(masco.getObservaciones());
        
        if  (masco.getAlergico().equals("Si")){
            cmbAlergico.setSelectedIndex(1);
        }else { 
            if (masco.getAlergico().equals("No")) {
               cmbAlergico.setSelectedIndex(2); 
            }           
        }
        
        if  (masco.getAtecion_especial().equals("Si")){
            cmbAtencion.setSelectedIndex(1);
        }else { 
            if (masco.getAtecion_especial().equals("No")) {
               cmbAtencion.setSelectedIndex(2); 
            }           
        }
        
        
    }   
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
            JOptionPane optionPane  = new JOptionPane(mensaje);
            
            if (tipo.equals("info")) {
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            }
            
            else if(tipo.equals("Error")){
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE); 
            }
            
            JDialog dialog = optionPane.createDialog(titulo);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);                 
    }
         
}
