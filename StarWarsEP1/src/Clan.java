
public class Clan {
	
	private String nome;
	private Mestre treinador;
	private String data_inicio;
	private String data_termino;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setTreinador(Mestre mestre){
		treinador = mestre;
	}
	public Mestre getTreinador() {
		return treinador;
	}
	
	public void setDataInicio(String data){
		data_inicio = data;
	}
	public String getDataInicio() {
		return data_inicio;
	}
	
	public void setDataTermino(String data){
		data_termino = data;
	}
	public String getDataTermino() {
		return data_termino;
	}
	
	
}
