import javax.swing.JOptionPane;

public class FatorialFor {
    public static void main(String[] args) {
        int num;
        int fatorial;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        JOptionPane.showMessageDialog(null, fatorial);
    }
}
