import java.util.ArrayList;
import java.util.List;

public class DuelistaSith extends Lorde{


	private double vida = 100;
	private double dominio_forca = 1;
	private float dominio_sabre = 1; //multiplicador sobre o dano do ataque de sabre
	
	private List<Habilidade>habilidades = new ArrayList<>();
	
	public DuelistaSith() {
		habilidades.add(new Esquivar());
		habilidades.add(new EmpurrarForca());
		habilidades.add(new EnforcarForca());
		habilidades.add(new InvestirSabre());
	}
	
	public int getNumeroHabilidades() {
		return habilidades.size();
	}
	
	public void setDominioSabre(float dom) {
		dominio_sabre = dom;
	}
	
	public float getDominioSabre() {
		return dominio_sabre;
	}
	
	public void setDominioForca() { // Cálculo padrão para o domínio da força, tipicamente varia entre 1 e 5
		dominio_forca = (this.getMidichlorians() * this.getRaiva())/5000;
	}
	
	public void setDominioForca(double dom) { //Set dominio arbitrário
		dominio_forca = dom;
	}
	
	public double getDominioForca() {
		return dominio_forca;
	}
	
	public void setVida(double hp) {
		vida = hp;
	}
	public void TomaDano (double dano) {
		vida -= dano;
	}
	public double getVida() {
		return vida;
	}
	//,,__________,,__________,,__________,,
	//Daqui em diante, definição das habilidades
	
	public Habilidade getHabilidade(int index) { //Metodo para pegar habilidades se o controle fosse manual
		try {
			return habilidades.get(index);
		}
		
		catch (IndexOutOfBoundsException e) {
			System.out.println("Posição inválida! Retornando primeiro membro");
			return habilidades.get(0);
		}
	}
	
	private class InvestirSabre extends Habilidade {
		static final int tipo = 2; //0 = esquivar, 1 = força, 2 = sabre
		static final int prioridade = 1;
		static final int dano_base = 20;		
		
		public int getTipo() {
			return tipo;
		}
		
		public int getPrioridade() {
			return prioridade;
		}
		
		public double DanoTotal() {
			return (dano_base *dominio_sabre);
		}
		
		public String Description() {
			return " investiu com o sabre de luz ";
		}
		
	}
	
	private class EmpurrarForca extends Habilidade {
		static final int tipo = 1; //0 = esquivar, 1 = força, 2 = sabre
		static final int prioridade = 1;
		static final int dano_base = 5;		
		
		public int getTipo() {
			return tipo;
		}
		
		public int getPrioridade() {
			return prioridade;
		}
		
		public double DanoTotal() {
			return (dano_base *dominio_forca);
		}
		
		public String Description() {
			return " empurrou com a força ";
		}
		
	}
	
	private class EnforcarForca extends Habilidade {
		static final int tipo = 1; //0 = esquivar, 1 = força, 2 = sabre
		static final int prioridade = 2;
		static final int dano_base = 10;		
		
		public int getTipo() {
			return tipo;
		}
		
		public int getPrioridade() {
			return prioridade;
		}
		
		public double DanoTotal() {
			return (dano_base *dominio_forca);
		}
		
		public String Description() {
			return " enforcou o oponente com a força ";
		}
		
	}
	
	private class Esquivar extends Habilidade {
		static final int tipo = 0; //0 = esquivar, 1 = força, 2 = sabre
		static final int prioridade = 0;
		static final int dano_base = 0;		
		
		public int getTipo() {
			return tipo;
		}
		
		public int getPrioridade() {
			return prioridade;
		}
		
		public double DanoTotal() {
			return (dano_base);
		}
		
		public String Description() {
			return " se esquivou ";
		}
		
	}
}
