
public class Padawan extends Jedi{

	private boolean constroi_sabre;
	private Jedi treinador;
	
	public void setConstroiSabre(boolean bool){
		constroi_sabre = bool;
	}
	public boolean getConstroiSabre() {
		return constroi_sabre;
	}
	
	public void setTreinador(Jedi treinador){
		this.treinador = treinador;
	}
	public Jedi getTreinador() {
		return treinador;
	}

}
