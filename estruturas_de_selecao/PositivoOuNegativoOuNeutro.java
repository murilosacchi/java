import javax.swing.JOptionPane;

public class PositivoOuNegativoOuNeutro {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "Esse número é positivo");
        }
        else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Esse número é negativo");
        }
        else {
            JOptionPane.showMessageDialog(null, "Esse número é neutro");
        }
    }
}
