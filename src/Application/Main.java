import java.util.Scanner;

public class Store {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products prod = new Products();

        System.out.println("Boas-vindas a Store system");
        System.out.println("1 - Cadastrar um produto");

        String option = "s";
        String option2 = "s";


        // Tenho que refatorar a lógica de adicionar mais produtos...
        while (option.equals("s")) {
            System.out.println("Digite o nome do produto que deseja cadastrar: ");
            String nomeProduto = sc.next();
            String cadastrar_produtos = String.valueOf(prod.cadastrarProdutos(nomeProduto));
            System.out.println("Produto " + nomeProduto + " cadastrado com sucesso");
            System.out.println(cadastrar_produtos);

            System.out.println("Deseja cadastrar mais produtos? (s ou n)");
            option = sc.next();

            System.out.println("Deseja setar os preço dos produtos? (s ou n)");
            option2 = sc.next();
        }

        prod.exibirProdutos();

        while (option2.equals("s")){
            System.out.println("Digite o nome do produto que você deseja setar o preço: ");
            String nome_produto = sc.next();
            System.out.println("Digite o preço do produto: " + nome_produto);
            double preco_produto = sc.nextDouble();

            prod.cadastrarPrecoProduto(nome_produto, preco_produto);

            System.out.println("Deseja setar mais preços de produtos? (s ou n)");

            option2 = sc.next();

        }

        System.out.println(prod.exibirDados());

    }
}
