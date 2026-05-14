package blend.view;

import blend.controller.CadastroClientes;
import blend.controller.CadastroLoja;

import java.util.Scanner;

public class MenuMain {
    public static void main(Scanner log) {
        System.out.println("\nSeja bem vindo ao Menu Inicial!");
        System.out.println("\nSelecione o tipo de login:");

        System.out.println("[1] - Cliente");
        System.out.println("[2] - Empresa");
        System.out.println("[0] - Encerrar");
        int op = log.nextInt();

        switch (op){
            case 1:
                CadastroClientes.Main(log);
                break;
            case 2:
                CadastroLoja.Main(log);
                break;
            case 0:
                System.out.println("Encerrando...");
                System.exit(0);
        }
    }
}