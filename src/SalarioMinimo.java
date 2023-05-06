import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double salarioMinimo = 1.300;
        System.out.println("Meu salario: ");
        Double meuSalario = scanner.nextDouble();
        Double quantSalario = meuSalario / salarioMinimo;
        System.out.printf("Você ganha %.2f salários mínimos.", quantSalario);

    }
}
