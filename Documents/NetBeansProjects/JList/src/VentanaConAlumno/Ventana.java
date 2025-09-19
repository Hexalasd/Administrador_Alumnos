package VentanaConAlumno;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {
    Liceo esiBuceo = new Liceo();
    private Alumno elAlumno;
    private DefaultListModel modelo;

    public Ventana() {
        initComponents();
        modelo = new DefaultListModel();
        listAlumnos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAlumnos = new javax.swing.JList<>();
        rbtnNocturno = new javax.swing.JRadioButton();
        btnMostrar = new javax.swing.JButton();
        btnDiurnos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        rbtnDiurno = new javax.swing.JRadioButton();
        txtCi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBorrar1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listAlumnos.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(listAlumnos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 141, 216));

        rbtnNocturno.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnNocturno);
        rbtnNocturno.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        rbtnNocturno.setForeground(new java.awt.Color(51, 51, 51));
        rbtnNocturno.setText("Nocturno");
        jPanel1.add(rbtnNocturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 177, -1, -1));

        btnMostrar.setBackground(new java.awt.Color(51, 51, 51));
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");
        btnMostrar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 70, 20));

        btnDiurnos.setBackground(new java.awt.Color(51, 51, 51));
        btnDiurnos.setForeground(new java.awt.Color(255, 255, 255));
        btnDiurnos.setText("Diurnos");
        btnDiurnos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        btnDiurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiurnosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 70, 20));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, -1));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Edad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtEdad.setBackground(new java.awt.Color(51, 51, 51));
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 170, -1));

        btnGuardar.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, 20));

        rbtnDiurno.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnDiurno);
        rbtnDiurno.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        rbtnDiurno.setForeground(new java.awt.Color(51, 51, 51));
        rbtnDiurno.setSelected(true);
        rbtnDiurno.setText("Diurno");
        jPanel1.add(rbtnDiurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 177, -1, -1));

        txtCi.setBackground(new java.awt.Color(51, 51, 51));
        txtCi.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 170, -1));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Ci:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Esi Buceo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 20));

        btnBorrar1.setBackground(new java.awt.Color(51, 51, 51));
        btnBorrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar1.setText("Borrar");
        btnBorrar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 70, 20));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VentanaConAlumno/Recursos/360_F_598587047_8tycDUDogGo87uWSnJLm9ym00gMMcsun (1).jpg"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 620, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean alumnoYaExiste(String ci) {
    for (int i = 0; i < modelo.getSize(); i++) {
        Alumno alumnoExistente;
        alumnoExistente = (Alumno) modelo.getElementAt(i);
        

        if (alumnoExistente.equals(new Alumno("", 0, true, ci))) {
            return true; 
        }
    }
    return false;
}
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        boolean esDiurno = rbtnDiurno.isSelected();
        String ci = txtCi.getText();

        elAlumno = new Alumno(nombre, edad, esDiurno ,ci);
        
        if(!alumnoYaExiste(ci)){
        modelo.addElement(elAlumno);
        esiBuceo.addAlumno(elAlumno);
        }else{
            JOptionPane.showMessageDialog(this,"el alumno esta repetido, no se va a añadir");
        }
            
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (!modelo.isEmpty()) {
            int posicion = listAlumnos.getSelectedIndex();
            Alumno miAlumno = (Alumno) modelo.getElementAt(posicion);
            JOptionPane.showMessageDialog(this, miAlumno);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnDiurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiurnosActionPerformed
       JOptionPane.showMessageDialog(this, esiBuceo.alumnosDiurno());
    }//GEN-LAST:event_btnDiurnosActionPerformed

    private void btnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar1ActionPerformed
        if (!modelo.isEmpty()) {
            int posicion = listAlumnos.getSelectedIndex();
            modelo.remove(posicion);            
            JOptionPane.showMessageDialog(this, "Ha sido borrado con exito.");
        }
    }//GEN-LAST:event_btnBorrar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnDiurnos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JList<String> listAlumnos;
    private javax.swing.JRadioButton rbtnDiurno;
    private javax.swing.JRadioButton rbtnNocturno;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
