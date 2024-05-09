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

    public void adicionar (int elemento){
        if (!estaCheio()){
            this.elementos[this.quantidade] = elemento;
            this.quantidade++;
        }
    }
}
