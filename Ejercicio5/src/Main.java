public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
Alumno gianni = new Alumno("Gianni",
        "Baldizzone",
        "44891361",
        "3899400292");
Docente gabriel = new Docente("Gabriel","Beratarbide","44891361");
Docente juan = new Docente("Juan","Beratarbide","44891361");
Materia programacion = new Materia("Programacion","T.M",gabriel,true,"14:10");
Materia programacion1 = new Materia("Programacion Web","T.T",juan,false,"14:30");
gianni.consultarCursosYDocente(gianni,programacion);
gianni.anotarseMateria(gianni,programacion);
gianni.anotarseMateria(gianni,programacion1);









    }
}