package faccat;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota N1: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a nota N2: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a nota N3: ");
        double n3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios) / 7;

        System.out.println("Média de Aproveitamento: " + mediaAproveitamento);

        if (mediaAproveitamento >= 9.0) {
            System.out.println("Conceito: A");
        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            System.out.println("Conceito: B");
        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: D");
        }
    }
}
