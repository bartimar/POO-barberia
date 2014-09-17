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
    private String descripcion;

    public TipoServicio(String nombre, String descripcion) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pNombre) {
        nombre = pNombre;
    }
    
    public String getDescripcion() {
        return nombre;
    }

    public void setDescripcion(String pDescripcion) {
        nombre = pDescripcion;
    }
    
    public String toString() {
        return "nombre = " + nombre;
    }

}
