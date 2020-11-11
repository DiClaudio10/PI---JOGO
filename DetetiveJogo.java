package br.com.projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;

public class DetetiveJogo {

	static List<String> ListaGeral = new ArrayList<>(); // global
	static Integer respostaGeral; // global

	static String nome;

	public static void main(String[] args) {

		Integer pontosDoJogo = 0;
		Integer pontosTeste = 0;
		
		String jogar = "Você entrou no jogo.";
		String creditos = " Ana Luiza \n Claudio \n Daniel \n Érico \n Júlia";
		String enredo = "";
		String sair = "Saiu do jogo.";

		String depoimentoDaTestemunha = null;
		String depoimentoDoJohn = null;

		JOptionPane.showMessageDialog(null, "Bem vindo ao Shadow Detectives"); // So aparece a mensagem

		Integer respostaGeral = Integer.parseInt(JOptionPane.showInputDialog(
				"Escreva uma das opções abaixo que deseja: \n 1- Jogar " + "\n 2- Créditos \n 3- Enredo \n 4- Sair")); // MENU

		switch (respostaGeral) {
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
		if (respostaGeral == 1) {

			nome = JOptionPane.showInputDialog("Escreva o seu nome: ");
			System.out.println("Bem vindo ao Shadow Detectives, " + nome);
			System.out.println("\n======================================\n");

			System.out.println("Instrutor: " + nome + ", vamos iniciá-lo para esse caso com um teste básico.");

			JOptionPane.showMessageDialog(null, "NIVEL FÁCIL!");
			System.out.println("");

			Integer[] alternativas = new Integer[3]; // Vetor
			alternativas[0] = 70; // Certa
			alternativas[1] = -70;
			alternativas[2] = 130;

			System.out.println("Resolva o cálculo da função abaixo: ");
			System.out.println("k(x) = 6x + 100\n" + "k(-5) = \n");
			System.out.println("Escolha uma das opções abaixo: ");
			System.out.println("0) 70");
			System.out.println("1) -70");
			System.out.println("2) 130");

			respostaGeral = Integer
					.parseInt(JOptionPane.showInputDialog("Escolha uma das opções abaixo: \n0) 70\n1)-70 \n2) 130"));

			if (Objects.equals(alternativas[respostaGeral], alternativas[0])) { // Comparar o valor 'raiz' das variaveis
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
			System.out
					.println(nome + ": Nunca estive tão nervoso(a)! Meu primeiro caso e já é algo tão grande asssim... "
							+ "Não posso falhar - Diz pensando alto. - Preciso analisar minhas pistas\n");
			System.out.println(nome + ", abre seu caderno.\n");

			System.out.println("1- Vitima encontrada na avenida Northwest\n2- Assasinado durante um caso\n"
					+ "3- Execução próximo a casa da testemunha 1.");

			JOptionPane.showMessageDialog(null,
					"1- Vitima encontrada na avenida Northwest\n2- Assasinado durante um caso\n"
							+ "3- Execução próximo a casa da testemunha 1.");
			System.out.println(nome + ", fecha o caderno. - Preciso interrogar a testemunha 1...\n");

			System.out.println("\n======================================\n");
			System.out.println("Washington, interrogação 1. \n10h30 AM");
			System.out.println("LOCAL: Casa da testemunha. \nTestemunha 1: Anne Clark");
			System.out.println(" ");
			System.out.println(depoimentoDaTestemunha);

			JOptionPane.showMessageDialog(null, "NIVEL FÁCIL!");

			alternativas[0] = 21;
			alternativas[1] = 12;
			alternativas[2] = 22; // CERTA

			System.out.println("Resolva o cálculo de função abaixo: ");
			System.out.println("f(x)= 5x - 3 \nf(5))");
			System.out.println("Escolha uma das opções abaixo: ");
			System.out.println("0) 21");
			System.out.println("1) 12");
			System.out.println("2) 22");// CERTA
			respostaGeral = Integer.parseInt(
					JOptionPane.showInputDialog("Escolha uma dentre as opções abaixo: \n0) 21\n1) 12 \n2) 22"));

			if (Objects.equals(alternativas[respostaGeral], alternativas[2])) { // Comparar o valor 'raiz' das variaveis
				System.out.println("\nResposta Correta!\n");
				System.out.println(
						"Anne: Acho que lembrei de uma coisa! Acho que vi um homem discutindo com esse outro homem que morreu."
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

			System.out.println("\nConversa entre detetive e hacker");
			JOptionPane.showMessageDialog(null,
					"Decodificando a Senha! \nDescubra as partes da senha realizando os exercicios.");

			JOptionPane.showMessageDialog(null, "QUESTÃO NIVEL MEDIO!");

			alternativas[0] = 3;
			alternativas[1] = 1; // CERTA
			alternativas[2] = 4;

			System.out.println("\nResolva a seguinte equação do 2º grau.\n" + "3x² – 7x + 4 = 0\n");
			System.out.println("Valor do Delta: ");
			System.out.println("0)3 \n1)1 \n2) 4");

			respostaGeral = Integer
					.parseInt(JOptionPane.showInputDialog("Escolha uma das opções abaixo: \n0) 3\n1) 1 \n2) 4"));

			if (Objects.equals(alternativas[respostaGeral], alternativas[1])) { // Comparar o valor 'raiz' das variaveis
				System.out.println("\nResposta Correta!\n");
				System.out.println("Numero: 12");

			} else {
				System.out.println("\nResposta Incorreta!\n");

			}

			System.out.println("\nAssinale o valor de X' e o X'', respectivamente: ");
			String a = "1, 3/3";
			String b = "1, 3/4";
			String c = "1, 4/3";// CERTA

			String resposta6 = JOptionPane
					.showInputDialog("Escolha uma das opções abaixo: \nA) 1, 3/3\nB)1, 3/4 \nC) 1, 4/3"); // Joption
																											// aceita
																											// String

			if (resposta6.equals(c)) {
				System.out.println("Numero: 27");

			} else {
				System.out.println("Conta Incorreta!");
			}

			System.out.println("Hacker: Vamos ver se vai funcionar!");

			JOptionPane.showMessageDialog(null, "Digite a senha: ");

			do {

				respostaGeral = Integer
						.parseInt(JOptionPane.showInputDialog("\n1) 1227\n2)1226 \n3) 1225 \n 4)1217\n 5)1272 "));

				switch (respostaGeral) {

				case 1:
					System.out.println("Senha Correta");
					pontosDoJogo += 30;
					break;

				case 2:
				case 3:
				case 4:
				case 5:
					System.out.println("Senha Incorreta");
					break;

				default:
					System.out.println("Senha Inválida");
				}

			} while (respostaGeral != 1);
			JOptionPane.showMessageDialog(null, "Celular Desbloqueado");

			System.out.println("\nPontuação Atual: " + pontosDoJogo);
			System.out.println("\nHacker: Conseguimos!");

			System.out.println(
					" Legal,conseguimos entrar no smartphone do suspeito!\nAgora temos algumas op��es para chegar at� ele:");
			Integer resp = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Para onde gostaria de ir?\n1-Para a casa informada pelo gps.\n2-Para o endere�o de trabalho informado pela agenda.\n3-Para a casa do 'patr�o' informada na agenda."));

			// System.out.println("olha no celular");
			Integer celular;

			do {

				celular = Integer.parseInt(JOptionPane.showInputDialog(
						"\n1) CONTATOS\n2) GALERIA \n3) MENSAGEM \n4) GMAIL \n5) MAPS \n6) INSTAGRAM \n7) BLOQUEAR"));

				switch (celular) {

				case 1:
					System.out.println(1);
					contatos();
					break;

				case 2:
					System.out.println(2);
					galeria();
					break;

				case 3:
					System.out.println(3);
					mensagem();
					break;

				case 4:
					System.out.println(4);
					gmail();
					break;

				case 5:
					System.out.println(5);
					maps();
					break;

				case 6:
					System.out.println(6);
					instagram();
					break;

				case 7:
					System.out.println(7);
					break;

				default:
					System.out.println("Senha Inválida");
				}

			} while (celular != 7);

			JOptionPane.showMessageDialog(null, "Pista encontrada!");

			// Achando o suspeito
			System.out.println("\n======================================\n");
			System.out.println("Washington, SUSPEITO  07:23 PM");
			System.out.println("LOCAL: Bar do Urso");

			System.out.println("Suspeito chega no bar e senta em uma cadeira afastada");
			System.out.println(
					"Suspeito: John, por acaso você achou algum celular ontem? - Diz colocando uma nota de 100 reais sobre o balcão");
			System.out.println("John: E por acaso como seria esse celular? - Pega a nota");
			System.out.println("Suspeito: Um Iphone 7 preto.");
			System.out.println("John: Acho que me recordo de um aparelho assim. Irei busca=lo - Diz e sai.");
			System.out.println("Suspeito fica sozinho no bar.");

			System.out.println("Pesonagem: Detetive\n");
			System.out.println(nome
					+ ": O que devo fazer? Afinal, o suspeito está sozinho... Devo ficar e ver como o suspeito se comporta ou devo ir até ele? ");
			respostaGeral = Integer.parseInt(JOptionPane.showInputDialog("1- Observar 2- Conversar"));

			if (respostaGeral == 1) {

				ListaGeral.clear();
				System.out.println("OPÇÃO OBSERVAR\n");

				JOptionPane.showMessageDialog(null, "QUESTÃO NIVEL HARD");
				System.out.println(
						"Dada a equação do segundo grau x² – 3x – 4 = 0, assinale a alternativa que apresenta, respectivamente, os valores de Δ e da soma das raízes dessa equação.");

				ListaGeral.add("Apenas 3");
				ListaGeral.add("25 e 3");
				ListaGeral.add("25 e – 2");
				ListaGeral.add(" 3 e – 2"); // Certa
				ListaGeral.add("Apenas – 2");

				System.out.println("\nQuais são as raízes reais da equação x2 – x = 6?\n");

				respostaGeral = Integer.parseInt(JOptionPane.showInputDialog(
						"Escolha uma das opções abaixo: \n0) Apenas\n1) 25 e 3 \n2) 25 e – 2 \n3) 3 e – 2 \n4)Apenas – 2 "));

				System.out.println(nome
						+ ": Acho melhor ficar. - Diz bebendo sua bebida enquanto observa a movimentação do suspeito.");
				System.out.println("Suspeito: John, ande rápido com isso! - Diz inquieto ao perceber seu olhar.");
				System.out.println("John: Está aqui! - Entrega-lhe o celular");
				System.out.println(
						"Suspeito: Obrigado - Diz pegando o celular.\nLevanta e caminha em direção a saida. Esbarra em um cliente e não percebe quando sua chave do carro cai no chão - Desculpa.");
				System.out.println(nome + ": -Percebe que a chave caiu e a pega  - Senhor! - Vai atrás do suspeito.");
				System.out.println("Encontra o suspeito no estacionamento procurando as chaves");
				System.out.println(nome + ": Acho que isso é do senhor - Entrega a chave para o suspeito");
				System.out.println("Suspeito: Obrigado");
				System.out.println(nome
						+ ": Escuta... Fiquei sabendo que você vende algumas coisas ilicitas... Estou interessado em algumas delas... - Diz e saca uma nota de 100 reais");
				System.out.println(
						"Suspeito: Tenho tudo que você quiser, mas como vou saber se você não é um tira? Encontre-me amanha as 10 horas da noite no beco ali.");
				System.out.println(nome + ": Combinado!");

			} else {
				System.out.println("OPÇÃO OBSERVAR\n");
				System.out.println(nome
						+ ": -Senta ao lado do suspeito e fica olhando o cardapio por um tempo. - Você poderia me ajudar? Estou querendo saber o que pedir, sou novo na região");
				System.out.println(
						"Suspeito: Claro - Pega o cardapio e mostra uma bebida -  Essa marguerita aqui é otima.");
				System.out.println(nome + ": Vou experimentar!");
				System.out.println(
						"John: Aqui está seu celular - Entrega o aparelho para o suspeito -  E o que o senhor vai querer? - Anota o pedido do detetive logo em seguida");
				System.out.println(nome + ": Que sorte que achou seu celular! Já perdi tantos... - Dá risada");
				System.out.println("Suspeito: Pois é - Dá risada - Foi uma sorte! - E o que te traz aqui nesse bar?");
				System.out.println(nome
						+ ": Como eu tinha falado, estou em procura de algumas coisas e soube que você as vende... Coisas ilicitas. Gostaria de compra-las.");
				System.out.println(
						"Suspeito: Tenho tudo que você quiser, mas como vou saber se você não é um policial? Encontre-me amanha as 10 horas da noite no beco ali na esquina."
								+ "- Diz enquanto bebe sua bebida - Aproveite sua margueritra - Levanta e se dirije a saída.");

				JOptionPane.showMessageDialog(null, "QUESTÃO NIVEL HARD");

				System.out.println("\nResolva a seguinte equação\n" + "f(x)= -x²  + 40x + 120\n");

				ListaGeral.clear();

				ListaGeral.add("Apenas 3");
				ListaGeral.add("25 e 3");
				ListaGeral.add("25 e – 2");
				ListaGeral.add("3 e – 2"); // Certa
				ListaGeral.add("Apenas – 2");

				System.out.println("\nQuais são as raízes reais da equação x2 – x = 6?\n");

				respostaGeral = Integer.parseInt(JOptionPane.showInputDialog(
						"Escolha uma das opções abaixo: \n0) Apenas\n1) 25 e 3 \n2) 25 e – 2 \n3) 3 e – 2 \n4)Apenas – 2 "));

				if (Objects.equals(ListaGeral.indexOf(respostaGeral), ListaGeral.indexOf(3))) {
					System.out.println("\nResposta Correta!\n");
					System.out.println("Revela alguma pista");

					pontosDoJogo += 40;

				} else {
					System.out.println("\nResposta Incorreta!\n");
					System.out.println("Suspeito não liga para o detetive");
				}
				System.out.println("Pontos atuais: " + pontosDoJogo);
			}

			System.out.println("\n======================================\n");
			System.out.println("Washington, Dia Seguinte  00:15 PM");
			System.out.println("Detetive no beco");

			System.out
					.println(nome + ": Já estou esperando a minutos e ele não aparece. - Diz com um tom de preocupação"
							+ "\nTed: - Suspeito se aproxima em uma moto acompanhado de dois homens em outras motos"
							+ "\nTed: Você veio mesmo, achei que estava blefando." + "\n" + nome
							+ ": Claro, estou interessado naquela parada."
							+ "\nTed: Cara, eu ja sei de tudo, sei que você é da polícia");

			ListaGeral.clear();

			ListaGeral.add("144m");
			ListaGeral.add("576m");
			ListaGeral.add("24m");
			ListaGeral.add("18m");
			ListaGeral.add("12m"); // certa

			System.out.println("\n\nRESOLVA ESTA EQUAÇÃO PARA CONVENCER QUE VOCÊ NÃO É UM POLICIAL PARA TED");

			JOptionPane.showMessageDialog(null, "NÍVEL DIFICIL");

			JOptionPane.showMessageDialog(null,
					"Um terreno quadrado possui área de 144 metros quadrados e apenas a sua frente ainda não está murada.");

			System.out.println(
					"Um terreno quadrado possui área de 144 metros quadrados e apenas a sua frente ainda não está murada.");

			System.out.println("\nQuantos metros de muro terão que ser feitos para isolar completamente esse terreno?"
					+ "\n1) 144m \n2) 576m \n3) 24m \n4) 18m \n5) 12m");

			respostaGeral = Integer.parseInt(JOptionPane.showInputDialog(
					"Quantos metros de muro terão que ser feitos para isolar completamente esse terreno?"
							+ "\n1) 144m \n2) 576m \n3) 24m \n4) 18m \n5) 12m"));

			if (Objects.equals(ListaGeral.indexOf(respostaGeral), ListaGeral.indexOf(5))) {
				System.out.println("\nResposta Correta!\n");
				System.out.println("Você concluiu o teste com maestria");

				pontosTeste += 30;

			} else {
				System.out.println("\nResposta Incorreta!\n");
				System.out.println("");
			}
			System.out.println("Pontos atuais: " + pontosDoJogo);

		}

		ListaGeral.clear();

		ListaGeral.add("f(x) = 1,5x + 5");
		ListaGeral.add("f(12) = 1,5.12 + 5");
		ListaGeral.add("f(12) = 18 + 5");
		ListaGeral.add("f(12) = 23"); // certa

		System.out.println(
				"Uma empresa de táxi cobra a bandeirada de R$ 5,00 e ainda o valor de R$ 1,50 para cada quilômetro rodado. Determine a lei da função correspondente ao valor cobrado "
						+ "pelos táxis dessa empresa e qual é o valor cobrado em uma corrida de 12 km."
						+ "\nComo a empresa cobra R$ 5,00 só para entrar no carro, então esse valor é fixo, ou seja, é a variável independente. "
						+ "A variável dependente é o valor de R$ 1,50 cobrado por quilômetro rodado. Sendo assim, a lei da função é f(x) = 1,5x + 5");

		JOptionPane.showMessageDialog(null, "TESTE 2");
		
		System.out.println("\n1) f(x) = 1,5x + 5 \n2)f(12) = 1,5.12 + 5 \n3)f(12) = 18 + 5 \n4)f(12) = 23");
		
		respostaGeral = Integer.parseInt(JOptionPane.showInputDialog(
				"Para a distância de 12 km, teremos:"
				+ "\n1) f(x) = 1,5x + 5 \n2)f(12) = 1,5.12 + 5 \n3)f(12) = 18 + 5 \n4)f(12) = 23"));

		if (Objects.equals(ListaGeral.indexOf(respostaGeral), ListaGeral.indexOf(4))) {
			System.out.println("\nResposta Correta!\n");
			System.out.println("Você concluiu mais um teste com maestria");

			pontosTeste += 20;

		} else {
			System.out.println("\nResposta Incorreta!\n");
			System.out.println("");
		}
		System.out.println("Pontos atuais: " + pontosDoJogo);
		
		
		if(pontosTeste < 20) {
			System.out.println("suspeito confia");
			
		}else{
			System.out.println("suspeito desconfia");

			System.out.println("Por conta do seu mal rendimento nos outros testes Ted desconfiou de você.");
			System.out.println("Realize este teste para receber a confiança de Ted");
			
			ListaGeral.clear();

			ListaGeral.add("k=2");
			ListaGeral.add("k=5");
			ListaGeral.add("k=0");
			ListaGeral.add("k=-1");
			ListaGeral.add("k=3"); // certa
			
			System.out.println("Considerando que p(x) = 2x³ – kx² + 3x – 2k, para que valores de k temos p(2) = 4?");
			
			System.out.println("\n1)k=2 \n2)k=5 \n3)k=0 \n4)k=-1 \n5)k=3");
			
			for(int i = 0; i < 5;) {
				
				respostaGeral = Integer.parseInt(JOptionPane.showInputDialog("Considerando que p(x) = 2x³ – kx² + 3x – 2k, para que valores de k temos p(2) = 4?"
						+ "\n1)k=2 \n2)k=5 \n3)k=0 \n4)k=-1 \n5)k=3"));
				
				
				if (Objects.equals(ListaGeral.indexOf(respostaGeral), ListaGeral.indexOf(5))) {
					System.out.println("\nResposta Correta!\n");
					System.out.println("Você recebeu a confiança de Ted");
	
					pontosTeste += 20;
					
					break;
				
				} else {
					System.out.println("\nResposta Incorreta!\n");
					System.out.println("");
					i++;
				}
			}
			
		}

	}

	static void contatos() {
		System.out.println("1-Jason ");
		System.out.println("2- Trevor ");
		System.out.println("3-Franklin ");
		System.out.println("4- Robert ");
		System.out.println("5- Michael ");

		System.out.println(nome + ": Será que devo ligar ou não?");
		respostaGeral = Integer.parseInt(JOptionPane.showInputDialog("1 - Ligar\n 2 - Não Ligar"));

		Integer info = Integer.parseInt(JOptionPane
				.showInputDialog("Para quem deseja ligar? \n1)Jason\n2)Trevor \n3)Franklin \n4)Robert \n5)Michael"));

		switch (info) {

		case 1:
			System.out.println("Linha ocupada.");
			break;
		case 2:
			System.out.println(
					"Trevor: Iae Ted! Você sumiu! Nem contou" + "o final que deu daquele cara que estava te seguindo!");
			respostaGeral = Integer
					.parseInt(JOptionPane.showInputDialog("E agora, devo me passar pelo assassino ou não? "
							+ "\n1 - Passar-se pelo assassino \n2 - Desligar"));

			if (respostaGeral == 1) {
				System.out
						.println(nome + ": Então cara! Tenho novidades - Dá risada - Pode me encontrar na Praça Darks");
				System.out.println("Trevor: Beleeza! Se cuida mano, percebi que você ta gripado - Desliga.");
			} else {
				System.out.println(nome + ": -Desliga a chamada.");
			}

			break;

		case 3:
			System.out.println("Linha ocupada.");
			break;
		case 4:
			System.out.println("Linha ocupada.");
			break;
		case 5:
			System.out.println("Linha ocupada.");
			break;

		default:
			System.out.println("Contato não encontrado");

		}

	}

	static void galeria() {
		System.out.println("Galeria Bloqueada");
	}

	static void mensagem() {
		System.out.println("89036-9\n" + "Seu código de verificação do e-mail é: 125638."
				+ "\nAcesse o e-mail: tedbucket76@gmail.com");
	}

	static void gmail() {
		System.out.println("atendimentomascarasduque@maskduque.com"
				+ "\nAgradecemos a sua compra, sua máscara será encaminhada para o endereço: x\nData de entrega: x");
	}

	static void maps() {
		System.out.println();
	}

	static void instagram() {
		JOptionPane.showMessageDialog(null, "Usuario: \nSenha: ");
		System.out.println(nome + ": Não consigo entrar sem essas informações.");
	}

}

// Vetor[x]
// Lista.indeOf(x)
/*
 * List <String> alternativas = new ArrayList<>(); // Vetor
 * alternativas.add("1, 1/4"); Certa
 */

//70
