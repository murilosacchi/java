import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) throws InterruptedException {
        VetorDinamico v = new VetorDinamico();
        Random gerador = new Random();
        while (true) {
            int elemento = 1 + gerador.nextInt(6);
            v.adicionar(elemento);
            v.exibir();
            Thread.sleep(5000);
            System.out.println("===================================");
        }
    }
}
