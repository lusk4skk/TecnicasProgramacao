package swing.model.gestao_acad.gestao.model;

public class Professor extends Pessoa{
	public Professor (String nome, String matricula) {
		super (nome, matricula);
	}
	
	public void DarNota(Aluno aluno, Disciplina disciplina, double nota){
		aluno.ReceberNota(disciplina, nota);
	}
}
	
	
	
