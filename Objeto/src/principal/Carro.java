package principal;

public class Carro {
	
	private String cor;
	private Integer ano;
	private String modelo;
	private String combustivel;
	
	public void definirCor(String corCarro) {
		this.cor = corCarro;
	}
	public String recuperarCor() {
		return this.cor;
	}
	//----------------------------------
	public void setAno(Integer anoCarro) {
		this.ano = anoCarro;
	}
	public Integer getAno() {
		return this.ano;
	}
	//-------------------------------------
	public void setModelo(String modeloCarro) {
		this.modelo = modeloCarro;
	}
	public String getModelo() {
		return this.modelo;
	}
	//-------------------------------------
	public void setCombustivel(String combustivelCarro) {
		this.combustivel = combustivelCarro;
	}
	public String getCombustivel() {
		return this.combustivel;
	}
}
