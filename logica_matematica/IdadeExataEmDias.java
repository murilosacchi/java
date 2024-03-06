import java.util.Scanner;

public class IdadeExataEmDias {

    static public void main(String... args) {
        Scanner leitor = new Scanner(System.in);
        double anos;
        double meses;
        double dias;
        double resultado;

        System.out.println("Digite quantos anos você tem");
        anos = leitor.nextDouble();
        System.out.println("Agora quantos meses");
        meses = leitor.nextDouble();
        System.out.println("Agora quantos dias");
        dias = leitor.nextDouble();

        resultado = (anos * 365) + (meses * 30) + dias;

        System.out.printf(
                "Você possui %.0f dias de vida",
                resultado);

    }
}