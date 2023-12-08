package faccat;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricaoProduto = scanner.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidadeAdquirida = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        double total = quantidadeAdquirida * precoUnitario;
        double desconto = 0.0;

        if (quantidadeAdquirida <= 5) {
            desconto = total * 0.02;
        } else if (quantidadeAdquirida > 5 && quantidadeAdquirida <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalPagar = total - desconto;

        System.out.println("Total: R$" + total);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Total a Pagar: R$" + totalPagar);
    }
}
