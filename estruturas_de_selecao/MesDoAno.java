import javax.swing.JOptionPane;

public class MesDoAno {
    public static void main(String[] args) {
        double dia;

        dia = Double.parseDouble(JOptionPane.showInputDialog("Digite um número, de 1 a 12, referente ao mês do ano"));

        if (dia == 1) {
            JOptionPane.showMessageDialog(null, "É janeiro");
        }
        else if (dia == 2) {
            JOptionPane.showMessageDialog(null, "É fevereiro");
        }
        else if (dia == 3) {
            JOptionPane.showMessageDialog(null, "É março");
        }
        else if (dia == 4) {
            JOptionPane.showMessageDialog(null, "É abril");
        }
        else if (dia == 5) {
            JOptionPane.showMessageDialog(null, "É maio");
        }
        else if (dia == 6) {
            JOptionPane.showMessageDialog(null, "É junho");
        }
        else if (dia == 7) {
            JOptionPane.showMessageDialog(null, "É julho");
        }
        else if (dia == 8) {
            JOptionPane.showMessageDialog(null, "É agosto");
        }
        else if (dia == 9) {
            JOptionPane.showMessageDialog(null, "É setembro");
        }
        else if (dia == 10) {
            JOptionPane.showMessageDialog(null, "É outubro");
        }
        else if (dia == 11) {
            JOptionPane.showMessageDialog(null, "É novembro");
        }
        else if (dia == 12) {
            JOptionPane.showMessageDialog(null, "É dezembro");
        }
        else {
            JOptionPane.showMessageDialog(null, "Esse número não corresponde a um dia da semana");
        }
    }

}