package br.senai.sp.jandira.ds1t.jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class JokenpoSimulacao {
    String nomeAdversario;
    String condicaoVitoriaXDerrotaXEmpate;
    String opcaoUsuario;
    String opcaoComputador;
    int valorUsuario;
    int valorComputador;

    public void receberDados(){
        Scanner leitor= new Scanner(System.in);

        System.out.print("Qual vai ser o nome do seu adversário? ");
        nomeAdversario= leitor.nextLine();
        System.out.println();

        System.out.println("Escolha uma opção abaixo:");
        System.out.println("(1) PEDRA");
        System.out.println("(2) PAPEL");
        System.out.println("(3) TESOURA");
        System.out.println();

        System.out.print("Digite o número da sua escolha: ");
        valorUsuario= leitor.nextInt();

        sortearEscolhaComputador();
    }

    public void sortearEscolhaComputador(){
        Random numeroAleatrorioDeUmXTres= new Random();
        valorComputador= numeroAleatrorioDeUmXTres.nextInt((3)+1);

        converterIntXStringUsuario();
    }

    public void converterIntXStringUsuario(){
        if (valorUsuario == 1){
            opcaoUsuario= "PEDRA";
        } else if (valorUsuario == 2) {
            opcaoUsuario= "PAPEL";
        }else{
            opcaoUsuario="TESOURA";
        }

        converterIntXStringComputador();
    }

    public void converterIntXStringComputador(){
        if (valorUsuario == 1){
            opcaoComputador= "PEDRA";
        } else if (valorUsuario == 2) {
            opcaoComputador= "PAPEL";
        }else{
            opcaoComputador="TESOURA";
        }
    }
}
