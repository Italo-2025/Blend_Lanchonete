package blend.controller;

import blend.model.Clientes;
import blend.view.MenuUsuario;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroClientes {

    public static ArrayList<Clientes> clientes = new ArrayList<>();
    static int id = 1;


    public static void Main(Scanner log) {
        System.out.println("Seja bem vindo a Blend Lanches!");

        System.out.println("[1] - Cadastro\n[2] - Login");
        int op_cadastro = log.nextInt();

        switch (op_cadastro){

            case 1:
                Cadastro(log);
                return;
            case 2:
                Login(log);
        }
    }

    static void Cadastro(Scanner log){

        System.out.println("Nome: ");
        String nome = log.nextLine();
        log.nextLine();

        System.out.println("Email:");
        String email = log.nextLine();

        System.out.println("Senha (4 digitos): ");
        int senha = log.nextInt();

        System.out.println("Endereço:");
        String endereco = log.nextLine();
        log.nextLine();

        CadastroClientes.id++;

        clientes.add(new Clientes(nome, email, senha, endereco, CadastroClientes.id));

        System.out.println("Cadastrado com sucesso!");
        System.out.println("Seu novo ID é: "+CadastroClientes.id);
    }

    static void Login(Scanner log){

        System.out.println("ID: ");
        int usu = log.nextInt();


        System.out.println("Senha (4 digitos):");
        int senha = log.nextInt();

        for(Clientes i : clientes) {
            if ( usu == i.getId_cliente() && senha == i.getSenha()){

                System.out.println("Seja bem vindo!");
                System.out.println("\nPRESSIONE 'ENTER' PARA CONTINUAR...");
                log.nextLine();
                log.nextLine();

                MenuUsuario.Main(log);
            }
            else{
                System.out.println("\u001B[31m"+"Usuario não encontrado!"+"\u001B[0m");
            }
            if (usu == i.getId_cliente() && senha != i.getSenha()) {
                System.out.println("Senha incorreta");
                continue;

            }
        }
    }
}
