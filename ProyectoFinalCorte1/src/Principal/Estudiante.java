package Principal;
import java.io.*;
/**
 * Permitira generar objetos estudiantes como clase hija de InteColegio
 * @author Camilo D'isidoro
 */
public class Estudiante extends InteColegio implements Serializable{
    private int nota;
    private int notas[];
    /**
     * Constructor del Estudiante
     * @param nombre
     * @param apellido
     * @param materia
     * @param codigo
     * @param numNotas
     * @param nota 
     */
    public Estudiante(String nombre, String apellido, String materia, long codigo, int numNotas, int nota){
        super(nombre, apellido, materia, codigo, numNotas);
        this.nota = nota;
    }
    /**
     * Asignación de materia
     */
    public void asigMateria(){
        
    }
    /**
     * Asignación de promedio
     */
    public void promedio(){
        
    }
    /**
     * Establece la cantidad de notas que tendra el estudiante
     * @param nota 
     */
    public void setNota(int nota){
        this.nota = nota;
    }
    /**
     * Obtiene la cantidad de notas que tendra el estudiante
     * @return 
     */
    public int getNota(){
        return this.nota;
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
     * @throws ClassNotFoundException 
     */
private void writeObject(java.io.ObjectOutputStream stream)
     throws IOException
{
   // Aquí escribimos en stream los bytes que queramos que se envien por red.
}
}