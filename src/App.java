import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre por favor");
        String nombre = sc.nextLine();
        sc.close();
        System.out.println("Hola " + nombre + " !!");
        System.out.println("Hasta Luego");  
    }
}
