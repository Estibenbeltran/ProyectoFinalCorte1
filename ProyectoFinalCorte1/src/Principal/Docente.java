package Principal;
import java.io.*;
/**
 * Permitira guardar los datos del docente como clase hija de InteColegio
 * @author Camilo D'isidoro
 */
public class Docente extends InteColegio implements Serializable{
    private int dirCur;
    /**
     * Constructor del docente
     * @param nombre
     * @param apellido
     * @param materia
     * @param codigo
     * @param numNotas
     * @param dirCur 
     */
    public Docente(String nombre, String apellido, String materia, long codigo, int numNotas, int dirCur){
        super(nombre, apellido, materia, codigo, numNotas);
        this.dirCur = dirCur;
    }
    /**
     * Define de cual curso se encargará
     * @param dir 
     */
    public void setDirec(int dir){
        this.dirCur = dir;
    }
    /**
     * Obtiene el curso del cual está encargado
     * @return 
     */
    public int getDirec(){
        return this.dirCur;
    }
    /**
     * Permite calificar a los estudiantes encargados
     */
    public void calificar(){
        
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