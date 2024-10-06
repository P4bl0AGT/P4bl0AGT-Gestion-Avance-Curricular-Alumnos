package modelo;

import java.util.Iterator;


public class Profesor extends Persona{
    //ATRIBUTOS
    private Contenedor<String, Asignatura> asignaturas;

    //CONSTRUCTOR
    public Profesor(String nombre, String apellido, String rut, int edad) {
        super(nombre, apellido, rut, edad);
        asignaturas = new Contenedor<>();
    }

    //METODOS
    @Override
    public void mostrar() { 
        System.out.println("Nombre del Profesor: " + getNombre());
        System.out.println("Apellido del Profesor: " + getApellido());
        System.out.println("Edad del Profesor: " + getEdad());
        System.out.println("Rut del Profesor: " + getRut());
        System.out.println("Asignaturas del Profesor: ");
        Iterator<Asignatura> iterador = asignaturas.iterador();
        while (iterador.hasNext()) {
            Asignatura aux = iterador.next();
            aux.mostrar();
        }
    }

    @Override
    public void mostrar(boolean simple) {
        System.out.println(" | " + getNombre() + " | " + getRut() + " | " );
        /* 
        Iterator<Asignatura> iterador = asignaturas.iterador();
        while (iterador.hasNext()) {
            Asignatura aux = iterador.next();
            aux.mostrar(true);
        }
        */
    }

    public boolean agregarAsignatura(Asignatura asignatura) {
        return asignaturas.agregar(asignatura.getCodigo(), asignatura);
    }

    public Asignatura elimarAsignatura(String codigo) {
        return asignaturas.eliminar(codigo);
    }
    
    @Override
    public String toString() {
       return (getNombre() + "," + getApellido() + "," + getRut() + "," + Integer.toString(getEdad()) + "\n");
    }
    
    public String toString(boolean sinSalto) {
       return (getNombre() + "," + getApellido() + "," + getRut() + "," + Integer.toString(getEdad()));
    }
    
    public String listarAsignaturas(){
        String cc = "";
        Iterator iterable = asignaturas.iterador();
        while (iterable.hasNext()) {
            cc += iterable.next().toString();
        }
        return cc;
    }
    
    public String listarAsignaturas(boolean simple){
        String cc = "";
        Iterator<Asignatura> iterable = asignaturas.iterador();
        while (iterable.hasNext()) {
            Asignatura asignatura = iterable.next();
            cc += (asignatura.getCodigo() + "-");
        }
        cc = cc.replaceFirst(".$", "");
        return cc;
    }
    
    public int contarAsignaturas() {
        return asignaturas.talla();
    }
    
    public Asignatura obtenerAsignatura(String id) {
        return asignaturas.obtener(id);
    }
    


}
