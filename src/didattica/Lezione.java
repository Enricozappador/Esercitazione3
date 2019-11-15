package didattica;

public class Lezione extends Blocco{
	String tipo; 
	public Lezione(String codice_corso, int codice_docente, String giorno, String orario ) {
		super(codice_corso, codice_docente, giorno, orario); 
		tipo= "L";
	}

	public String descriviti() {
		return super.descriviti();
	}

}
