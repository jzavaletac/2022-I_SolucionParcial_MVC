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
public class PersonaArreglo {
    
    private Persona[] personas;
    private int indice;

    public PersonaArreglo(int tamano) {
        this.personas = new Persona[tamano];
        this.indice = 0;
    }
    
    public void agregar(Persona persona){
        this.personas[this.indice] = persona;
        this.indice++; 
    }

    @Override
    public String toString() {
        String resultado = "";
        for(int i=0 ; i < this.indice; i++){
            resultado = resultado + this.personas[i];
        }
        return resultado;
    }
    
   public String getClientes(){
        String resultado = "";
        for(int i=0 ; i < this.indice; i++){
            if(this.personas[i] instanceof Cliente){
                resultado = resultado + this.personas[i];
            }
        }
        return resultado;
   } 
   
   public String getEmpleados(){
        String resultado = "";
        for(int i=0 ; i < this.indice; i++){
            if(this.personas[i] instanceof Empleado){
                resultado = resultado + this.personas[i];
            }
        }
        return resultado;
   } 
}
