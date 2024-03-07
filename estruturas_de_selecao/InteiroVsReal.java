import javax.swing.JOptionPane;

public class InteiroVsReal {
    public static void main(String[] args) {
        int inteiro;
        double real;

        inteiro = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número inteiro"));
        real = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));

        if (inteiro < real) {
            JOptionPane.showMessageDialog(null, "O número inteiro é menor que o número real");

        }

    }

}
