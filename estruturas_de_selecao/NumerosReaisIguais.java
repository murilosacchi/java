import javax.swing.JOptionPane;

public class NumerosReaisIguais {
    public static void main(String[] args) {
        double num1;
        double num2;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número real"));

        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }
    }
}
