package associacao;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.setModelo("Fiat Argo");
		carro1.setPlaca("CRL789");
		carro1.setAno(2021);
		carro1.setValor(65000.0);
		
		Carro carro2 = new Carro();
		
		carro2.setModelo("Gol Bolinha");
		carro2.setPlaca("C5F5G9");
		carro2.setAno(2001);
		carro2.setValor(25000.0);
		
		List<Carro> carros = new ArrayList<Carro>();
		carros.add(carro1);
		carros.add(carro2);
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Lucas");
		pessoa1.setDataNascimento("03/04/2003");
		pessoa1.setEndereco("Estrada de Colegio 122");
		pessoa1.setTelefone("(21)99968-0746");
		pessoa1.setCarros(carros);

		System.out.println(pessoa1.getCarros());
		}
}
