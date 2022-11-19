
package desafiojava;

/**
 *
 * @author Hector Barotto
 */
public class DesafioJava {


    public static void main(String[] args) {
        //Desafio 1: Calcular haber mensual
        Salario haberMensual = new Salario();
        System.out.println("Salario: " + haberMensual.totalHaberMensual(100.00, 49));
        //Desafio 2: Libro / carrito
        Libro libro1 = new Libro("123-12-12345-12-1", "Yo Programo", "Hector Barotto", 1, 0.50);
        Libro libro2 = new Libro("123-12-12346-12-1", "Yo Programo basico", "Hector M. Barotto", 2, 1.00);
        Libro libro3 = new Libro("123-12-12347-12-1", "Yo Programo avanzado", "Hector Mario Barotto", 3, 2.555);
        Libro[] libros = new Libro[3];
        libros[0] = libro1;
        libros[1] = libro2;
        libros[2] = libro3;
        Carrito carrito = new Carrito(1,libros);
        System.out.println(carrito);
        
    }
    
}
