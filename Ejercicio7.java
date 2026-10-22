
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce un número positivo: ..0.");
        numero = input.nextInt();

        // Repetimos mientras el numero no sea negativo
        while (numero >= 0) {

            // Sumamos el numero
            suma = suma + numero;

            // Contamos los números introducidos
            contador++;

            // Pedimos otro numero
            System.out.println("Introduce otro número: ");
            numero = input.nextInt();
        }

        // Comprobamos que se haya introducido algún numero
        if (contador > 0) {

            // Calculamos la media
            double media = (double) suma / contador;
            System.out.println("La media es: " + media);

        } else {
            System.out.println("No has introducido ningún número positivo.");
        }

        input.close();
    }
}