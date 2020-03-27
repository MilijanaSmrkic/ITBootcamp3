package pozoristee;

import java.util.ArrayList;

public class Predstava {
	/*
	 * * Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi
	 * zaposlene koji ucestvuju u realizaciji predstave. Zaposleni za realizaciju
	 * predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na
	 * predstavi. Sastavlja se tekstualni opis predstave navodeci naziv predstave i
	 * naziv pozorista u kojem se predstava odrzava razdvojene zarezom, a potom
	 * zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u
	 * zasebnom redu).
	 */
	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni;

	public Predstava(String naziv, Pozoriste pozoriste) {
		super();
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		zaposleni = new ArrayList<Zaposleni>();
	}

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public void dodajZaposlenog(Zaposleni z) {
		zaposleni.add(z);
	}

	public void udaljiZaposlenog(int i) {
		zaposleni.remove(i);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.getNaziv());
		sb.append(",").append(this.getPozoriste() + "\n");
		for (int i = 0; i < zaposleni.size(); i++) {
			if (zaposleni.get(i) != null)
				sb.append(zaposleni.get(i) + "\n");
		}
		return sb.toString();
	}

}
