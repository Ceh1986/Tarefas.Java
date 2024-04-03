import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = scanner.nextInt();

        int soma = 0;
        for (int i = 0, impar = 1; i < n; i++, impar += 2) {
            soma += impar;
        }

        System.out.println("A soma dos primeiros " + n + " números ímpares é " + soma);

        scanner.close();
    }
}
