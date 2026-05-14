package blend.view;

import blend.model.Carrinho;
import blend.model.Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class CarrinhoCliente {

    public static ArrayList<Carrinho> carrinho = new ArrayList<>();

     static void Main(Scanner log) {
         System.out.println("--------------Carrinho-----------");
        for (Carrinho c : carrinho) {
            System.out.println(c);
        }
         System.out.println("PRESSIONE 'ENTER' PARA CONTINUAR...");
         log.nextLine();
         log.nextLine();

         MenuUsuario.Main(log);
    }
}
