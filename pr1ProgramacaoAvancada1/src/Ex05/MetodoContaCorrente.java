package Ex05;

public class MetodoContaCorrente {
		
		private Double sacar=0.0,depositar=0.0,saldo=0.0;
		private String nome;
		
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getSacar() {
			return sacar;
		}

		public void setSacar(Double sacar) {
			this.sacar = sacar;
		}

		public Double getDepositar() {
			return depositar;
		}

		public void setDepositar(Double depositar) {
			this.depositar = depositar;
		}

		public Double getSaldo() {
			return saldo;
		}

		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}
		
		public Double Depositar() {
			this.saldo = this.saldo + this.depositar;
			return depositar;
		}
		
		public Double Sacar() {
			this.saldo = this.saldo - this.sacar;
			return sacar;
		}
		
		public String exibirSaldo() {
			return "o saldo da conta é: "+this.saldo;
			
			
		}
		
}
