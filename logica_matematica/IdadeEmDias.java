import java.util.Scanner;

public class IdadeEmDias {

    static public void main(String... args) {
        Scanner leitor = new Scanner(System.in);
        double anos;
        double resultado;

        System.out.println("Digite sua idade");
        anos = leitor.nextDouble();

        resultado = anos * 365;

        System.out.printf(
                "Você possui %.0f dias de vida",
                resultado);

    }
}