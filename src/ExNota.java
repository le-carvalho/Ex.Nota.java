import java.util.Scanner;

public class ExNota {
    public static void main(String[] args) {

        int nota;

        Scanner scan = new Scanner(System.in);
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota Inválida! Digite Novamente: ");
            nota = scan.nextInt();
        }
        if (nota >= 0 && nota <= 10)
            System.out.println("Obrigada!");

    }
}