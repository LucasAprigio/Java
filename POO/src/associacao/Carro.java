package associacao;

public class Carro {
	
	private String modelo;
	private String placa;
	private Integer ano;
	private Double valor;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", valor=" + valor + "]";
	}
	
	
	
	
}
