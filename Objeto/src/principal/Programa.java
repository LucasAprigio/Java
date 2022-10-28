package principal;

public class Programa {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.definirCor("Preto Fosco");
		carro1.setAno(2021);
		carro1.setModelo("Fiat-Argo");
		carro1.setCombustivel("Etanol");
		
		System.out.println("Carro 1 | cor: "+carro1.recuperarCor()+"| Ano: "+carro1.getAno()+"| Modelo: "+carro1.getModelo()+"| Combustivel: "+carro1.getCombustivel());
	}
}
