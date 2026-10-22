
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String combiancion = "1616"; 

        int intentos = 4;

        for (int i = 0; i< intentos; i++) {
            System.out.println("Introduce la combinacion: ");
            String clave = input.nextLine();

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
