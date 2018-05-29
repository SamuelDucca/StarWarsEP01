import java.util.concurrent.ThreadLocalRandom;

public class Batalha {
	
	private DuelistaJedi jedi;
	private DuelistaSith sith;
	
	public Batalha(DuelistaJedi jedi, DuelistaSith sith) {
		this.jedi = jedi;
		this.sith = sith;
	}
	
	public Batalha(DuelistaSith sith, DuelistaJedi jedi) {
		this.jedi = jedi;
		this.sith = sith;
	}
	
	private int getRandom(DuelistaSith sith) { //retorna um inteiro entre 0 e o numero maximo de habilidades do duelista -1
		return ThreadLocalRandom.current().nextInt(0, sith.getNumeroHabilidades());
	}
	private int getRandom(DuelistaJedi jedi) { 
		return ThreadLocalRandom.current().nextInt(0, jedi.getNumeroHabilidades());
	}
	private void ImprimeAcao(Ser duelista, Habilidade acao) {
		System.out.println(duelista.getNome() + " " + acao.Description());
	}
	
	public void lutar() {
		int i = 0, j = 0;
		String vencedor = " ";
		
		while (jedi.getVida() > 0 && sith.getVida() > 0) {
			//Gera número aleatório correspondente à habilidade a ser usada
			i = getRandom(sith);
			j = getRandom(jedi);
			
			if (jedi.getHabilidade(j).getTipo() < sith.getHabilidade(i).getTipo()) {
				//Ação do jedi tem tipo prioritário sobre a do sith. Jedi ataca primeiro
				ImprimeAcao(jedi, jedi.getHabilidade(j));
				sith.TomaDano(jedi.getHabilidade(j).DanoTotal());
				if (sith.getVida() <= 0) {
					vencedor = jedi.getNome();
					break;
				}
				else { //Sith está vivo, sua vez de atacar
					ImprimeAcao(sith, sith.getHabilidade(i));
					if (jedi.getHabilidade(j).getTipo() != 0 || jedi.getHabilidade(j).getTipo() == 0 && sith.getHabilidade(i).getTipo() == 1) {
						//jedi não se esquivou ou jedi se esquivou e sith atacou com a força. Jedi toma dano
						jedi.TomaDano(sith.getHabilidade(i).DanoTotal());
					}
					if (jedi.getVida() <= 0) {
						vencedor = sith.getNome();
						break;
					}
				}	
			} //fim if jedi ataca primeiro
			
			else { //Ação do Jedi NÃO tem tipo prioritário sobre a do Sith, mas pode ter prioridade idêntica
				
				if (jedi.getHabilidade(j).getTipo() > sith.getHabilidade(i).getTipo()) {
					//Ação do Sith tem tipo prioritário sobre a do Jedi. Sith ataca primeiro
					ImprimeAcao(sith, sith.getHabilidade(i));
					jedi.TomaDano(sith.getHabilidade(i).DanoTotal());
					if (jedi.getVida() <= 0) {
						vencedor = sith.getNome();
						break;
					}
					else { //Jedi está vivo, sua vez de atacar
						ImprimeAcao(jedi, jedi.getHabilidade(j));
						if (sith.getHabilidade(i).getTipo() != 0 || sith.getHabilidade(i).getTipo() == 0 && jedi.getHabilidade(j).getTipo() == 1) {
							//sith não se esquivou ou sith se esquivou e jedi atacou com a força. Sith toma dano.
							sith.TomaDano(jedi.getHabilidade(j).DanoTotal());
						}
						if (sith.getVida() <= 0) {
							vencedor = jedi.getNome();
							break;
						}
					}
				} //fim if sith ataca primeiro
				
				else { //Ambas as ações tem tipo idêntico, a decisão é feita pela prioridade dentro do mesmo tipo
					
					if (jedi.getHabilidade(j).getPrioridade() < sith.getHabilidade(i).getPrioridade()) {
						//Jedi tem prioridade e ataca primeiro
						ImprimeAcao(jedi, jedi.getHabilidade(j));
						sith.TomaDano(jedi.getHabilidade(j).DanoTotal());
						if (sith.getVida() <= 0) {
							vencedor = jedi.getNome();
							break;
						}
						else { //Sith está vivo, sua vez de atacar
							ImprimeAcao(sith, sith.getHabilidade(i));
							jedi.TomaDano(sith.getHabilidade(i).DanoTotal());
							if (jedi.getVida() <= 0) {
								vencedor = sith.getNome();
								break;
							}
						}	
					} //fim if jedi ataca primeiro
					
					if (jedi.getHabilidade(j).getPrioridade() > sith.getHabilidade(i).getPrioridade()) {
						//Sith tem prioridade e ataca primeiro
						ImprimeAcao(sith, sith.getHabilidade(i));
						jedi.TomaDano(sith.getHabilidade(i).DanoTotal());
						if (jedi.getVida() <= 0) {
							vencedor = sith.getNome();
							break;
						}
						else { //Jedi está vivo, sua vez de atacar
							ImprimeAcao(jedi, jedi.getHabilidade(j));
							sith.TomaDano(jedi.getHabilidade(j).DanoTotal());
							if (sith.getVida() <= 0) {
								vencedor = jedi.getNome();
								break;
							}
						}
					} //fim if sith ataca primeiro	
					
					if (jedi.getHabilidade(j).getPrioridade() == sith.getHabilidade(i).getPrioridade()) {
						//Ambos fizeram o mesmo tipo de ataque com a mesma prioridade
						//Nesse caso, é como se os ataques se anulassem e ambos estivessem em impasse
						ImprimeAcao(jedi, jedi.getHabilidade(j));
						System.out.println("ao mesmo tempo em que ");
						ImprimeAcao(sith, sith.getHabilidade(i));
						System.out.println("Ambos ficaram em um impasse!");
						
					} //fim if prioridade igual
					
				} //fim ação de tipo identico
				
			}//fim jedi não tem tipo prioritário
			
			//Todas as possibilidades de combate foram tratadas
			//Imprime status da luta
			System.out.println(jedi.getNome() + " tem " + jedi.getVida() + " de vida e " + sith.getNome() + " tem " + sith.getVida() + " de vida");
			System.out.println(",,__________,,__________,,");
			
		} //fim while combate
		System.out.println();
		System.out.println(" === O vencedor foi: " + vencedor + " ===");
		
	} //fim método luta()
	
	
}

