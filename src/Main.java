public class Main {
    public static void main(String[] args) {

        int edad;

        float a,b;
        System.out.println("Ingrese el primer numero: ");
        a = Float.parseFloat(System.console().readLine());
        System.out.println("Ingrese el segundo numero: ");
        b = Float.parseFloat(System.console().readLine());
        if(a>b){
            System.out.println(a+" Es mayor que "+b);
        }else {
            System.out.println(b+"Es mayor que "+a);
        }
    }
}