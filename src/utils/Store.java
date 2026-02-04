import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Products {
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


    public Serializable cadastrarProdutos(String produtos){
        lista_produtos.add(produtos);
        return divider;
    }

    public void exibirProdutos(){
        System.out.println("Produtos adicionados: ");
        for (int i = 0; i < lista_produtos.size(); i++){
            System.out.println("["+i+"] " + lista_produtos.get(i));
        }
    }

    public String cadastrarPrecoProduto(String nome_produto, double preco_produto){

        this.produto_preco = preco_produto;
        this.nome_produto = nome_produto;

        for (Object object : lista_produtos){

            if (lista_produtos.contains(nome_produto)){
                System.out.println("Produto de nome: " + getNomeProduto() + " foi setado o preço " + getPrecoProduto());
            } else {
                System.out.println("Esse produto não existe na lista");
            }

        }
        return divider;
    }

    public String exibirDados(){
        return "Informações da loja:\n produtos cadastrados:"  + lista_produtos + ", Produto cadastrados com valores:"; // Em desenvolvimento...
    }

};
