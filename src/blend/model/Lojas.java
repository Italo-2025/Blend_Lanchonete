package blend.model;

public class Lojas {

        int id_lojas;
        private final String cnpj;
        private final int senha;
        private final String endereco;
        private final String nome_loja;


        public Lojas(String nome_loja, String cnpj, int senha, String endereco, int id_lojas){
            this.nome_loja = nome_loja;
            this.cnpj = cnpj;
            this.senha = senha;
            this.endereco = endereco;
            this.id_lojas =id_lojas;
        }

        //Getter
        public String getEndereco() {return endereco;}
        public int getId_lojas() {return id_lojas;}
        public String getCnpj() {return cnpj;}

    }

