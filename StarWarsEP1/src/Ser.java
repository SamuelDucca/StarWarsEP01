
public class Ser {
	
	private String nome;
	private String sexo;
	private String especie;
	private String data_nascimento;
	private Planeta planeta_natal;
	private double midi_chlorians = 2500; //média de midichlorians de um ser vivo comum
	
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
	
	public void setEspecie(String especie){
		this.especie = especie;
	}
	public String getEspecie() {
		return especie;
	}
	
	public void setDataNascimento(String nasc){
		data_nascimento = nasc;
	}
	public String getDataNascimento() {
		return data_nascimento;
	}
	
	public void setPlanetaNatal(Planeta plan){
		planeta_natal = plan;
	}
	public Planeta getPlanetaNatal() {
		return planeta_natal;
	}
	
	public void setMidichlorians(double midi){
		midi_chlorians = midi;
	}
	public double getMidichlorians() {
		return midi_chlorians;
	}
}
