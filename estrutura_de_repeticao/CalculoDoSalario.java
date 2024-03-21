import java.util.Scanner;

public class CalculoDoSalario {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        int funcionarios;
        double salarioMinimo;
        double horas;
        String categoria;
        String turno;

        System.out.println("Digite o número de funcionários: ");
        funcionarios = leitor.nextInt();
        System.out.println("Digite o valor do salário mínimo: ");
        salarioMinimo = leitor.nextDouble();

        for (int i = 1; i <= funcionarios;) {
            System.out.println("Digite quantas horas foram trabalhadas");
            horas = leitor.nextDouble();
            leitor.nextLine();
            System.out.println("Digite a categoria");
            categoria = leitor.nextLine();
            System.out.println("Digite o turno");
            turno = leitor.nextLine();

            do {
                do {
                    do {
                        if (categoria == "G") {
                            if (turno == "N") {
                                
                            }
                            else if (turno == "M" || turno == "V") {
                                
                            }                            
                        }
                    } while (turno == "N" || turno == "M" || turno == "V");
                    
                } while (categoria == "G" || categoria == "O");
            } while (horas >= 0);
            i++;
        }

    }
}
