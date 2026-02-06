package baby;

import java.util.Scanner;

public class BabyMain {

	public static void main(String[] args) {

		Baby baby1 = new Baby();
		Baby baby2 = new Baby();
		Baby baby3 = new Baby();

		int biberonTotali;

		Scanner scan = new Scanner(System.in);

		System.out.println("Come si chiama il baby");
		baby1.setNome(scan.next());

		System.out.println("Il baby è maschio? (inserisci true se è vero, false se è falso)");
		baby1.setMale(scan.nextBoolean());

		System.out.println("Quanto pesa il baby?");
		baby1.setPeso(scan.nextDouble());

		System.out.println("Baby1: ");
		System.out.println(baby1.toString());

		System.out.println("Come si chiama il baby");
		baby2.setNome(scan.next());

		System.out.println("Il baby è maschio? (inserisci true se è vero, false se è falso)");
		baby2.setMale(scan.nextBoolean());

		System.out.println("Quanto pesa il baby?");
		baby2.setPeso(scan.nextDouble());

		System.out.println("Baby2: ");
		System.out.println(baby2.toString());

		System.out.println("Come si chiama il baby");
		baby3.setNome(scan.next());

		System.out.println("Il baby è maschio? (inserisci true se è vero, false se è falso)");
		baby3.setMale(scan.nextBoolean());

		System.out.println("Quanto pesa il baby?");
		baby3.setPeso(scan.nextDouble());

		System.out.println("Baby3: ");
		System.out.println(baby3.toString());

		biberonTotali = 0 + baby1.babyMangia();
		System.out.println("il nuovo peso del di baby1 vale:" + baby1.getPeso());
		System.out.println("Baby1 ha mangiato : " + baby1.getnBiberon() + "biberon");

		biberonTotali = biberonTotali + baby2.babyMangia();
		System.out.println("il nuovo peso del di baby2 vale:" + baby2.getPeso());
		System.out.println("Baby2 ha mangiato : " + baby2.getnBiberon() + "biberon");

		biberonTotali = biberonTotali + baby3.babyMangia();
		System.out.println("il nuovo peso del di baby3 vale:" + baby3.getPeso());
		System.out.println("Baby3 ha mangiato : " + baby3.getnBiberon() + "biberon");

		System.out.println("Il numero dei biberon totali : " + biberonTotali);

	}
}
