
public class Youngling extends Jedi {
	
	private Clan clan;
	private boolean colheu_cristais;
	
	public void setClan(Clan clan){
		this.clan = clan;
	}
	public Clan getClan() {
		return clan;
	}
	
	public void setColheuCristais(boolean bool){
		colheu_cristais = bool;
	}
	public boolean getColheuCristais() {
		return colheu_cristais;
	}
}
