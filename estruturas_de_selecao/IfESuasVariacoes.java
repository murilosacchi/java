import java.util.Scanner;

public class IfESuasVariacoes {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        final int VALOR_MINIMO = 0, VALOR_MAXIMO = 10;
        System.out.println("Qual a sua nota?");
        var nota = leitor.nextDouble();

        if (nota >= VALOR_MINIMO && nota <= VALOR_MAXIMO) {
            if (nota >= 9) {
                System.out.println("A");
                System.out.println("Parabéns");

            } 
            else if (nota >= 6) {
                System.out.println("C");

            } 
            else {
                System.out.println("De recuperação");
            }

        } 
        else {
            System.out.println("Nota inválida");
        }

        leitor.close();

    }
}
