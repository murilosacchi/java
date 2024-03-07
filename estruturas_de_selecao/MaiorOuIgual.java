import javax.swing.JOptionPane;

public class MaiorOuIgual {
    public static void main(String[] args) {
        double num1;
        double num2;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite dois números"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + " é maior");
        }
        else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, num2 + " é maior");
        }
        else{
            JOptionPane.showMessageDialog(null, "Estes números são iguais");

        }
    }
}