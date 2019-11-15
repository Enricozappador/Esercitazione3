package didattica;

public class Blocco {
	String codice_corso; 
	int codice_docente; 
	String giorno;
	String orario;
	String tipo; 
	String cognome_docente; 
	String nome_corso; 
	

	public Blocco(String codice_corso, int codice_docente, String giorno, String orario) {
		super();
		this.codice_corso = codice_corso;
		this.codice_docente = codice_docente;
		this.giorno = giorno;
		this.orario = orario;
		tipo = ""; 
	}


	public String getCodice_corso() {
		return codice_corso;
	}


	public void setCodice_corso(String codice_corso) {
		this.codice_corso = codice_corso;
	}


	public int getCodice_docente() {
		return codice_docente;
	}


	public void setCodice_docente(int codice_docente) {
		this.codice_docente = codice_docente;
	}


	public String getGiorno() {
		return giorno;
	}


	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}


	public String getOrario() {
		return orario;
	}


	public void setOrario(String orario) {
		this.orario = orario;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String descriviti() {
		return codice_corso+" "+Ateneo.cercaC(getCodice_corso()).getNome()+" "+codice_docente+" "+Ateneo.cercaD(getCodice_docente()).getCognome()+" "+tipo+" "+giorno+" "+orario;
	}
	
}
