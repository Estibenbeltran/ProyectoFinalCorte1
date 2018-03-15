package Principal;
/**
 *
 * @author daiyd
 */
public class Docente extends InteColegio{
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
}
