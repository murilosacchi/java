import javax.swing.JOptionPane;

public class SaqueBancario {
    public static void main(String[] args) {
        double saldo;
        double saque;
        double resultado;

        saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu saldo"));
        saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar"));
        resultado = saldo - saque;

        if (saldo >= saque) {
            JOptionPane.showMessageDialog(null, "Saldo remanescente: R$" +resultado);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não é possível realizar o saque");
        }
    }
}
