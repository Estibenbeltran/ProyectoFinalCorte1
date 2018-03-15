/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
}
