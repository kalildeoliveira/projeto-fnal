package br.com.ifc.pfinal;

public class Pergunta {
	private int acertos=0;
	private int erros=0;
	private int numero=0;
	private String pergunta = " ";
	private String resposta=" ";
	private String gabarito=" ";
	
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

	public void setResposta(int numero, String resposta) {
		getNumero();
		if (this.resposta.equals(getGabarito()) {
			setAcertos(1);
		} else {
			setErros(1);
		}
	}

	public String getGabarito() {
		return gabarito;
	}

	public void setGabarito(String gabarito) {
		this.gabarito = gabarito;
	}
	
}