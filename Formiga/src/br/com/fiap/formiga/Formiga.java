package br.com.fiap.formiga;

public class Formiga {

	// [modificador] [tipo] [nome] = [valor]
	private int vel;
	private int formigaX;
	private int formigaY;
	private boolean carregandoAlimento;
	private int casaX;
	private int casaY;
	private int alimentoX;
	private int alimentoY;
	
	public Formiga(int formigaX, int formigaY) {
		this.formigaX = formigaX;
		this.formigaY = formigaY;
	}
	
	public void buscarComida() {
		andar();
		temAlimento();
	}

	private void andar() {
		int sorteio = (int) (Math.random()*4);
		if(sorteio == 0) formigaX += vel;
		if(sorteio == 1) formigaX -= vel;
		if(sorteio == 2) formigaY -= vel;
		if(sorteio == 3) formigaY += vel;
	}

	private void temAlimento() {
		if(formigaX == alimentoX && formigaY == alimentoY) {
			pegarAlimento();
		}
	}

	private void pegarAlimento() {
		carregandoAlimento = true;
	}
	
	private void deixarAlimento() {
		carregandoAlimento = false;
	}
	
	private void estaEmCasa() {
		if(emCasa()) deixarAlimento();
	}
	
	private boolean emCasa() {
		return formigaX == casaX && formigaY == casaY;
	}
	
	public void agir() {
		if(carregandoAlimento) {
			System.out.println("A formiga está carregando comida");
			return;
		}
		
		buscarComida();
		
	}
	
	
	
}