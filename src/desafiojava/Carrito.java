
package desafiojava;

/**
    * Crear una clase Carrito que tenga los identificadores de un carrito de 
    * compras de libros: ID carrito, arreglo con los libros que contiene el carrito, 
    * y que contenga un metodo que devuelva el monto total de todos los libros 
    * agregados al carrito.
 */
public class Carrito {
    private int id;
    private Libro[] libros;

    public Carrito() {
    }

    public Carrito(int id, Libro[] libros) {
        this.id = id;
        this.libros = libros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }
    
    public double montoTotal(){
        double total = 0;
        for(Libro libro: libros){
            total += libro.getPrecio();
        }
        return total;
    }
    
    private String cMontoTotal(){
        return String.format("$%,.2f", montoTotal());
    }
    
    private String verLibrosEnCarrito(){
        String miCarrito = "";
        int i = 1;
        for(Libro libro: getLibros()){
            miCarrito += String.valueOf(i) + ".-" + libro +"\n";
            i++;
        }
        return miCarrito;
    }
    
    @Override
    public String toString(){
        return "Libros en Carrito:\n" + verLibrosEnCarrito() + "Monto Total " + cMontoTotal();
    }
}
