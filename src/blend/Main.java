package blend;
import blend.controller.CadastroClientes;
import blend.controller.CadastroLoja;
import blend.model.Clientes;
import blend.model.Lojas;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner log = new Scanner(System.in);

        CadastroClientes.clientes.add(new Clientes("Italo", "italo@gmail.com", 1234, "Rua Rio de Janeiro, 54", 1));
        CadastroLoja.lojas.add(new Lojas("Blend", "123", 1234, "BH", 1000));

        CadastroLoja.Main(log);
    }
}
