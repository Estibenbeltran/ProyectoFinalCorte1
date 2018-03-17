package Principal;
import java.util.Scanner;
/**
 * Permitira generar objetos estudiantes como clase hija de InteColegio
 * @author Camilo D'isidoro
 */
 class Estudiante extends InteColegio{
    
    private String nombreAlumno = " ";
    private int numeroNotas=1;
    private float promedioNotas=0.0f;
    public float notas[] = new float[1000];
    static int cantidadAlumnosAgregados=0;
    private static String alumnos[]=new String[50];
   
    Estudiante(){
        
    }
    /**
     * 
     * @param _asignacionMateria
     * @param _asignacionCurso
     * @param _nombreAlumno 
     */
    Estudiante(String _asignacionMateria, String _asignacionCurso,String _nombreAlumno){
        super(_asignacionMateria, _asignacionCurso);
        this.nombreAlumno=_nombreAlumno;
    }
    public void asignarNumeroNotas(int _numeroNotas){
        
        setNumeroNotas(_numeroNotas);
    }
    
    public void imprimirNotas(){
        
        for(int i=0;i<getNumeroNotas();i++){
            System.out.println("Nota "+(1+i)+": "+getNotas()[i]);
        }
        
    }
    public void calcularPromedio(){
        float _promedioNotas=0.0f;
        for (int i = 0; i < 10; i++) {
            _promedioNotas=_promedioNotas+getNotas()[i];
        }
        
        _promedioNotas=_promedioNotas/getNumeroNotas();
        setPromedioNotas(_promedioNotas);
    }
    //
    public String informarAlumno(int contadorAct){
         String respuesta="";
         
         respuesta = alumnos[contadorAct];

         return respuesta;
     }
    //
    public void actualizarAlumno(){
        Files alumnos1=new Files(getNombreAlumno(),"Alumno");
        for(int i=0;i<alumnos.length;i++){
            alumnos[i]=new String();
        }
        int contadorAct=0;
        cantidadAlumnosAgregados=0;
        for(int i=0;i<alumnos.length;i++){
            if(alumnos1.actualizar(i)!="Ninguno"){
                alumnos[contadorAct]=alumnos1.actualizar(i);
                contadorAct++;
                cantidadAlumnosAgregados++;
            }
        }
    }
    public void agregarAlumno(){
        for(int i=cantidadAlumnosAgregados;i<alumnos.length;i++){
            alumnos[i]=new String();
        }
        
        //llenar maestros
        Scanner lecturaVar = new Scanner(System.in);
        System.out.print("Digite estudiante que desea agregar: ");
        String alumnoP1;
        int bandera=0;
        alumnoP1 = lecturaVar.nextLine();
       
        
        
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i].equals(alumnoP1)){
                System.out.println("El estudiante ya se encuentra registrado.");
                bandera=1;
            }
        }
       
        if(bandera==0){
        alumnos[getCantidadCursosCreados()] = (alumnoP1);
        cantidadAlumnosAgregados++;
        
        Files alumnos2=new Files(alumnoP1,"Alumno");
        alumnos2.escribir();
        System.out.println("El estudiante ha sido agregado");
        }
        bandera=0;
    }
    
    public String eliminarAlumno(){
        for(int i=cantidadAlumnosAgregados;i<alumnos.length;i++){
            alumnos[i]=new String();
        }
        Scanner lecturaVar = new Scanner(System.in);
        System.out.println("Estudiante que desea eliminar: ");
        String alumnoP2;
        int bandera=1;
        alumnoP2 = lecturaVar.nextLine();
       
        
        
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i].equals(alumnoP2)){
                System.out.println("El estudiante ha sido eliminado.");
                bandera=0;
            }
        }
       
        if(bandera==0){
        Files alumnos3=new Files(alumnoP2,"Alumno");
            alumnos3.eliminar();
            actualizarAlumno();
        }else{
            System.out.println("El estudiante no se encuentra");
        }
        bandera=1;
        return alumnoP2;
    }

    /**
     * @return the nombreAlumno
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * @param nombreAlumno the nombreAlumno to set
     */
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    /**
     * @return the numeroNotas
     */
    public int getNumeroNotas() {
        return numeroNotas;
    }

    /**
     * @param numeroNotas the numeroNotas to set
     */
    public void setNumeroNotas(int numeroNotas) {
        this.numeroNotas = numeroNotas;
    }

    /**
     * @return the promedioNotas
     */
    public float getPromedioNotas() {
        return promedioNotas;
    }

    /**
     * @param promedioNotas the promedioNotas to set
     */
    public void setPromedioNotas(float promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    /**
     * @return the notas
     */
    public float[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    /**
     * @return the notas
     */
   

    
}
