import java.util.Random;

public class NossoVetor {
    private int ocupacao;
    private int[] vetor;

    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0;
    }

    public NossoVetor() {
        this(10);
    }

    public void insere(int i) {
        if (estaCheio())
            redimensionaVetor(vetor.length * 2);
        vetor[ocupacao++] = i;
    }

    public boolean estaCheio() {
        return ocupacao == vetor.length;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    public int remove() {
        if (estaVazio())
            throw new VetorVazioException("Vetor vazio, não há o que remover");
        int i = vetor[--ocupacao];
        if (vetor.length >= 4 && ocupacao <= vetor.length / 4) {
            redimensionaVetor(vetor.length / 2);
        }
        return i;
    }

    @Override
    public String toString() {
        String s = "ocupação = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s + "\n";
    }

    private void redimensionaVetor(int novoTamanho) {
        int[] temp = new int[novoTamanho];
        for (int i = 0; i < ocupacao; i++) {
            temp[i] = vetor[i];
        }
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

    public void selectionSort() {
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
}

class VetorVazioException extends RuntimeException {
    public VetorVazioException(String msg) {
        super(msg);
    }
}