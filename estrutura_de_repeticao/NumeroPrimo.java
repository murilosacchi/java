import javax.swing.JOptionPane;

public class NumeroPrimo {
    public static void main(String[] args) {
        int num;
        int i; 
        int contador;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
        i = 1;
        contador = 0;

        while (i <= num) {
            if (num % i == 0) {
                contador++;
            }
            i++;
        }

        if (contador == 2) {
            JOptionPane.showMessageDialog(null, "O número é primo");
        }
        else {
            JOptionPane.showMessageDialog(null, "O número não é primo");
        }

    }
}