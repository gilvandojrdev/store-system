import java.util.Scanner;

public class Store {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products prod = new Products();
        System.out.println("Boas vindas a loja");
        String input = "s";
        String input2 = "s";

        while (input.equals("s")){
            prod.cadastrarProdutos();
            prod.exibirProdutos();

            System.out.println("Deseja adicionar mais? digite (s ou n)");
            input = sc.next();

            while (input.equals("s")){
                if (input.equals("s")){
                    prod.cadastrarProdutos();
                    prod.exibirProdutos();
                    System.out.println("Deseja adicionar mais? digite (s ou n)");
                    input = sc.next();
                } else {
                    System.out.println("digite apenas (s ou n)");
                }
            }

            while (input.equals("n")){
                System.out.println("Deseja setar os preços dos produtos cadastrados digite (s ou n)");
                input = sc.next();

                if (input.equals("s")){
                    while (input.equals("s")){
                        prod.cadastrarPrecoProduto();
                        System.out.println("Deseja setar mais preços dos produtos cadastrados digite (s ou n)");
                        input = sc.next();
                    }
                    if (input.equals("n")){
                        System.out.println("Deseja ver os produtos cadastrados? digite (s ou n)");
                        input2 = sc.next();

                        if (input2.equals("s")){
                            System.out.println(prod.exibirDados()); 
                            break;
                        }

                        if (input2.equals("n")){
                            System.out.println("finalizado");
                            break;
                        }
                    }
                }
            }
        }
    }
}
