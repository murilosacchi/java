import javax.swing.JOptionPane;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Murilo");
        pessoa.setIdade(19);

        JOptionPane.showMessageDialog(null, "Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
    }
}
