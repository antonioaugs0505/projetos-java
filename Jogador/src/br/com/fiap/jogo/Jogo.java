package br.com.fiap.jogo;

public class Jogo {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Antonio");
		Jogador jogador2 = new Jogador();
		
		System.out.println("Jogador1 " + jogador1.getNome()+ 
									"XP=" + jogador1.getExperiencia() +
									" HP=" + jogador1.getVida() +   
									" Envenenado=" + jogador1.isEnvenenado()   
									);
		
		jogador1.ganharExperiencia(20);
		jogador2.ganharExperiencia(50);
		jogador2.atacar(jogador1);
		
		System.out.println("Jogador1 " + jogador1.getNome()+ 
				"XP=" + jogador1.getExperiencia() +
				" HP=" + jogador1.getVida() +   
				" Envenenado=" + jogador1.isEnvenenado()   
				);
		
		System.out.println("Jogador2 XP" + jogador2.getExperiencia());
		
	}
	
}