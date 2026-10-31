import java.util.Scanner;

public class Atividade05 {

    public static double somaImposto(double taxaImposto, double custo) {
        custo = custo + (custo * taxaImposto / 100);
        return custo;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a taxa de imposto (%): ");
        double taxa = entrada.nextDouble();

        System.out.print("Digite o custo do produto: ");
        double custo = entrada.nextDouble();

        double resultado = somaImposto(taxa, custo);

        System.out.println("Custo com imposto: R$ " + resultado);

    }
}
