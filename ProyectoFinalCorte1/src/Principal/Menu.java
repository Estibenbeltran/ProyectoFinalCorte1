package Principal;
import java.util.Scanner;
/**
 *
 * @author Dairo Beltran y Camilo D'isidoro
 * Esta clase permitirá la presentacuión del menú en la clase principal Main
 */
public class Menu {
    public void menu(){
        int opc=20;
        Scanner leer = new Scanner(System.in);
         while(opc!=0){
            System.out.println("Bienvenido, que desea hacer?"); 
            System.out.println("1)Ver la lista de docentes y estudiantes");
            System.out.println("2)Crear curso, materias y asignar estudiantes");
            System.out.println("3)Ingresar notas a los estudiantes");
            System.out.println("4)Ver el listado de alumnos (por materia), sus notas y su promedio final");
            System.out.println("5)Ver los mejores 5 estudaintes por materia");
            System.out.println("6)Ver el listado de docentes y sus materias");
            System.out.println("0)Salir");
            opc = leer.nextInt();
            while(opc<0 || opc>6){//validacion de la opcion
                System.out.println("opcion invalida");
                opc = leer.nextInt();
            }
            switch(opc){
                case 0:
                //aqui se finaliza el programa
                        System.out.println("Has salido del programa para poder votar");
                break;

                case 1:
                break;

                case 2:
                break;

                case 3:
                break;

                case 4:
                break;

                case 5:
                break;

                case 6:
                break;
            }   
        }           
    }
}


