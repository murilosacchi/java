import java.util.Scanner;

public class Comissao {

    static public void main(String... args) {
        Scanner leitor = new Scanner(System.in);
        double preco;
        double quantidade;
        double resultado;

        System.out.println("Digite o preço unitário da peça");
        preco = leitor.nextDouble();
        System.out.println("Digite o número de peças vendidas");
        quantidade = leitor.nextDouble();

        resultado = (0.05 * (preco * quantidade));

        System.out.printf(
                "A comissão é R$%.2f reais",
                resultado);
    }
}