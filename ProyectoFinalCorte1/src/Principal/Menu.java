package Principal;
import java.util.Scanner;
import java.io.*;
/**
 *Esta clase permitirá la presentacuión del menú en la clase principal Main
 * @author Dairo Beltran y Camilo Disidoro
 */
public class Menu {
    public void menu(){
        //GENERACION DE FICHEROS CON SUS RUTAS
        String rutaE = "D:\\Documentos\\Universidad\\Prog 2\\Proyecto Corte 1\\ProyectoFinalCorte1\\ProyectoFinalCorte1\\estudiantes.txt";
        File estudiantes = new File(rutaE);
        String rutaD = "D:\\Documentos\\Universidad\\Prog 2\\Proyecto Corte 1\\ProyectoFinalCorte1\\ProyectoFinalCorte1\\docentes.txt";
        File docentes = new File(rutaD);
        String rutaM = "D:\\Documentos\\Universidad\\Prog 2\\Proyecto Corte 1\\ProyectoFinalCorte1\\ProyectoFinalCorte1\\materias.txt";
        File materias = new File(rutaM);
        String rutaC = "D:\\Documentos\\Universidad\\Prog 2\\Proyecto Corte 1\\ProyectoFinalCorte1\\ProyectoFinalCorte1\\cursos.txt";
        File cursos = new File(rutaC);
        //DECLARACION DE VARIABLES INTERNAS
        int opc=20;
        Scanner leer = new Scanner(System.in);
        //GENERACION DEL MENU
         while(opc!=0){
            System.out.println("Bienvenido, que desea hacer?"); 
            System.out.println("1)Ver la lista de docentes y estudiantes");                                                                  //PENDIENTE
            System.out.println("2)Crear curso, materias y asignar estudiantes");                                                        //PENDIENTE
            System.out.println("3)Ingresar notas a los estudiantes");                                                                             //PENDIENTE
            System.out.println("4)Ver el listado de alumnos (por materia), sus notas y su promedio final");          //PENDIENTE
            System.out.println("5)Ver los mejores 5 estudiantes por materia");                                                          //PENDIENTE
            System.out.println("6)Ver el listado de docentes y sus materias");                                                            //PENDIENTE
            System.out.println("7) Eliminar Registros");                                                                                                    //PENDIENTE
            System.out.println("0)Salir");
            opc = leer.nextInt();
            while(opc<0 || opc>7){//validacion de la opcion
                System.out.println("opcion invalida");
                opc = leer.nextInt();
            }
            //SELECCION DE LA OPCION
            switch(opc){
                case 0:
                //aqui se finaliza el programa
                        System.out.println("Has salido del programa");
                break;
                case 1:
                    //PERMITE ELEGIR ENTRE SI DESEA VER LOS ESTUDIANTES O DOCENTES
                    System.out.println("Seleccione que desea ver:");
                    System.out.println("1)Estudiantes");
                    System.out.println("2)Profesores");
                    System.out.println("0)Volver");
                    opc = leer.nextInt();
                    while(opc<0 || opc>2){
                        System.out.println("Opcion no valida");
                        opc = leer.nextInt();
                    }
                    //ACTUA SEGUN LA OPCION ELEGIDA
                    switch (opc){
                        case 1:
                            //VALIDA SI EL ARCHIVO EXISTE, DE NO EXISTIR NOS DIRA QUE EL ARCHIVO NO FUE ENCONTRADO
                            if(!(new File("estudiantes.txt")).exists()){
                                System.out.println("Archivo no encontrado");
                            }else{
                                //PERMITE LA APERTURA DEL FICHERO
                                try{
                                    BufferedReader leerF = new BufferedReader(new FileReader(new File("estudiantes.txt")));
                                    String linea;
                                    while((linea=leerF.readLine())!=null){
                                        System.out.println(linea);
                                    }
                                    leerF.close();
                                }catch(IOException e){ //DETECTARA CUALQUIER POSIBLE FALLO AL CERRAR EL ARCHIVO, Y RETORNARA UN ERROR
                                    System.out.println("Error");
                                }
                            }
                            break;
                        case 2:
                            //VALIDA SI EL ARCHIVO EXISTE, DE NO EXISITIR NOS DIRA QUE EL ARCHIVO NO FUE ENCONTRADO
                            if(!(new File("docentes.txt")).exists()){
                                System.out.println("Archivo no encontrado");
                            }else{
                                //PERMITE LA APERTURA DEL FICHERO
                                try{
                                    BufferedReader leerF = new BufferedReader(new FileReader(new File("docentes.txt")));
                                    String linea;
                                    while((linea=leerF.readLine())!=null){
                                        System.out.println(linea);
                                    }
                                    leerF.close();
                                }catch(IOException e){//DETECTARA CUALQUIER POSIBLE FALLO AL CERRAR EL ARCHIVO, Y  RETORNARA UN ERROR
                                    System.out.println("Error");
                                }
                            }
                            break;
                    }
                    break;
                case 2:
                    try{
                    //CREA EL FILEWRITER, QUE PERMITIRA ESCRIBIR SOBRE EL ARCHIVO
                    BufferedWriter escribir = new BufferedWriter(new FileWriter(new File("archivo.txt")));
                    //ESCRIBIREMOS CON EL METODO WRITE DENTRO DEL ARCHIVO
                    escribir.write("Meme");
                    //CERRAMOS EL FICHERO
                    escribir.close();
                    }catch(IOException e){//DETECTA CUALQUIER POSIBLE FALLO AL CERRAR EL ARCHIVO, Y RETORNARA UN ERROR
                        System.out.println("Error");
                    } 
                    break;
                case 3:
                    try{
                        //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                        FileWriter escribir=new FileWriter(estudiantes,true);
                        
                        
                        
                        escribir.close();
                    }catch(IOException e){
                        System.out.println("Error");
                    }
                    break;
                case 4:
                    //SI NO ENCUENTRA EL ARCHIVO, DIRA QUE NO EXISTE
                    if(!(new File("archivo.txt")).exists()){
                        System.out.println("Archivo no encontrado");
                    }else{
                        //PERMITE LA APERTURA DEL FICHERO
                        try{
                            BufferedReader leerF = new BufferedReader(new FileReader(new File("archivo.txt")));
                            String linea = null;
                            while((linea=leerF.readLine())!=null){
                                System.out.println(linea);
                            }
                            leerF.close();
                        }catch(IOException e){//SI DETECTA ALGUN ERROR, PASA AQUI
                            System.out.println("Error");
                        }
                    }
                    break;
                case 5:
                    //SI NO EXISTE EL ARCHIVO, DIRA QUE NO EXISTE
                    if(!(new File("archivo.txt")).exists()){
                        System.out.println("Archivo no encontrado");
                    }else{
                        //PERMITE LA APERTURA DEL FICHERO
                        try{
                            BufferedReader leerF = new BufferedReader(new FileReader(new File("archivo.txt")));
                            String linea = null;
                            while((linea=leerF.readLine())!=null){
                                System.out.println(linea);
                            }
                            leerF.close();
                        }catch(IOException e){//SI DETECTA ALGUN ERROR PASA AQUI
                            System.out.println("Error");
                        }
                    }
                    break;
                case 6:
                    //SI EL ARCHIVO NO EXISTE, PASA AQUI
                    if(!(new File("archivo.txt")).exists()){
                        System.out.println("Archivo no encontrado");
                    }else{
                        //PERMITE LA APERTURA DEL FICHERO
                        try{
                            BufferedReader leerF = new BufferedReader(new FileReader(new File("archivo.txt")));
                            String linea = null;
                            while((linea=leerF.readLine())!=null){
                                System.out.println(linea);
                            }
                            leerF.close();
                        }catch(IOException e){//SI DETECTA ALGUN ERROR PASA AQUI
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