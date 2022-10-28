package Ex02;

public class Ex02Relogio {
	public static void main(String[] args) {
		MetodoRelogio relogio1 = new MetodoRelogio();
		
		relogio1.setData("10/09/2022");
		relogio1.setHora("03:58");
		
		System.out.println("Eu fiz essa questão no dia "+relogio1.getData()+" ás "+relogio1.getHora()+" da madrugada");
	}
}
