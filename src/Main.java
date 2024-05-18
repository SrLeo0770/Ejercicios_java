import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Escriba un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        } while (numero <= 10 || numero >= 30);

        int contador = 1;
        while (contador <= numero) {
            System.out.println(contador);
            contador += 2;
        }
    }
}