import java.util.ArrayList;

public class Materia {
    private String nombre;
    private String turno;
    private Docente docente;
    private Boolean tieneCorrelativa;

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    private String horario;

    public Materia(String nombre, String turno, Docente docente, Boolean tieneCorrelativa, String horario) {
        this.nombre = nombre;
        this.turno = turno;
        this.docente = docente;
        this.tieneCorrelativa = tieneCorrelativa;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }



    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Boolean getTieneCorrelativa() {
        return tieneCorrelativa;
    }

    public void setTieneCorrelativa(Boolean tieneCorrelativa) {
        this.tieneCorrelativa = tieneCorrelativa;
    }

public void mostrarDatos(){
        System.out.println("Turnos disponibles: "+this.getTurno() + "\nDocente de la materia: "+this.getDocente().getNombre());
}


}
