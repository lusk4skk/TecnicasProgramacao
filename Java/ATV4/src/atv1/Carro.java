package atv1;

public class Carro {

    public String cor;
    public String modelo;
    public int tanque;
    public boolean ligado = false;
    public boolean andando = false;
    
    public void ligar() {
    	if (!ligado) {
    		System.out.println("Carro ligando...");
    		System.out.println("Carro ligado!\n");
    		ligado = true;
    	} else {
    		System.out.println("O carro já está ligado!\n");
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
    
    public void acelerar() {
    	if (ligado && tanque > 0) {
                System.out.println("Carro andando...\n");
                andando = true;
                tanque--;
    	} else if (!ligado && tanque > 0) {
    		System.out.println("O carro está desligado");
    		this.ligar();
    		this.acelerar();
    	} else if (ligado && tanque == 0) {
    		System.out.println("Carro sem gasolina! Finalize o programa.\n");
    	} else {
    		this.ligar();
    		System.out.println("Carro sem gasolina! Finalize o programa.\n");
    	}
    }
    
    public void frear() {
    	if (andando) {
    		System.out.println("Freando carro...");
    		System.out.println("Carro parado\n");
    	} else {
    		System.out.println("O carro já está parado.\n");
    	}
    }
    
    public void buzinar() {
    	System.out.println("Biiii! Biiii!\n");
    	if (andando && tanque > 0) { tanque--; }
    }
}
