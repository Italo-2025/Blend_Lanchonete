package blend.controller;

import blend.model.Lojas;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroLoja {

    public static ArrayList<Lojas> lojas = new ArrayList<>();
    static int id = 999;


    public static void Main(Scanner log) {
        System.out.println("Seja bem vindo a Blend Lanches Owner!");

        System.out.println("[1] - Cadastro\n[2] - Login");
        int op_castro = log.nextInt();

        switch (op_castro){

            case 1:
                Cadastro_loja(log);
                return;
            case 2:
                Login_loja(log);
        }
    }

    static void Cadastro_loja(Scanner log){

        System.out.println("Nome: ");
        String nome = log.nextLine();
        log.nextLine();

        System.out.println("CNPJ:");
        String cnpj = log.nextLine();

        System.out.println("Senha (4 digitos): ");
        int senha = log.nextInt();

        System.out.println("Endereço:");
        String endereco = log.nextLine();
        log.nextLine();

        CadastroLoja.id++;

        lojas.add(new Lojas(nome, cnpj, senha, endereco, CadastroLoja.id));

        System.out.println("Cadastrado com sucesso!");
        System.out.println("Seu novo ID é: "+CadastroLoja.id);
    }

    static void Login_loja(Scanner log){

        System.out.println("ID: ");
        int id_loja = log.nextInt();

        System.out.println("CNPJ (14 digitos):");
        String cnpj = log.nextLine();
        log.nextLine();

        for(Lojas i : lojas) {
            if ( id_loja == i.getId_lojas() && cnpj == i.getCnpj()){
                System.out.println("Seja bem vindo!");
                System.out.println("\nPRESSIONE 'ENTER' PARA CONTINUAR...");
                log.nextLine();
                log.nextLine();
            }
            if (cnpj != i.getCnpj()) {
                System.out.println("CNPJ incorreta");
                continue;

            }
        }
    }
}
