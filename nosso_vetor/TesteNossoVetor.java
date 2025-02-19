public class TesteNossoVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor(8);
        NossoVetor v2 = new NossoVetor();

        v1.insere(2);
        v2.insere(30);

        for (int i = 10; i <= 70; i += 10) {
            v1.insere(i);
        }

        if (v1.tamanhoAtual() == v1.ocupacaoAtual()) {
            System.out.println("O vetor está cheio" + "\nTamanho: " + v1.tamanhoAtual() + "\nOcupação: " + v1.ocupacaoAtual());
        } else {
            System.out.println("O tamanho do vetor é " + v1.tamanhoAtual() + " e a ocupação do vetor é " + v1.ocupacaoAtual());
        }

    }
}