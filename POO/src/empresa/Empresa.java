package empresa;

public class Empresa {
		 
	private String nome;
	private String cnpj;
	private String endereco;
	private String dataFundacao;
	private Double faturamento;
	
	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Cnpj: "+ cnpj);
		System.out.println("Endereço: "+ endereco);
		System.out.println("Data de Fundação: "+ dataFundacao);
		System.out.println("Faturamento: "+ faturamento);	
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public void setFaturamento(Double faturamento) {
		this.faturamento = faturamento;
	}
	
	
}
