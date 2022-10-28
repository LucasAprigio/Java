package principal;
import java.util.Scanner;

public class TerceiroProjeto {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		String nome ;
		Integer idade;
		Boolean confirmacao;
		
		System.out.print("Digite o seu nome:");
		nome = leitura.nextLine();
		
		System.out.print("Digite a sua idade: ");
		idade = leitura.nextInt();
		
		System.out.println("O Seu nome é "+nome+" e sua idade é "+idade);
		confirmacao = leitura.nextBoolean();
		
		
		
			
	}
}
