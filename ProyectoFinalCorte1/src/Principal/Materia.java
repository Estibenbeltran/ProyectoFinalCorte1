package Principal;
import java.util.Scanner;
/**
 *Permitira gestionar la creacion de materias
 * @author daiyd
 */
public class Materia{
    
    static int cantidadMateriasCreadas=0;
    static String materias[]= new String[50];
    
    private String asignacionMateria= "Ninguno";
    
    public Materia(){
        
    }
    public Materia(String _asignacionMateria){
        for(int i=0;i<materias.length;i++){
            if(materias[i].equals(_asignacionMateria)){
             this.asignacionMateria=_asignacionMateria;
            }
        }
    }
    public String informarMateria(int contadorAct){
         String respuesta="";
         
         respuesta = materias[contadorAct];

         return respuesta;
     }
    public void imprimirMateria(){
        for (int i = 0; i < 10; i++) {
            if(materias[i]!=null && !materias[i].equals("")){
                System.out.println("Materia: "+materias[i]);
            }
        }
    }
    public void agregarMateria(){
        for(int i=getCantidadMateriasCreadas();i<materias.length;i++){
            materias[i]=new String();
        }
        
        Scanner lecturaVar = new Scanner(System.in);
        System.out.print("Digite la Materia que desea agregar: ");
        String materiaP;
        int bandera=0;
        materiaP = lecturaVar.nextLine();
        
        
        for(int i=0;i<materias.length;i++){
            if(materias[i].equals(materiaP)){
                System.out.println("La materia ya se encuentra registrada.");
                bandera=1;
            }
        }
       
        if(bandera==0){
        materias[getCantidadMateriasCreadas()] = materiaP;
            setCantidadMateriasCreadas(getCantidadMateriasCreadas() + 1);
        }
        bandera=0;
       
    }

    /**
     * @return the asignacionMateria
     */
    public String getAsignacionMateria() {
        return this.asignacionMateria;
    }

    /**
     * @param asignacionMateria the asignacionMateria to set
     */
    public void setAsignacionMateria(String asignacionMateria) {
        this.asignacionMateria = asignacionMateria;
    }
    
    @Override 
    public String toString(){ 
        return "Materia: "+this.asignacionMateria;
    }; 

    /**
     * @return the cantidadMateriasCreadas
     */
    public int getCantidadMateriasCreadas() {
        return cantidadMateriasCreadas;
    }

    /**
     * @param aCantidadMateriasCreadas the cantidadMateriasCreadas to set
     */
    public void setCantidadMateriasCreadas(int aCantidadMateriasCreadas) {
        cantidadMateriasCreadas = aCantidadMateriasCreadas;
    }
    
}
