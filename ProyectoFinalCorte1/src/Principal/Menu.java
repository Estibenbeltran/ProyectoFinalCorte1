package Principal;
import java.util.Scanner;
import java.io.*;
/**
 *Esta clase permitirá la presentacuión del menú en la clase principal Main
 * @author Dairo Beltran y Camilo Disidoro
 */
public class Menu {
    private int totalMaestros=0;
    private int totalAlumnos=0;
    private int totalMaterias=0;
    private int totalCursos=0;
    private int cantidadObjetosMaestros=0;
    private int cantidadObjetosAlumnos=0;
    
    Menu(){
        
    }
    public void menu(){
        
        Materia materia = new Materia();
        InteColegio curso = new InteColegio();
        Docente maestro = new Docente();
        Estudiante alumno = new Estudiante();
        
        Docente maestros[] = new Docente[300];
        Estudiante alumnos[] = new Estudiante[300];
        
        Scanner lecturaVar = new Scanner(System.in);
        
        
        
        byte opcionMenu=0;
        String respuestaCase21="";
        String respuestaCase22="";
        String respuestaCase23="";
        float nota1,nota2,nota3,nota4,nota5;
        String nombre1="",nombre2="",nombre3="",nombre4="",nombre5="";
        
        for (int i = 0; i < 300; i++) {
            alumnos[i]=new Estudiante();
        }
        do{//repeticion del menu de opciones
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("|       Ingresa una opcion                 |");         
        System.out.println("|1.Añadir y Eliminar (Estudiante y Docente)|");
        System.out.println("|2.Asignar Estudiante y Maestro            |");
        System.out.println("|3.Asignar Notas Estudiante                |");
        System.out.println("|4.Listado Alumnos por Materia             |");
        System.out.println("|5.Mostrar 5 Mejores Promedios             |");
        System.out.println("|6.Listado Docentes                        |"); 
        System.out.println("--------------------------------------------");                           
        System.out.println(" ");                         
                                   
        
        opcionMenu = lecturaVar.nextByte();//escaneo del dato del menu del usuario
        switch(opcionMenu){

            case 1:
                do{//repeticion del menu de opciones
                System.out.println(" ");
                System.out.println("-----------------------------");
                System.out.println("|       AÑADIR Y ELIMINAR   |");    
                System.out.println("|1.Añadir Estudiante        |");
                System.out.println("|2.Eliminar Estudiante      |");
                System.out.println("|3.Añadir Docente           |");
                System.out.println("|4.Eliminar Docente         |");
                System.out.println("|5.Añadir Materia           |");
                System.out.println("|6.Añadir Curso             |");
                System.out.println("|7.Volver                   |"); 
                System.out.println("-----------------------------");                           
                System.out.println(" "); 
                opcionMenu = lecturaVar.nextByte();//escaneo del dato del menu del usuario
                switch(opcionMenu){

                    case 1:
                        Files archivo1= new Files("Alumno");
                        archivo1.imprimir();
                        alumno.actualizarAlumno();
                        alumno.agregarAlumno();
                        setTotalMaestros(maestro.cantidadMaestrosAgregados);
                        setTotalAlumnos(alumno.cantidadAlumnosAgregados);
                        
                        break;

                    case 2:
                        Files archivo2= new Files("Alumno");
                        archivo2.imprimir();
                        alumno.actualizarAlumno();
                        alumno.eliminarAlumno();
                        setTotalMaestros(maestro.cantidadMaestrosAgregados);
                        setTotalAlumnos(alumno.cantidadAlumnosAgregados);
                       break;

                    case 3:
                        Files archivo3= new Files("Maestro");
                        archivo3.imprimir();
                        maestro.actualizarMaestro();
                        maestro.agregarMaestro();
                        setTotalMaestros(maestro.cantidadMaestrosAgregados);
                        setTotalAlumnos(alumno.cantidadAlumnosAgregados);
                       break;

                    case 4:
                        Files archivo4= new Files("Maestro");
                        archivo4.imprimir();
                        maestro.actualizarMaestro();
                        maestro.eliminarMaestro();
                        setTotalMaestros(maestro.cantidadMaestrosAgregados);
                        setTotalAlumnos(alumno.cantidadAlumnosAgregados);
                       break;
                       
                    case 5:
                       materia.imprimirMateria();
                       materia.agregarMateria();
                       break;
                       
                    case 6:
                       curso.imprimirCurso();
                       curso.agregarCurso();
                       break;

                    case 7:
                        //salida del menu.
                        break;
                    default:
                        //opcion no valida del menu.
                        System.out.println("La opcion no es valida.");
                        break;
                }

                }while(opcionMenu!=7);
                opcionMenu=0;

                break;

            case 2:
                                
                do{//repeticion del menu de opciones

                        System.out.println("1.Establecer Alumno");
                        System.out.println("2.Establecer Maestro");
                        System.out.println("3.Volver");

                        opcionMenu = lecturaVar.nextByte();//escaneo del dato del menu del usuario
                        switch(opcionMenu){

                            case 1://asignar alumno
                                alumno.actualizarAlumno();
                                setTotalAlumnos(alumno.cantidadAlumnosAgregados);
                                if(getTotalAlumnos()!=0){
                                    Files archivo21= new Files("Alumno");
                                    System.out.println(" ");
                                    System.out.println("    Cantidad de Estudiantes");
                                    System.out.println(" ");
                                    archivo21.imprimir();
                                    System.out.println(" ");
                                    System.out.println("----------------------");

                                    String respuestaDatosPersona=" ";
                                    String asignarPersona=" ";
                                    boolean existePersona=false;

                                    System.out.print("Estudiante al que desea asignar:");
                                    asignarPersona=lecturaVar.nextLine();
                                    asignarPersona=lecturaVar.nextLine();

                                    for (int i = 0; i < getTotalAlumnos(); i++) {

                                        respuestaDatosPersona=alumno.informarAlumno(i);
                                        if(asignarPersona.equals(respuestaDatosPersona)){
                                            existePersona=true;
                                        }
                                    }
                                    

                                    if(existePersona==true){
                                        /*Validacion si existe una materia*/
                                        String asignarMateria=" ";
                                        String respuestaDatosMateria=" ";
                                        boolean existeMateria=false;
                                        setTotalMaterias(materia.getCantidadMateriasCreadas());
                                        if(getTotalMaterias()!=0){
                                            System.out.println(" ");
                                            System.out.println("Cantidad de materias");
                                            System.out.println(" ");
                                            materia.imprimirMateria();
                                            System.out.println(" ");
                                            System.out.println("---------------------");
                                            System.out.print("Materia que desea asignar:");
                                            asignarMateria=lecturaVar.nextLine();
                                            for (int o = 0; o < getTotalMaterias(); o++) {
                                                respuestaDatosMateria=materia.informarMateria(o);
                                                if(asignarMateria.equals(respuestaDatosMateria)){
                                                    existeMateria=true;
                                                }
                                            }
                                            
                                            if(existeMateria==true){
                                                /*Validacion si existe un curso*/
                                                String asignarCurso=" ";
                                                String respuestaDatosCurso=" ";
                                                boolean existeCurso=false;
                                                setTotalCursos(curso.getCantidadCursosCreados());
                                                if(getTotalCursos()!=0){
                                                    System.out.println(" ");
                                                    System.out.println(" Cantidad de cursos");
                                                    System.out.println(" ");
                                                    curso.imprimirCurso();
                                                    System.out.println(" ");
                                                    System.out.println("--------------------");
                                                    System.out.print("curso que desea asignar:");
                                                    asignarCurso=lecturaVar.nextLine();
                                                    for (int p = 0; p < getTotalCursos(); p++) {
                                                        respuestaDatosCurso=curso.informarCurso(p);
                                                        if(asignarCurso.equals(respuestaDatosCurso)){
                                                            existeCurso=true;
                                                        }
                                                    }

                                                    if(existeCurso==true){
                                                        /*Validacion si existe un curso*/
                                                        boolean objetoExistente=false;
                                                        for (int q = 0; q < getCantidadObjetosAlumnos(); q++) {
                                                            if(asignarPersona.equals(alumnos[q].getNombreAlumno()) && asignarMateria.equals(alumnos[q].getAsignacionMateria()) && asignarCurso.equals(alumnos[q].getAsignacionCurso())){
                                                                objetoExistente=true;
                                                            }
                                                            if(asignarPersona.equals(alumnos[q].getNombreAlumno()) && asignarMateria.equals(alumnos[q].getAsignacionMateria())){
                                                                objetoExistente=true;
                                                            }
                                                        }
                                                        if(objetoExistente==false){
                                                            
                                                            alumnos[getCantidadObjetosAlumnos()]=new Estudiante(asignarMateria, asignarCurso, asignarPersona);
                                                            setCantidadObjetosAlumnos(getCantidadObjetosAlumnos()+1);
                                                        }else{
                                                            System.out.println("Al estudiante ya se le ha asignado este curso y/o esta materia.");
                                                        }

                                                    }else{
                                                        System.out.println("El curso ingresado no se encuentra en el sistema.");
                                                    }

                                                }else{
                                                   System.out.println("No hay cursos para asignar."); 
                                                }
                                            }else{
                                                System.out.println("La materia ingresada no se encuentra en el sistema.");
                                            }

                                        }else{
                                           System.out.println("No hay materias para asignar."); 
                                        }

                                    }else{
                                        System.out.println("La persona ingresada no se encuentra en el sistema.");
                                    }

                                }else{
                                   System.out.println("No hay alumnos para asignar."); 
                                }
                                break;

                            case 2:
                                maestro.actualizarMaestro();
                                setTotalMaestros(maestro.cantidadMaestrosAgregados);
                                if(getTotalMaestros()!=0){
                                    Files archivo22= new Files("Maestro");
                                    System.out.println(" ");
                                    System.out.println("   Docentes encontrados ");
                                    System.out.println(" ");
                                    archivo22.imprimir();
                                    System.out.println(" ");
                                    System.out.println("------------------------");

                                    String respuestaDatosPersona=" ";
                                    String asignarPersona=" ";
                                    boolean existePersona=false;

                                    System.out.print("docente que deseas asignar:");
                                    asignarPersona=lecturaVar.nextLine();
                                    asignarPersona=lecturaVar.nextLine();

                                    for (int i = 0; i < getTotalMaestros(); i++) {

                                        respuestaDatosPersona=maestro.informarMaestro(i);
                                        if(asignarPersona.equals(respuestaDatosPersona)){
                                            existePersona=true;
                                        }
                                    }
                                    

                                    if(existePersona==true){
                                        /*Validacion si existe una materia*/
                                        String asignarMateria=" ";
                                        String respuestaDatosMateria=" ";
                                        boolean existeMateria=false;
                                        setTotalMaterias(materia.getCantidadMateriasCreadas());
                                        if(getTotalMaterias()!=0){
                                            System.out.println(" ");
                                            System.out.println(" Cantidad de materias");
                                            System.out.println(" ");
                                            materia.imprimirMateria();
                                            System.out.println(" ");
                                            System.out.println("----------------");
                                            System.out.print("materia que desea asignar:");
                                            asignarMateria=lecturaVar.nextLine();
                                            for (int o = 0; o < getTotalMaterias(); o++) {
                                                respuestaDatosMateria=materia.informarMateria(o);
                                                if(asignarMateria.equals(respuestaDatosMateria)){
                                                    existeMateria=true;
                                                }
                                            }
                                            
                                            if(existeMateria==true){
                                                /*Validacion si existe un curso*/
                                                String asignarCurso=" ";
                                                String respuestaDatosCurso=" ";
                                                boolean existeCurso=false;
                                                setTotalCursos(curso.getCantidadCursosCreados());
                                                if(getTotalCursos()!=0){
                                                    System.out.println(" ");
                                                    System.out.println("Cantidad de cursos ");
                                                    System.out.println(" ");
                                                    curso.imprimirCurso();
                                                    System.out.println(" ");
                                                    System.out.println("--------------------");
                                                    System.out.print("curso que desea asignar:");
                                                    asignarCurso=lecturaVar.nextLine();
                                                    for (int p = 0; p < getTotalCursos(); p++) {
                                                        respuestaDatosCurso=curso.informarCurso(p);
                                                        if(asignarCurso.equals(respuestaDatosCurso)){
                                                            existeCurso=true;
                                                        }
                                                    }

                                                    if(existeCurso==true){
                                                        /*Validacion si existe un curso*/
                                                        boolean objetoExistente=false;
                                                        for (int q = 0; q < getCantidadObjetosMaestros(); q++) {
                                                            if(asignarPersona.equals(maestros[q].getNombreMaestro()) && asignarMateria.equals(maestros[q].getAsignacionMateria()) && asignarCurso.equals(maestros[q].getAsignacionCurso())){
                                                                objetoExistente=true;
                                                            }
                                                        }
                                                        if(objetoExistente==false){
                                                            maestros[getCantidadObjetosMaestros()]=new Docente(asignarMateria, asignarCurso, asignarPersona);
                                                            setCantidadObjetosMaestros(getCantidadObjetosMaestros()+1);
                                                        }else{
                                                            System.out.println("Al maestro ya se le ha asignado este curso con esta materia");
                                                        }

                                                    }else{
                                                        System.out.println("El curso ingresado no se encuentra ");
                                                    }

                                                }else{
                                                   System.out.println("No hay cursos para asignar"); 
                                                }
                                            }else{
                                                System.out.println("La materia ingresada no se encuentra");
                                            }

                                        }else{
                                           System.out.println("No hay materias para asignar"); 
                                        }

                                    }else{
                                        System.out.println("La persona ingresada no se encuentra ");
                                    }

                                }else{
                                   System.out.println("No hay maestros para asignar"); 
                                }
                               break;

                            case 3:
                                
                               break;

                            default:
                                //opcion no valida del menu.
                                System.out.println("La opcion no es valida");
                                break;
                        }

                        }while(opcionMenu!=3);
                        opcionMenu=0;
                
               break;

            case 3:
               alumno.actualizarAlumno();
                setTotalAlumnos(alumno.cantidadAlumnosAgregados);
                String nombreModificarAlumno=" ";
                String materiaModificarAlumno=" ";
                String cursoModificarAlumno=" ";
                boolean encontrado31=false;
                if(getCantidadObjetosAlumnos()!=0){
                    System.out.println(" ");
                    System.out.println("Cantidad de estudiantes");
                    System.out.println(" ");
                    System.out.println("");
                    for (int i = 0; i < getCantidadObjetosAlumnos(); i++) {
                        if(alumnos[i].getNombreAlumno()!="none"){
                            System.out.println("Nombre: \n"+alumnos[i].getNombreAlumno());
                            System.out.println("Materia: \n"+alumnos[i].getAsignacionMateria());
                            System.out.println("Curso:\n "+alumnos[i].getAsignacionCurso());
                            System.out.println("---------------------");
                        }
                    }
                    System.out.println("----------------------------");
                    System.out.print("Nombre del estudiante que desea modificar:\n");
                    nombreModificarAlumno=lecturaVar.nextLine();
                    nombreModificarAlumno=lecturaVar.nextLine();
                    System.out.print("Materia del estudiante que desea modificar:\n");
                    materiaModificarAlumno=lecturaVar.nextLine();
                    System.out.print("Curso del estudiante que desea modificar:\n");
                    cursoModificarAlumno=lecturaVar.nextLine();
                    
                    for (int u = 0; u < getCantidadObjetosAlumnos(); u++) {
                        if((nombreModificarAlumno.equals(alumnos[u].getNombreAlumno())) && (materiaModificarAlumno.equals(alumnos[u].getAsignacionMateria())) && (cursoModificarAlumno.equals(alumnos[u].getAsignacionCurso()))){
                            
                            System.out.println(" ");
                            System.out.println("Notas del alumno");
                            System.out.println(" ");
                            System.out.println("Nombre: \n"+alumnos[u].getNombreAlumno());
                            System.out.println("Materia: \n"+alumnos[u].getAsignacionMateria());
                            System.out.println("Curso: \n"+alumnos[u].getAsignacionCurso());
                            System.out.println("Numero de Notas: \n"+alumnos[u].getNumeroNotas());
                            alumnos[u].imprimirNotas();
                            alumnos[u].calcularPromedio();
                            System.out.println("Nota Final: \n"+alumnos[u].getPromedioNotas());
                            System.out.println(" ");
                            System.out.println("-------------------------------");
                            System.out.println(" ");
                            
                            do{//repeticion del menu de opciones
                                System.out.println(" ");
                                System.out.println("Realizar modificacion");        
                                System.out.println("1.Modificar Cantidad de Notas");
                                System.out.println("2.Modificar Notas");
                                System.out.println("3.Regresar");
                                System.out.println(" ");
                                System.out.println("-------------------------------");                           
                                System.out.println(" "); 
                                System.out.print("R:/ ");
                                opcionMenu = lecturaVar.nextByte();//escaneo del dato del menu del usuario
                                switch(opcionMenu){

                                    case 1:
                                        int cantidadModificarNotas=0;
                                        System.out.print("Cantidad de notas a sacar por estudiante: \n");
                                        cantidadModificarNotas=lecturaVar.nextInt();
                                        if(cantidadModificarNotas > alumnos[u].getNumeroNotas()){
                                            alumnos[u].asignarNumeroNotas(cantidadModificarNotas);
                                        }else{
                                            System.out.println("notas entre 1,0 a 5,0\n");
                                        }

                                        break;

                                    case 2:
                                        int numeroNotaModificar=0;
                                        float nuevaCalificacion=0.0f;
                                        System.out.print("Numero de la nota que desea modificar: \n");
                                        numeroNotaModificar=lecturaVar.nextInt();
                                        if(numeroNotaModificar<=alumnos[u].getNumeroNotas()&&numeroNotaModificar>0){
                                            System.out.print("Calificacion nueva: \n");
                                            nuevaCalificacion=lecturaVar.nextFloat();
                                            if((nuevaCalificacion<=(float)(5.0)) && (nuevaCalificacion>=0)){
                                                alumnos[u].notas[(numeroNotaModificar-1)]=nuevaCalificacion;
                                            }else{
                                                System.out.println("Calificacion no valida.");
                                            }
                                        }
                                       break;

                                    case 3:
                                        
                                       break;
                                       
                                    default:
                                        //opcion no valida del menu.
                                        System.out.println("La opcion no es valida.");
                                        break;
                                }

                                }while(opcionMenu!=3);
                                opcionMenu=0;
                            
                            //
                            u=getCantidadObjetosAlumnos();
                            encontrado31=true;
                        }
                    }
                    if(encontrado31==false){
                        System.out.println("El estudiante no se encuentra ");
                    }
                }else{
                    System.out.println(" ");
                    System.out.println("No hay estudiantes, por favor primero ingresa estudiantes");
                }
        
               break;


            case 4:
                alumno.actualizarAlumno();
                setTotalAlumnos(alumno.cantidadAlumnosAgregados);
                String materiaListar=" ";
                String respuestaListarMaterias=" ";
                boolean materiaListaExiste=false;
                setTotalMaterias(materia.getCantidadMateriasCreadas());
                if(getTotalMaterias()!=0){
                    System.out.println(" ");
                    System.out.println("Cantidad de materias");
                    System.out.println(" ");
                    materia.imprimirMateria();
                    System.out.println(" ");
                    System.out.println("-------------------------");
                    System.out.print("Materia que desea listar:");
                    materiaListar=lecturaVar.nextLine();
                    materiaListar=lecturaVar.nextLine();
                    for (int p = 0; p < getTotalMaterias(); p++) {
                        respuestaListarMaterias=materia.informarMateria(p);
                        if(materiaListar.equals(respuestaListarMaterias)){
                            materiaListaExiste=true;
                        }
                    }
                    
                    if(materiaListaExiste==true){
                        System.out.println(" ");
                        System.out.println("Cantidad de estudiantes");
                        System.out.println(" ");
                        System.out.println("------------------------");
                        for (int i = 0; i < getCantidadObjetosAlumnos(); i++) {
                            if(!alumnos[i].equals(null)){
                                if(materiaListar.equals(alumnos[i].getAsignacionMateria())){
                                    System.out.println("Nombre: \n"+alumnos[i].getNombreAlumno());
                                    System.out.println("Curso: \n"+alumnos[i].getAsignacionCurso());
                                    alumnos[i].imprimirNotas();
                                    alumnos[i].calcularPromedio();
                                    System.out.println("Nota Final: \n"+alumnos[i].getPromedioNotas());
                                }
                                
                            }
                            System.out.println("----------------------");
                            System.out.println(" ");
                        }
                        System.out.println(" ");
                        System.out.println("------------------------");
                    }else{
                        System.out.println("La materia ingresada no se encuentra");
                    }
                }else{
                    System.out.println("No hay materias");
                }
               break;

            case 5:
                alumno.actualizarAlumno();
                maestro.actualizarMaestro();
                setTotalAlumnos(alumno.cantidadAlumnosAgregados);
                setTotalMaestros(maestro.cantidadMaestrosAgregados);
                nota1=alumnos[0].getPromedioNotas();
                nombre1=alumnos[0].getNombreAlumno();
                nota2=alumnos[1].getPromedioNotas();
                nombre2=alumnos[1].getNombreAlumno();
                nota3=alumnos[2].getPromedioNotas();
                nombre3=alumnos[2].getNombreAlumno();
                nota4=alumnos[3].getPromedioNotas();
                nombre4=alumnos[3].getNombreAlumno();
                nota5=alumnos[4].getPromedioNotas();
                nombre5=alumnos[4].getNombreAlumno();
                
                for(int i=5;i<getCantidadObjetosAlumnos();i++){
                    if(alumnos[i].getPromedioNotas()>nota1){
                        nota1=alumnos[i].getPromedioNotas();
                        nombre1=alumnos[i].getNombreAlumno();
                    }else{
                        if(alumnos[i].getPromedioNotas()>nota2){
                            nota2=alumnos[i].getPromedioNotas();
                            nombre2=alumnos[i].getNombreAlumno();
                        }else{
                            if(alumnos[i].getPromedioNotas()>nota3){
                                nota3=alumnos[i].getPromedioNotas();
                                nombre3=alumnos[i].getNombreAlumno();
                            }else{
                               if(alumnos[i].getPromedioNotas()>nota4){
                                    nota4=alumnos[i].getPromedioNotas();
                                    nombre4=alumnos[i].getNombreAlumno();
                                }else{
                                   if(alumnos[i].getPromedioNotas()>nota5){
                                        nota5=alumnos[i].getPromedioNotas();
                                        nombre5=alumnos[i].getNombreAlumno();
                                    }
                                }
                            }

                        }
                    }
                }
                System.out.println(" ");
                System.out.println("Cantidad de promedios");
                System.out.println(" ");
                System.out.println("Nota 1: "+nota1);
                System.out.println("Nombre: "+nombre1);
                System.out.println(" ");
                System.out.println("Nota 2: "+nota2);
                System.out.println("Nombre: "+nombre2);
                System.out.println(" ");
                System.out.println("Nota 3: "+nota3);
                System.out.println("Nombre: "+nombre3);
                System.out.println(" ");
                System.out.println("Nota 4: "+nota4);
                System.out.println("Nombre: "+nombre4);
                System.out.println(" ");
                System.out.println("Nota 5: "+nota5);
                System.out.println("Nombre: "+nombre5);
                System.out.println(" ");
                System.out.println("-----------------------");
                System.out.println(" ");
                break;
            case 6:
                maestro.actualizarMaestro();
                setTotalMaestros(maestro.cantidadMaestrosAgregados);
                    
                    System.out.println(" ");
                    System.out.println("Lista de maestros");
                    System.out.println(" ");
                    System.out.println("-------------------------");
                    for (int i = 0; i < getTotalMaestros(); i++) {
                       
                        System.out.println("Nombre: " + maestro.informarMaestro(i));
                        for (int j = 0; j < getCantidadObjetosMaestros(); j++) {
                            if(maestro.informarMaestro(i).equals(maestros[j].getNombreMaestro())){
                                System.out.println("Materia: "+maestros[j].getAsignacionMateria()+" - Curso: "+maestros[j].getAsignacionCurso());
                            }
                        }
                        System.out.println("-----------------------");
                    }
                    
                    System.out.println(" ");
                    System.out.println("-----------------------");
                break;
            default:
                //opcion no valida del menu.
                System.out.println("La opcion no es valida.");
                break;
        }

        }while(opcionMenu!=7);
    }

