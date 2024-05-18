import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        while (true) {
            System.out.print("Por favor, ingrese un número mayor a 10 y menor que 30: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero > 10 && numero < 30) {
                    break;
                } else {
                    System.out.println("El número debe ser mayor a 10 y menor que 30. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next(); // Descarta la entrada no válida
            }
        }

        System.out.println("Números impares desde 1 hasta " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}