import java.io.Serializable;
import java.util.ArrayList;

public class Products {

    private ArrayList lista_produtos = new ArrayList<>();
    private String divider = "-------------------";

    public Products(){
        this.lista_produtos = lista_produtos;
        this.divider = divider;
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
}
