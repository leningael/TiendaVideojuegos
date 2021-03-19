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
public class Clientes extends Persona{
    private int puntos;

    public Clientes(String clavePersona, String nombre, String numeroTelefono, int puntos) {
        super(clavePersona, nombre, numeroTelefono);
        this.puntos = puntos;
    }
    
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return super.toString() + ", puntos: " + getPuntos();
    }
    
    
}
