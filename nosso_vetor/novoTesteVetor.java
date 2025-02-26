import java.util.Random;

public class novoTesteVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor(4);

        Random r = new Random();
        for (int i = 1; i <= 10000; i++) {
            if (r.nextBoolean()) {
                v1.insere(i);
            } else {
                v1.remove();
            }
            System.out.println(v1);
            System.out.println("Tamanho = " + v1.getTamanho());
        }
    }
}
