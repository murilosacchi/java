public class ListaSimplesCopia {
    private No primeiro;

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void insereInicio(int elemento) {
        No novo = new No(elemento);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }

    public int removeInicio() {
        if (estaVazia())
            throw new RuntimeException("Lista vazia");
        int removido = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return removido;
    }

    public void insereFim(int elemento) {
        No novo = new No(elemento);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            No runner = primeiro;
            while (runner.getProximo() != null) {
                runner = runner.getProximo();
            }
            runner.setProximo(novo);
        }
    }

    @Override
    public String toString() {
        String s = "lista: ";
        if (estaVazia()) {
            s = s + "vazia";
        } else {
            No runner = primeiro;
            while (runner != null) {
                s = s + runner + "->";
                runner = runner.getProximo();
            }
            s = s + "\\\\";
        }
        return s + "\n";
    }

}
