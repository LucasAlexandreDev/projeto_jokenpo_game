package br.senai.sp.jandira.ds1t.jokenpo;

import br.senai.sp.jandira.ds1t.jokenpo.model.JokenpoSimulacao;

public class JokenpoApp {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("  --> VAMOS JOGAR JOKENPÔ <--    ");
        System.out.println("---------------------------------");


        JokenpoSimulacao jokenpo= new JokenpoSimulacao();
        jokenpo.receberDados();
    }
}
