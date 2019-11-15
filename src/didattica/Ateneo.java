package didattica;

public class Ateneo {
	static Corso corsi[]; 
	static int count; 
	String code; 
	int i; 
	Corso trovato;
	int k; 
	static Docente docenti[]; 
	static int numDocenti;
	Lezione lezioni[]; 
	int numeroLezioni;
	Esercitazione esercitazioni[];
	int numeroEsercitazioni; 
	Blocco blocchi[];
	static int numeroBlocchi; 
	Blocco bloccot[];
	Blocco blocco[];
	
	
	public Ateneo() {
	
		corsi = new Corso[1000]; 
		count = 0; 
		code = null; 
		trovato = null;  
		numDocenti = 0; 
		docenti = new Docente [500]; 
		numDocenti = 0; 
		lezioni = new Lezione [100000];
		numeroLezioni = 0; 
		esercitazioni = new Esercitazione[100000]; 
		numeroEsercitazioni = 0; 
		blocchi = new Blocco[100000]; 
		bloccot = new Blocco[100000]; 
		blocco = new Blocco[100000]; 
	}
	
	public Corso nuovoCorso(String nome, int numeroOre, int numeroSquadre, String periodo, String corsoDiLaurea) {
		
		if (count > 1000) {
			return null; 
		}
		if (count<= 9 ) {
		code = "000" + count; 
			
		}
		if (count > 9 && count <=99 ) {
			code = "00"+ count; 
		}
		if (count > 99 && count <= 999) {
			code = "0" + count; 
			
		}
		
		Corso temp = new Corso (code, nome, numeroOre, numeroSquadre, periodo, corsoDiLaurea); 
		corsi [count++]= temp ;
		return temp;
	}

	public Corso cercaCorso(String codiceCorso) { 
		for (i=0; i<count; i++) {
			if (code.equalsIgnoreCase(codiceCorso)) {
				trovato=corsi[i];
			}
			else 
				trovato = null; 
			
		}

		return trovato;
	}

	public Corso[] cercaCorsi(String daCercare) {
		
		Corso tempCorso[] = new Corso [count]; 
		
		for (k=0; k<count ; k++) {
			if( corsi [k].getNome().contains(daCercare) || corsi[k].getCorsoDiLaurea().contains(daCercare)) {
				tempCorso[k]= corsi [k]; 
				return tempCorso;
			}
			
			
		}
		
		return null;
	}
	
	public int nuovoDocente(int codice, String cognome, String nome, String ruolo) {
		Docente tempD= new Docente (codice ,cognome, nome, ruolo); 
		docenti[numDocenti] = tempD; 
		numDocenti++; 
		
		if (docenti[numDocenti-1].getCodice()==codice)
			docenti[numDocenti]= tempD; 
		
		return codice;
	}
	
	public Docente cercaDocente(int codiceDocente) {
		for (i=0; i<numDocenti; i++) {
			if(docenti[i].getCodice()== codiceDocente) {
				Docente tempDoc = docenti[i]; 
				return tempDoc; 
			}
		}
		return null;
	}
	
	public boolean assegnaDocenteCorso(String codiceCorso, int codiceDocente) {
		for (i=0; i<count ; i++ ) {
			for (k=0 ; k<numDocenti ; k++) {
				if ((corsi[i].getCodice().compareTo(codiceCorso)==0)&& (docenti[k].getCodice()==codiceDocente)){
					
					corsi[i].setCodiceDocente(codiceDocente);
					docenti[k].setCodice_corso(codiceCorso); 
				}
			}
		}
		return false;
	}
	
	public Docente titolare(String codiceCorso) {
		
		return null;
	}

	public String corsiDocente(int codiceDocente) {
		
			String corsitemp = "";
			for (i=0; i<count; i++) {
				if(corsi[i].getCodiceDocente()==codiceDocente) {
					corsitemp += corsi[i].getCodice();
				}
			}
		
		return corsitemp;
	}

	public String docentiCorso(String codiceCorso) { 
		String docentitemp = "";
		for (i=0; i<numDocenti ;i++) {
			if(docenti[i].getCodice_corso().compareTo(codiceCorso)==0) {
				docentitemp += docenti[i].getCodice_corso(); 
			}
			
		}
		return docentitemp;
	}
	
	public Lezione nuovoBlocco(String codiceCorso, int codiceDocente, String giorno, String orario) {
		Lezione ltemp = new Lezione(codiceCorso, codiceDocente, giorno, orario); 
		ltemp.setTipo("L");
		lezioni[numeroLezioni++] = ltemp; 
		lezioni[numeroBlocchi++] = ltemp; 
		
		
		return ltemp;
	}
	
	public Esercitazione nuovoBlocco(String codiceCorso, int codiceDocente, String giorno, String orario, int numeroSquadra) {
		Esercitazione etemp = new Esercitazione(codiceCorso, codiceDocente, giorno, orario, numeroSquadra); 
		etemp.setTipo("EL");
		esercitazioni[numeroEsercitazioni++] = etemp;
		blocchi[numeroBlocchi++] = etemp;
		return etemp; 
	}

	public Blocco[] blocchi() {
		for (i=0; i<numeroBlocchi; i++) {
			if(blocchi[i]!= null) {
				blocco[i]= blocchi[i];
			}
			
		}
		return blocco;
		
	}
	
	public Blocco[] blocchi(int codiceDocente) {
		for (i=0; i<numeroBlocchi; i++) {
			if((blocchi[i]!=null)&&(blocchi[i].codice_docente == codiceDocente)) {
				bloccot[i]= blocchi[i]; 
			}
		}
		return bloccot;
	}
	
	public Blocco[] blocchi(String tipo) {
		return null;
	}
	public static Corso cercaC (String codiceCorso) {
		for(int i=0; i<count; i++) {
			if(corsi[i].getCodice().toString().equals(codiceCorso)) {
				return corsi[i];
			}
			
		}
		return null; 
	}
	public static Docente cercaD(int codiceDocente) {
		for(int k=0; k<numDocenti; k++) {
			if(docenti[k].getCodice()==codiceDocente) {
				return docenti[k];
			}
		}
		return null;
	}
}


