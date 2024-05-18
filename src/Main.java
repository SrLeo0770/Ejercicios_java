public class Main {
    public static void main(String[] args) {

        int numero;
        System.out.println("ingrese un numero");
        numero = Integer.parseInt(System.console().readLine());
        if (numero % 2 == 0) {
            System.out.println(numero+" si es un numero par");
        }else {
            System.out.println(numero+" no es un numero par");
        }
    }
}