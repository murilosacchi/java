import java.util.Scanner;

public class AreaDoTriangulo {

    static public void main(String... args) {
        Scanner leitor = new Scanner(System.in);
        double b;
        double h;
        double area;

        System.out.println("Digite a base de um triangulo");
        b = leitor.nextDouble();
        System.out.println("Digite a altura do mesmo triângulo");
        h = leitor.nextDouble();

        area = (b * h) / 2;

        System.out.printf(
                "A área do triângulo é %.2f",
                area);

    }
}