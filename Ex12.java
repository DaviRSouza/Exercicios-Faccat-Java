package faccat;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = converterFahrenheitParaCelsius(temperaturaFahrenheit);

        System.out.println("A temperatura em graus Celsius é: " + temperaturaCelsius);
    }

    private static double converterFahrenheitParaCelsius(double temperaturaFahrenheit) {
        // Fórmula de conversão de Fahrenheit para Celsius
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}
