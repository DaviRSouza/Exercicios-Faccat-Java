package faccat;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler número da conta, saldo, débito e crédito
        System.out.print("Digite o número da conta do cliente: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o débito da conta: ");
        double debito = scanner.nextDouble();

        System.out.print("Digite o crédito da conta: ");
        double credito = scanner.nextDouble();

        // Calcular saldo atual
        double saldoAtual = saldo - debito + credito;

        // Exibir saldo atual
        System.out.println("Saldo atual: R$ " + saldoAtual);

        // Testar se saldo atual é maior ou igual a zero e exibir mensagem correspondente
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }
}
