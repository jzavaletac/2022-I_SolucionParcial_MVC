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
public class UsuarioArreglo {
    private Usuario[] usuarios;
    private int indice;

    public UsuarioArreglo(int tamano) {
        this.usuarios = new Usuario[tamano];
        this.indice = 0;
    }
    
    public boolean agregar(Usuario usuario){
        boolean result = false;
        if(!lleno()){
            this.usuarios[indice] = usuario;
            indice++;
            result = true;
        }else{
            crecer();
        }
        
        return result;
    }

    private boolean lleno() {
        if(this.indice == this.usuarios.length) 
            return true;
        else 
            return false;
    }

    private void crecer() {
        
    }
    
    public Usuario ingresar(String usuario, String clave){
        Usuario result = null;
        for( Usuario u : this.usuarios ){
            if(u != null && u.ingresar(usuario, clave)  ){
                result = u;
                break;
            }
        }
        return result;
    }
    
    
}
