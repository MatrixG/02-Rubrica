package pkgRubrica;

import java.util.ArrayList;
import java.util.List;

public class Rubrica {

	private String nomeRubrica;
	List<Contatto> contatti = new ArrayList<Contatto>();
	

	public Rubrica(){	
	}
	
	public Rubrica(String nomeRubrica) {
		
		this.nomeRubrica = nomeRubrica;
	}
	
	public String getNomeRubrica() {
		
		return nomeRubrica;
	}
	public void setNomeRubrica(String nomeRubrica) {
		
		this.nomeRubrica = nomeRubrica;
	}
	

	
	public boolean aggiungiContatto(String nome, String cognome, String cel){
		
		Contatto temp = new Contatto(nome, cognome, cel);
		
		return contatti.add(temp);	
	}
	
	public String cercaContatto(String nome, String cognome){
		
		for (Contatto cnt : contatti){
			if (cnt.getCognome().equals(cognome) &&
					cnt.getNome().equals(nome)){
				return (cnt.getCognome() + " " +
						cnt.getNome() + " " + 
						cnt.getTelefono());
			}
			
		}
		return null;
	}
	
	public void eliminaContatto (String nome, String cognome){
		
		int i = 0;
		
		for (Contatto cnt : contatti){
			if (cnt.getCognome().equals(cognome) &&
					cnt.getNome().equals(nome)){
				contatti.remove(i);
				return;
			}
			i++;
		}
	}
}
