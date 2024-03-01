import java.util.Scanner;

public class Eleitores {

    static public void main(String... args) {
        Scanner leitor = new Scanner(System.in);
        double total;
        double brancos;
        double nulos;
        double validos;
        double resultadobrancos;
        double resultadonulos;
        double resultadovalidos;

        System.out.println("Digite o número total de eleitores");
        total = leitor.nextDouble();
        System.out.println("Digite o número de votos brancos");
        brancos = leitor.nextDouble();
        System.out.println("Digite o número de votos nulos");
        nulos = leitor.nextDouble();
        System.out.println("Digite o número de votos válidos");
        validos = leitor.nextDouble();

        resultadobrancos = (100 * brancos) / total;
        resultadonulos = (100 * nulos) / total;
        resultadovalidos = (100 * validos) / total;

        System.out.printf(
                "O número total de eleitores é %.0f, dentre esses, %.2f%% são votos brancos, %.2f%% são nulos e %.2f%% são válidos.",
                total, resultadobrancos, resultadonulos, resultadovalidos);
    }

}