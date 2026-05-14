package blend.view;

import blend.controller.CadastroProdutos;

import java.util.Scanner;

public class MenuLoja {
    public static void main(Scanner log) {
        System.out.println("[1] - Cadastrar produto novo");
        System.out.println("[2] - Listar produtos existentes");
        System.out.println("[3] - Excluir produto");
        int op = log.nextInt();

        switch (op){
            case 1:
                CadastroProdutos.main(log);
                break;
        }
    }
}
