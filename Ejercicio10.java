
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pedimos un número entero y positivo
        System.out.println("Introduce un número entero y positivo:");
        int numero = input.nextInt();

        // Comprobamos que el número sea positivo
        while (numero <= 0) {
            System.out.println("Error, introduce un número positivo:");
            numero = input.nextInt();
        }

        // Creamos una variable para guardar la suma
        int suma = 0;

        // Sumamos los 100 números siguientes al número introducido
        for (int i = 1; i <= 100; i++) {
            suma = suma + numero + i;
        }

        // Mostramos el resultado
        System.out.println("La suma es: " + suma);

        input.close();
    }
}