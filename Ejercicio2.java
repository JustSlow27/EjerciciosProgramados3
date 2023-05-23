package EjerciciosProgramados3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        while (num > 0) {
            System.out.println("El cuadrado de " + num + " es " + (num * num));}
            System.out.println("El cubo de " + num + " es " + (num * num * num));
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
        }
    }
    
