package pozoristee;

public class GlavniProgramPozoriste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pozoriste p = new Pozoriste("JDP");
		Pozoriste p2 = new Pozoriste("Atelje 212");
		Pozoriste p3 = new Pozoriste("Dadov");
		Reditelj r = new Reditelj("Marko Markovic", "JDP", "Mare");
		Zaposleni z = new Zaposleni("Ana Peric", "JDP");
		Glumac g1 = new Glumac("Petar Petrovic", "Atelje 212", "otac Pera");
		Predstava pred = new Predstava("Laza i paralaza", p);
		pred.dodajZaposlenog(z);
		System.out.println(p.getNaziv());
		System.out.println(p.getId());
		System.out.println(p3.getId());
		System.out.println(Pozoriste.getGlobalId());

	}

}
