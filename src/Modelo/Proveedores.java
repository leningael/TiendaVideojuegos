/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author lenin
 */
public class Proveedores extends Persona{
    private String email;
    private double total = 0.0;

    public Proveedores(String clavePersona, String nombre, String numeroTelefono, String email) {
        super(clavePersona, nombre, numeroTelefono);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", email=" + getEmail();
    }
    
}
