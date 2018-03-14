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
     * 
     * @param nombre
     * @param apellido
     * @param materia
     * @param codigo
     * @param numNotas 
     */
    /**
     * Este constructor permitirá tener l nombre, apellido, materia, codigo y numero de notas
     * tanto de los estudiantes como de los docentes
     */
    
    public InteColegio(String nombre, String apellido, String materia, long codigo, int numNotas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.codigo = codigo;
        this.numNotas = numNotas;
        
    }

    
}
