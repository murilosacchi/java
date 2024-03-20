import static javax.swing.JOptionPane.showInputDialog;

import java.util.Scanner;

public class VariasContas {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        double valorDigitado;
        double soma = 0;
        int quantidadeDigitados = 0;
        double media = 0;
        double maior = -1;
        double mediaPares = 0;
        double percentualImpares;

        do {
            System.out.println("Digite um valor");
            valorDigitado = leitor.nextDouble();
            if (valorDigitado != 30000) {
                soma = soma + valorDigitado;
            }
        } while (valorDigitado != 30000);

    }
}
