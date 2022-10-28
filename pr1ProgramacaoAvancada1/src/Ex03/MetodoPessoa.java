package Ex03;

public class MetodoPessoa {
		
		private String nome;
		private Integer datanascimento;
		private Double altura;
		private Integer idade;
		
	public void setNome(String pessoaNome) {
		this.nome = pessoaNome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setDataNascimento(Integer pessoaNascimento) {
		this.datanascimento = pessoaNascimento;
	}
	public Integer getDataNascimento() {
		return this.datanascimento;
	}
	
	public void setAltura(Double pessoaAltura){
		this.altura = pessoaAltura;
	}
	public Double getAltura(){
		return this.altura;
	}
	
	public void setIdade(Integer pessoaIdade){
		this.idade = pessoaIdade;
	}
	public Integer getIdade(){
		return this.idade;
	}
	
	public String exibiriPessoa() {
		idade = 2022 - datanascimento;
		
		return "Olá "+this.nome+", nascido no ano de "+this.datanascimento+" com "+this.altura+" metros de altura, com atualmente "+this.idade+" anos de idade";
	}
}
