package faccat;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler 3 valores
        System.out.println("Digite o primeiro valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = scanner.nextInt();

        // Calcular e exibir a soma dos dois maiores
        int somaDosDoisMaiores;

        if ((valor1 > valor2 && valor1 < valor3) || (valor1 < valor2 && valor1 > valor3)) {
            // valor1 é o do meio
            somaDosDoisMaiores = valor1 + valor3;
        } else if ((valor2 > valor1 && valor2 < valor3) || (valor2 < valor1 && valor2 > valor3)) {
            // valor2 é o do meio
            somaDosDoisMaiores = valor2 + valor3;
        } else {
            // valor3 é o do meio
            somaDosDoisMaiores = valor1 + valor2;
        }

        System.out.println("A soma dos dois maiores valores é: " + somaDosDoisMaiores);
    }
}
