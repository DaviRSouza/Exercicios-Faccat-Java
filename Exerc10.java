package faccat;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double custoFinal = calcularCustoFinal(custoFabrica);

        System.out.println("O custo final ao consumidor é: " + custoFinal);
    }

    private static double calcularCustoFinal(double custoFabrica) {
        // Definindo percentuais
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        // Calculando custo final
        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        double custoImpostos = custoFabrica * percentualImpostos;
        double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;

        return custoFinal;
    }
}