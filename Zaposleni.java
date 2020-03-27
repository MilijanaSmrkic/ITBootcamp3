package pozoristee;

public class Zaposleni {
	/*
	 * Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i
	 * pozoristem u kojem je zaposlen. Svi podaci mogu da se dohvate. Moze da se
	 * sastavi tekstualni opis u obliku ime[naziv_pozorista].
	 */

	private String ime;
	private String pozoriste;

	public Zaposleni(String ime, String pozoriste) {
		this.ime = ime;
		this.pozoriste = pozoriste;
	}

	public String getImePrezime() {
		return ime;
	}

	public String getPozoriste() {
		return pozoriste;
	}

	public String toString() {

		return this.ime + "[" + this.pozoriste + "]";
	}

}
