public class Store {

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

    private static String name;
    private static int quantity;
    private static double price;


    public static String getName(){
        return name;
    }

    public  String setName(String name){
        this.name = name;
        return name;
    }

    public double getPrice(){
        return price;
    }

    public double setPrice(double price){
        this.price = price;
        return price;
    }

}
