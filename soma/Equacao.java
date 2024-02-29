import javax.swing.JOptionPane;

public class Equacao {
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
        resultado = Math.pow(primeiroValor, 2)+Math.pow(segundoValor, 2)+Math.pow(terceiroValor, 2)+Math.pow(quartoValor, 2);

        // saída
        // JOptionPane.showMessageDialog(null, resultado);
        JOptionPane.showMessageDialog(null, "A soma dos quadrados é " + resultado);
    }
}
