import pratica.logica.java.utils.Store;
import pratica.logica.java.utils.Test;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store prod = new Store();
        Test testCode = new Test();

        System.out.println("Boas-vindas a Store system");
        System.out.println("1 - Cadastrar um produto");
        System.out.println("Digite 'cadastrar' para iniciar:");

        String input = sc.nextLine();

        try {
            Store.OpcoesLoja opcoes = Store.OpcoesLoja.valueOf(input.toUpperCase());

            switch (opcoes) {
                case CADASTRAR: {
                    System.out.println("Digite o nome do produto: ");
                    String prodName = sc.next();
                    String registerProdName = prod.setName(prodName);

                    System.out.println("Digite o preço do produto");
                    double prodPrice = sc.nextDouble();
                    String registerProdPrice = String.valueOf(prod.setPrice(prodPrice));

                    System.out.println("Produto de nome: " + Store.getName() + " do preço " + prod.getPrice() + " armazenado. ");
                }

            }
        } catch (IllegalArgumentException e){
            System.out.println("Opção inválida");
        }

        sc.close();

    }
}
