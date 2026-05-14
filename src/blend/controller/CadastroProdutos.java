package blend.controller;

import blend.model.Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProdutos {

    public static ArrayList<Produtos> produtos = new ArrayList();
    static int id_prod = 1;

    public ArrayList<Produtos> getProdutos() {
        return produtos;
    }

    public static void main(Scanner log) {
        System.out.println("Digite o nome do produto:");
        String nome = log.nextLine();
        log.nextLine();

        System.out.println("Digite o preço do produto:");
        double preco = log.nextDouble();
        log.nextLine();

        System.out.println("Informações do produto:");
        String inf = log.nextLine();

        CadastroProdutos.id_prod++;

        produtos.add(new Produtos(nome, preco, inf, CadastroProdutos.id_prod));

        System.out.println("O id do seu produto é "+CadastroProdutos.id_prod);

    }
}
