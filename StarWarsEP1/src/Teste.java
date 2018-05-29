
public class Teste {

	public static void main(String[] args) {
		DuelistaSith player1 = new DuelistaSith();
		DuelistaJedi player2 = new DuelistaJedi();
		
		player1.setNome("Anakin Skywalker");
		player1.setMidichlorians(20000);
		player1.setRaiva(1);
		player1.setDominioSabre(1);
		player1.setDominioForca();
		
		player2.setNome("Obi-Wan");
		player2.setMidichlorians(13000);
		player2.setPazInterna(1);
		player2.setDominioSabre(2);
		player2.setDominioForca();
		
		Batalha mustafar = new Batalha(player2, player1);
		mustafar.lutar();

	}

}
