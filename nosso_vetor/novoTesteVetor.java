import java.util.Random;

public class novoTesteVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor(4);

        Random r = new Random();
        for (int i = 1; i <= 30; i++) {
            if (r.nextBoolean()) {
                v1.insere(i);
                System.out.println(i + " foi inserido");
            } else {
                try {
                    System.out.println(v1.remove() + " foi removido");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }

            }
            System.out.println(v1);
            System.out.println("Tamanho = " + v1.getTamanho());
        }
    }
}
