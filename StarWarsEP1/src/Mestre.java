
public class Mestre extends Jedi {
	
	private boolean imortal;
	private double campo_videncia;
	
	public void setCampoVidencia(double campo){
		campo_videncia = campo;
	}
	public double getCampoVidencia() {
		return campo_videncia;
	}
	
	public void setImortal(boolean bool){
		imortal = bool;
	}
	public boolean getImortal() {
		return imortal;
	}
}
