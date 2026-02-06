import java.util.Scanner;

public class Store {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products prod = new Products();
        System.out.println("Boas vindas a loja");
        String input = "s";

        while (input.equals("s")){
            prod.cadastrarProdutos();
            System.out.println("Deseja adicionar mais? digite (s ou n)");
            input = sc.next();

            if (input.equals("s")){
                prod.cadastrarProdutos();
                System.out.println("Deseja adicionar mais? digite (s ou n)");
                input = sc.next();
            } else {
                System.out.println("digite apenas (s ou n)");
            }

            if (input.equals("n")){
                System.out.println("Deseja setar os preços dos produtos cadastrados digite (s ou n)");
                input = sc.next();

                if (input.equals("s")){
                    prod.cadastrarPrecoProduto();
                    System.out.println("Deseja setar mais preços dos produtos cadastrados digite (s ou n)");
                    input = sc.next();
                }
                
                if(input.equals("n")){
                    System.out.println("Deseja ver os produtos cadastrados? digite (s ou n)");
                    input = sc.next();

                    if (input.equals("s")){
                        System.out.println(prod.exibirDados());
                        break;
                    }

                    if (input.equals("n")){
                        System.out.println("finalizado");
                        break;
                    }
                }
            }
        }
    }
}
