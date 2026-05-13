package blend.model;

public class Clientes {
    int id_cliente;
    private final String nome;
    private final String email;
    private final int senha;
    private final String endereco;

    public Clientes(String nome, String email, int senha, String endereco, int id_cliente){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.id_cliente =id_cliente;
    }

    //Getter
    public String getNome() {return nome;}
    public String getEmail() {return email;}
    public int getSenha() {return senha;}
    public String getEndereco() {return endereco;}
    public int getId_cliente() {return id_cliente;}

}


