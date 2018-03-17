package Principal;
import java.util.Scanner;
/**
 * Permitira inicializar las personas Integrantes del Colegio como la clase padre
 * @author Camilo D'isidoro
 */
public class InteColegio extends Materia{
    private static int cantidadCursosCreados=0;
    public static String cursos[]=new String[50];
    private String asignacionCurso="Ninguno";
    public InteColegio(String _asignacionMateria,String _asignacionCurso) {
        super(_asignacionMateria);
        for(int i=0;i<cursos.length;i++){
            if(cursos[i].equals(_asignacionCurso)){
             this.asignacionCurso=_asignacionCurso;
            }
        }
        
    }
    InteColegio(){
        
    }
    
    public String informarCurso(int contadorAct){
         String respuesta="";
         
         respuesta = cursos[contadorAct];

         return respuesta;
     }
     public void imprimirCurso(){
        for (int i = 0; i < 10; i++) {
            if(cursos[i]!=null && !cursos[i].equals("")){
                System.out.println("Curso: "+cursos[i]);
            }
        }
    }
    public void agregarCurso(){
        for(int i=getCantidadCursosCreados();i<cursos.length;i++){
            cursos[i]=new String();
        }
        Scanner lecturaVar = new Scanner(System.in);
        System.out.print("Digite el curso que desea agregar: ");
        String cursoP;
        int bandera=0;
        cursoP = lecturaVar.nextLine();
        
        
        for(int i=0;i<cursos.length;i++){
            if(cursos[i].equals(cursoP)){
                System.out.println("El curso ya se encuentra registrado.");
                bandera=1;
            }
        }
       
        if(bandera==0){
        cursos[getCantidadCursosCreados()] = cursoP;
            setCantidadCursosCreados(getCantidadCursosCreados() + 1);
        }
        bandera=0;
       
    }
    /**
     * @return the asignacionCurso
     */
    public String getAsignacionCurso() {
        return asignacionCurso;
    }

    /**
     * @param asignacionCurso the asignacionCurso to set
     */
    public void setAsignacionCurso(String asignacionCurso) {
        this.asignacionCurso = asignacionCurso;
    }

    /**
     * @return the cantidadCursosCreados
     */
    public int getCantidadCursosCreados() {
        return cantidadCursosCreados;
    }

    /**
     * @param aCantidadCursosCreados the cantidadCursosCreados to set
     */
    public void setCantidadCursosCreados(int aCantidadCursosCreados) {
        cantidadCursosCreados = aCantidadCursosCreados;
    }
    
}
