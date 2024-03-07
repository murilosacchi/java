import javax.swing.JOptionPane;

public class IMC {    
    public static void main(String[] args) {
        double altura;
        double peso;
        double imc;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (em metros)")); 
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso (em KG)"));
        imc = peso/(Math.pow(altura, 2));

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso ideal");
        }
        else if (imc > 18.5 && imc < 24.9) {
            JOptionPane.showMessageDialog(null, "Peso ideal, muito bem");
        }
        else if (imc > 25 && imc < 29.9) {
            JOptionPane.showMessageDialog(null, "Sobrepeso, um regime bem leve pode ajudar");
        }
        else if (imc > 30 && imc < 34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade leve");
        }
        else if (imc > 35 && imc < 39.9) {
            JOptionPane.showMessageDialog(null, "Obesidade moderada");
        }
        else {
            JOptionPane.showMessageDialog(null, "Obesidade mórbida");
        }
    }
}
