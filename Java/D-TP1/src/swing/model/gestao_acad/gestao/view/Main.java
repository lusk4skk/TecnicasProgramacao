package swing.model.gestao_acad.gestao.view;
import swing.model.gestao_acad.gestao.model.*;

public class Main {

	public static void main(String[] args) {
		Professor prof = new Professor("Gugute", "Lucas");
		Aluno al = new Aluno("Raul", "555");
		Disciplina dsm = new Disciplina ("Materia");
		
		prof.DarNota(al, dsm, 0);
		al.MostrarHistorico();
	}

}
