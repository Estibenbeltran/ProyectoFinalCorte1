package Principal;
import java.util.Scanner;
/**
 * Permitira guardar los datos del docente como clase hija de InteColegio
 * @author Camilo D'isidoro
 */
public class Docente extends InteColegio{
    
  
    private String nombreMaestro = " ";
    static int cantidadMaestrosAgregados=0;
    private static String maestros[]=new String[50];
    
    Docente(){
        
    }
    public Docente(String _asignacionMateria, String _asignacionCurso,String _nombreMaestro) {
        super(_asignacionMateria, _asignacionCurso);
        this.nombreMaestro=_nombreMaestro;
    }
    public String informarMaestro(int contadorAct){
        String respuesta="";
        if(contadorAct>cantidadMaestrosAgregados){
            respuesta="none";
        }else{
            respuesta=maestros[contadorAct];
        }
        
        return respuesta;
    }
    public void actualizarMaestro(){
        int contadorAct=0;
        Files maestros1=new Files(getNombreMaestro(),"Maestro");
        for(int i=0;i<maestros.length;i++){
            maestros[i]=new String();
        }
        cantidadMaestrosAgregados=0;
        for(int i=0;i<maestros.length;i++){
            if(maestros1.actualizar(i)!="Ninguno"){
                maestros[contadorAct]=maestros1.actualizar(i);
                contadorAct++;
                cantidadMaestrosAgregados++;
            }
        }
    }
    public void agregarMaestro(){
        for(int i=cantidadMaestrosAgregados;i<maestros.length;i++){
            maestros[i]=new String();
        }
        //llenar maestros
        Scanner lecturaVar = new Scanner(System.in);
        System.out.print("Digite el maestro que desea agregar: ");
        String maestroP1;
        int bandera=0;
        maestroP1 = lecturaVar.nextLine();
       
        
        
        for(int i=0;i<maestros.length;i++){
            if(maestros[i].equals(maestroP1)){
                System.out.println("El maestro ya se encuentra registrado.");
                bandera=1;
            }
        }
       
        if(bandera==0){
        maestros[getCantidadCursosCreados()] = (maestroP1);
        cantidadMaestrosAgregados++;
        
        Files maestros2=new Files(maestroP1,"Maestro");
        maestros2.escribir();
        System.out.println("El maestro ha sido agregado");
        }
        bandera=0;
    }
    public String eliminarMaestro(){
        for(int i=cantidadMaestrosAgregados;i<maestros.length;i++){
            maestros[i]=new String();
        }
        Scanner lecturaVar = new Scanner(System.in);
        System.out.println("Digite maestro que desea eliminar: ");
        String maestroP2;
        int bandera=1;
        maestroP2 = lecturaVar.nextLine();
       
        
        
        for(int i=0;i<maestros.length;i++){
            if(maestros[i].equals(maestroP2)){
                System.out.println("El maestro se ha eliminado.");
                bandera=0;
            }
        }
       
        if(bandera==0){
        Files alumnos3=new Files(maestroP2,"Maestro");
            alumnos3.eliminar();
            actualizarMaestro();
        }else{
            System.out.println("El maestro no se encuentra");
        }
        bandera=1;
        return maestroP2;
    }
    
    
    /*@Override 
    public String toString(){ 
        return "Nombre: "+this.getNombreMaestro();
    }; */

    /**
     * @return the NombreMaestro
     */
    public String getNombreMaestro() {
        return nombreMaestro;
    }

    /**
     * @param NombreMaestro the NombreMaestro to set
     */
    public void setNombreMaestro(String NombreMaestro) {
        this.nombreMaestro = NombreMaestro;
    }

    

    
   
}

