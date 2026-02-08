package dev.frgilvando;

import dev.frgilvando.utils.Products;
import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Locale localBR = new Locale("pt", "BR");
        List<Products> listaProdutos = new ArrayList<>();

        Scanner sc = new Scanner(System.in).useLocale(localBR);
        NumberFormat formatador = NumberFormat.getCurrencyInstance(localBR);

        System.out.println("=== Bem-vindo à Loja ===");
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("\nDigite o nome do produto: ");
            sc.skip("\\R?");
            String nome = sc.nextLine();
            
            System.out.print("Digite o preço do produto (ex: 10,50): ");
            
            if (sc.hasNextDouble()) {
                double preco = sc.nextDouble();
                listaProdutos.add(new Products(nome, preco));
                System.out.println("Produto salvo com sucesso!");
            } else {
                System.out.println("O produto '" + nome + "' não foi adicionado.");
                sc.next();
            }

            exibirLista(listaProdutos, formatador);

            System.out.print("\nDeseja adicionar outro? (s/n): ");
            continuar = sc.next();
        }

        sc.close();
        System.out.println("\nSistema encerrado. Total de itens: " + listaProdutos.size());
    }

    private static void exibirLista(List<Products> lista, NumberFormat fmt) {
        System.out.println("\n--- Lista de Produtos Atual ---");
        if (lista.isEmpty()) {
            System.out.println("(Lista vazia)");
        } else {
            for (Products p : lista) {
                System.out.println("- " + p.getNome() + ": " + fmt.format(p.getPreco()));
            }
        }
    }
}
