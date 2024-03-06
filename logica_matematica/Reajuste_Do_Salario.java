import java.util.Scanner;

public class Reajuste_Do_Salario {
    static public void main(String... args) {
        Scanner leitor = new Scanner(System.in);
        double salario;
        double reajuste;
        double resultado;

        System.out.println("Digite o seu salário");
        salario = leitor.nextDouble();
        System.out.println("Digite o seu percentual de reajuste");
        reajuste = leitor.nextDouble();

        resultado = salario + (salario * (reajuste / 100));

        System.out.printf(
                "O seu salário atual de R$%.2f, terá um reajuste de %.0f%%, e ficará R$%.2f",
                salario, reajuste, resultado);

    }
}