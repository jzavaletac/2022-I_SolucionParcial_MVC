/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author OCA-UIE
 */
public class Vuelo {
    private int numero;
    private int horaSalida;
    private int horaLlegada;
    private Date fecha;
    private String destino;
    private float precio;
    
    private Asiento[] asientos;
    private int numAsientos;
    private int indiceAsiento;

    public Vuelo(int numero, int horaSalida, int horaLlegada, 
                Date fecha, String destino, int numAsientos, float precio) {
        this.numero = numero;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.fecha = fecha;
        this.destino = destino;
        this.numAsientos = numAsientos;
        this.precio = precio;
        generarAsientos( numAsientos, precio );
        
    }

    private void generarAsientos(int numAsientos, float precio) {
        this.asientos = new Asiento[numAsientos];
        for(int i=0; i< numAsientos; i++){
            this.asientos[i]= new Asiento(i+1, precio);
        }
    }
    
    public Asiento[] asientoslibre(){
        Asiento[] resultado = new Asiento[getCantidadAsientosLibre()];
        int indice = 0;
        for(int i=0; i< numAsientos; i++){
            if(this.asientos[i].getVenta() == null){
                resultado[indice] = this.asientos[i];
                indice++;
            }
        }
        return resultado;
    }

    private int getCantidadAsientosLibre() {
        int resultado =0;
        for(int i=0; i< numAsientos; i++){
            if(this.asientos[i].getVenta() == null){
                resultado++;
            }
        }
        return resultado;
    }
    
    
    
}
