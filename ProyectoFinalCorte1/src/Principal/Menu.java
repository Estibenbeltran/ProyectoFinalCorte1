package Principal;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Dairo Beltran y Camilo D'isidoro
 * Esta clase permitirá la presentacuión del menú en la clase principal Main
 */
public class Menu {
    public void menu(){
        String ruta = "D:\\Documentos\\Universidad\\Prog 2\\Proyecto Corte 1\\ProyectoFinalCorte1\\ProyectoFinalCorte1\\archivo.txt";
        File archivo = new File(ruta);
        int opc=20;
        Scanner leer = new Scanner(System.in);
         while(opc!=0){
            System.out.println("Bienvenido, que desea hacer?"); 
            System.out.println("1)Ver la lista de docentes y estudiantes");
            System.out.println("2)Crear curso, materias y asignar estudiantes");
            System.out.println("3)Ingresar notas a los estudiantes");
            System.out.println("4)Ver el listado de alumnos (por materia), sus notas y su promedio final");
            System.out.println("5)Ver los mejores 5 estudiantes por materia");
            System.out.println("6)Ver el listado de docentes y sus materias");
            System.out.println("7) Eliminar Registros");
            System.out.println("0)Salir");
            opc = leer.nextInt();
            while(opc<0 || opc>7){//validacion de la opcion
                System.out.println("opcion invalida");
                opc = leer.nextInt();
            }
            switch(opc){
                case 0:
                //aqui se finaliza el programa
                        System.out.println("Has salido del programa");
                break;
                case 1:
                    if(!(new File("archivo.txt")).exists()){
                        System.out.println("Archivo no encontrado");
                    }else{
                        try{
                            BufferedReader leerF = new BufferedReader(new FileReader(new File("archivo.txt")));
                            String linea = null;
                            while((linea=leerF.readLine())!=null){
                                System.out.println(linea);
                            }
                            leerF.close();
                        }catch(IOException e){
                            System.out.println("Error");
                        }
                    }
                    break;
                case 2:
                    try{
                    //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                    BufferedWriter escribir = new BufferedWriter(new FileWriter(new File("archivo.txt")));
                    //Escribimos en el archivo con el metodo write
                    escribir.write("Meme");
                    //Cerramos la conexion
                    escribir.close();
                    }catch(IOException e){//Si existe un problema al escribir cae aqui
                        System.out.println("Error");
                    } 
                    break;
                case 3:
                    try{
                        //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                        FileWriter escribir=new FileWriter(archivo,true);
                        
                        
                        
                        escribir.close();
                    }catch(IOException e){
                        System.out.println("Error");
                    }
                    break;
                case 4:
                    if(!(new File("archivo.txt")).exists()){
                        System.out.println("Archivo no encontrado");
                    }else{
                        try{
                            BufferedReader leerF = new BufferedReader(new FileReader(new File("archivo.txt")));
                            String linea = null;
                            while((linea=leerF.readLine())!=null){
                                System.out.println(linea);
                            }
                            leerF.close();
                        }catch(IOException e){
                            System.out.println("Error");
                        }
                    }
                    break;
                case 5:
                    if(!(new File("archivo.txt")).exists()){
                        System.out.println("Archivo no encontrado");
                    }else{
                        try{
                            BufferedReader leerF = new BufferedReader(new FileReader(new File("archivo.txt")));
                            String linea = null;
                            while((linea=leerF.readLine())!=null){
                                System.out.println(linea);
                            }
                            leerF.close();
                        }catch(IOException e){
                            System.out.println("Error");
                        }
                    }
                    break;
                case 6:
                    if(!(new File("archivo.txt")).exists()){
                        System.out.println("Archivo no encontrado");
                    }else{
                        try{
                            BufferedReader leerF = new BufferedReader(new FileReader(new File("archivo.txt")));
                            String linea = null;
                            while((linea=leerF.readLine())!=null){
                                System.out.println(linea);
                            }
                            leerF.close();
                        }catch(IOException e){
                            System.out.println("Error");
                        }
                    }
                    break;
                case 7:
                        
                    break;
            }   
        }           
    }
}

