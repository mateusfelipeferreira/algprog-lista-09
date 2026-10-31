import java.util.Scanner;

public class Atividade03 {

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        int n2 = entrada.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int n3 = entrada.nextInt();

        int resultado = somar(n1, n2, n3);

        System.out.println("A soma e: " + resultado);

    }
}