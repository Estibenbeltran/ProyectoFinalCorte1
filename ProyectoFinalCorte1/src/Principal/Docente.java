package Principal;

import java.io.*;
/**
 *
 * @author daiyd
 */
public class Docente extends InteColegio implements Serializable{
    private int dirCur;
    public Docente(String nombre, String apellido, String materia, long codigo, int numNotas, int dirCur){
        super(nombre, apellido, materia, codigo, numNotas);
        this.dirCur = dirCur;
    }
    public void setDirec(int dir){
        this.dirCur = dir;
    }
    public int getDirec(){
        return this.dirCur;
    }
    public void calificar(){
        
    }
private void readObject(java.io.ObjectInputStream stream)
     throws IOException, ClassNotFoundException
{
   // Aqui debemos leer los bytes de stream y reconstruir el objeto
}

private void writeObject(java.io.ObjectOutputStream stream)
     throws IOException
{
   // Aquí escribimos en stream los bytes que queramos que se envien por red.
}
}
