package br.com.ifc.pfinal;

public class Usuario {

	// Dados para o cadastro e acesso ao sistema
	private String nome;
	private String matricula;
	private String senha;
	private Pergunta pergunta;
	
	public Usuario () {
		
	}
	
	public Usuario (String nome, String matricula, String senha) {
		setNome (nome);
		setMatricula (matricula);
		setSenha (senha);		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		if (matricula == null || matricula.length()!=8) {
			System.out.println("Matrícula deve ter 8 dígitos");
		} else {
			this.matricula = matricula;
		}
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if (senha == null || senha.length()< 8 || senha.length() >32) {
			System.out.println("Senha deve estar entre 8 e 32 caracteres");
		} else {
		this.senha = senha;
		}
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

}
