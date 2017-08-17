
package javaapplication24;


public class miTiendaDisco {
    
    //ATRIBUTOS
    
    private String NombreTienda;
    private int NIT;
    private Disco[] disco;
    
    // METODOS
    
    // ***CONSTRUCTOR***

    public miTiendaDisco(String NombreTienda, int NIT) {
        this.NombreTienda = NombreTienda;
        this.NIT = NIT;
    }
    
    //***SECCION GET AtributosPrivado***

    public String getNombreTienda() {
        return NombreTienda;
    }

    public int getNIT() {
        return NIT;
    }
     
    //***SECCION GET AtributosPrivado***

    public void setNombreTienda(String NombreTienda) {
        this.NombreTienda = NombreTienda;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }
}
