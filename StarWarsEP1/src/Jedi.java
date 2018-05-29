
public abstract class Jedi extends Ser {
	
	private float paz_interna = 1;
	private boolean telepatia;
	private boolean telecinese;
	private boolean persuasao;
	
	public void setPazInterna(float paz){
		paz_interna = paz;
	}
	public float getPazInterna() {
		return paz_interna;
	}
	
	public void setTelepatia(boolean bool){
		telepatia = bool;
	}
	public boolean getTelepatia() {
		return telepatia;
	}
	
	public void setTelecinese(boolean bool){
		telecinese = bool;
	}
	public boolean getTelecinese() {
		return telecinese;
	}
	
	public void setPersuasao(boolean bool){
		persuasao = bool;
	}
	public boolean getPersuasao() {
		return persuasao;
	}
}
