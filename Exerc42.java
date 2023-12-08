package faccat;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do empregado (código): ");
        int codigoEmpregado = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano de ingresso na empresa do empregado: ");
        int anoIngresso = scanner.nextInt();

        int idade = 2023 - anoNascimento;
        int tempoTrabalho = 2023 - anoIngresso;

        System.out.println("Idade do empregado: " + idade + " anos");
        System.out.println("Tempo de trabalho na empresa: " + tempoTrabalho + " anos");

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer aposentadoria");
        }
    }
}
