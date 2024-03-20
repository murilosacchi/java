import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;
import static java.lang.Math.*;

public class Enroscado {
    public static void main(String[] args) {
        long numeroTermos = parseLong(showInputDialog("Digite o número de termos"));
        var x = parseDouble(showInputDialog("Digite o valor de X"));
        boolean incrementandoDenominador = true;
        double total = 0;
        int denominador = 1;
        for (long i = 0; i < numeroTermos; i++) {
            if (denominador == 4) {
                incrementandoDenominador = false;

            } else if (denominador == 1) {
                incrementandoDenominador = true;
            }

            double fatorial = 1;
            for (long j = 1; j <= denominador; j++) {
                fatorial *= j;
            }

            double fracao = pow(x, i + 1) / fatorial;
            total = total + (i % 2 == 1 ? fracao + -1 : fracao);

            denominador = incrementandoDenominador ? denominador + 1 : denominador - 1;

        }
        showMessageDialog(null, total);

    }
}
