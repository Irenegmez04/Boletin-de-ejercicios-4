
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int numero;

        // Repetimos el proceso 10 veces
        for (int i = 1; i <= 10; i++) {

            // Pedimos un número por teclado
            System.out.println("Introduce un número:");
            numero = input.nextInt();

            // Comprobamos si el numero es positivo
            if (numero > 0) {
                positivos++;
            }

            // Comprobamos si el numero es negativo - Ponemos el else if para que no cuente el 0, ya que si ponemos else, lo cuenta como negativo
            else if (numero < 0) {
                negativos++;
            }
        }

        // Mostramos la cantidad de numeros positivos y negativos
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);

        input.close();
    }
}