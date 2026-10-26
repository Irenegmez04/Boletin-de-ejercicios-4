
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pedimos un número por teclado
        System.out.println("Introduce un número:");
        int numero = input.nextInt();

        // Suponemos que el numero es primo - Pnemos boolena para registrar si es verdadero o falso
        boolean primo = true;

        // Los numeros menores que 2 no son primos
        if (numero < 2) {
            primo = false;
        }

        // Comprobamos si el número es divisible entre otros números
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }

        // Mostramos si el numero es primo o no
        if (primo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }

        input.close();
    }
}
