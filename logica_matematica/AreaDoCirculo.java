import java.util.Scanner;

public class AreaDoCirculo {

    static public void main(String... args) {
        Scanner leitor = new Scanner(System.in);
        double r;
        double area;

        System.out.println("Digite o raio do círculo");
        r = leitor.nextDouble();

        area = Math.PI * (Math.pow(r, 2));

        System.out.printf(
                "A area de um circulo com raio %.2f é %.2f",
                r, area);

    }

}
