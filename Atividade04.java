import java.util.Scanner;

public class Atividade04 {

    public static char verificar(int n) {
        if (n > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = entrada.nextInt();

        char resultado = verificar(numero);

        System.out.println("Resultado: " + resultado);

   }
}
