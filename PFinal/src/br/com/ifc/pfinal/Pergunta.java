package br.com.ifc.pfinal;

public class Pergunta {
	private int acertos=0;
	private int erros=0;
	private String pergunta = " ";
	private String resposta=" ";
	private String gabarito=" ";
	
	public Pergunta () {
	}
	
	public Pergunta(int acertos, int erros, String pergunta, String resposta, String gabarito) {
		setAcertos(acertos);
		setErros(erros);
		setPergunta(pergunta, resposta, gabarito);
	}
	public int getAcertos() {
		return acertos;
	}
	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}
	public int getErros() {
		return erros;
	}
	public void setErros(int erros) {
		this.erros = erros;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta, String resposta, String gabarito) {
		this.gabarito = gabarito;
		this.resposta = resposta;
		this.pergunta = pergunta;
		if (resposta.equals(gabarito)) {
			setAcertos(1);
		} else {
			setErros(1);
		}
	}
}