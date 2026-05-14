package blend.view;

import blend.controller.CadastroProdutos;
import blend.model.Carrinho;
import blend.model.Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUsuario {
    public static void Main(Scanner log) {

        CadastroProdutos lista = new CadastroProdutos();
        ArrayList<Produtos> produtos = lista.getProdutos();

        System.out.println("-------Produtos disponiveis-------\n");

        for (Produtos j : CadastroProdutos.produtos){
            System.out.println(j);
        }

        System.out.println("Qual deseja adicionar ao carrinho (ID):");
        int carrinho = log.nextInt();

        for (Produtos j : CadastroProdutos.produtos){
            if (carrinho == j.getId()){
                CarrinhoCliente.carrinho.add(new Carrinho(carrinho));
            }
        }
    }
}
