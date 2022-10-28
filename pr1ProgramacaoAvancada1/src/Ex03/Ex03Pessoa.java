package Ex03;

public class Ex03Pessoa {
	public static void main(String[] args) {
		MetodoPessoa pessoa1 = new MetodoPessoa();
		
		pessoa1.setNome("Lucas");
		pessoa1.setDataNascimento(2003);
		pessoa1.setAltura(1.75);
		
		System.out.println(pessoa1.exibiriPessoa());
	}
}
