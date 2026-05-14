package blend.model;

public class Produtos {
    String nome;
    double preco;
    String detalhes;
    int id;

    public Produtos(String nome, double preco, String detalhes, int id){
    this.nome = nome;
    this.preco = preco;
    this.detalhes = detalhes;
    this.id = id;
    }

    //Getter
    public int getId() {return id;}
    public String getNome() {return nome;}
    public double getPreco() {return preco;}
    public String getDetalhes() {return detalhes;}

    //Setter
    public void setNome (String nome) { this.nome = nome; };
    public void setPreco (double preco) { this.preco = preco; }
    public void setDetalhes (String detalhes) { this.detalhes = detalhes; }
    public void setId (int id) { this.id = id; }

    @Override
    public String toString(){
        return String.format("\u001B[1;34m"+"Nome"+"\u001B[0m"+": %-5s | "+"\u001B[1;34m"+"Preço"+"\u001B[0m"+":%.2f | "+"\u001B[1;34m"+"Detalhes"+"\u001B[0m"+":%-20s | "+"\u001B[1;34m"+"ID"+"\u001B[0m"+":%-5d",
                nome, preco, detalhes, id);
    }
}
