import javax.swing.JOptionPane;

public class CompraDeRoupa {
    public static void main(String[] args) {
        double roupa;
        int pagamento;
        double desconto;
        double parcelas;
        double parcelado;
        double crediario;

        roupa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da roupa"));
        pagamento = Integer.parseInt(JOptionPane.showInputDialog("Digite a forma de pagamento:\n 0 - Compra à vista\n 1 - Compra parcelada no cartão\n 2 - Crediário"));

        if (pagamento == 0) {
            desconto = roupa * 0.90;
            JOptionPane.showMessageDialog(null, "Com desconto de 10% a roupa custará R$" + desconto);
        }
        else if (pagamento == 1) {
            parcelas = Double.parseDouble(JOptionPane.showInputDialog("Em quantas parcelas?"));
            parcelado = roupa / parcelas;
            JOptionPane.showMessageDialog(null, "O valor de cada parcela será de R$" + parcelado);
        }
        else if (pagamento == 2) {
            parcelas = Double.parseDouble(JOptionPane.showInputDialog("Em quantas parcelas?"));
            crediario = (roupa * 1.10) / parcelas;
            JOptionPane.showMessageDialog(null, "O valor de cada parcela com juros de 10% sobre o valor total será de R$" + crediario);
        }
        else {
            JOptionPane.showMessageDialog(null, "opção inválida");
        }
        
    }
}
