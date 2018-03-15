package Principal;
/**
 *
 * @author daiyd
 */

public class InteColegio {
    private String nombre, apellido, materia;
    private long codigo;
    private int numNotas;
    /**
     * Este constructor permitirá tener l nombre, apellido, materia, codigo y numero de notas
     * tanto de los estudiantes como de los docentes
     */
    /**
     * 
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
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setMateria (String materia){
        this.materia = materia;
    }
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    public void setNotas(int notas){
        this.numNotas = notas;
    }
    public String getNombre (){
        return this.nombre;
    }
    public String getApellido(){
         return this.apellido;
    }
    public String getMateria (){
        return this.materia;
    }
    public long getCodigo(){
        return this.codigo;
    }
    public int getNotas(){
        return this.numNotas;
    }
}