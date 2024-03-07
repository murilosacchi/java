import javax.swing.JOptionPane;

public class AnoBissexto {
    public static void main(String[] args) {
        int ano;

        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));

        if (ano % 4 == 0) {
            if (ano % 100 != 0 || ano % 400 != 0) {
                JOptionPane.showMessageDialog(null, "Esse ano é bissexto");

            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Esse ano não é bissexto");
        }
    }
}