package Principal;
/**
 *
 * @author daiyd
 */
public class Estudiante extends InteColegio{
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
}
