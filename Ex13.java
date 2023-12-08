package faccat;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double mediaFinal = calcularMediaFinal(nota1, nota2, nota3);

        System.out.println("A média final é: " + mediaFinal);
    }

    private static double calcularMediaFinal(double nota1, double nota2, double nota3) {
        // Fórmula para calcular a média final ponderada
        return (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
    }
}
