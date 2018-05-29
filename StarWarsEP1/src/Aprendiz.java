
public class Aprendiz extends Sith{
	
	private Lorde treinador;
	private boolean constroi_sabre;
	
	public void setTreinador(Lorde lord){
		treinador = lord;
	}
	public Lorde getTreinador() {
		return treinador;
	}

	public void setConstroiSabre(boolean bool){
		constroi_sabre = bool;
	}
	
	public boolean getConstroiSabre() {
		return constroi_sabre;
	}
}
