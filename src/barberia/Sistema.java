/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberia;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Marek
 */
public class Sistema {

    private ArrayList<Cliente> clientes;
    private ArrayList<Cita> citas;
    private ArrayList<TipoServicio> tipoServicios;
    private Horario horario;
    private ListaEspera listaEspera;
    

    public Sistema() {
        clientes = new ArrayList<>();
        citas = new ArrayList<>();
        tipoServicios = new ArrayList<>();
        horario = new Horario();
        listaEspera = new ListaEspera();
    }
    //Cliente
    public void crearCliente(String nombre, String email, String numeroTelefono) {
        clientes.add(new Cliente(nombre, email, numeroTelefono));
        
    }

    public void modificarCliente(int index, Cliente c) {
        clientes.set(index, c);
    }

    public void consultarCliente() {

    }

    public void borrarCliente(Cliente c) {
        clientes.remove(c);
    }

    //Cita
    public void crearCita(Calendar fecha, Cliente c) {
        citas.add(new Cita(fecha,c));
    }
    
    public void borrarCita(Cita c) {
        citas.remove(c);
    }
    
    public void consultarCita() {
        
    }
    public void modificarCita(int index, Cita c) {
        citas.set(index, c);
    }
    
    public void enviarNotificacion(String correo) {
        
    }
    
    //TipoServicio
    public void crearTipoServicio(String nombre, String descripcion) {
        tipoServicios.add(new TipoServicio(nombre, descripcion));
    }
    public void modificarTipoServicio(int index, TipoServicio t) {
        tipoServicios.set(index,t);
    }
    
    public void borrarTipoServicio ( TipoServicio t) {
        tipoServicios.remove(t);
    }
    
    public void consultarTipoServicio(TipoServicio t) {
        
    }
  
    //TODO: Borrar esto de diagrama
//    public void muestraTipoServicio() {
//        for(TipoServicio t : tipoServicios) {
//            System.out.println(t.toString());
//        }
//    }
}
