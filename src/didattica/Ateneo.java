package didattica;

public class Ateneo {

	public Ateneo() {
	}
	
	public Corso nuovoCorso(String nome, int numeroOre, int numeroSquadre, String periodo, String corsoDiLaurea) {
		return null;
	}

	public Corso cercaCorso(String codiceCorso) {
		return null;
	}

	public Corso[] cercaCorsi(String daCercare) {
		return null;
	}
	
	public int nuovoDocente(int codice, String cognome, String nome, String ruolo) {
		return -1;
	}
	
	public Docente cercaDocente(int codiceDocente) {
		return null;
	}
	
	public boolean assegnaDocenteCorso(String codiceCorso, int codiceDocente) {
		return false;
	}
	
	public Docente titolare(String codiceCorso) {
		return null;
	}

	public String corsiDocente(int codiceDocente) {
		return null;
	}

	public String docentiCorso(String codiceCorso) {
		return null;
	}
	
	public Lezione nuovoBlocco(String codiceCorso, int codiceDocente, String giorno, String orario) {
		return null;
	}
	
	public Esercitazione nuovoBlocco(String codiceCorso, int codiceDocente, String giorno, String orario, int numeroSquadra) {
		return null;
	}

	public Blocco[] blocchi() {
		return null;
		
	}
	
	public Blocco[] blocchi(int codiceDocente) {
		return null;
	}
	
	public Blocco[] blocchi(String tipo) {
		return null;
	}
}


