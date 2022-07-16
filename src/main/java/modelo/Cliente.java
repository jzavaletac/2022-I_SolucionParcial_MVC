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
public class Cliente extends  Persona{
    private float dinero;
    private int puntos;

    public Cliente(float dinero, String dni, String nombre) {
        super(dni, nombre);
        this.dinero = dinero;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return dni+"\t"+ nombre +"\t"+ dinero +"\t"+puntos + '\n';
    }

    @Override
    public void validar() {
        
    }
    
    
    
}
