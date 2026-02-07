import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Products {
    Scanner sc = new Scanner(System.in);
    private List<Object> lista_produtos = new ArrayList<>();
    private String divider = "-------------------";
    private double produto_preco;
    private String nome_produto;

    public Products(){
        this.lista_produtos = lista_produtos;
        this.divider = divider;
    }

    public List getLista(){
        return lista_produtos;
    }


    public String getNomeProduto(){
        return nome_produto;
    }

    public double getPrecoProduto(){
        return produto_preco;
    }


    public Serializable cadastrarProdutos(){
        System.out.println("Digite o nome do produto que deseja cadastrar");
        String nomeProduto = sc.next();
        lista_produtos.add(nomeProduto);
        System.out.println("Produto " + nomeProduto + " cadastrado com sucesso");
        return divider;
    }

    public void exibirProdutos(){
        System.out.println("Produtos adicionados: ");
        for (int i = 0; i < lista_produtos.size(); i++){
            System.out.println("["+i+"] " + lista_produtos.get(i));
        }
    }

    public String cadastrarPrecoProduto(){

        System.out.println("Digite o nome do produto que você deseja setar o preço");
        nome_produto = sc.next();
        System.out.println("Digite o preço do produto " + getNomeProduto());
        double preco_produto = sc.nextDouble();

        if (lista_produtos.contains(nome_produto)){
            System.out.println("Produto de nome: " + nome_produto + " foi setado o preço " + preco_produto);
        } else {
                System.out.println("Esse produto não existe na lista");
        }

        return divider;
    }

    public String exibirDados(){
        return "Informações da loja: produtos cadastrados: \n"  + nome_produto + " | " + produto_preco ; // Em desenvolvimento...
    }
};
