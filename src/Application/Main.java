import java.util.Scanner;

public class Store {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dev.frgilvando.utils.Store prod = new dev.frgilvando.utils.Store();

        System.out.println("Boas-vindas a Store system");
        System.out.println("1 - Cadastrar um produto");
        System.out.println("Digite 'cadastrar' para iniciar:");

        String input = sc.nextLine();

        try {
            dev.frgilvando.utils.Store.OpcoesLoja opcoes = dev.frgilvando.utils.Store.OpcoesLoja.valueOf(input.toUpperCase());

            switch (opcoes) {
                case CADASTRAR: {
                    System.out.println("Digite os nomes dos produtos que deseja cadastrar por virgula exemplo 'feijão,arroz': ");
                    String prodName = sc.next();
                    String cadastrar_produtos = prod.produtos(prodName);
                    System.out.println(cadastrar_produtos);
                }

            }
        } catch (IllegalArgumentException e){
            System.out.println("Opção inválida");
        }

        sc.close();
    }
}
