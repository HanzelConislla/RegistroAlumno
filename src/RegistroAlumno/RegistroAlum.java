/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroAlumno;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hanze
 */
public final class RegistroAlum extends javax.swing.JFrame {

    
    DefaultTableModel modelo=new DefaultTableModel();
    ArrayList<Alumno> listaAlumnos=new ArrayList<>();
    public RegistroAlum() {
        initComponents();
        this.setTitle("Registro Alumno Turno Mañana");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CURSO");
        modelo.addColumn("TURNO");
        refrescarTABLA();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreAlum = new javax.swing.JTextField();
        cboTurno = new javax.swing.JComboBox<>();
        btnAgregarAlum = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cboCurso1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRegistro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 450, 180));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Estudiante :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Turno :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        getContentPane().add(txtNombreAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 220, -1));

        cboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAÑANA", "TARDE", "NOCHE" }));
        getContentPane().add(cboTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 140, 20));

        btnAgregarAlum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregarAlum.setText("Agregar");
        btnAgregarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 140, 70));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 130, 70));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Curso :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        cboCurso1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geometria", "Trigonometria", "Algebra" }));
        getContentPane().add(cboCurso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumActionPerformed
        try {
        Alumno alumno=new Alumno();
        alumno.setNombre(txtNombreAlum.getText());
        alumno.setCurso(cboTurno.getSelectedItem().toString());
        alumno.setCurso(cboTurno.getSelectedItem().toString());

        listaAlumnos.add(alumno);
        refrescarTABLA();
        }catch (Exception e) {      
            JOptionPane.showMessageDialog(this,"ERROR AL AGREGAR ALUMNO ");
        }
    }//GEN-LAST:event_btnAgregarAlumActionPerformed

    public void refrescarTABLA(){
        //Borrar todos los elementos del modelo
        while(modelo.getRowCount()>0){
          modelo.removeRow(0);
        }
        
        for(Alumno alumno: listaAlumnos){
            Object a[]=new Object[2];
            a[0]=alumno.getNombre();
            a[1]=alumno.getCurso();
            a[2]=alumno.getTurno();
            modelo.addRow(a);

        }
        tblRegistro.setModel(modelo);
    }
    
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
            java.util.logging.Logger.getLogger(RegistroAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlum;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cboCurso1;
    private javax.swing.JComboBox<String> cboTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtNombreAlum;
    // End of variables declaration//GEN-END:variables
}
