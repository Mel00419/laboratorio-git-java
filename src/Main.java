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

        if (nota1 < 0 || nota1 > 10 ||
                nota2 < 0 || nota2 > 10 ||
                nota3 < 0 || nota3 > 10) {
            System.out.println("Error: las notas deben estar entre 0 y 10");
        } else {
            double promedio = (nota1 + nota2 + nota3) / 3;
            System.out.println("Promedio: " + promedio);
        }
    }
}


