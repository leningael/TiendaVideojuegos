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
public class Producto {
    private String idProducto;
    private String idProveedor;
    private String nombre;
    private double precio;
    private int stock = 0;
    private int cantComprar;
    private double precioPorArticulo;

    public Producto(String idProducto, String idProveedor, String nombre, double precio, int cantComprar, double precioPorArticulo) {
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.precio = precio;
        this.cantComprar = cantComprar;
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantComprar() {
        return cantComprar;
    }

    public void setCantComprar(int cantComprar) {
        this.cantComprar = cantComprar;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }
    

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }
    public void actualizarStock(int cantComprar, boolean adquirir){
        if(adquirir == true)
            setStock(getStock()+cantComprar);
        if(adquirir == false)
            setStock(getStock()-cantComprar);
    }
    @Override
    public String toString() {
        return "idProducto: " + getIdProducto() + ", nombre: " + getNombre() + ", precio: " + getPrecio() + ", stock: " + getStock() + ", cantComprar: " + getCantComprar() + ", precioPorArticulo: " + getPrecioPorArticulo();
    }
    
}
