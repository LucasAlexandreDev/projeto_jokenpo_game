package br.senai.sp.jandira.ds1t.jokenpo.model;

import br.senai.sp.jandira.ds1t.jokenpo.JokenpoApp;

import java.util.Random;
import java.util.Scanner;

public class JokenpoSimulacao {
    String nomeAdversario;
    String condicaoVitoriaXDerrotaXEmpate;
    String opcaoUsuario;
    String opcaoComputador;
    int valorUsuario;
    int valorComputador;

    public void inicarJokenpo(){
        System.out.println("---------------------------------");
        System.out.println("  --> VAMOS JOGAR JOKENPÔ <--    ");
        System.out.println("---------------------------------");

        receberDados();
    }


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
        System.out.println("---------------------------------");


        sortearEscolhaComputador();
    }

    public void sortearEscolhaComputador(){
        Random numeroAleatrorioDeUmXTres= new Random();
        valorComputador= numeroAleatrorioDeUmXTres.nextInt(3)+1;

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
        if (valorComputador == 1){
            opcaoComputador= "PEDRA";

        } else if (valorComputador == 2) {
            opcaoComputador= "PAPEL";

        }else{
            opcaoComputador="TESOURA";
        }

        classificarJogadasJokenpo();
    }

    public void classificarJogadasJokenpo(){
        if (valorUsuario == valorComputador){
            condicaoVitoriaXDerrotaXEmpate= " --> DEU EMPATE <--";

        } else if (valorUsuario== 1 && valorComputador == 2) {
            condicaoVitoriaXDerrotaXEmpate= " --->  VOCÊ PERDEU  <---";

        } else if (valorUsuario== 1 && valorComputador == 3) {
            condicaoVitoriaXDerrotaXEmpate= " --->  VOCÊ GANHOU  <---";

        } else if (valorUsuario== 2 && valorComputador == 1 ) {
            condicaoVitoriaXDerrotaXEmpate= " --->  VOCÊ GANHOU  <---";

        } else if (valorUsuario== 2 && valorComputador== 3){
            condicaoVitoriaXDerrotaXEmpate= " --->  VOCÊ PERDEU  <---";

        } else if (valorUsuario== 3 && valorComputador== 1) {
            condicaoVitoriaXDerrotaXEmpate= " --->  VOCÊ PERDEU  <---";

        } else{
            condicaoVitoriaXDerrotaXEmpate= " --->  VOCÊ GANHOU  <---";
        }

        exibirResultadoJokenpo();
    }

    public void exibirResultadoJokenpo(){
        System.out.println("Você escolheu: " +opcaoUsuario);
        System.out.println("O(A) " +nomeAdversario+ " escolheu: " +opcaoComputador);
        System.out.println("----------------------------");
        System.out.println(condicaoVitoriaXDerrotaXEmpate);
        System.out.println("----------------------------");

        escolherjogarNovamente();
    }

    public void escolherjogarNovamente(){

        Scanner leitor= new Scanner(System.in);
        String jogarNovamente;

        System.out.println();
        System.out.print("Deseja jogar novamente? (S/N): ");
        jogarNovamente= leitor.nextLine();

        if (jogarNovamente.equals("S")){
            inicarJokenpo();
        }else{
            System.out.println();
            System.out.println("Muito obrigado por usar o meu programa");
        }
    }
}