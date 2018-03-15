package Principal;
import Principal.Menu;
import Principal.InteColegio;
import Principal.Estudiante;
import Principal.Docente;
/**
 *
 * @version 1.0
 * @author Dairo Estiben Beltran Martinez y Camil oAndrés D'isidoro Flechas
 * Este ejercicio consta de los siguientes requerimnetos:
 * 1.El programa debe gestionar:  docentes y alumnos. (Crear y eliminar del archivo plano), crear curso, materias
 * y asignar estudiantes (Dinámica). Listado de docentes y alumnos ya precargado en el archivo plano. 
 * 2.El sistema debe poder asignar n cantidad notas a los estudiantes o por materia.
 * 3.El sistema debe mostrar el listado de alumnos por materia, sus notas y su nota final. 
 * 4.El sistema debe mostrar lo mejores 5 promedios por materia.
 * 5.El sistema debe generar el listado de docentes y sus materias. 

 */
public class Main {
    public static void main(String[] args){
        Menu men = new Menu();
        men.menu();
    }
}

