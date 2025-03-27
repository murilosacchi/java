import java.util.Date;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        NossoVetor v;
        System.out.print("digite o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();

            // Escolher um valor para buscar
            System.out.print("Digite um valor para buscar no vetor: ");
            int valor = scanner.nextInt();

            // Busca Linear antes da ordenação
            long ini = System.nanoTime();
            int indiceLinear = v.buscaLinear(valor);
            long fim = System.nanoTime();
            System.out.println("Busca Linear demorou " + ((fim - ini) / 1_000_000) + " milissegundos");
            System.out.println("Resultado da Busca Linear: "
                    + (indiceLinear != -1 ? "Encontrado no índice " + indiceLinear : "Não encontrado"));

            // Ordenação com Bubble Sort
            ini = new Date().getTime();
            v.bubbleSort();
            fim = new Date().getTime();
            System.out.println("bubble demorou " + (fim - ini) + " milissegundos");

            // Busca Binária após a ordenação
            ini = System.nanoTime();
            int indiceBinaria = v.buscaBinaria(valor);
            fim = System.nanoTime();
            System.out.println("Busca Binária demorou " + ((fim - ini) / 1_000_000) + " milissegundos");
            System.out.println("Resultado da Busca Binária: "
                    + (indiceBinaria != -1 ? "Encontrado no índice " + indiceBinaria : "Não encontrado"));

            // Outras ordenações
            v.preencheVetor();
            ini = new Date().getTime();
            v.selectionsort();
            fim = new Date().getTime();
            System.out.println("selection demorou " + (fim - ini) + " milissegundos");

            v.preencheVetor();
            ini = new Date().getTime();
            v.insertionSort();
            fim = new Date().getTime();
            System.out.println("insertion demorou " + (fim - ini) + " milissegundos");

            System.out.print("\nescolha o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
