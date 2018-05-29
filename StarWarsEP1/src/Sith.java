
public class Sith extends Ser{
	
	private String nome_sith;
	private float raiva;
	private boolean telepatia;
	private boolean telecinese;
	private boolean persuasao;
	
	public void setNomeSith(String nome){
		this.nome_sith = nome;
	}
	public String getNomeSith() {
		return nome_sith;
	}
	
	public void setRaiva(float raiva){
		this.raiva = raiva;
	}
	public float getRaiva() {
		return raiva;
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
