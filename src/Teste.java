import java.util.Scanner;

    public class Teste {
        public static void main(String[] args) {
            double salarioMinimo = 788.00; // valor do salário mínimo em reais
            double salarioUsuario; // variável para armazenar o salário do usuário

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor do seu salário: ");
            salarioUsuario = sc.nextDouble(); // lê o salário do usuário

            double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo; // calcula a quantidade de salários mínimos

            System.out.printf("Você ganha %.2f salários mínimos.", quantidadeSalariosMinimos); // imprime o resultado com duas casas decimais
        }
    }


