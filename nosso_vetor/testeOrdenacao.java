import java.util.Date;
import java.util.Scanner;

public class testeOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        NossoVetor v;
        System.out.print("digite o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();

        while (t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();

            long inib = new Date().getTime();
            v.bubbleSort();
            long fimb = new Date().getTime();

            v.preencheVetor();

            long ini = new Date().getTime();
            v.selectionSort();
            long fim = new Date().getTime();

            System.out.println("o selectionSort demorou " + (fim - ini) + " milissegundos");
            System.out.println("o bubbleSort demorou " + (fimb - inib) + " milissegundos");
            System.out.print("\nescolha o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
