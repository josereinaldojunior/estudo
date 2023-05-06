import java.util.Scanner;

public class LerIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite mes: ");
        int mes = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite dia :");
        int dia = scanner.nextInt();
        scanner.nextLine();
        int anoDias = ano / 365;
        int mesDias = mes / 30;
        System.out.println("Total dias :" + anoDias + mesDias + dia);
    }
}
