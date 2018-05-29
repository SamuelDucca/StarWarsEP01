import java.util.ArrayList;
import java.util.List;

public class Missao {

	private Ser elaborador;
	private String data;
	private String nome;
	private String descricao;
	private Ser executor;
	private boolean sucesso;
	
	private List<Ser>seres_envolvidos = new ArrayList<>();
	private List<Planeta>planetas_envolvidos = new ArrayList<>();
	
	
	public void setDadosMissao(Ser elaborador, String data, String nome, String descricao, Ser executor ){
		this.elaborador = elaborador;
		this.data = data;
		this.nome = nome;
		this.descricao = descricao;
		this.executor = executor;
		
	}
	
	public void getDadosMissao() {
		System.out.println(nome);
		System.out.println(data);
		System.out.println(descricao);
		System.out.println("Elaborada por" + elaborador.getNome());
		if (executor instanceof Sith) {
			System.out.println("Executada por" + ((Sith) executor).getNomeSith());
		}
		else {
			System.out.println("Executada por" + executor.getNome());
		}	
	}
	
	public void setSucesso(boolean bool) {
		sucesso =  bool;
	}
	
	public boolean getSucesso() {
		return sucesso;
	}
	
	public void setSerEnvolvido(Ser novo_envolvido) {
		seres_envolvidos.add(novo_envolvido);
	}
	
	public void MostraSeresEnvolvidos() {
		int n = seres_envolvidos.size();
		int i;
		System.out.println("Seres envolvidos:");
		for (i=0; i < n; i++) {
			System.out.println(i + " " + seres_envolvidos.get(i).getNome() + " da espécie " + seres_envolvidos.get(i).getEspecie());
		}
	}
	
	public Ser getSerEnvolvido(int index) {
		
		try {
			return seres_envolvidos.get(index);
		}
		
		catch (IndexOutOfBoundsException e) {
			System.out.println("Posição inválida! Retornando primeiro membro");
			return seres_envolvidos.get(0);
		}
		
	}
	
	public void RemoveSerEnvolvido(int index) {
		try {
			seres_envolvidos.remove(index);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
		}
	}

	public void setPlanetaEnvolvido(Planeta novo_envolvido) {
		planetas_envolvidos.add(novo_envolvido);
	}
	
	public void MostraPlanetasEnvolvidos() {
		int n = planetas_envolvidos.size();
		int i;
		System.out.println("Planetas envolvidos:");
		for (i=0; i < n; i++) {
			System.out.println(i + " " + planetas_envolvidos.get(i).getNome() + " do sistema " + planetas_envolvidos.get(i).getSistema());
		}
	}
	
	public Planeta getPlanetaEnvolvido(int index) {
		
		try {
			return planetas_envolvidos.get(index);
		}
		
		catch (IndexOutOfBoundsException e) {
			System.out.println("Posição inválida! Retornando primeiro membro");
			return planetas_envolvidos.get(0);
		}
		
	}
	
	public void RemovePlanetaEnvolvido(int index) {
		try {
			planetas_envolvidos.remove(index);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
		}
	}
	
}

