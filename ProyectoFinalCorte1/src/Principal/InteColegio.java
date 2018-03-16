package Principal;
import java.io.*;
/**
 * Permitira inicializar las personas Integrantes del Colegio como la clase padre
 * @author Camilo D'isidoro
 */
public class InteColegio implements Serializable{
    private String nombre, apellido, materia;
    private long codigo;
    private int numNotas;
    /**
     * Este constructor permitirá tener l nombre, apellido, materia, codigo y numero de notas
     * tanto de los estudiantes como de los docentes
     */
    /**
     * Constructor de la persona
     * @param nombre
     * @param apellido
     * @param materia
     * @param codigo
     * @param numNotas 
     */
    public InteColegio(String nombre, String apellido, String materia, long codigo, int numNotas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.codigo = codigo;
        this.numNotas = numNotas;
    }
    /**
     * Se modifica el nombre de la persona
     * @param nombre 
     */
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    /**
     * Se modifica el apellido de la persona
     * @param apellido 
     */
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    /**
     * Se modifica el nombre de la materia asignada a la persona
     * @param materia 
     */
    public void setMateria (String materia){
        this.materia = materia;
    }
    /**
     * Se modifica el codigo de la persona
     * @param codigo 
     */
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    /**
     * Se modifican las notas dependiendo de la persona (Docente las notas a sacar / Estudiante las notas obtenidas)
     * @param notas 
     */
    public void setNotas(int notas){
        this.numNotas = notas;
    }
    /**
     * Obtiene el nombre de la persona
     * @return 
     */
    public String getNombre (){
        return this.nombre;
    }
    /**
     * Obtiene el apellido de la persona
     * @return 
     */
    public String getApellido(){
         return this.apellido;
    }
    /**
     * Obtiene la materia asignada
     * @return 
     */
    public String getMateria (){
        return this.materia;
    }
    /**
     * Obtiene el codigo de la persona
     * @return 
     */
    public long getCodigo(){
        return this.codigo;
    }
    /**
     * Obtiene las notas obtenidas
     * @return 
     */
    public int getNotas(){
        return this.numNotas;
    }
    /**
     * Lee el objeto para la Serialización
     * @param stream
     * @throws IOException
     * @throws ClassNotFoundException 
     */
private void readObject(java.io.ObjectInputStream stream)
     throws IOException, ClassNotFoundException
{
   // Aqui debemos leer los bytes de stream y reconstruir el objeto
}
/**
 * Escribe el objeto para la Serialización
 * @param stream
 * @throws IOException 
 */
private void writeObject(java.io.ObjectOutputStream stream)
     throws IOException
{
   // Aquí escribimos en stream los bytes que queramos que se envien por red.
}
}