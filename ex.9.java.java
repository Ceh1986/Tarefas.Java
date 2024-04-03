import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Digite outro nome:");
        String nomePesquisa = scanner.nextLine();

        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equals(nomePesquisa)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome " + nomePesquisa + " está na lista.");
        } else {
            System.out.println("O nome " + nomePesquisa + " não está na lista.");
        }

        scanner.close();
    }
}
