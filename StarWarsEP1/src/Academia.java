
public class Academia {

	private String nome;
	private Planeta planeta;
	private String treina;
	private Conselho conselho;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPlaneta(Planeta p){
		planeta = p;
	}
	
	public Planeta getPlaneta() {
		return planeta;
	}
	
	public void setTreinamento(String treinamento){
		this.treina = treinamento;
	}
	
	public String getTreinamento() {
		return treina;
	}
	
	public void setConselho(Conselho con){
		conselho = con;
	}
	
	public Conselho getConselho() {
		return conselho;
	}

}


