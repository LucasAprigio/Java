package empresa;

public class Programa {

	public static void main(String[] args) {
		Empresa minhaEmpresa = new Empresa();
		
		minhaEmpresa.setNome("Lc Corp");
		minhaEmpresa.setCnpj("38.846.454/0001-08");
		minhaEmpresa.setEndereco("Estrada do Colegio 122");
		minhaEmpresa.setDataFundacao("03/04/2003");
		minhaEmpresa.setFaturamento(250789.50);
		
		minhaEmpresa.imprimir();
	}
}
