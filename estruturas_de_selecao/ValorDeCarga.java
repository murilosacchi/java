import javax.swing.JOptionPane;

public class ValorDeCarga {
    public static void main(String[] args) {
        int codigo;
        double carga;
        double cargafinal;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do estado de 1 a 5"));
        carga = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor inicial de carga"));

        if (codigo == 2 || codigo == 5) {
            cargafinal = carga *0.88;
            JOptionPane.showMessageDialog(null, "O valor final da carga é R$" + cargafinal);
        }
        else if (codigo == 1 || codigo ==3 || codigo == 4) {
            cargafinal = carga * 0.85;
            JOptionPane.showMessageDialog(null, "O valor final da carga é R$" + cargafinal);            
        }
        else {
            JOptionPane.showMessageDialog(null, "O número não representa um estado");
        }
    }
    
}
