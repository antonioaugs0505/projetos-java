package br.com.fiap.jogo;

public class Jogador {
	
	private String nome;
	private int experiencia = 10;
	private int vida = 30;
	private boolean envenenado;
	
	public Jogador() {
		
	}
	
	public Jogador(String nome) {
		System.out.println("Jogador criado:" + nome);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public int getVida() {
		return vida;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}
	
	public void levarDano(int pontos) {
		this.vida -= pontos;
		if(this.vida <= 0) {
			System.out.println("Game Over " + nome);
			this.vida = 0;
		}
	}

	public void ganharCura(int pontos) {
		this.vida += pontos;		
	}

	public void ganharExperiencia(int pontos) {
		this.experiencia += pontos;		
	}
	
	
	public void atacar(Jogador jogador) {
		jogador.levarDano(this.experiencia);
		
		if(jogador.derrotado()) 
			this.ganharExperiencia(jogador.getExperiencia());
		
	}

	private boolean derrotado() {
		return vida == 0;
	}
	
}