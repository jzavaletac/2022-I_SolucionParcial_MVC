/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.*;
import vista.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author OCA-UIE
 */
public class ControladorIngreso {
    private frmIngreso vista;
    private UsuarioArreglo modelo;
    
    
    public ControladorIngreso(UsuarioArreglo modelo, frmIngreso vista) {
        this.vista = vista;
        this.modelo=modelo;
        
        this.vista.btnIngresar.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    Usuario u = modelo.ingresar( vista.txtUsuario.getText(),
                            vista.txtClave.getText());
                    if(u != null){
                        System.out.println( "Ok: "+u);
                    }else{
                        vista.txtClave.setText("");
                        JOptionPane.showMessageDialog(vista, "Intente nuevamente");
                    }
                }
            }
        );
        
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.txtUsuario.setText("");
        this.vista.txtClave.setText("");
        this.vista.setVisible(true);
    }
    
}
