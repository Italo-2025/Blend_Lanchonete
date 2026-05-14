package blend.view;

import blend.model.Carrinho;
import blend.model.Produtos;

import java.util.ArrayList;

public class CarrinhoCliente {

    public static ArrayList<Carrinho> carrinho = new ArrayList<>();

     static void Main() {
         System.out.println("--------------Carrinho-----------");
        for (Carrinho c : carrinho) {
            System.out.println(c);
        }
    }
}
