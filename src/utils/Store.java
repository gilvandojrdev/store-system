import java.util.StringTokenizer;

public class Store {

    public String divider = "--------------------------------------";

    public enum OpcoesLoja {
        CADASTRAR(1);

        private final int OPCAO;

        OpcoesLoja(int opcao){
            this.OPCAO = opcao;
        }

        public int getOption(){
            return OPCAO;
        }
    }
    
    public String produtos(String produtos){
        StringTokenizer tokenizer = new StringTokenizer(produtos, ",");
        int tokenCount = tokenizer.countTokens();
        String[] stringArray = new String[tokenCount];

        for (int i = 0; i < tokenCount; i++) {
            stringArray[i] = tokenizer.nextToken();
        }

        System.out.println("Produtos cadastrados: ");

        for (String element : stringArray) {
            System.out.println(element);
        }
        return divider;
    }
}
