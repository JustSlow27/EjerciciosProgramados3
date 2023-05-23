package EjerciciosProgramados3;

public class Ejercicio4 {
    public static void main(String[] args) {
        int año = 2020;
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
    }
    
}
