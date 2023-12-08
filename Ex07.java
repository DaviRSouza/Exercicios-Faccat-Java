package faccat;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);

        System.out.println("A idade em dias é: " + idadeEmDias + " dias");
    }

    private static int calcularIdadeEmDias(int anos, int meses, int dias) {
        return (anos * 365) + (meses * 30) + dias;
    }
}
