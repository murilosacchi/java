import javax.swing.JOptionPane;

public class SomaDoisNumeros {
    public static void main(String[] args) {

        //declaração de variaveis
        double primeiroValor;
        double segundoValor;
        double terceiroValor;
        double quartoValor;
        double resultado;

        //entrada
        primeiroValor =
        Double.parseDouble(JOptionPane.showInputDialog(""));
        segundoValor = 
        Double.parseDouble(JOptionPane.showInputDialog(""));
        terceiroValor = 
        Double.parseDouble(JOptionPane.showInputDialog(""));
        quartoValor = 
        Double.parseDouble(JOptionPane.showInputDialog(""));

        //processamento
        resultado = (primeiroValor*primeiroValor)+(segundoValor*s);

        //saída
        //JOptionPane.showMessageDialog(null, resultado);
        JOptionPane.showMessageDialog(null, "Voce possui " + resultado + " dolares, que corresponde a " + segundoValor + " reais");
    }
}
