public class Main {
    public static void main(String[] args) {
        int edad;
        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(System.console().readLine());
        if (edad >= 18) {
            System.out.println("Si es mayor de edad");
        }else if (edad < 18) {
            System.out.println("No es mayor de edad");
        }
    }
}