/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberia;

import java.util.Calendar;

/**
 *
 * @author Marek
 */
public class Cita {

    private Calendar fecha;
    private boolean confirmada;
    private Cliente client;

    public Cita(Calendar fecha, Cliente client) {
        this.fecha = fecha;
        this.client = client;
    }

    public void confirmarCita() {
        confirmada = true;
    }

    public String toString() {
        return "Fecha = " + fecha + " confirmada=" + confirmada;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

}
