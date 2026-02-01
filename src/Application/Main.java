import java.util.Scanner;

public class Store {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products prod = new Products();

        System.out.println("Boas-vindas a Store system");
        System.out.println("1 - Cadastrar um produto");

        String option = "s";

        while (option.equals("s")) {
            System.out.println("Digite o nome do produto que deseja cadastrar: ");
            String nomeProduto = sc.next();
            String cadastrar_produtos = String.valueOf(prod.cadastrarProdutos(nomeProduto));
            System.out.println("Produto " + nomeProduto + " cadastrado com sucesso");
            System.out.println(cadastrar_produtos);

            System.out.println("Deseja cadastrar mais produtos? (s ou n)");
            option = sc.next();
        }
        sc.close();

        prod.exibirProdutos();
    }
}
