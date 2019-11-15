package didattica;

public class Esercitazione extends Blocco {
	int numeroSquadra; 
	String tipo;

	public Esercitazione(String codice_corso, int codice_docente, String giorno, String orario, int numeroSquadra) {
		super(codice_corso, codice_docente,giorno,orario);
		this.numeroSquadra = numeroSquadra;
		tipo = "EL"; 
	}
	public int getNumeroSquadra() {
		return numeroSquadra; 
	}

	public String descriviti() {
		return super.descriviti()+" "+numeroSquadra;
	}

}
