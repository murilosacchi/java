import javax.swing.JOptionPane;

public class EquacaoDeSegundoGrau {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double delta;
        double raiz1;
        double raiz2;
        double raiz3;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C"));
        delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "As raízes da equação são " + raiz1 + " e " + raiz2);
        }
        else if (delta == 0) {
            raiz3 = (-b) / (2 * a);
            JOptionPane.showMessageDialog(null, "A raíz da equação é " + raiz3);
        }
        else {
            JOptionPane.showMessageDialog(null, "Não é uma equação de segundo grau");
        } 

    }

}
