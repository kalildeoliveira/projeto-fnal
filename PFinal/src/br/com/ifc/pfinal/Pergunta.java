package br.com.ifc.pfinal;

public class Pergunta {
	private int acertos=0, erros=0, numero=0;
	private String pergunta = "Qual é o seu nome?";		// a String já vem com uma pergunta
	private String resposta="A";						// padrão
	private String gabarito="A";						// padrão
	
	public Pergunta () {
	}
	
		
	public Pergunta(int acertos, int erros, int numero, String pergunta, String gabarito) {
		setAcertos(acertos);
		setErros(erros);
		setNumero(numero);
		setPergunta(pergunta);
		setGabarito(gabarito);
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
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getGabarito() {
		return gabarito;
	}

	public void setGabarito(String gabarito) {
		this.gabarito = gabarito;
	}
	
}