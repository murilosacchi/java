public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    //construtor é o padrão herdado, zera tudo
    //não temos gets e sets para atributos de controle
    public boolean listaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (listaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }
    public void insereFim (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (listaVazia()) {
            primeiro = novo;
        }
        else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    @Override
    public String toString () {
        if (listaVazia()) return "lista vazia\n";
        String s = "\\\\=";
        for (NoDuplo runner=primeiro; runner != null; runner = runner.getProximo()) {
            s += runner + "=";
        }
        return s + "\\\\\n";
    }
    public int removeInicio () {
        if (listaVazia()) throw new RuntimeException("lista vazia, nao ha o que remover");
        int info = primeiro.getInfo();
        if (primeiro == ultimo) { //tem um só, vai esvaziar
            primeiro = null;
            ultimo = null;
        }
        else {
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        return info;
    }
    public int removeFim () {
        if (listaVazia()) throw new RuntimeException("lista vazia, nao ha o que remover");
        int info = ultimo.getInfo();
        if (primeiro == ultimo) { //tem um só, vai esvaziar
            primeiro = null;
            ultimo = null;
        }
        else {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        return info;
    }
}
