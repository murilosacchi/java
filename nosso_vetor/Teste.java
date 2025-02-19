import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int i;
        int[] v;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do vetor?");
        i = scanner.nextInt();
        v = new int[i];
        scanner.close();
    }
}
