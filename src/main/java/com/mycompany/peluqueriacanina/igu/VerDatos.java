
package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascotas;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VerDatos extends javax.swing.JFrame {

    Controladora control = new Controladora();
    
    public VerDatos() {      
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("VISUALIZACIÓN DATOS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaMascotas.setBackground(new java.awt.Color(255, 255, 255));
        tablaMascotas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Datos de Mascotas");

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Villa\\Downloads\\eliminar (1).png")); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Villa\\Downloads\\editar (2).png")); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnEditar)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Villa\\Downloads\\flecha-izquierda (1).png")); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addGap(315, 315, 315))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla(); 
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        //Controlo que la tabal no este vacia 
        if (tablaMascotas.getRowCount() > 0) {
            
            //Controlo que se haya seleccinado una mascota
            if (tablaMascotas.getSelectedRow()!=-1 ) {
                
                //Obtengo id de la mascota a eliminar 
                int num_Cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt
                (tablaMascotas.getSelectedRow(), 0)));
                
                //Llamo el metodo borrar 
                control.borrarMascota(num_Cliente); 
                
                //Aviso al usuario que borro correctamente 
                mostrarMensaje("Mascota Eliminada correctamente", "Info", "Borrado de Mascota");
                
                cargarTabla();
               
            }
            else{
                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al Eliminar");
            }
        }
        else{
           mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al Eliminar"); 
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
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
            //Controlo que la tabal no este vacia 
        if (tablaMascotas.getRowCount() > 0) {
            
            //Controlo que se haya seleccinado una mascota
            if (tablaMascotas.getSelectedRow()!=-1 ) {
                
                //Obtengo id de la mascota a editar
                int num_Cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt
                (tablaMascotas.getSelectedRow(), 0)));
                
                ModificarDatos pantallaModif = new ModificarDatos(num_Cliente); 
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null); 
                
                this.dispose();
                    
            }
            else{
                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al Eliminar");
            }
        }
        else{
           mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al Eliminar"); 
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Definir el modelo que queremos que tenga la tabla 
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            
            //Que fila y columna no sean editables 
            @Override
            public boolean isCellEditable (int row, int column){
            return false;  
            }
        };
        
        //Establecemos el nombre de las columnas 
        
        String titulos[] = {"Num","Nombre", "Raza", "Color", "Alergico", "At. Esp.", "Dueño", "Cel"}; 
        modeloTabla.setColumnIdentifiers(titulos); 
        
        //Carga de los DATOS desde la BD
        List <Mascotas> listaMascotas = control.traerMascotas(); 
        
        //Recorrer la lista y mostrar cada uno de los elementos 
        if (listaMascotas !=null) {
            for (Mascotas masco: listaMascotas){
                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getRaza(), masco.getColor(), masco.getAlergico(), 
                    masco.getAtecion_especial(), masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCelDuenio()}; 
                
                modeloTabla.addRow(objeto); 
            }
        }
        
        tablaMascotas.setModel(modeloTabla);
        
    }
}
