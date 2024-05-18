import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("1. Comprobar si es mayor de edad");
        System.out.println("2. Comparar dos números");
        System.out.println("3. Verificar si un número es par");
        System.out.println("4. Calcular el factorial de un número");
        System.out.println("5. Imprimir números impares hasta un número dado");
        System.out.println("6. Imprimir números impares hasta un número dado (while)");
        System.out.println("7. Mostrar el día de la semana según el número ingresado");
        System.out.print("Elige una opción: ");
        option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 7:
                int numero;
                System.out.print("Escriba un número del 1 al 5: ");
                numero = scanner.nextInt();
                scanner.nextLine();
                switch (numero) {
                    case 1:
                        System.out.println("Lunes");
                        break;
                    case 2:
                        System.out.println("Martes");
                        break;
                    case 3:
                        System.out.println("Miércoles");
                        break;
                    case 4:
                        System.out.println("Jueves");
                        break;
                    case 5:
                        System.out.println("Viernes");
                        break;
                    default:
                        System.out.println("El número debe estar entre 1 y 5.");
                }
                break;
            default:
                System.out.println("Opción inválida");
        }

        scanner.close();
    }
}