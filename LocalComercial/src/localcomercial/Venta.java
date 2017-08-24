/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localcomercial;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
class Venta {
    
    private Date fecha; 
    private int codigoVendedor;
    private int codigoProducto;
    private int cantidad;
    private int tipoPago;

    public Venta(int codigoVendedor, int codigoProducto, int cantidad, int tipoPago) {
        this.fecha = new Date();
        System.out.println(this.fecha);
        this.codigoVendedor = codigoVendedor;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.tipoPago = tipoPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }
    
}
