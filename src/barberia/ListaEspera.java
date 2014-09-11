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
public class ListaEspera {

    private ArrayList<Cliente> clientes;

    public ListaEspera() {
        clientes = new ArrayList<>();
    }

    public void mostrar() {
        System.out.println(toString());
    }

    public String toString() {
        return "";
    }

    public void establecerHorario() {
        ;
    }
    
    public void agregarCliente(Cliente c) {
        clientes.add(c);
    }
    
    public void borrarCliente(Cliente c) {
        clientes.remove(c);
    }
}
