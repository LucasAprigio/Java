package Principal;
import java.util.Scanner;

public class primeiro {
	public static void main(String[] args) {

		Double base, altura, area;
		Scanner leitura = new Scanner(System.in);
		
		for(Integer repete = 0; repete <= 4; repete++ ) {
					
		System.out.print("Digite a Base do triangulo: ");
		base = leitura.nextDouble();
		
		System.out.println("Digite a altura do triangulo: ");
		altura = leitura.nextDouble();
		
		area = base * altura;
		
		System.out.println("A area do triangulo é "+area+"m²");
		
		}		
	}
}
