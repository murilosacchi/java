import java.util.Scanner;

public class CalculoDoSalario {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        // funcionarios e salario mininmo
        System.out.println("Digite o número de funcionários: ");
        int funcionarios = leitor.nextInt();
        System.out.println("Digite o valor do salário mínimo");
        double salarioMinimo = leitor.nextDouble();

        // for para cada funcionario
        for (int i = 0; i < funcionarios; i++) {

            // numero de horas trabalhadas
            int horasTrabalhadas;
            do {
                System.out.println("Digite o número de horas trabalhadas do funcionário " + (i + 1) + ": ");
                horasTrabalhadas = leitor.nextInt();
            } while (horasTrabalhadas <= 0);

            // categoria
            String categoria;
            do {
                System.out.println("Digite a categoria: ");
                categoria = leitor.next().toUpperCase();
            } while (!"GO".contains(categoria));

            // turno
            String turno;
            do {
                System.out.println("Digite o turno: ");
                turno = leitor.next().toUpperCase();
            } while (!"MNV".contains(turno));

            // valor hora trabalhada
            if (categoria.contains("G")) {
                if (turno.contains("N")) {
                    double salario = salarioMinimo * 0.18;
                    System.out.println("O valor da hora trabalhada é R$" + salario);
                } 
                else {
                    double salario = salarioMinimo * 0.15;
                    System.out.println("O valor da hora trabalhada é R$" + salario);
                }
            }
            else {
                if (turno.contains("N")) {
                    double salario = salarioMinimo * 0.13;
                    System.out.println("O valor da hora trabalhada é R$" + salario); 
                }
                else {
                    double salario = salarioMinimo * 0.10;
                    System.out.println("O valor da hora trabalhada é R$" + salario);
                }
            }
        }
    }
}