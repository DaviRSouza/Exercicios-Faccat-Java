package faccat;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = calcularAreaRetangulo(base, altura);

        System.out.println("A área do retângulo é: " + area);
    }

    private static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }
}
