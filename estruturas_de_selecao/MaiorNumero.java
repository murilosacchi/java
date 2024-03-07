import javax.swing.JOptionPane;

public class MaiorNumero {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número diferente"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número diferente"));

        if (num1 > num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "O maior número é " + num1);
        }

        else if (num2 > num1 && num2 > num3) {
            JOptionPane.showMessageDialog(null, "O maior número é " +num2);
        }

        else if (num3 > num1 && num3 > num2) {
            JOptionPane.showMessageDialog(null, "O maior número é " + num3);
        }
        else {
            JOptionPane.showMessageDialog(null, "Os números devem ser diferentes");
        }
    }
    
}
