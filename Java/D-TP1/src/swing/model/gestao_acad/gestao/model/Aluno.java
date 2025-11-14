package swing.model.gestao_acad.gestao.model;

public class Aluno extends Pessoa {

		private Disciplina[] disciplinas = new Disciplina[100];
		private double [] notas = new double [100];
		private int total = 0;
		
		public Aluno(String nome, String matricula){
			super(nome, matricula);
		}
		
		public void ReceberNota(Disciplina D, double nota) {
			disciplinas[total] = D;
			notas[total] = nota;
			total++;
		}
		
		public void MostrarHistorico() {
			System.out.print("\n Histórico de: " + getNome());
			
			if (total == 0) {
				System.out.print("\nNenhuma disciplina cadastrada.");
				return;
			}
			
			for (int i = 0; i < total; i++) {
				System.out.print("\n" + disciplinas[i].getNome() + "\nNota: " + notas[i]);
			}
		}
		
}
