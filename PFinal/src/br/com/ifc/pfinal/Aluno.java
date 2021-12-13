package br.com.ifc.pfinal;

import java.util.Scanner;

public class Aluno extends Usuario {
	private double nota=0;
	private Scanner sc;

	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}	
	public void respondePergunta () {
		Pergunta p = new Pergunta();
		System.out.println(p.getPergunta());
		sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Qual é a sua resposta a esta pergunta?");
		System.out.print("Resposta: ");
		String resposta = sc.next();
		String gabarito = p.getGabarito();
		if (gabarito.equals(resposta)){
			p.setAcertos(1);
			System.out.println("Parabéns! Você acertou!");
			this.nota = p.getAcertos();
			System.out.println("Pontuação: "+this.nota);
		} else {
			p.setErros(1);
			System.out.println("Não foi desta vez!");
			this.nota = p.getErros();
			System.out.println("Pontuação: "+this.nota);
		}
		
	}
}
