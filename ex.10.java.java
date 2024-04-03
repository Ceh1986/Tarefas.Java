import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaSecreta = "Java123";
        String tentativa;

        while (true) {
            System.out.println("Digite a senha:");
            tentativa = scanner.nextLine();

            if (tentativa.equals(senhaSecreta)) {
                System.out.println("Acesso concedido!");
                break;
            } else {
                System.out.println("Tentativa inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
