import javax.swing.JOptionPane;

public class Cardapio {
    public static void main(String[] args) {
        double opcao;
        double misto;
        double salada;
        double laranja;
        double manga;

        opcao = Double.parseDouble(JOptionPane.showInputDialog(
                " 1- Misto quente R$5,50\n 2- Salada Chinesa R$10,20\n 3- Suco de laranja R$4,00\n 4- Suco de manga R$3,50"));
        misto = 5.50;
        salada = 10.20;
        laranja = 4.00;
        manga = 3.50;

        if (opcao == 1) {
            JOptionPane.showMessageDialog(null, "bom apetite, vai lhe custar R$" + misto);
        } 
        else if (opcao == 2) {
            JOptionPane.showMessageDialog(null, "bom apetite, vai lhe custar R$" + salada);
        } 
        else if (opcao == 3) {
            JOptionPane.showMessageDialog(null, "tenha um excelente drink, vai lhe custar R$" + laranja);
        }
        else if (opcao == 4) {
            JOptionPane.showMessageDialog(null, "tenha um excelente drink, vai lhe custar R$" + manga);
        }
        else {
            JOptionPane.showMessageDialog(null, "Não possuimos essa opção no cardápio");
        }
    }
}
