import javax.swing.JOptionPane;

public class CotacaoDoDolar {
    public static void main(String[] args) {

        // declaração de variaveis
        double primeiroValor;
        double segundoValor;
        double resultado;

        // entrada
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Qual a cotacao do dolar:"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de dolar:"));

        // processamento
        resultado = primeiroValor * segundoValor;

        // saída
        // JOptionPane.showMessageDialog(null, resultado);
        JOptionPane.showMessageDialog(null,
                "Voce possui " + resultado + " dolares, que corresponde a " + segundoValor + " reais");
    }
}
