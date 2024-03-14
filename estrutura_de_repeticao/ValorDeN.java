import javax.swing.JOptionPane;

public class ValorDeN {
    public static void main(String[] args) {
        int num;
        double e;
        double fatorial;
        int i = 1;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro e positivo"));
        e = 1;
        fatorial = 1;

        while (i <= num) {
            fatorial *= i;
            e += 1 / fatorial;
            i++;
        }

        JOptionPane.showMessageDialog(null, e);
    }
}
