/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import modelo.*;
import vista.*;
import java.awt.event.*;
/**
 *
 * @author OCA-UIE
 */
public class ControladorPrincipal {
    private frmPrincipal vista;
    private PersonaArreglo modelo;
    
    
    public ControladorPrincipal(PersonaArreglo modelo, frmPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnSalir.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            }
        );
        
        this.vista.btnVuelos.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    
                    ControladorVuelo controlador = new ControladorVuelo( new VueloArreglo(), new frmVuelo() );
                    controlador.iniciar();
                    vista.dispose();
                }
            }
        );

    } 
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }

    
}
