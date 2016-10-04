package pkgRubrica;

public class MainRubrica {

	public static void main(String[] args) {
		
		Rubrica myRub = new Rubrica("Home");
		
		
		//Creo i contatti
		String nome1 = "Mario";
		String cognome1 = "Rossi";
		String tel1 = "331123456";
		
		String nome2 = "Andrea";
		String cognome2 = "Verdi";
		String tel2 = "3311233333";
		
		String nome3 = "Giorgio";
		String cognome3 = "Giallo";
		String tel3 = "33112789";
		
		
		//Aggiungo in rubrica
		myRub.aggiungiContatto(nome1, cognome1, tel1);
		myRub.aggiungiContatto(nome2, cognome2, tel2);
		myRub.aggiungiContatto(nome3, cognome3, tel3);
		
		//Uso i metodi per cercare ed eliminare
		System.out.println(myRub.cercaContatto("Giorgio", "Giallo"));
		System.out.println(myRub.cercaContatto("Andrea", "Verdi"));
		myRub.eliminaContatto("Giorgio", "Giallo");
		System.out.println(myRub.cercaContatto("Giorgio", "Giallo"));
	}

}