    /**
     * @return the totalMaestros
     */
    public int getTotalMaestros() {
        return totalMaestros;
    }

    /**
     * @param totalMaestros the totalMaestros to set
     */
    public void setTotalMaestros(int totalMaestros) {
        this.totalMaestros = totalMaestros;
    }

    /**
     * @return the totalAlumnos
     */
    public int getTotalAlumnos() {
        return totalAlumnos;
    }

    /**
     * @param totalAlumnos the totalAlumnos to set
     */
    public void setTotalAlumnos(int totalAlumnos) {
        this.totalAlumnos = totalAlumnos;
    }

    /**
     * @return the cantidadObjetosMaestros
     */
    public int getCantidadObjetosMaestros() {
        return cantidadObjetosMaestros;
    }

    /**
     * @param cantidadObjetosMaestros the cantidadObjetosMaestros to set
     */
    public void setCantidadObjetosMaestros(int cantidadObjetosMaestros) {
        this.cantidadObjetosMaestros = cantidadObjetosMaestros;
    }

    /**
     * @return the cantidadObjetosAlumnos
     */
    public int getCantidadObjetosAlumnos() {
        return cantidadObjetosAlumnos;
    }

    /**
     * @param cantidadObjetosAlumnos the cantidadObjetosAlumnos to set
     */
    public void setCantidadObjetosAlumnos(int cantidadObjetosAlumnos) {
        this.cantidadObjetosAlumnos = cantidadObjetosAlumnos;
    }

    /**
     * @return the totalMaterias
     */
    public int getTotalMaterias() {
        return totalMaterias;
    }

    /**
     * @param totalMaterias the totalMaterias to set
     */
    public void setTotalMaterias(int totalMaterias) {
        this.totalMaterias = totalMaterias;
    }

    /**
     * @return the totalCursos
     */
    public int getTotalCursos() {
        return totalCursos;
    }

    /**
     * @param totalCursos the totalCursos to set
     */
    public void setTotalCursos(int totalCursos) {
        this.totalCursos = totalCursos;
    }
}
