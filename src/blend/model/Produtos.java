package blend.model;

public class Produtos {
    String nome;
    double preco;
    int tempo_entrega;
    double frete;

    public Produtos(String nome, double preco, double frete, int tempo_entrega){
    this.nome = nome;
    this.preco = preco;
    this.tempo_entrega = tempo_entrega;
    this.frete = frete;
    }

    //Setter
    public void setNome (String nome) { this.nome = nome; };
    public void setPreco (double preco) { this.preco = preco; }
    public void setFrete (double frete) { this.frete = frete; }
    public void setTempo_entrega (int tempo_entrega) { this.tempo_entrega = tempo_entrega; }
}
