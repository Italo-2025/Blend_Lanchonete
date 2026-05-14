package blend;
import blend.controller.CadastroClientes;
import blend.controller.CadastroLoja;
import blend.controller.CadastroProdutos;
import blend.model.Clientes;
import blend.model.Lojas;
import blend.model.Produtos;
import blend.view.MenuMain;

import java.awt.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner log = new Scanner(System.in);

        CadastroClientes.clientes.add(new Clientes("Italo", "italo@gmail.com", 1234, "Rua Rio de Janeiro, 54", 1));
        CadastroLoja.lojas.add(new Lojas("Blend", "123", 1234, "BH", 1000));
        CadastroProdutos.produtos.add(new Produtos("Cachorro quente", 10, "Hamburguer Artesanal, Salsicha de pombo, maionese estragada", 1));

        do {
            MenuMain.main(log);
        }while (true);

    }
}