import javax.swing.JOptionPane;

public class MaiorNumeroInteiro {
    public static void main(String[] args) {
        int num1;
        int num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "Primeiro maior que o segundo");
        }
        else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "Segundo maior que o primeiro");
        }
    }    
}
