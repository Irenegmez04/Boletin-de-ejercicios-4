
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pedimos dos numeros enteros
        System.out.println("Introduce el primer número:");
        int num1 = input.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = input.nextInt();

        // Comprobamos que los numeros sean distintos
        while (num1 == num2) {
            System.out.println("Los números deben ser distintos.");
            System.out.println("Introduce el primer número:");
            num1 = input.nextInt();

            System.out.println("Introduce el segundo número:");
            num2 = input.nextInt();
        }

        // Comprobamos cuál es el numero menor
        int menor = num1;
        int mayor = num2;

        if (num1 > num2) {
            menor = num2;
            mayor = num1;
        }

        // Mostramos los numeros incrementando de 7 en 7
        for (int i = menor; i <= mayor; i = i + 7) {
            System.out.println(i);
        }

        input.close();
    }
}