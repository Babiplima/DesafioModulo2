package br.com.zup;

import java.util.Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Crie um programa para gerenciar uma lista de funcionários de uma empresa,
        // cada funcionário tem nome, telefone, email e CPF.
        // No final do programa deve ser exibida a lista de funcionários cadastrados.


        Scanner leitor = new Scanner(System.in);
        Scanner leitor1 = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);


        int opcao;
        String nome1 = "";
        String telefone1 = "";
        String email1 = "";
        String cpf = "";
        Map<String, String> funcionarios = new HashMap<String, String>();
        boolean chave = true;


        System.out.println("*** Seja bem vindo ao cadastro de funcionários ***");

        while (chave == true) {

            // Menu de opções para usuário

            System.out.println("Digite 1 para cadastro ");
            System.out.println("Digite 2 para exibir listas de cadastros ");
            System.out.println("Digite 3 para excluir um cadastro pelo CPF ");
            System.out.println("Digite 4 caso deseje sair do programa ");

            //Lendo a opção escolhida pelo usuário

            opcao = leitor.nextInt();

            //Entrando com dados dos funcionários

            switch (opcao) {
                case 1: {
                    System.out.println("Digite o nome completo do funcionário ");
                    nome1 = leitor1.nextLine();
                    System.out.println("Digite o telefone do funcionário com código de área ");
                    telefone1 = leitor1.nextLine();
                    System.out.println("Digite o email do funcionário ");
                    email1 = leitor1.nextLine();
                    System.out.println("Digite o CPF ");
                    cpf = leitor1.nextLine();
                    if (funcionarios.size() != 0) {
                        for (String verificarChave : funcionarios.keySet()) {
                            if (verificarChave.equals(cpf)) {
                                System.out.println("Este funcionário já esta cadastrado. ");
                            } else {
                                funcionarios.put(cpf, "Nome: " + nome1 + " Telefone: " + telefone1);
                                System.out.println("Usuário cadastrado com sucesso. ");

                            }
                        }
                    }else{
                        funcionarios.put(cpf, "Nome: " + nome1 + " Telefone: " + telefone1);
                        System.out.println("Usuário cadastrado com sucesso. ");
                    }
                }
                break;
                //Mostrar lista de funcionários

                case 2: {
                    for (String chaveFuncionarios : funcionarios.keySet()) {
                        System.out.println("Dados do funcionario " + funcionarios.get(chaveFuncionarios) + " CPF " + chaveFuncionarios);
                    }
                }
                break;

                //Excluindo cadastro

                case 3: {
                    System.out.println("Por favor, digite o cadastro a ser excluído1: ");
                    String cpfExcluido = "";
                    String cpfASerExcluido = leitor2.nextLine();
                    for (String cpfFuncionario : funcionarios.keySet()) {

                        if (cpfFuncionario.equals(cpfASerExcluido)) {

                            System.out.println("CPF excluido com sucesso. ");
                            cpfExcluido = cpfASerExcluido;
                        } else {
                            System.out.println("CPF não cadastrado");
                            break;
                        }

                    }
                }

                default: {
                    chave = false;
                }
            }
        }
    }
}







