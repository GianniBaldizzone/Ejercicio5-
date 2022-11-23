public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
Alumno gianni = new Alumno("Gianni",
        "Baldizzone",
        "44891361",
        "3899400292");
Docente gabriel = new Docente("Gabriel","Beratarbide","44891361");
Materia programacion = new Materia("Programacion","T.M",gabriel,true,"14:10");
//Materia programacion1 = new Materia("Programacion","T.T",);
gianni.consultarCursosYDocente(gianni,programacion);
gianni.anotarseMateria(gianni,programacion);







    }
}