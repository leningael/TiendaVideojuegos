/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author lenin
 */
public class Horario {
    private Hora horaInicio;
    private Hora horaSalida;

    public Horario(Hora horaInicio, Hora horaSalida) {
        this.horaInicio = horaInicio;
        this.horaSalida = horaSalida;
    }

    public Hora getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Hora horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Hora getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Hora horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return getHoraInicio() + "-" + getHoraSalida();
    }
    
}
