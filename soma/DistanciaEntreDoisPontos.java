import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    static public void main(String... args) {

        // variaveis
        Scanner leitor = new Scanner(System.in);
        float x1, x2, y1, y2;
        float distancia;

        // entrada
        System.out.println("Digite o valor de x1");
        x1 = leitor.nextFloat();
        System.out.println("Digite o valor de x2");
        x2 = leitor.nextFloat();
        System.out.println("Digite o valor de y1");
        y1 = leitor.nextFloat();
        System.out.println("Digite o valor de y2");
        y2 = leitor.nextFloat();

        // processamento
        distancia = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // saida
        System.out.printf(
                "A distância entre p1 (%.2f, %.2f) e p2 (%.2f, %.2f) é %.2f",
                x1, y1, x2, y2, distancia);

    }
}