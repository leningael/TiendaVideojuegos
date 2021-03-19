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
public class Vendedores extends Persona implements PorPagar{
    private double horasTrabajo;
    private Horario horario;

    public Vendedores(String clavePersona, String nombre, String numeroTelefono, double horasTrabajo, Horario horario) {
        super(clavePersona, nombre, numeroTelefono);
        this.horasTrabajo = horasTrabajo;
        this.horario = horario;
    }

    public double getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(double horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    

    @Override
    public double obtenerMontoPago() {
        return getHorasTrabajo()*80*14;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", horas de trabajo: " + getHorasTrabajo() + ", horario: " + getHorario();
    }
    
}
