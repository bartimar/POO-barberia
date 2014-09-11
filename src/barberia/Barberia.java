/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package barberia;

import java.util.ArrayList;

/**
 *
 * @author Freddy Ulate
 */
public class Barberia {
   
    private ArrayList<Cliente> clientes;
    private ArrayList<Cita> citas;
    private ArrayList<TipoServicio> tipoServicios;
    private Horario horario;
    private ListaEspera listaEspera;
    
    public Barberia() {
        clientes = new ArrayList<>();
        citas = new ArrayList<>();
        tipoServicios = new ArrayList<>();
        horario = new Horario();
        listaEspera = new ListaEspera();
    }
    
    public void correPantalla() {
        //TODO        
    }
    
    //Cliente
    public void crearCliente(String nombre, String email, String numeroTelefono) {
        
    }
     public void modificarCliente() {
         
     }
     public void consultarCliente() {
         
     }
     
     public void borrarCliente() {
         
     }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sistema sistema = new Sistema();
        sistema.correPantalla();
        
    }
    
}
