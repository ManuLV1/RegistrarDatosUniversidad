/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class RegistroNotas extends javax.swing.JFrame {

    Connection connect;

    public RegistroNotas() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        cbAsignaturas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNota2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNota3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btIngresar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 24)); // NOI18N
        jLabel1.setText("Universidad de Belén");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el nombre del estudiante");

        jLabel3.setText("Ingrese la nota del primer corte");

        txtNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota1ActionPerformed(evt);
            }
        });

        cbAsignaturas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja una materia....", "Programación III", "Cálculo Integral", "Cátedra Institucional", "Teoría de Sistemas" }));
        cbAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAsignaturasActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese la nota del segundo corte");

        txtNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingrese la nota del último corte");

        txtNota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingrese el apellido del estudiante");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNota1))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbAsignaturas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNota3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellido))
                .addGap(160, 160, 160))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(cbAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        btIngresar.setText("Ingresar notas");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar notas");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(btIngresar)
                .addGap(164, 164, 164)
                .addComponent(btEliminar)
                .addGap(187, 187, 187))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIngresar)
                    .addComponent(btEliminar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAsignaturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAsignaturasActionPerformed

    private void txtNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota1ActionPerformed

    private void txtNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota2ActionPerformed

    public static Connection getConnection() {

        Connection connect = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1", "root", "1000604354");

        } catch (Exception e) {

            System.out.println("error: " + e);
        }
        return connect;
    }

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed

        try {
            if (txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtNota1.getText().equals("") || txtNota2.getText().equals("") || txtNota3.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Ingrese todos los datos para continuar");
            } else {

                double nota1 = Double.parseDouble(txtNota1.getText());
                double nota2 = Double.parseDouble(txtNota2.getText());
                double nota3 = Double.parseDouble(txtNota3.getText());
                double sumaNotas = nota1 + nota2 + nota3;
                String cbOpcion = (String) cbAsignaturas.getSelectedItem();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                connect = getConnection();
                PreparedStatement ps;
                double promedio = sumaNotas / 3;

                switch (cbOpcion) {

                    case "Programación III":

//                  ResultSet rs;
                        ps = connect.prepareStatement("INSERT INTO programcion3(nombre, apellidos, corte1, corte2, cortef) VALUES ('" + nombre + "','" + apellido + "'," + nota1 + "," + nota2 + "," + nota3 + ")");
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Información subida correctamente a la base de datos");
                        JOptionPane.showMessageDialog(null, "Su promedio final es: " + promedio);
                        if (promedio < 30 && promedio >= 0) {

                            JOptionPane.showMessageDialog(null, "Sigue esforzandote para subir esas notas");
                        } else if (promedio < 51) {

                            JOptionPane.showMessageDialog(null, "Felicidades usted acaba de culminar de manera excelente esta clase");
                        } else {

                            JOptionPane.showMessageDialog(null, "Por favor verifique sus notas, puede que haya digitado un número negativo\n o una nota mayor a 5");
                        }
                        break;
                    case "Cálculo Integral":

//                  ResultSet rs;
                        ps = connect.prepareStatement("INSERT INTO calculo(nombre, apellidos, corte1, corte2, cortef) VALUES ('" + nombre + "','" + apellido + "'," + nota1 + "," + nota2 + "," + nota3 + ")");
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Información subida correctamente a la base de datos");
                        JOptionPane.showMessageDialog(null, "Su promedio final es: " + promedio);
                        if (promedio < 30 && promedio >= 0) {

                            JOptionPane.showMessageDialog(null, "Sigue esforzandote para subir esas notas");
                        } else if (promedio < 51) {

                            JOptionPane.showMessageDialog(null, "Felicidades usted acaba de culminar de manera excelente esta clase");
                        } else {

                            JOptionPane.showMessageDialog(null, "Por favor verifique sus notas, puede que haya digitado un número negativo\n o una nota mayor a 5");
                        }
                        break;
                    case "Cátedra Institucional":

                        ps = connect.prepareStatement("INSERT INTO catedra(nombre, apellidos, corte1, corte2, cortef) VALUES ('" + nombre + "','" + apellido + "'," + nota1 + "," + nota2 + "," + nota3 + ")");
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Información subida correctamente a la base de datos");

                        JOptionPane.showMessageDialog(null, "Su promedio final es: " + promedio);

                        if (promedio < 30 && promedio >= 0) {

                            JOptionPane.showMessageDialog(null, "Sigue esforzandote para subir esas notas");
                        } else if (promedio < 51) {

                            JOptionPane.showMessageDialog(null, "Felicidades usted acaba de culminar de manera excelente esta clase");
                        } else {

                            JOptionPane.showMessageDialog(null, "Por favor verifique sus notas, puede que haya digitado un número negativo\n o una nota mayor a 5");
                        }
                        break;
                    case "Teoría de Sistemas":

                        ps = connect.prepareStatement("INSERT INTO teoria(nombre, apellidos, corte1, corte2, cortef) VALUES ('" + nombre + "','" + apellido + "'," + nota1 + "," + nota2 + "," + nota3 + ")");
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Información subida correctamente a la base de datos");

                        JOptionPane.showMessageDialog(null, "Su promedio final es: " + promedio);

                        if (promedio < 30 && promedio >= 0) {

                            JOptionPane.showMessageDialog(null, "Sigue esforzandote para subir esas notas");
                        } else if (promedio < 51) {

                            JOptionPane.showMessageDialog(null, "Felicidades usted acaba de culminar de manera excelente esta clase");
                        } else {

                            JOptionPane.showMessageDialog(null, "Por favor verifique sus notas, puede que haya digitado un número negativo\n o una nota mayor a 5");
                        }
                        break;
                    default:

                        JOptionPane.showMessageDialog(null, "Ingrese una asignatura");
                }

            }

        } catch (Exception e) {

            System.out.println("No se pudo subir la información a la base de datos");
        }
    }//GEN-LAST:event_btIngresarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota3ActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed

        try {
            if (txtNombre.getText().equals("") && txtApellido.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Debe ingresar to para poder buscar y eliminar el registro");
            } else {
                double nota1 = Double.parseDouble(txtNota1.getText());
                double nota2 = Double.parseDouble(txtNota2.getText());
                double nota3 = Double.parseDouble(txtNota3.getText());
                String cbOpcion = (String) cbAsignaturas.getSelectedItem();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                connect = getConnection();
                PreparedStatement ps;
                ResultSet rs;

                switch (cbOpcion) {

                    case "Programación III":

//                  ResultSet rs;
                        ps = connect.prepareStatement("DELETE FROM programcion3 WHERE nombre = '" + nombre + "' or apellidos = '" + apellido + "';");
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Información eliminada correctamente de la base de datos");

                        break;
                    case "Cálculo Integral":

//ResultSet rs;
                        ps = connect.prepareStatement("DELETE FROM calculo WHERE nombre = '" + nombre + "' or apellidos = '" + apellido + "';");
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Información eliminada correctamente de la base de datos");
                        break;
                    case "Cátedra Institucional":

                        ps = connect.prepareStatement("DELETE FROM catedra WHERE nombre = '" + nombre + "' or apellidos = '" + apellido + "';");
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Información eliminada correctamente de la base de datos");
                        break;
                    case "Teoría de Sistemas":

                        ps = connect.prepareStatement("DELETE FROM teoria WHERE nombre = '" + nombre + "' or apellidos = '" + apellido + "';");

                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Información eliminada correctamente de la base de datos");
                        break;
                    default:

                        JOptionPane.showMessageDialog(null, "Ingrese una asignatura");
                }
            }

        } catch (Exception e) {

            System.out.println("No se pudo eliminar la información de la base de datos");
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Connection count = null; //count es el nombre de la variable
        count = getConnection();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btIngresar;
    private javax.swing.JComboBox<String> cbAsignaturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    // End of variables declaration//GEN-END:variables
}
