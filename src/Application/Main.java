package dev.frgilvando;

import dev.frgilvando.utils.Products;
import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        List<Products> listaProdutos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Boas vindas a loja");
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")){
            System.out.print("Digite o nome do produto: ");
            String nome = sc.next();

            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            listaProdutos.add(new Products(nome, preco));

            System.out.println("\n--- Lista de Produtos ---");
            for (Products p : listaProdutos) {
                System.out.println("Produto: " + p.getNome() + " | Preço: " + formatador.format(p.getPreco()));
            }

            System.out.print("\nDeseja adicionar outro? (s/n): ");
            continuar = sc.next();
        }

        sc.close();
        System.out.println("Sistema encerrado.");
    }
}
