/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JMenuItem;

/**
 *
 * @author Note
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAgregarProfesor = new javax.swing.JMenuItem();
        jMenuItemMostrarProfesores = new javax.swing.JMenuItem();
        jMenuItemBuscarProfesor = new javax.swing.JMenuItem();
        jMenuItemEliminarProfesor = new javax.swing.JMenuItem();
        jMenuItemAgregarAsignaturaProfesor = new javax.swing.JMenuItem();
        jMenuItemEliminarAsignaturaProfesor = new javax.swing.JMenuItem();
        jMenuItemMostrarAsignaturasProfesor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAgregarAlumno = new javax.swing.JMenuItem();
        jMenuItemMostrarAlumnos = new javax.swing.JMenuItem();
        jMenuItemBuscarPorRut = new javax.swing.JMenuItem();
        jMenuItemBuscarPorCarrera = new javax.swing.JMenuItem();
        jMenuItemEliminarAlumno = new javax.swing.JMenuItem();
        jMenuItemEstadoAsignatura = new javax.swing.JMenuItem();
        jMenuItemActualizacionEstado = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAgregarCarrera = new javax.swing.JMenuItem();
        jMenuItemMostrarCarreras = new javax.swing.JMenuItem();
        jMenuItemBuscarCarrera = new javax.swing.JMenuItem();
        jMenuItemEliminarCarrera = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("  Sistema Gestion Instituto");

        jButtonSalir.setText("Salir ");

        jLabel2.setText("[Al salir se generara un reporte y se guardaran los datos ]");

        jMenu3.setText("Profesor");

        jMenuItemAgregarProfesor.setText("Agregar Profesor");
        jMenu3.add(jMenuItemAgregarProfesor);

        jMenuItemMostrarProfesores.setText("Mostrar Profesores");
        jMenu3.add(jMenuItemMostrarProfesores);

        jMenuItemBuscarProfesor.setText("Buscar Profesor");
        jMenu3.add(jMenuItemBuscarProfesor);

        jMenuItemEliminarProfesor.setText("Eliminar Profesor");
        jMenu3.add(jMenuItemEliminarProfesor);

        jMenuItemAgregarAsignaturaProfesor.setText("Agregar Asignatura");
        jMenu3.add(jMenuItemAgregarAsignaturaProfesor);

        jMenuItemEliminarAsignaturaProfesor.setText("Eliminar Asignatura");
        jMenu3.add(jMenuItemEliminarAsignaturaProfesor);

        jMenuItemMostrarAsignaturasProfesor.setText("Mostrar Asignaturas");
        jMenu3.add(jMenuItemMostrarAsignaturasProfesor);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Alumno");

        jMenuItemAgregarAlumno.setText("Agregar Alumno");
        jMenu2.add(jMenuItemAgregarAlumno);

        jMenuItemMostrarAlumnos.setText("Mostrar Alumnos");
        jMenu2.add(jMenuItemMostrarAlumnos);

        jMenuItemBuscarPorRut.setText("Buscar Por Rut");
        jMenu2.add(jMenuItemBuscarPorRut);

        jMenuItemBuscarPorCarrera.setText("Buscar Por Carrera");
        jMenu2.add(jMenuItemBuscarPorCarrera);

        jMenuItemEliminarAlumno.setText("Eliminar Alumno");
        jMenu2.add(jMenuItemEliminarAlumno);

        jMenuItemEstadoAsignatura.setText("Estado Asignatura");
        jMenu2.add(jMenuItemEstadoAsignatura);

        jMenuItemActualizacionEstado.setText("Actualizacion Estado");
        jMenu2.add(jMenuItemActualizacionEstado);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Carreras");

        jMenuItemAgregarCarrera.setText("Agregar Carrera");
        jMenu1.add(jMenuItemAgregarCarrera);

        jMenuItemMostrarCarreras.setText("Mostrar Carreras");
        jMenu1.add(jMenuItemMostrarCarreras);

        jMenuItemBuscarCarrera.setText("Buscar Carrera");
        jMenu1.add(jMenuItemBuscarCarrera);

        jMenuItemEliminarCarrera.setText("Eliminar Carrera");
        jMenu1.add(jMenuItemEliminarCarrera);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjButtonSalir() {
        return jButtonSalir;
    }

    //AQUI VAN LOS METODOS NECESARIOS PARA LA COMPARACION EN EL CONTROLADOR--------------------------------
    // CORESPONDE A LOS SUB-MENUS
    //(PUBLIC) (JMENUITEM) (GET+NOMBREVENTANA)
    //GETTERS DE PROFESOR
    public JMenuItem getjMenuItemAgregarProfesor() {
        return jMenuItemAgregarProfesor;}

    public JMenuItem getjMenuItemMostrarProfesores() {
        return jMenuItemMostrarProfesores;}
    
    public JMenuItem getjMenuItemEliminarProfesor(){
        return jMenuItemEliminarProfesor;}
    
    public JMenuItem getjMenuItemBuscarProfesor(){
        return jMenuItemBuscarProfesor;}
    
    public JMenuItem getjMenuItemEliminarAsignaturaProfesor() {
        return jMenuItemEliminarAsignaturaProfesor;}
    
    public JMenuItem getjMenuItemMostrarAsignaturasProfesor() {
        return jMenuItemMostrarAsignaturasProfesor;}


//GETTERS DE CARRERA
    public JMenuItem getjMenuItemAgregarCarrera(){
        return jMenuItemAgregarCarrera;}
    
    public JMenuItem getjMenuItemBuscarCarrera() {
        return jMenuItemBuscarCarrera;}
    
    public JMenuItem getjMenuItemEliminarCarrera() {
        return jMenuItemEliminarCarrera;}
    
    public JMenuItem getjMenuItemMostrarCarreras(){
        return jMenuItemMostrarCarreras;}
    
    public JMenuItem getjMenuItemjMenuItemAgregarAsignaturaProfesor() {
        return jMenuItemAgregarAsignaturaProfesor;}

    
    
    //GETTERS DE ALUMNO
    
     public JMenuItem getjMenuItemActualizacionEstadoAsignaturaAlumno() {
        return jMenuItemActualizacionEstado;
    }

    public JMenuItem getjMenuItemAgregarAlumno() {
        return jMenuItemAgregarAlumno;
    }

    public JMenuItem getjMenuItemBuscarPorCarrera() {
        return jMenuItemBuscarPorCarrera;
    }

    public JMenuItem getjMenuItemBuscarPorRut() {
        return jMenuItemBuscarPorRut;
    }

    public JMenuItem getjMenuItemEliminarAlumno() {
        return jMenuItemEliminarAlumno;
    }

    public JMenuItem getjMenuItemEstadoAsignatura() {
        return jMenuItemEstadoAsignatura;
    }

    public JMenuItem getjMenuItemMostrarAlumnos() {
        return jMenuItemMostrarAlumnos;
    }
    
    
     // ...
    //LO DE ABAJO SON LOS NOMBRES DE LOS BOTONES, == A LO DE ARRIBA
    
  
//-------------------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemActualizacionEstado;
    private javax.swing.JMenuItem jMenuItemAgregarAlumno;
    private javax.swing.JMenuItem jMenuItemAgregarAsignaturaProfesor;
    private javax.swing.JMenuItem jMenuItemAgregarCarrera;
    private javax.swing.JMenuItem jMenuItemAgregarProfesor;
    private javax.swing.JMenuItem jMenuItemBuscarCarrera;
    private javax.swing.JMenuItem jMenuItemBuscarPorCarrera;
    private javax.swing.JMenuItem jMenuItemBuscarPorRut;
    private javax.swing.JMenuItem jMenuItemBuscarProfesor;
    private javax.swing.JMenuItem jMenuItemEliminarAlumno;
    private javax.swing.JMenuItem jMenuItemEliminarAsignaturaProfesor;
    private javax.swing.JMenuItem jMenuItemEliminarCarrera;
    private javax.swing.JMenuItem jMenuItemEliminarProfesor;
    private javax.swing.JMenuItem jMenuItemEstadoAsignatura;
    private javax.swing.JMenuItem jMenuItemMostrarAlumnos;
    private javax.swing.JMenuItem jMenuItemMostrarAsignaturasProfesor;
    private javax.swing.JMenuItem jMenuItemMostrarCarreras;
    private javax.swing.JMenuItem jMenuItemMostrarProfesores;
    // End of variables declaration//GEN-END:variables
}
