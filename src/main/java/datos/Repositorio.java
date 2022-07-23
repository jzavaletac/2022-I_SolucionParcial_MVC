/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Usuario;
import modelo.UsuarioArreglo;

/**
 *
 * @author OCA-UIE
 */
public class Repositorio {
    public static UsuarioArreglo usuarios = new UsuarioArreglo(5);
    public static Usuario usuario_validado;
    
}
