/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static Aplicacion.TiendaVideojuegosInicio.listaProductos;

import java.util.ArrayList;

/**
 *
 * @author lenin
 */
public class Ventas{
    public static double total = 0.0;
    private String idCliente;
    private String matricula;
    private String idProducto;
    private Fecha fecha;
    private Hora hora;

    public Ventas(String idCliente, String matricula, String idProducto, Fecha fecha, Hora hora) {
        this.idCliente = idCliente;
        this.matricula = matricula;
        this.idProducto = idProducto;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }
    
    
    @Override
    public String toString() {
        return "Id cliente: " + getIdCliente() + ", matricula: " + getMatricula() + ", id producto: " + getIdProducto() + ", fecha: " + getFecha() + ", hora: " + getHora();
    }
    
}
