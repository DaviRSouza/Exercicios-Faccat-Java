package faccat;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int codigoUsuarioCorreto = 1234;

        System.out.print("Digite o código de usuário: ");
        int codigoUsuarioDigitado = scanner.nextInt();


        if (codigoUsuarioDigitado != codigoUsuarioCorreto) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.print("Digite a senha: ");
            int senhaDigitada = scanner.nextInt();


            if (senhaDigitada != 9999) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Acesso permitido");
            }
        }
    }
}
