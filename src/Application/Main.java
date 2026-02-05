import java.util.Scanner;

public class Store {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products prod = new Products();
        System.out.println("Boas-vindas a Store system");
        String option = "s";
        String option2 = "s";

      // Novo código de cadastro de produto e preço em andamento.
      while(option.equals("s")){
          prod.cadastrarProdutos();

          System.out.println("Deseja cadastrar mais produtos? (s ou n) | digite uma opção abaixo");
          option = sc.next();

          if(option.equals("s")){
              prod.cadastrarProdutos();
              System.out.println("Deseja cadastrar mais produtos? (s ou n) | digite uma opção abaixo");
              option = sc.next();

          } else if (option.equals("n")) {
              System.out.println("Deseja setar os preço dos produtos? (s ou n) | digite uma opção abaixo");
              option2 = sc.next();
              if (option2.equals("s")){
                  prod.cadastrarPrecoProduto();
              } else if (option2.equals("n")){
                  System.out.println("Etapas concluidas deseja ver as informações de produtos? (s ou n) \n digite uma opção abaixo ");
              }
          } else {
              System.out.println("Tente novamente digite apenas (s ou n)");
          }
      }

// Código antigo lógica com problemas.        

//          else if (option.equals("n")){
//              System.out.println("Deseja setar os preço dos produtos? (s ou n) | digite uma opção abaixo");
//              option2 = sc.next();
//
//                   if(option2.equals("s")){
//                       prod.cadastrarPrecoProduto();
//                       System.out.println("Deseja setar mais preços de produtos? (s ou n) | digite uma opção abaixo");
//                       option2 = sc.next();
//                   }   else if (option2.equals("n")) {
//
//                       System.out.println("Etapas concluidas deseja ver as informações de produtos? (s ou n) \n digite uma opção abaixo ");
//                       option2 = sc.next();
//
//                           if (option2.equals("s")){
//                               prod.exibirDados();
//                           }
//                           else if (option2.equals("n")) {
//                               System.out.println("Programa finalizado");
//                               break;
//                           } else {
//                               System.out.println("Tente novamente digite apenas (s ou n)");
//                           }
//
//                           } else {
//                               System.out.println("Tente novamente digite apenas (s ou n)");
//                           }
//
//                           } else {
//                               System.out.println("Tente novamente digite apenas (s ou n)");
//                           }
//      }

      // Setar preço no produto cadastrado
//      while (option2.equals("s")){
//          prod.cadastrarPrecoProduto();
//
//          System.out.println("Deseja setar mais preços de produtos? (s ou n) | digite uma opção abaixo");
//          option2 = sc.next();
//
//          if (option2.equals("n")){
//              System.out.println("Etapas concluidas deseja ver as informações de produtos? (s ou n) \n digite uma opção abaixo ");
//              option2 = sc.next();
//
//              if(option2.equals("s")){
//                  prod.exibirDados();
//              } else if (option2.equals("n")) {
//                  System.out.println("Finalizado");
//                  break;
//              }
//
//          } else {
//              System.out.println("Digite apenas (s ou n) | digite uma opção abaixo");
//          }
//
//      }

//
//        // Logica quase pronta tenho que otimizar a o cadastro de produtos tornando em função para chamar ela novamente sem fazer código denovo.
//        while (option.equals("s")) {
//
//            prod.cadastrarProdutos();
//
//            System.out.println("Deseja cadastrar mais produtos? (s ou n) | digite uma opção abaixo");
//            option = sc.next();
//
//            if(option.equals("n")){
//                System.out.println("Deseja setar os preço dos produtos? (s ou n) | digite uma opção abaixo");
//                option2 = sc.next();
//
//                if (option2.equals("s")){
//                    System.out.println("Digite o nome do produto que você deseja setar o preço: ");
//                    String nome_produto = sc.next();
//                    System.out.println("Digite o preço do produto: " + nome_produto);
//                    double preco_produto = sc.nextDouble();
//
//                    prod.cadastrarPrecoProduto(nome_produto, preco_produto);
//
//                    System.out.println("Deseja setar mais preços de produtos? (s ou n) | digite uma opção abaixo");
//                    option2 = sc.next();
//
//                    if (option2.equals("n")){
//                        System.out.println("Etapas concluidas deseja ver as informações de produtos? (s ou n) \n digite uma opção abaixo ");
//                        option2 = sc.next();
//                        if(option2.equals("s")){
//                            prod.exibirDados();
//                        } else if (option2.equals("n")){
//                            System.out.println("Finalizado");
//                            break;
//                        }
//                        else {
//                            System.out.println("Digite apenas (s ou n) | digite uma opção abaixo");
//                            option2 = sc.next();
//                        }
//                    }
//                }
//            }
////            else if (option.equals("s")) {
////                prod.cadastrarProdutos();
////            }
//            else {
//                System.out.println("Digite apenas (s ou n) | digite uma opção abaixo");
//                option = sc.next();
//            }
//        }
    }
}
