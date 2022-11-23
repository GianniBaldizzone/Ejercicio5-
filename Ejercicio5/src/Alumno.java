import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private String numeroMatricula;
    private ArrayList<Materia> materias;


    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public Alumno(String nombre, String apellido, String dni, String numeroMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.numeroMatricula = numeroMatricula;
        this.materias = new ArrayList<Materia>(0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
   public void consultarCursosYDocente (Alumno yo, Materia materia){
       System.out.println(this.nombre + " esta pidiendo los turnos y el docente de esta materia");
       materia.mostrarDatos();
   }
    public void anotarseMateria(Alumno yo, Materia materiaParaAnotarse){
            getMaterias().add(materiaParaAnotarse);
            System.out.println(this.nombre + " se anoto correctamente a la materia "+ materiaParaAnotarse.getNombre());
            System.out.println(getMaterias());}

}

