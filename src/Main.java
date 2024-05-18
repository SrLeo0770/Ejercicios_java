public class Main {
    public static void main(String[] args) {

 int numero;
        int factorial=1;
        System.out.println("ingrese un numero:");
        numero = Integer.parseInt(System.console().readLine());
        int i=numero;
        while (i>1){
            factorial*=i;
            i--;
        }
        System.out.println("El factorial de "+numero+" es: "+factorial);
    }
}