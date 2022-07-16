/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author OCA-UIE
 */
public class Empleado extends Persona{
    private float sueldo;
    private int codigo;

    public Empleado(float sueldo, int codigo, String dni, String nombre) {
        super(dni, nombre);
        this.sueldo = sueldo;
        this.codigo = codigo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return dni+"\t"+ nombre +"\t"+ sueldo +"\t"+codigo + '\n';
    }

    @Override
    public void validar() {

    }
    
    
}
