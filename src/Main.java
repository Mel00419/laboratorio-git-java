import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println(" SISTEMA DE REGISTRO DE ESTUDIANTES ");
        System.out.println("====================================");
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Bienvenido " + nombre);
    }
}
