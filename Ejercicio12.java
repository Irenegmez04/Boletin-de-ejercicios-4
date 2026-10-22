
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numero = input.nextInt();

        // Muestra el numero al revés
        while (numero > 0) {
            System.out.print(numero % 10);
            numero = numero / 10;
        }

        // Salto de linea al terminar
        System.out.println();

        // Cierra el Scanner
        input.close();
    }
}