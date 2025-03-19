public class TestePersonagem {
    public static void main(String[] args) {
        // 1. Construir o personagem
        var p = new Personagem();

        // 2. Fazer o personagem atacar, caçar, comer e dormir
        p.atacar(5);
        p.cacar();
        p.comer();
        p.dormir();        
    }   
    
}
