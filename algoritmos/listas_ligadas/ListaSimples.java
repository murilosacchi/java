public class ListaSimples {
    private No primeiro;
    private No ultimo;

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void insereInicio(int elemento) {
        No novo = new No(elemento);
        if (estaVazia()) {
            ultimo = novo;
        } else {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }

    public int removeInicio() {
        if (estaVazia())
            throw new RuntimeException("Lista vazia, não há o que remover");
        int removido = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) {
            ultimo = null;
        }
        return removido;
    }

    public void insereFim(int elemento) {
        No novo = new No(elemento);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    public int removeFim() {
        if (estaVazia())
            throw new RuntimeException("Lista vazia, não há o que remover");
        int removido = ultimo.getInfo();
        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        } else {
            No runner = primeiro;
            while (runner.getProximo() != ultimo) {
                runner = runner.getProximo();
            }
            runner.setProximo(null);
            ultimo = runner;
        }
        return removido;
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

    public void inserePosicao(int elemento, int posicao) {
        if (posicao < 0) {
            throw new IllegalArgumentException("Posição inválida");
        }
        if (posicao == 0) {
            insereInicio(elemento);
            return;
        }
        No novo = new No(elemento);
        No runner = primeiro;
        for (int i = 0; i < posicao - 1; i++) {
            if (runner == null) {
                throw new IllegalArgumentException("Posição inválida");
            }
            runner = runner.getProximo();
        }
        novo.setProximo(runner.getProximo());
        runner.setProximo(novo);
        if (novo.getProximo() == null) {
            ultimo = novo;
        }
    }

    public boolean removeElemento(int elemento) {
        if (estaVazia()) {
            return false;
        }
        if (primeiro.getInfo() == elemento) {
            removeInicio();
            return true;
        }
        No runner = primeiro;
        while (runner.getProximo() != null && runner.getProximo().getInfo() != elemento) {
            runner = runner.getProximo();
        }
        if (runner.getProximo() == null) {
            return false;
        }
        runner.setProximo(runner.getProximo().getProximo());
        if (runner.getProximo() == null) {
            ultimo = runner;
        }
        return true;
    }
}