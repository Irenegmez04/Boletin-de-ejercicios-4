
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pide un numeor al usuario
        System.out.println("Introduce un número:");
        int numero = input.nextInt();

        // Muestra la tabla de multiplicar del numero
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        input.close();
    }
}