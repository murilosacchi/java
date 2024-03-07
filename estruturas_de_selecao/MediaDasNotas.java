import javax.swing.JOptionPane;

public class MediaDasNotas {
    public static void main(String[] args) {
        double nota1;
        double nota2; 
        double media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua primeira nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua segunda nota"));
        media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10) {
            JOptionPane.showMessageDialog(null, "Parabéns, continue assim!");
        }
        else if (media >= 7 && media < 9) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
        else if (media >= 6 && media < 7) {
            JOptionPane.showMessageDialog(null, "Aprovado no limite, estude um pouco mais");
        }
        else if (media >= 2 && media < 6) {
            JOptionPane.showMessageDialog(null, "Não está reprovado mas ainda pode fazer a recuperação");
        }
        else if (media >= 0 && media < 2) {
            JOptionPane.showMessageDialog(null, "Reprovado, nos vemos no semestre que vem");
        }
        else {
            JOptionPane.showMessageDialog(null, "Nota inválida");
        }
        
    
    }    
}
