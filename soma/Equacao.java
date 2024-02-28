import javax.swing.JOptionPane;

public class equacao {
    public static void main(String[] args) {

        // declaração de variaveis
        double primeiroValor;
        double segundoValor;
        double terceiroValor;
        double quartoValor;
        double resultado;

        // entrada
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor"));
        terceiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor"));
        quartoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor"));

        // processamento
        resultado = (primeiroValor * primeiroValor) + (segundoValor * segundoValor) + (terceiroValor) * (terceiroValor)
                + (quartoValor) * (quartoValor);

        // saída
        // JOptionPane.showMessageDialog(null, resultado);
        JOptionPane.showMessageDialog(null, "A soma dos quadrados é " + resultado);
    }
}
