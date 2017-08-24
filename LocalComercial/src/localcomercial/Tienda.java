/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localcomercial;

import java.util.ArrayList;

class Tienda {
    
    ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
    ArrayList<Producto> productos = new ArrayList<Producto>();
    ArrayList<Venta> ventas = new ArrayList<Venta>();
    
    public void crearProducto(Producto producto){
        this.productos.add(producto);
    }
    public void crearVendedor(Vendedor vendedor){
        this.vendedores.add(vendedor);
    }
    public void crearVenta(Venta venta){
        this.ventas.add(venta);        
    }
    
    public Vendedor mejorVendedor(){
        Vendedor mejorVendedor = null;
        for(Venta x:ventas)
        {
            x.getCodigoVendedor();
        }
        return mejorVendedor;
    }    
}