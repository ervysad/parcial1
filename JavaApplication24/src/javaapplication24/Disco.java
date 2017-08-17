
package javaapplication24;

public class Disco {
    
    //ATRIBUTOS
    
    private String NombreDisco;
    private String Autor;
    private String Genero;
    private String imagen;
    private Cancion[] cancion;
    
    // METODOS
    
    // ***CONTRUCTOR***

    public Disco(String NombreDisco, String Autor, String Genero, String imagen) {
        this.NombreDisco = NombreDisco;
        this.Autor = Autor;
        this.Genero = Genero;
        this.imagen = imagen;
    }
    
    //***SECCION GET AtributosPrivado***

    public String getNombreDisco() {
        return NombreDisco;
    }

    public String getAutor() {
        return Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public String getImagen() {
        return imagen;
    }
    
    // ***SECCION SET Atributos Privados***

    public void setNombreDisco(String NombreDisco) {
        this.NombreDisco = NombreDisco;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }   
    
    public void AgregarCancion(){
        this.cancion = cancion;
    }
}
