package modelo.view;
import modelo.model.*;

public class Main {

	public static void main(String[] args) {
		Gerente ger = new Gerente("Ale",10);
		// Colaborador colab = new Colaborador("Ale",1);
		
		System.out.println(ger.abrirCaixa());
		System.out.println(ger.baterPonto());
	}

}
