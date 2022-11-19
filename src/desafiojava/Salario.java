
package desafiojava;

/**
    * 1- Desarrolla un programa que determina la cantidad de dinero que cobrará 
    * un trabajador en el mes. Para esto se sabe que cuando las horas de trabajo 
    * mensuales exceden de 40, el resto se contabiliza como horas extras y que 
    * estas se pagan al doble de una hora normal cuando no exceden de 8; 
    * si las horas extras exceden de 8 se pagan las primeras al doble de lo que 
    * se paga por una hora normal y el resto el triple. Nota: el programa debe 
    * recibir el valor en pesos que vale una hora normal, la cantidad total de 
    * horas trabajadas y mostrar por pantalla el monto total que va a cobrar el 
    * trabajador.
 */
public class Salario {
    
    public Salario(){}

    public double totalHaberMensual(double valorHoraNormal, int cantHorasTrabajadas){
        int horas = cantHorasTrabajadas;
        if(horas > 48){
            // A las horas normales  se suman horas extras dobles y horas extras triples
            horas = 56 + (horas - 48) * 3;
        }else if(horas > 40 && horas <= 48){
            // A las horas normales se sumas horas extras dobles
            horas = 40 + (horas - 40) * 2;
        }
        // Si ha trabajado 40 horas ó menos la cantidad de horas no ha tenido cambios
        return valorHoraNormal * horas; 
    }
}
