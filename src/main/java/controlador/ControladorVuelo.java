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
public class ControladorVuelo {
    private frmVuelo vista;
    private VueloArreglo modelo;
    
    public ControladorVuelo(VueloArreglo modelo, frmVuelo vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
}
