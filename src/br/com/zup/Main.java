package br.com.zup;

import java.util.Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Crie um programa para gerenciar uma lista de funcionários de uma empresa,
        // cada funcionário tem nome, telefone, email e CPF.
        // No final do programa deve ser exibida a lista de funcionários cadastrados.


        Scanner leitor = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<String, String>();

        boolean chaveFuncionarios = true;

        System.out.println( "*** Seja bem vindo ao cadastro de funcionários ***");
        int opcEscolhida = 0;
        int opcEscolhida2 = 0;

        while (chaveFuncionarios == true) {

            // Menu de opções para usuário

            System.out.println("Digite 1 para cadastro ");


            //Lendo a opção escolhida pelo usuário

            opcEscolhida = leitor.nextInt();
            leitor.nextLine();

            //Entrega Mínima: O sistema permite, via terminal,
            // inserir pelo menos 1 funcionário em uma lista e retornar o mesmo na tela.

            if (opcEscolhida == 1) {
                System.out.println("Digite o nome completo do funcionário ");
                String nome = leitor.nextLine();
                System.out.println("Digite o telefone do funcionário com código de área ");
                String telefone = leitor.nextLine();
                System.out.println("Digite o email do funcionário ");
                String email = leitor.nextLine();
                System.out.println("Digite o CPF ");
                String cpf = leitor.nextLine();
                break;
            }

                }
            }

        }










