package br.com.ifc.pfinal;

public class Aluno extends Usuario {
	private double nota=0;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public Pergunta respondePergunta (Pergunta pergunta) {
		return null;
	}
}
