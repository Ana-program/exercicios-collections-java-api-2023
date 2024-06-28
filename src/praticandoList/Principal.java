package praticandoList;

public class Principal {

    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Tenis Vans", 800.00, 1);
        carrinhoDeCompras.adicionarItem("Blusa Adidas", 450.00, 1);
        carrinhoDeCompras.adicionarItem("Touca Adidas", 35.00, 2);
    
        carrinhoDeCompras.removerItem("Blusa Adidas");

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();;


    
}

}
