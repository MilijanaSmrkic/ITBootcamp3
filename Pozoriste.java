package pozoristee;

public class Pozoriste {
	/*
	 * Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i
	 * naziv koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku
	 * naziv[id].
	 */
	private int id;
	private static int globalId = 0;
	private String naziv;

	public Pozoriste(String naziv) {
		this.naziv = naziv;
		this.id = globalId;
		globalId++;
	}

	public int getId() {
		return id;
	}

	public static int getGlobalId() {
		return globalId;
	}

	public String getNaziv() {
		return naziv;
	}

	public String toString() {
		return this.getNaziv() + "[" + this.getId() + "]";
	}

}
