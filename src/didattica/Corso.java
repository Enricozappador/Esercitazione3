package didattica;

public class Corso {
	
	//creo le parti base 
	
	private String codice; 
	private String nome; 
	private int numeroOre; 
	private int numeroSquadre; 
	private String periodo;
	private String corsoDiLaurea;
	int codice_docente; 
	private Docente docenti[];
	
// returno le parti (ho già i getter e non mi servono setter) 
	
	

	public String getCodice() {
		return codice;
	}

	public Corso(String codice, String nome, int numeroOre, int numeroSquadre, String periodo, String corsoDiLaurea) {
	this.codice = codice;
	this.nome = nome;
	this.numeroOre = numeroOre;
	this.numeroSquadre = numeroSquadre;
	this.periodo = periodo;
	this.corsoDiLaurea = corsoDiLaurea;
	codice_docente= 0; 
	docenti = new Docente [5];
}

	public String getNome() {
		return nome;
	}

	public int getNumeroOre() {
		return numeroOre;
	}

	public int getNumeroSquadre() {
		return numeroSquadre;
	}

	public String getPeriodo() {
		return periodo;
	}

	public String getCorsoDiLaurea() {
		return corsoDiLaurea;
	}

	public String descriviti() {
		return codice+" "+nome+" "+numeroOre+" "+numeroSquadre+" "+periodo+" "+corsoDiLaurea;
	}

	public void setCodiceDocente(int codiceDocente) {
		this.codice_docente= codiceDocente; 
		
	}

	public int getCodiceDocente() {
		// TODO Auto-generated method stub
		return codice_docente;
	}

	public Docente titolare() {
		// TODO Auto-generated method stub
		return docenti[0];
	}

}
