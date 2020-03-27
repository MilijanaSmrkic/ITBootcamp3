package pozoristee;

public class Glumac extends Zaposleni {
	/*
	 * * Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je
	 * uloga_ime[naziv_pozorista].
	 */
	private String nazivUloge;

	public Glumac(String ime, String pozoriste, String nazivUloge) {
		super(ime, pozoriste);
		this.nazivUloge = nazivUloge;
	}

	public String getNazivUloge() {
		return nazivUloge;
	}

	public String toString() {
		return "uloga_" + this.nazivUloge + "[" + this.getPozoriste() + "]" + ".";
	}

}
