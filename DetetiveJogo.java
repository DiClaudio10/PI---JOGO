package br.com.projeto;

import java.util.Objects;

import javax.swing.JOptionPane;

public class DetetiveJogo {

	public static void main(String[] args) {

		Integer pontosDoJogo = 0;

		String jogar = "Você entrou no jogo.";
		String creditos = " Ana Luiza \n Claudio \n Daniel \n Érico \n Julia";
		String enredo = "";
		String sair = "Saiu do jogo.";

		String nome;
		String depoimentoDaTestemunha = null;

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

			System.out.println("Instrutor: " + nome + ", vamos prepará-lo para esse caso com um teste básico.");

			JOptionPane.showMessageDialog(null, "NIVEL FÁCIL!");
			System.out.println("");

			Integer[] alternativas = new Integer[3]; // Vetor
			alternativas[0] = 70; // Array
			alternativas[1] = -70; // Array
			alternativas[2] = 130; // Array

			System.out.println("Resolva o cálculo de função abaixo: ");
			System.out.println("k(x) = 6x + 100\n" + "k(-5) = ");
			System.out.println("Escolha uma das opções abaixo: ");
			System.out.println("<0> 70"); // 70
			System.out.println("<1> -70");
			System.out.println("<2> 130");

			Integer resposta3 = Integer
					.parseInt(JOptionPane.showInputDialog("Escolha uma das opções abaixo: \n<0> 70\n<1>-70 \n<2> 130"));

			if (Objects.equals(alternativas[resposta3], alternativas[0])) { // Comparar o valor 'raiz' das variaveis
				System.out.println("\nResposta Correta!\n");
				System.out.println("Instrutor: " + nome + ", você foi bem no teste e está pronto para o caso.");
				pontosDoJogo = +20;

			} else {
				System.out.println("\nResposta Incorreta!\n");
				System.out.println("Obrigado por realizar o teste, sei que se sairá melhor em campo");
			}

			System.out.println("Sua quantidade de pontos é: " + pontosDoJogo);
			System.out.println("\n======================================");
			
			System.out.println("Washington, AM 8h00\n");
			System.out.println("Instrutor: A partir deste momento você estará sozinho, ligue-nos se  precisar de algo");
			
			JOptionPane.showMessageDialog(null, "Ínicio do jogo");
			
			System.out.println("Nunca estive tão nervoso(a) meu primeiro caso e já é algo tão grande"
					+ "preciso analisar minhas pistas\n");
			System.out.println(nome + ", abre seu caderno...\n");
			
			System.out.println("1- Morto próximo a avenida Northwest\n2- Foi morto durante um caso\n"
					+ "3- Execução próximo a casa da testemunha");
			
			JOptionPane.showMessageDialog(null, "1- Morto próximo a avenida Northwest.\n2- Foi morto durante um caso.\n"
					+ "3- Execução próximo a casa da testemunha.");
			
			System.out.println("Preciso interrogar a testemunha...\n");
			System.out.println("Washington, interrogando a testemunha: AM 10h30");
			System.out.println(depoimentoDaTestemunha);
						
		}

//		System.out.println("Academia Eyers, Washington, 2015");
//
//		System.out.println("Desconhecido: Vocês viram que o detetive Peralta foi assassinado na madrugada de hoje?");
//		System.out.println("Desconhecido 2: Meu Deus, ele era minha maior inspiração!\nEle foi encontrado em um beco "
//				+ "perto da avenida Northwest");
//		System.out.println("Instrutor: Silêncio, todos em seus devidos lugares. - Diz adentrando na sala \n "
//				+ "Tenho um cominucado muito importante a fazer! \nComo já devem saber o detetive Peralta foi assassinado"
//				+ "na madrugada de hoje, ");

		// CASO INICIADO

	}

}
