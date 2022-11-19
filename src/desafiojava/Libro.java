
package desafiojava;

/**
    * 2 - Crear una clase Libro que contenga los siguientes atributos:
    * ISBN
    * Titulo
    * Autor
    * Número de páginas
    * Precio
    * Crear sus respectivos métodos get y set correspondientes para cada atributo. 
    * Crear el método toString() para mostrar la información relativa al libro con 
    * el siguiente formato: “El libro Titulo con ISBN creado por autor tiene páginas”
    * Crear una clase Carrito que tenga los identificadores de un carrito de 
    * compras de libros: ID carrito, arreglo con los libros que contiene el carrito, 
    * y que contenga un metodo que devuelva el monto total de todos los libros 
    * agregados al carrito.
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int cantPaginas;
    private double precio;

    public Libro(String ISBN, String titulo, String autor, int cantPaginas, double precio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        this.precio = precio;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "El libro Titulo: "+ getTitulo()  +" con ISBN: "+ getISBN() 
                +"\ncreado por autor: "+ getAutor() +" tiene: "+ getCantPaginas() +" páginas";
    }
    
}
