public class TesteNossoVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor(5);
        NossoVetor v2 = new NossoVetor();

        v1.insere(2);
        v2.insere(30);

        int i = 100;
        v1.insere(i++);
        System.out.println(v1.toString());

        int a = v1.remove();
        System.out.println("'" + a + "'" + " foi removido\n");
        System.out.println(v1);

        while (!v1.estaVazio()) {
            System.out.println(v1.remove() + " foi removido");
        }
    }

}