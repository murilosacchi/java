import java.util.Random;

public class NossoVetor {
    private int ocupacao;
    private int[] vetor;

    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0; // por clareza
    }

    public NossoVetor() {
        this(10);
    }

    // public boolean insere (int i) {
    // if (!estaCheio()) {
    // vetor[ocupacao++] = i;
    // return true;
    // }
    // return false;
    // }
    public void insere(int i) {
        if (estaCheio())
            redimensionaVetor(vetor.length * 2);
        vetor[ocupacao++] = i;
    }

    boolean estaCheio() {
        return ocupacao == vetor.length;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    // public int remove () {
    // if (!estaVazio()) {
    // return vetor[--ocupacao];
    // }
    // return -1;
    // }
    // public int remove() {
    // int i = -1;
    // if (!estaVazio()) {
    // i = vetor[--ocupacao];
    // if (vetor.length >= 4 && ocupacao <= vetor.length/4)
    // redimensionaVetor(vetor.length/2);
    // }
    // return i;
    // }
    public int remove() {
        if (estaVazio())
            throw new VetorVazioException("vetor vazio, nao ha o que remover");
        int i = vetor[--ocupacao];
        if (vetor.length >= 4 && ocupacao <= vetor.length / 4)
            redimensionaVetor(vetor.length / 2);
        return i;
    }

    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s + "\n";
    }

    // private void dobraVetor () {
    // int[] temp = new int[vetor.length*2];
    // for (int i=0; i < ocupacao; i++)
    // temp[i] = vetor[i];
    // vetor = temp;
    // }
    // private void reduzVetor () {
    // int[] temp = new int[vetor.length/2];
    // for (int i=0; i < ocupacao; i++)
    // temp[i] = vetor[i];
    // vetor = temp;
    // }
    private void redimensionaVetor(int novoTamanho) {
        int[] temp = new int[novoTamanho];
        for (int i = 0; i < ocupacao; i++)
            temp[i] = vetor[i];
        vetor = temp;
    }

    public int getTamanho() {
        return vetor.length;
    }

    public void preencheVetor() {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(vetor.length * 10);
        }
        ocupacao = vetor.length;
    }

    public void bubbleSort() {
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public void selectionsort() {
        for (int i = 0; i < vetor.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < vetor.length; ++j)
                if (vetor[j] < vetor[min])
                    min = j;
            int x = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = x;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < vetor.length; i++) {
            int key = vetor[i];
            int j = i - 1;

            // Move os elementos do vetor que são maiores que a chave
            // para uma posição à frente de sua posição atual
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = key;
        }
    }

    /**
     * Realiza uma busca linear no vetor.
     * 
     * @param valor O valor a ser buscado.
     * @return O índice do valor no vetor, ou -1 se não for encontrado.
     */
    public int buscaLinear(int valor) {
        for (int i = 0; i < ocupacao; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1; // Valor não encontrado
    }

    /**
     * Realiza uma busca binária no vetor.
     * O vetor deve estar ordenado para que a busca binária funcione corretamente.
     * 
     * @param valor O valor a ser buscado.
     * @return O índice do valor no vetor, ou -1 se não for encontrado.
     */
    public int buscaBinaria(int valor) {
        int inicio = 0;
        int fim = ocupacao - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == valor) {
                return meio; // Valor encontrado
            } else if (vetor[meio] < valor) {
                inicio = meio + 1; // Busca na metade direita
            } else {
                fim = meio - 1; // Busca na metade esquerda
            }
        }
        return -1; // Valor não encontrado
    }

    public int[] getVetor() {
        return vetor;
    }
}

class VetorVazioException extends RuntimeException {
    public VetorVazioException(String msg) {
        super(msg);
    }
}