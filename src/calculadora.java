import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite outro número");
        int numero2 = entrada.nextInt();

        System.out.println("Digite (1) para somar os numeros, (2) para subtrair, (3) para dividir e (4) para multiplicar");
        int numeroDigitado = entrada.nextInt();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double divisao = numero1 / numero2;
        double multiplicacao = numero1 * numero2;

        if (numeroDigitado == 1) {
            System.out.println("O resultado da soma: " + soma);
        } else if (numeroDigitado == 2) {
            System.out.println("O resultado da subtração: " + subtracao);
        } else if (numeroDigitado == 3) {
            System.out.println("O resultado da divisão: " + divisao);
        } else if (numeroDigitado == 4) {
            System.out.println("O resultado da multiplicação: " + multiplicacao);
        } else {
            System.out.println("Numero inválido.");
        }

    }
}
