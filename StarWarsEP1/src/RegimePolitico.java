import java.util.List;
import java.util.ArrayList;

public class RegimePolitico {
	
	private String nome;
	private String data_inicio;
	private String data_termino;
	private Planeta capital;
	private Ser chefe_estado;

	private List<Planeta>planetas_membros = new ArrayList<>();
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
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
	
	public void setCapital(Planeta plan){
		capital = plan;
	}
	public Planeta getCapital() {
		return capital;
	}
	
	public void setChefeEstado(Ser chefe){
		chefe_estado = chefe;
	}
	public Ser getChefeEstado() {
		return chefe_estado;
	}
	
	
	public void setPlanetaMembro(Planeta novo_membro) {
		planetas_membros.add(novo_membro);
	}
	
	public void MostraPlanetasMembros() {
		int n = planetas_membros.size();
		int i;
		System.out.println("Planetas membros:");
		for (i=0; i < n; i++) {
			System.out.println(i + " " + planetas_membros.get(i).getNome() + " de cor " + planetas_membros.get(i).getCor() +
					" no sistema " + planetas_membros.get(i).getSistema() + 
					" com diâmetro de " + planetas_membros.get(i).getDiametro() + " km");
		}
	}
	
	public Planeta getPlanetaMembro(int index) {
		
		try {
			return planetas_membros.get(index);
		}
		
		catch (IndexOutOfBoundsException e) {
			System.out.println("Posição inválida! Retornando primeiro membro");
			return planetas_membros.get(0);
		}
		
	}
	
	public void RemovePlanetaMembro(int index) {
		try {
			planetas_membros.remove(index);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
		}
	}
}