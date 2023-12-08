package faccat;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler um valor
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        // Verificar se o valor é positivo, negativo ou zero e exibir mensagem correspondente
        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }
    }
}
