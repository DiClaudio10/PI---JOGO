package com.tarefa.rpg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;

public class JogoDetetive {

    public static void main(String[] args) {

        Integer pontosDoJogo = 0;

        String jogar = "Você entrou no jogo.";
        String creditos = " Ana Luiza \n Claudio \n Daniel \n Érico \n Júlia";
        String enredo = "";
        String sair = "Saiu do jogo.";

        String nome;
        String depoimentoDaTestemunha = null;
        String depoimentoDoJohn = null;
              

        JOptionPane.showMessageDialog(null, "Bem vindo ao Shadow Detectives"); // So aparece a mensagem

        Integer resposta2 = Integer.parseInt(JOptionPane.showInputDialog(
                "Escreva uma das opções abaixo que deseja: \n 1- Jogar " + "\n 2- Créditos \n 3- Enredo \n 4- Sair")); // MENU

        switch (resposta2) {
            case 1:
                System.out.println(jogar);
                System.out.println("");
                break;
                
            case 2:
                System.out.println(creditos);
                System.out.println("");
                break;
                
            case 3:
                System.out.println(enredo);
                System.out.println("");
                break;
                
            case 4:
                System.out.println(sair);
                break;

            default:
                System.out.println("\n Opção inválida.");
        }

        // Escrever o nome
        if (resposta2 == 1) {

            nome = JOptionPane.showInputDialog("Escreva o seu nome: ");
            System.out.println("Bem vindo ao Shadow Detectives, " + nome);
            System.out.println("\n======================================\n");

            System.out.println("Instrutor: " + nome + ", vamos iniciá-lo para esse caso com um teste básico.");

            JOptionPane.showMessageDialog(null, "NIVEL FÁCIL!");
            System.out.println("");

            Integer[] alternativas = new Integer[3]; // Vetor
            alternativas[0] = 70; // Certa
            alternativas[1] = -70; // Array
            alternativas[2] = 130; // Array

            System.out.println("Resolva o cálculo da função abaixo: ");
            System.out.println("k(x) = 6x + 100\n" + "k(-5) = \n");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("0) 70");
            System.out.println("1) -70");
            System.out.println("2) 130");

            Integer resposta3 = Integer
                    .parseInt(JOptionPane.showInputDialog("Escolha uma das opções abaixo: \n0) 70\n1)-70 \n2) 130"));

            if (Objects.equals(alternativas[resposta3], alternativas[0])) { // Comparar o valor 'raiz' das variaveis
                System.out.println("\nResposta Correta!\n");
                System.out.println("Instrutor: " + nome + ", você foi bem no teste! Está pronto para iniciar o caso.");
                pontosDoJogo = +20;

            } else {
                System.out.println("\nResposta Incorreta!\n");
                System.out.println("Obrigado por realizar o teste, sei que se sairá melhor em campo");
            }

            System.out.println("Sua quantidade de pontos é de: " + pontosDoJogo);
            System.out.println("\n======================================");

            System.out.println("Washington, 8h00 AM");
            System.out.println("Começo da operação");
            System.out.println(" ");
            System.out.println("Intrutor deixa você em frente a uma cafeteria.");
            System.out.println("Instrutor: A partir deste momento você estará sozinho (a)."
                    + " Ligue-nos se precisar de algo. Boa sorte! - Diz entrando em seu carro.");

            JOptionPane.showMessageDialog(null, "Ínicio do jogo");

            System.out.println("Pesonagem: Jogador");
            System.out.println(nome + ": Nunca estive tão nervoso(a)! Meu primeiro caso e já é algo tão grande asssim... "
                    + "Não posso falhar - Diz pensando alto. - Preciso analisar minhas pistas\n");
            System.out.println(nome + ", abre seu caderno.\n");

            System.out.println("1- Vitima encontrada na avenida Northwest\n2- Assasinado durante um caso\n"
                    + "3- Execução próximo a casa da testemunha 1.");

            JOptionPane.showMessageDialog(null, "1- Vitima encontrada na avenida Northwest\n2- Assasinado durante um caso\n"
                    + "3- Execução próximo a casa da testemunha 1.");
            System.out.println(nome + ", fecha o caderno. - Preciso interrogar a testemunha 1...\n");

            System.out.println("\n======================================\n");
            System.out.println("Washington, interrogação 1. \n10h30 AM");
            System.out.println("LOCAL: Casa da testemunha. \nTestemunha 1: Anne Clark");
            System.out.println(" ");
            System.out.println(depoimentoDaTestemunha);

            JOptionPane.showMessageDialog(null, "NIVEL FÁCIL!");

            alternativas[0] = 21; // Array
            alternativas[1] = 12; // Array
            alternativas[2] = 22; // Array

            System.out.println("Resolva o cálculo de função abaixo: ");
            System.out.println("f(x)= 5x - 3 \nf(5))");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("0) 21");
            System.out.println("1) 12");
            System.out.println("2) 22");//certa
            Integer resposta4 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma dentre as opções abaixo: \n0) 21\n1)12 \n2) 22"));

            if (Objects.equals(alternativas[resposta4], alternativas[2])) { //Comparar o valor 'raiz' das variaveis
                System.out.println("\nResposta Correta!\n");
                System.out.println("Anne: Acho que lembrei de uma coisa! Acho que vi um homem discutindo com esse outro homem que morreu."
                        + "Ele parecia bem alterado! Os dois brigaram quando apareceu o Senhor John, dono do bar,"
                        + " e então os dois sairam correndo em lados opostos. ");
                System.out.println("Infelizmente, só lembro disso.");

                pontosDoJogo += 20;

            } else {
                System.out.println("\nResposta Incorreta!\n");

            }

            System.out.println("Sua quantidade de pontos é: " + pontosDoJogo);
            System.out.println("\n======================================\n");
            System.out.println("Washington, interrogando a testemunha 2  11:37 AM");
            System.out.println("LOCAL: Bar do Urso \nTestemunha 2: John Grey"); 

            System.out.println(depoimentoDoJohn);
            System.out.println(" ");

            if (pontosDoJogo == 40) {

                System.out.println("celu");
                System.out.println("John da o celular");

            } else {
                System.out.println("erro");
            }

            System.out.println("\nInvestigação da cena do crime");
               
            System.out.println("\n======================================\n");
            System.out.println("Washington, visitando o hacker  03:23 PM");

            System.out.println("Conversa entre detetive e hacker");
            JOptionPane.showMessageDialog(null, "Decodificando a Senha! \nDescubra as partes da senha realizando os exercicios.");

            JOptionPane.showMessageDialog(null, "NIVEL MEDIO!");

            alternativas[0] = 3; // Array
            alternativas[1] = 1; //certa
            alternativas[2] = 4; // Array

            System.out.println("Resolva a seguinte equação do 2º grau.\n"
                    + "3x² – 7x + 4 = 0\n");
            System.out.println("Valor do Delta: ");
            System.out.println("0)3 \n1) 1 \n2) 4");

            Integer resposta5 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções abaixo: \n0) 3\n1) 1 \n2) 4"));

            if (Objects.equals(alternativas[resposta5], alternativas[1])) { //Comparar o valor 'raiz' das variaveis
                System.out.println("\nResposta Correta!\n");
                System.out.println("Numero: 12");

            } else {
                System.out.println("\nResposta Incorreta!\n");

            }

            System.out.println("Assinale o valor de X' e o X'', respectivamente: ");
            String a = "1, 3/3";
            String b = "1, 3/4";
            String c = "1, 4/3";//CERTA

            String resposta6 = JOptionPane.showInputDialog("Escolha uma das opções abaixo: \n A) 1, 3/3\nB)1, 3/4 \nC) 1, 4/3"); //Joption aceita String

            if (resposta6.equals(c)) {
                System.out.println("Numero: 27");

            } else {
                System.out.println("Conta Incorreta!");
            }

            System.out.println("Hacker: Vamos ver se vai funcionar!");    

            JOptionPane.showMessageDialog(null, "Digite a senha: ");
            
            Integer resposta;
                       
            do {
                       
                resposta = Integer.parseInt(JOptionPane.showInputDialog("\n1) 1227\n2)1226 \n3) 1225 \n 4)1217\n 5)1272 "));        
                
                switch (resposta) {

                    case 1:
                        System.out.println("Senha Correta");
                        pontosDoJogo += 30;   
                        break;

                    case 2:
                        System.out.println("Senha Incorreta");
                        break;

                    case 3:
                        System.out.println("Senha Incorreta");
                        break;

                    case 4:
                        System.out.println("Senha Incorreta");
                        break;

                    case 5:
                        System.out.println("Senha Incorreta");
                        break;

                    default:
                        System.out.println("Senha Inválida");
                }

            } while (resposta != 1);
            JOptionPane.showMessageDialog(null,"Celular Desbloqueado");
            System.out.println("\nPontuação Atual: " + pontosDoJogo);
            System.out.println("\nHacker: Conseguimos!");
        }		
    }
}


/*List <String> alternativas = new ArrayList<>(); // Vetor
            alternativas.add("1, 1/4"); Certa*/