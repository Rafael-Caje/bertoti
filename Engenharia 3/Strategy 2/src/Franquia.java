import java.util.Scanner;

public class Franquia {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Scanner menu = new Scanner (System.in);

        System.out.print("******* Filiais *******\n\n");
        System.out.print("|---------------------------|\n");
        System.out.print("| 1 - São José dos Campos   |\n");
        System.out.print("| 2 - São Paulo             |\n");
        System.out.print("| 3 - Rio de Janeiro        |\n");
        System.out.print("|---------------------------|\n");
        System.out.print("Digite o número da Filial: ");

        int opcao = menu.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("\nSão José dos Campos\n");

                restaurante.setComida(new Pratos());
                restaurante.comerComida();

                restaurante.setBebida(new Suco());
                restaurante.beberBebida();
                break;

            case 2:
                System.out.print("\nSão Paulo\n");

                restaurante.setComida(new Lanche());
                restaurante.comerComida();

                restaurante.setBebida(new Refrigerante());
                restaurante.beberBebida();
                break;

            case 3:
                System.out.print("\nRio de Janeiro\n");

                restaurante.setComida(new Pratos());
                restaurante.comerComida();

                restaurante.setBebida(new Cerveja());
                restaurante.beberBebida();
                break;

            default:
                System.out.print("\nOpção Inválida!");
                break;

        }
    }
}