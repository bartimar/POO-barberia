/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberia;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    public static boolean validarNumeroTelefono(final String numero) {
        Pattern pattern;
        Matcher matcher;

        final String NUMERO_PATTERN
                = "^[0-9]{4,}[-]?[0-9]{4,}$";

        pattern = Pattern.compile(NUMERO_PATTERN);

        matcher = pattern.matcher(numero);
        return matcher.matches();
    }

    public static boolean validarEmail(final String email) {
        Pattern pattern;
        Matcher matcher;

        final String EMAIL_PATTERN
                = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        pattern = Pattern.compile(EMAIL_PATTERN);

        matcher = pattern.matcher(email);
        return matcher.matches();

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
