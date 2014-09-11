/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package barberia;

import java.util.ArrayList;

/**
 *
 * @author Marek
 */
public class Cliente {
    private String nombre;
    private String email;
    private String numeroTelefono;
    

    public Cliente(String nombre, String email, String numeroTelefono) {
        this.nombre = nombre;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }
    
    public static boolean validarNombre(String nombre) {
        return true;
    }
    public static boolean validarNumeroTelefono(String numero) {
        return true;
    }
    public static boolean validarEmail(String email) {
        return true;
    }
    
    public String toString() {
        return "nombre = " + nombre + " email = " + email + " numeroTelefono = " + numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    
}
