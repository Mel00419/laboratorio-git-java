import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("==============================");
        System.out.println(" SISTEMA ACADÉMICO");
        System.out.println("==============================");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Consultar estudiante");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = teclado.nextInt();
        System.out.println("Opción seleccionada: " + opcion);
    }
}