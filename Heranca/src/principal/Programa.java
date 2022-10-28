package principal;

public class Programa {
		
		public static void main(String[] args) {
			Funcionario funcionario1 = new Funcionario();
			funcionario1.setNome("Lucas");
			funcionario1.setMatricula("M755L5");
			funcionario1.setSalario(3500.0);
			
			System.out.println(funcionario1.getNome());
		}
}
