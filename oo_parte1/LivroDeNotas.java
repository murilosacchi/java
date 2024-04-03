public class LivroDeNotas {
    String nomeDisciplina;

    static int ano = 2024;
    void recepcionarUsuario() {
        System.out.println("Bem vindo ao livro de notas de " + this.nomeDisciplina);
    }

    // construtor padrão: lista de parâmetros vazia
    LivroDeNotas() {
        System.out.println("construindo um livro...");
    }

    LivroDeNotas(String nomeDisciplina) {
        nomeDisciplina = nomeDisciplina;
    }
}

