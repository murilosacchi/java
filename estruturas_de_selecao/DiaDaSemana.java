import javax.swing.JOptionPane;

public class DiaDaSemana {
    public static void main(String[] args) {
        double dia;

        dia = Double.parseDouble(JOptionPane.showInputDialog("Digite um número, de 1 a 7, referente ao dia da semana"));

        if (dia == 1) {
            JOptionPane.showMessageDialog(null, "É domingo");
        }
        else if (dia == 2) {
            JOptionPane.showMessageDialog(null, "É segunda - feira");
        }
        else if (dia == 3) {
            JOptionPane.showMessageDialog(null, "É terça - feira");
        }
        else if (dia == 4) {
            JOptionPane.showMessageDialog(null, "É quarta - feira");
        }
        else if (dia == 5) {
            JOptionPane.showMessageDialog(null, "É quinta - feira");
        }
        else if (dia == 6) {
            JOptionPane.showMessageDialog(null, "É sexta - feira");
        }
        else if (dia == 7) {
            JOptionPane.showMessageDialog(null, "É sábado");
        }
        else {
            JOptionPane.showMessageDialog(null, "Esse número não corresponde a um dia da semana");
        }
    }

}
