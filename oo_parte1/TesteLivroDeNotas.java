public class TesteLivroDeNotas {
    public static void main(String[] args) {
        var meuLivro = new LivroDeNotas();
        meuLivro.nomeDisciplina = "POO";
        meuLivro.recepcionarUsuario();
        var meuLivro2 = new LivroDeNotas();
        meuLivro2.nomeDisciplina = "Modelagem";
        meuLivro2.recepcionarUsuario();

        System.out.println(meuLivro.ano);
        meuLivro.ano = 2025;
        System.out.println(meuLivro2.ano);
    }
}
