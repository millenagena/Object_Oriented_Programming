package lab10;

public class Cliente {
	private String nome;
	private String cpf;
	private String email;
	private String dataNascimento;
	private String sexo;
	private Integer numeroConta;
	private Boolean noticias;
	
	public Cliente(String nome, String cpf, String email, String dataNascimento, 
				   String sexo, Integer numeroConta, Boolean noticias) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.numeroConta = numeroConta;
		this.noticias = noticias;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getNumeroConta() {
		return this.numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public Boolean getNoticias() {
		return this.noticias;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", dataNascimento=" + dataNascimento
				+ ", sexo=" + sexo + ", numeroConta=" + numeroConta + "]";
	}
	
	
}
