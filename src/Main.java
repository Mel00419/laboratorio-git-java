import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CÁLCULO DE PROMEDIO");
        System.out.print("Ingrese nota 1: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Ingrese nota 2: ");
        double nota2 = teclado.nextDouble();
        System.out.print("Ingrese nota 3: ");
        double nota3 = teclado.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Promedio: " + promedio);
    }
}

