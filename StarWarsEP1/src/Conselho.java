import java.util.ArrayList;
import java.util.List;

public class Conselho {
	
	private String nome;
	private List<Ser>membros = new ArrayList<>();
	
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setMembro(Ser novo_membro) {
		membros.add(novo_membro);
	}
	
	public void MostraMembros() {
		int n = membros.size();
		int i;
		
		for (i=0; i < n; i++) {
			System.out.println(i + " " + membros.get(i).getNome());
		}
	}
	
	public Ser getMembro(int index) {
		
		try {
			return membros.get(index);
		}
		
		catch (IndexOutOfBoundsException e) {
			System.out.println("Posição inválida! Retornando primeiro membro");
			return membros.get(0);
		}
		
	}
	
	public void RemoveMembro(int index) {
		try {
			membros.remove(index);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
		}
	}
}

