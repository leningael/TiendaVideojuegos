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
public class Ventas implements PorPagar{
    private String folio;
    private String idCliente;
    private String matricula;
    private ArrayList<Producto> productos;
    private Fecha fecha;
    private Hora hora;

    public Ventas(String folio, String idCliente, String matricula, ArrayList<Producto> productos, Fecha fecha, Hora hora) {
        this.folio = folio;
        this.idCliente = idCliente;
        this.matricula = matricula;
        this.productos = productos;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
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
    public double obtenerMontoPago() {
        double total = 0.0;
        for(int i = 0; i < productos.size(); i++){
            total = total + productos.get(i).getPrecio()*productos.get(i).getCantComprar();
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "Folio: " + getFolio() + ", idCliente: " + getIdCliente() + ", matricula: " + getMatricula() + ", productos: " + getProductos() + ", fecha: " + getFecha() + ", hora: " + getHora();
    }
    
}
