public class VetorDinamico {
    private int[] elementos;
    private int quantidade;
    private int capacidade;

    public VetorDinamico() {
        this.capacidade = 4;
        this.elementos = new int[this.capacidade];
    }

    public boolean estaCheio() {
        if (this.quantidade == this.capacidade)
            return true;
        else
            return false;

        // ou: return this.quantidade == this.capacidade
    }

    public void adicionar(int elemento) {
        if (estaCheio()) {
            this.aumentarCapacidade();
        }
        this.elementos[this.quantidade] = elemento;
        this.quantidade++;
    }

    private void aumentarCapacidade() {
        int[] aux = new int[this.capacidade * 2];
        for (int i = 0; i < this.quantidade; i++) {
            aux[i] = this.elementos[i];
        }
        this.elementos = aux;

        /*
         * private void aumentarCapacidade(){
         * int novaCapacidade = this.capacidade * 2;
         * int[] novoArray = new int[novaCapacidade];4
         * 
         * // copiar elementos do array original para o novo array usando
         * System.arraycopy
         * System.arraycopy(this.elementos, 0, novoArray, 0, this.quantidade);
         * 
         * // atualizar referências do vetor
         * this.elementos = novoArray;
         * this.capacidade = novaCapacidade;
         * }
         */
    }

    public void exibir() {
        System.out.printf("Quantidade: %d, Capacidade: %d\n", this.quantidade, this.capacidade);
        for (int i = 0; i < this.quantidade; i++) {
            System.out.printf(this.elementos[i] + "");
        }
        System.out.println();
    }
}
