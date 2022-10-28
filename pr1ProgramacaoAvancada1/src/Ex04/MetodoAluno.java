package Ex04;

public class MetodoAluno {
		
		private String matricula;
		private String nome;
		private Double nota1,nota2,notatrabalho,media = 0.0;
		
		public Double getNotatrabalho() {
			return notatrabalho;
		}
		public void setNotatrabalho(Double notatrabalho) {
			this.notatrabalho = notatrabalho;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Double getNota1() {
			return nota1;
		}
		public void setNota1(Double nota1) {
			this.nota1 = nota1;
		}
		public Double getNota2() {
			return nota2;
		}
		public void setNota2(Double nota2) {
			this.nota2 = nota2;
		}
		
		public void setMedia(Double media) {
			this.media = media;
		}
		public Double getMedia() {
			return media;
		}
		
		public String dadosCadastrais() {
			return "Matricula: "+this.matricula+ " Nome: "+this.nome;			
		}
		
		public String mediaAluno() {
			media = (nota1 + nota2 + notatrabalho) /3;
			
			if(media >= 7) {
				return "O aluno foi aprovado com media "+this.media;
			}else{
				return "O aluno foi reprovado com media "+this.media;
			}
		}
		
		
}
