package br.com.ifc.pfinal;

import java.io.IOException;
import java.util.Scanner;

public class Professor extends Usuario {
	private Scanner sc;
	
	public void criarPergunta() {
		String opcao, a, b, c = new String();
		sc = new Scanner(System.in);
		a = "A"; b = "B"; c = "C";
		Pergunta p = new Pergunta();
		System.out.println("#################################################");
		System.out.println("\n\n\n");
		System.out.println("    SEJA BEM-VINDO, PROFESSOR!  ");
		System.out.println("\n\n\n");
		System.out.println("#################################################");
		System.out.println("\n\n\n");
		System.out.println("Qual tipo de pergunta gostaria de fazer?\n");
		System.out.println("A - Multipla escolha");
		System.out.println("B - Falso ou Verdadeiro");
		System.out.print("Opção : ");
		opcao = sc.next();
		if (opcao.equals(a)){
			System.out.println("Qual o enunciado da pergunta?");
			System.out.print("Enunciado: ");
			String enun = sc.nextLine();
			String enunciado = sc.nextLine();
			System.out.println("Agora escreva as alternativas A, B e C");
			System.out.print("Alternativa A: ");
			String letraA = sc.nextLine();
			System.out.print("Alternatva B: ");
			String letraB = sc.nextLine();
			System.out.print("Alternativa C: ");
			String letraC = sc.nextLine();
			String concatenacao = "\n"+enunciado + "\n A - "+letraA+"\n B - "+letraB+"\n C - "+letraC;
			p.setPergunta(concatenacao);
			System.out.println("Informe o gabarito desta pergunta (\"A, B ou C\")");
			System.out.print("Gabarito: ");
			String gabarito = sc.nextLine();
			p.setGabarito(gabarito);
			System.out.println(p.getPergunta());
			System.out.println(p.getGabarito());
		}
		else if (opcao.equals(b)) {
			String f, v = new String();
			f= "F"; v="V"; 
			System.out.println("Qual o enunciado da pergunta?");
			System.out.print("Enunciado: ");
			String enun = sc.nextLine();
			System.out.println("Agora escreva as alternativas A, B e C");
			
		}
		else {
			System.out.println("\n\n\nOpção inválida! Reiniciando o programa... \n");	
			criarPergunta();
		}
		
	}
}
