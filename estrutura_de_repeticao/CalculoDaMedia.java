import javax.swing.JOptionPane;

public class CalculoDaMedia {
    public static void main(String[] args) {
        int numeroAlunos;
        int contador;
        double nota1;
        double nota2;
        double media;

        numeroAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de alunos"));
        contador = 1;

        while (contador <= numeroAlunos) {
            contador += 1;
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova"));
            media = (nota1 + nota2) / 2;
            if (nota1 <= 10 && nota2 <= 10 && nota1 >= 0 && nota2 >= 0) {
                if (media >= 6) {
                    JOptionPane.showMessageDialog(null, "Sua média é " + media + "\nAprovado!");
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Sua média é " + media + "\nReprovado!");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Nota inválida");
            }
        }

    }

}
