import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        calcularNumeros(entrada);
        entrada.close();
    }

    public static double calcularNumeros(Scanner entrada) {
        System.out.println("Digite um numero");
        double numero1 = entrada.nextDouble();
        System.out.println("Digite outro numero");
        double numero2 = entrada.nextDouble();



        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double divisao = numero1 / numero2;
        double multiplicacao = numero1 * numero2;
        boolean opcaoFalsa = false;

        while (!opcaoFalsa) {
            System.out.println("Digite (1) para somar os numeros, (2) para subtrair, (3) para dividir e (4) para multiplicar");
            double numeroDigitado = entrada.nextDouble();

        if (numeroDigitado == 1) {
            System.out.println("O resultado da soma: " + soma);
            opcaoFalsa = true;
        } else if (numeroDigitado == 2) {
            System.out.println("O resultado da subtração: " + subtracao);
            opcaoFalsa = true;
        } else if (numeroDigitado == 3) {
            System.out.println("O resultado da divisão: " + divisao);
            opcaoFalsa = true;
        } else if (numeroDigitado == 4) {
            System.out.println("O resultado da multiplicação: " + multiplicacao);
            opcaoFalsa = true;
        } else {
            System.out.println("O numero digitado é invalido, digite novamente.");
        }
        }

        return 0;
    }

}
