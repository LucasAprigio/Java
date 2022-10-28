package Ex05;

public class Ex05ContaCorrente {
		
		public static void main(String[] args) {
			MetodoContaCorrente conta = new MetodoContaCorrente();
			
			conta.setNome("Lucas");
			conta.setSaldo(50.0);
			conta.setDepositar(30.0);
			conta.setSacar(20.0);
			
			conta.Depositar();
			conta.Sacar();
			
			System.out.println("Ola! "+conta.getNome()+ " " +conta.exibirSaldo());
		}	
}
