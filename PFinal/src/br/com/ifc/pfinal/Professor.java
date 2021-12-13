package br.com.ifc.pfinal;

import java.util.Scanner;

public class Professor extends Usuario {
	public void criarPergunta() {
		String opcao, a, b, c = new String();
		Scanner sc = new Scanner(System.in);
		a = "A"; b = "B"; c = "C";
		Pergunta p = new Pergunta();
		System.out.println("Qual tipo de pergunta gostaria de fazer?\n");
		System.out.println("A - Multipla escolha");
		System.out.println("B - Falso ou Verdadeiro");
		System.out.print("Opção : ");
		opcao = sc.next();
		if (opcao.equals(a)) {
			String enunciado, letraA, letraB, letraC, enunciadoMaisAlternativa, gabarito = new String();
			System.out.print("Enunciado da pergunta: ");
			enunciado = sc.nextLine();
			System.out.print("Alternativa A: ");
			letraA = sc.nextLine();
			System.out.print("Alternativa B: ");
			letraB = sc.nextLine();
			System.out.print("Alternativa C: ");
			letraC = sc.nextLine();
			enunciadoMaisAlternativa = enunciado + "\nA -" + letraA + "\nB -" + letraB + "\nC -" + letraC;
			System.out.println(enunciadoMaisAlternativa);			
			boolean sairDoLoop = true;
			while (sairDoLoop) {
				System.out.print("Gabarito: (A, B ou C?) ");
				gabarito = sc.next();
				if (gabarito.equals(a) || gabarito.equals(b) || gabarito.equals(c)) {
					p.setPergunta(enunciadoMaisAlternativa, null, gabarito);
					sairDoLoop = false;
				} else {
					System.out.println("O gabarito deve ser apenas uma letra. Use maiúsculo!");
				}
			}
		}
		if (opcao.equals(b)) {
			String enunciado, f, v = new String();
			f= "F"; v="V"; 
			System.out.print("Enunciado da pergunta: ");
			enunciado = sc.next();
			
		}
		else {
			System.out.println("Opção inválida! Fim do Programa!");	
		}
		
	}
}
