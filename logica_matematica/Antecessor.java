import java.util.Scanner;

public class Antecessor {

    static public void main(String... args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        int resultado;

        System.out.println("Digite um número");
        numero = leitor.nextInt();

        resultado = numero - 1;

        System.out.println("O numero é antecessor é " + resultado);
    }
}