package blend.model;

import blend.controller.CadastroProdutos;

public class Carrinho {
    int id_prod;
    String nome;
    double preco;
    String detalhes;

    public Carrinho(int id_prod) {
        this.id_prod = id_prod;

        // Busca o produto na lista pelo ID
        for (Produtos p : CadastroProdutos.produtos) {
            if (p.getId() == id_prod) {
                this.nome = p.getNome();
                this.preco = p.getPreco();
                this.detalhes = p.getDetalhes();
            }
        }
    }
    @Override
    public String toString(){
        return String.format("\u001B[1;34m"+"Nome\"+\"\u001B[0m\"+\": %-5s | \"+\"\u001B[1;34m\"+\"Preço\"+\"\u001B[0m\"+\":%.2f | \"+\"\u001B[1;34m\"+\"Detalhes\"+\"\u001B[0m\"+\":%-20s |",
                nome, preco, detalhes);
        }
}
