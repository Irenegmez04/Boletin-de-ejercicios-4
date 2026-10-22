
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Combiancion correcta y numero de intenetos
        String combiancion = "1616"; 
        int intentos = 4;

        // Numero de intentos para abrir la caja fuerte
        for (int i = 0; i< intentos; i++) {
            System.out.println("Introduce la combinacion: ");
            String clave = input.nextLine();

            // Comprueba si la combinacion es correcta
            if (clave.equals(combiancion)) {
                System.out.println("La combinacion es correcta");
                break;
            } else {
                System.out.println("La combinacion es incorrecta");
            }

        }

    input.close();

    }
}
