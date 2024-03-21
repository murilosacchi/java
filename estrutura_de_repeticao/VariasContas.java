import java.util.Scanner;

public class VariasContas {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        double valorDigitado;
        double soma = 0;
        int quantidadeDigitados = 0;
        double media = 0;
        double maior = -1;
        double menor = -1;
        double mediaPares = 0;
        double percentualImpares = 0;

        do {
            System.out.println("Digite um valor");
            valorDigitado = leitor.nextDouble();
            if (valorDigitado != 30000) {
                soma = soma + valorDigitado;
                quantidadeDigitados += 1;
                media = media + valorDigitado;
                if (maior < 0 || valorDigitado > maior) {
                    maior = valorDigitado;
                }
                menor = menor == -1 || valorDigitado < menor ? valorDigitado : menor;
                mediaPares = valorDigitado % 2 == 0 ? mediaPares + valorDigitado : mediaPares;
                percentualImpares += valorDigitado % 2;
            }
        } while (valorDigitado != 30000);
        System.out.println("Soma: " + soma);
        System.out.println("Quantidade Digitados: " + quantidadeDigitados);
        System.out.println("Média: " + (media / quantidadeDigitados));
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média pares: " + (mediaPares / (quantidadeDigitados - percentualImpares)));
        System.out.println("Percentual ímpares: " + (percentualImpares / quantidadeDigitados * 100) + "%");
        leitor.close();

    }
}
