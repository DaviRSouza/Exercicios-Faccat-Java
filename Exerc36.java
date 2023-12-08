package faccat;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro homem: ");
        int idadeHomem1 = scanner.nextInt();

        System.out.print("Digite a idade do segundo homem: ");
        int idadeHomem2 = scanner.nextInt();

        while (idadeHomem1 == idadeHomem2) {
            System.out.println("As idades dos homens devem ser diferentes. Digite novamente.");
            System.out.print("Digite a idade do segundo homem: ");
            idadeHomem2 = scanner.nextInt();
        }

        System.out.print("Digite a idade da primeira mulher: ");
        int idadeMulher1 = scanner.nextInt();

        System.out.print("Digite a idade da segunda mulher: ");
        int idadeMulher2 = scanner.nextInt();

        while (idadeMulher1 == idadeMulher2) {
            System.out.println("As idades das mulheres devem ser diferentes. Digite novamente.");
            System.out.print("Digite a idade da segunda mulher: ");
            idadeMulher2 = scanner.nextInt();
        }

        int somaIdades = (idadeHomem1 > idadeHomem2 ? idadeHomem1 : idadeHomem2) +
                (idadeMulher1 < idadeMulher2 ? idadeMulher1 : idadeMulher2);

        int produtoIdades = (idadeHomem1 < idadeHomem2 ? idadeHomem1 : idadeHomem2) *
                (idadeMulher1 > idadeMulher2 ? idadeMulher1 : idadeMulher2);

        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + somaIdades);
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produtoIdades);
    }
}
