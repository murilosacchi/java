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
            double valorHora;
            double salarioInical;
            if (categoria.contains("G")) {
                if (turno.contains("N")) {
                    valorHora = salarioMinimo * 0.18;
                    salarioInical = horasTrabalhadas * valorHora;
                } else {
                    valorHora = salarioMinimo * 0.15;
                    salarioInical = horasTrabalhadas * valorHora;
                }
            } else {
                if (turno.contains("N")) {
                    valorHora = salarioMinimo * 0.13;
                    salarioInical = horasTrabalhadas * valorHora;
                } else {
                    valorHora = salarioMinimo * 0.10;
                    salarioInical = horasTrabalhadas * valorHora;
                }

            }
            // auxilio alimentação
            double auxilioAlimentacao;
            if (salarioInical <= 300) {
                auxilioAlimentacao = salarioInical * 0.20;
            } else if (salarioInical <= 600) {
                auxilioAlimentacao = salarioInical * 0.15;
            } else {
                auxilioAlimentacao = salarioInical * 0.05;
            }

            // salario final
            double salarioFinal = salarioInical + auxilioAlimentacao;

            // saídas

            System.out.printf(
                    "O funcionário %d trabalha %d horas\nO valor da hora trabalhada é R$%.2f\nO salário inicial é R$%.2f\nO auxilio alimentação é R$%.2f\nO sálario final é R$%.2f\n\n",
                    i + 1, horasTrabalhadas, valorHora, salarioInical, auxilioAlimentacao, salarioFinal);

        }
    }
}
