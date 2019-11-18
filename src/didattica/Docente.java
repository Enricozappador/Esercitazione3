package didattica;

public class Docente {
	
	private int codiceDoc; 
	private String cognomeDoc; 
	private String nomeDoc; 
	private String ruoloDoc; 
	private String codice_corso;
	private int numCorso;
	private Corso assegnaCorsi[]; 
	private String cod_corso;
	
	

	public Docente(int codiceDoc, String cognomeDoc, String nomeDoc, String ruoloDoc) {
		
		this.codiceDoc = codiceDoc;
		this.cognomeDoc = cognomeDoc;
		this.nomeDoc = nomeDoc;
		this.ruoloDoc = ruoloDoc;
		numCorso = 0; 
		assegnaCorsi = new Corso[5]; 
		cod_corso = null; 
	
	}

	public int getCodice() {
		return codiceDoc;
	}

	public String getCognome() {
		return cognomeDoc;
	}

	public String getNome() {
		return nomeDoc;
	}

	public String getRuolo() {
		return ruoloDoc;
	}

	

	public String getCodice_corso() {
		return codice_corso;
	}

	public void setCodice_corso(String codice_corso) {
		this.codice_corso = codice_corso;
	}
	public String descriviti() {
		return codiceDoc+" "+cognomeDoc+" "+nomeDoc+" "+ruoloDoc;
	}
	public void assegnaCorso(Corso c) {
		if(numCorso<5) {
			assegnaCorsi[numCorso]= c; 
			numCorso ++; 
		}
	}
	public String elencoCorsi() {
		String s = " "; 
		for (int i=0; i<numCorso; i++) {
			s += assegnaCorsi[i].getCodice(); 
			if(i!=numCorso-1) {
				s += "\n"; 
			}
		}
		return s; 
	}
}
