package blend.view;

import blend.controller.CadastroClientes;
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

        System.out.println("\nQual deseja adicionar ao carrinho (ID):");
        int carrinho = log.nextInt();

        for (Produtos j : CadastroProdutos.produtos){
            if (carrinho == j.getId()){
                CarrinhoCliente.carrinho.add(new Carrinho(carrinho));

                System.out.println("Produto adicionado com sucesso!\n");
            }
            else{
                System.out.println("Produto não encontrado!");
                break;
            }
        }


        System.out.println("[1] - Consultar carrinho");
        System.out.println("[2] - Voltar ao mercado");
        System.out.println("[3] - Finalizar compra");

        int op = log.nextInt();

        switch (op){
            case 1:
                CarrinhoCliente.Main(log);
                break;
            case 2:
                MenuUsuario.Main(log);
                break;
            case 3:
                break;

        }
    }
}
