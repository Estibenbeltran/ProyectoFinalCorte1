package Principal;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author Dairo Beltran y Camilo D'isidoro
 * Esta clase permitirá la presentacuión del menú en la clase principal Main
 */
public class Menu {
    public void menu(){
        String ruta = "C:\\Users\\daiyd\\OneDrive\\Documents\\Documentos de la Universidad\\Programación 2\\ProyectoFinalCorte1\\ProyectoFinalCorte1\\archivo.txt";
        File archivo = new File(ruta);
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

                case 1:/*
                    String saludo="Hola";

                    try{
                    //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
                    File archivo=new File("texto.txt");
                    //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                    FileWriter escribir=new FileWriter(archivo,true);
                    //Escribimos en el archivo con el metodo write
                    escribir.write(saludo);
                    //Cerramos la conexion
                    escribir.close();
                    }catch(Exception e){//Si existe un problema al escribir cae aqui
                    System.out.println("Error al escribir");
                    } */
                break;

                case 2:
                    System.out.println("");
                break;

                case 3:
                    int num;
                    System.out.println("Cuantas notas desea sacar por estudiante?");
                    num = leer.nextInt();
                    while(num<=0){
                        System.out.println("Nota inválida");
                        num = leer.nextInt();
                    }
                    float [] notas = new float[num];
                    for(int i=0; i<num; i++){
                        System.out.println("Ingresa la nota del estudiante numero "+i+1);
                        notas[i] = leer.nextFloat();
                    }
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

