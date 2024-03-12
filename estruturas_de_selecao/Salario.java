import javax.swing.JOptionPane;

public class Salario {
    public static void main(String[] args) {
        double valorhora;
        int horas;
        double imposto;
        double comissao;
        double bruto;
        double liquido;
        double semcomissao;

        valorhora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora trabalhada"));
        horas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas horas foram trabalhadas"));
        imposto = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos porcento deve se declarar de imposto (de 0 a 1)"));
        comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissão"));

        bruto = valorhora * horas;
        liquido = bruto - (imposto * bruto) + comissao;
        semcomissao = bruto - imposto;

        if (horas >= 120) {
            JOptionPane.showMessageDialog(null, "O salário bruto é R$" + bruto + "\nO salário líquido é R$" + liquido);
        }
        else {
            JOptionPane.showMessageDialog(null, "O salário bruto é R$" + bruto + "\nO salário líquido é R$" + semcomissao);
        }
    }

}
