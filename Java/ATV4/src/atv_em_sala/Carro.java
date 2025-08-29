package atv_em_sala;

public class Carro {

    public String marca;
    public String modelo;
    public int ano;
    public boolean ligado = false;
    
    public void ligar() {
    	if (!ligado) {
    		System.out.println("Carro ligando...");
    		System.out.println("Carro ligado!\n");
    		ligado = true;
    	} else {
    		System.out.println("O carro já está ligado!\n");
    	}
    }
    
    public void acelerar() {
    	if (ligado) {
    		System.out.println("Carro andando...\n");
    	} else {
    		System.out.println("O carro está desligado");
    		System.out.println("Carro ligando...\n");
    		this.ligar();
    		this.acelerar();
    	}
    }

    public void desligar() {
    	if (ligado) {
    		System.out.println("Carro desligando...");
    		System.out.println("Carro desligado\n");
    		ligado = false;
    	} else {
    		System.out.println("O carro já está desligado.\n");
    	}
    	
    }
}
