import java.util.Scanner;

public class Atividade06 {

    public static int converter(int hora, char[] periodo) {
        if (hora == 0) {
            periodo[0] = 'A';
            return 12;
        } else if (hora < 12) {
            periodo[0] = 'A';
            return hora;
        } else if (hora == 12) {
            periodo[0] = 'P';
            return 12;
        } else {
            periodo[0] = 'P';
            return hora - 12;
        }
    }

    public static void saida(int hora, int minuto, char periodo) {
        System.out.printf("%d:%02d %s.M.%n",
                hora, minuto, periodo);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Digite a hora (0 a 23): ");
            int hora = entrada.nextInt();

            System.out.print("Digite os minutos (0 a 59): ");
            int minuto = entrada.nextInt();

            char[] periodo = new char[1];

            int horaConvertida = converter(hora, periodo);

            saida(horaConvertida, minuto, periodo[0]);

            System.out.print("Deseja fazer outra conversao? (S/N): ");
            continuar = entrada.next().charAt(0);
        }
    }
}