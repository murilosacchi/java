import javax.swing.JOptionPane;

public class SomaEMediaEProdutoEMenorEMaior {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        double soma;
        double media;
        double produto;
        double menor;
        double maior;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número inteiro"));

        soma = num1 + num2 + num3; 
        media = (num1 + num2 + num3) / 3;
        produto = num1 * num2 * num3;
        maior = Math.max(num1, Math.max(num2, num3));
        menor = Math.min(num1, Math.min(num2, num3));

        JOptionPane.showMessageDialog(null, "A soma é " +soma+ ", a média é " +media+ ", o produto é " +produto+ ", o menor é " +menor+ ", e o maior é " +maior+ ".");

    }
}