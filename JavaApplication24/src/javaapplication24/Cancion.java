
package javaapplication24;

public class Cancion {
    
    //ATRIBUTOS
    
    private String Nombre;
    private double Precio;
    private double Duracion;
    private double Tamaño;
    private double Calidad;
    
    // METODOS
    
    // ***CONTRUCTOR***
    
    public Cancion(String Nombre, double Precio, double Duracion, double Tamaño, double Calidad) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Duracion = Duracion;
        this.Tamaño = Tamaño;
        this.Calidad = Calidad;
    }
    
    //***SECCION GET Atributos Privados***
    
    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public double getDuracion() {
        return Duracion;
    }

    public double getTamaño() {
        return Tamaño;
    }

    public double getCalidad() {
        return Calidad;
    }
    
    //***SECCION SET Atributos Privados***
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setDuracion(double Duracion) {
        this.Duracion = Duracion;
    }

    public void setTamaño(double Tamaño) {
        this.Tamaño = Tamaño;
    }

    public void setCalida(double Calidad) {
        this.Calidad = Calidad;
    }
    
    
}
