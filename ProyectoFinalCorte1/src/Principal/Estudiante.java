package Principal;

import java.io.*;

/**
 *
 * @author daiyd
 */
public class Estudiante extends InteColegio implements Serializable{
    private int nota;
    private int notas[];
    public Estudiante(String nombre, String apellido, String materia, long codigo, int numNotas, int nota){
        super(nombre, apellido, materia, codigo, numNotas);
        this.nota = nota;
    }
    public void asigMateria(){
        
    }
    public void promedio(){
        
    }
    public void setNota(int nota){
        this.nota = nota;
    }
    public int getNota(){
        return this.nota;
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
