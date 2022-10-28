package Ex04;
	public class Ex04Aluno {
		public static void main(String[] args) {
			MetodoAluno aluno = new MetodoAluno();
			
			aluno.setNome("Lucas");
			aluno.setMatricula("25K33");
			aluno.setNota1(5.65);
			aluno.setNota2(8.0);
			aluno.setNotatrabalho(5.0);
			
		System.out.println(aluno.dadosCadastrais());
		
		System.out.println(aluno.mediaAluno());
	}
}
