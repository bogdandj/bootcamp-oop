package projekat_11_5;

public class zad2 {

	public static void main(String[] args) {
		Auto kola = new Auto();
		kola.vozac = "Ivan Gavrilovic";
		kola.modelAuta = "Audi";
		kola.brojVrata = 5;
		kola.potrosnjaGoriva = 9;
		kola.brzina = 200;
		kola.registracija = "KG-153-ZE";
		kola.klima = true;
		kola.godinaProizvodnje = 1945;
		kola.mesecIstekaRegistracije = 4;
		kola.kubikaza = 3000;

		kola.stampajAuto();
		System.out.println(("Brzina je prekoracena: ") + kola.prekoracenje(50));
		System.out.println(("Vasa kazna je: ") + kola.kazna(50));
		System.out.println("\n");
		kola.dodajGas();
		kola.koci();
		System.out.println(kola.potroseno());
		System.out.println(kola.oldTimer());
		System.out.println(kola.isteklaRegistracija());
		System.out.println(kola.cenaRegistracija());
		
		System.out.println("\n");

		Auto vozilo = new Auto();
		vozilo.vozac = "Mika Mikic";
		vozilo.modelAuta = "Yugo 45";
		vozilo.brojVrata = 3;
		vozilo.potrosnjaGoriva = 7.3;
		vozilo.brzina = 45;

		vozilo.stampajAuto();
		System.out.println(("Brzina je prekoracena: ") + vozilo.prekoracenje(50));
		System.out.println(("Vasa kazna je: ") + vozilo.kazna(50));

	}

}
