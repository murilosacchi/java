import java.util.Arrays;

import javax.swing.JOptionPane;

public class OrdemCrescente {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número inteiro"));
        int[] numeros = { num1, num2, num3 };
        Arrays.sort(numeros);

        if (num1 != num2 && num1 != num3 && num2 != num3) {
            JOptionPane.showMessageDialog(null, numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        } 
        else {
            JOptionPane.showMessageDialog(null, "ERRO!\nOs números são iguais");
        }

    }

}
