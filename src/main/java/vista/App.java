/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;
import controlador.ControladorPrincipal;

/**
 *
 * @author OCA-UIE
 */
public class App {
    public static void main(String args[]){
        System.out.println("Inicio del programa");
        //Persona p = new Persona("0102030405", "Jorge Zavaleta");
        
        PersonaArreglo personas = new PersonaArreglo(20);
        //personas.agregar(p);
        personas.agregar(new Cliente(500, "40414243","Juan Perez"));
        personas.agregar(new Empleado(2500,1, "70714243","Carlos Rojas"));
        personas.agregar(new Empleado(2000,2, "80814243","Jhon Rios"));
        personas.agregar(new Cliente(300, "30313233","Maria Diaz"));
        System.out.println(personas);
        System.out.println("Clientes");
        System.out.println(personas.getClientes());
        
        System.out.println("Empleados");
        System.out.println(personas.getEmpleados());
        
        ControladorPrincipal controlador = new ControladorPrincipal( personas, new frmPrincipal() );
        controlador.iniciar();
    }
}
