/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberia;

/**
 *
 * @author Marek
 */
public class TipoServicio {

    private String nombre;

    public TipoServicio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pNombre) {
        nombre = pNombre;
    }
    
    public String toString() {
        return "nombre = " + nombre;
    }

}
