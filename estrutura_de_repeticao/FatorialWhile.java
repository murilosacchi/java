import javax.swing.JOptionPane;

public class FatorialWhile {
    public static void main(String[] args) {
        int num;
        int fatorial;
        int i;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        fatorial = 1;
        i = 1;

        while (i <= num) {
            fatorial *= i;
            i++;
        }

        JOptionPane.showMessageDialog(null, fatorial);
    }
}
