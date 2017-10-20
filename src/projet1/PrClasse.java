package projet1;


import java.util.Scanner;

public class PrClasse {

	public static void main(String[] args) {

		final int MONTH31 = 31;
		final int MONTH30 = 30;

		//Date Builder with multiple array
		String dateBuilder[][] = {
			{"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "decembre"},
			{"lundi","mardi","mecredi", "jeudi", "vendredi", "samedi","dimanche"}
		};
		
		Scanner sc = new Scanner(System.in);
		int month = 0;
		String reponse = "";
		
		do {
			System.out.print("Entrez quelque nombre [1-365] : ");
			int nJours = sc.nextInt();
			int cpt31 = 1, cpt30 = 1;
			
			if (nJours <= MONTH31 * cpt31) month = 0;
			else if (nJours <= MONTH31 * cpt31 + MONTH30 * cpt30 - 1) month = 1;
			else if (nJours <= MONTH31 * ++cpt31 + MONTH30 * cpt30 - 1) month = 2;
			else if (nJours <= MONTH31 * cpt31 + MONTH30 * ++cpt30 - 1) month = 3;
			else if (nJours <= MONTH31 * ++cpt31 + MONTH30 * cpt30 - 1) month = 4;
			else if (nJours <= MONTH31 * cpt31 + MONTH30 * ++cpt30 - 1) month = 5;
			else if (nJours <= MONTH31 * ++cpt31 + MONTH30 * cpt30 - 1) month = 6; // juillet
			else if (nJours <= MONTH31 * ++cpt31 + MONTH30 * cpt30 - 1) month = 7; // aout
			else if (nJours <= MONTH31 * cpt31 + MONTH30 * ++cpt30 - 1) month = 8;
			else if (nJours <= MONTH31 * ++cpt31 + MONTH30 * cpt30 - 1) month = 9;
			else if (nJours <= MONTH31 * cpt31 + MONTH30 * ++cpt30 - 1) month = 10;
			else if (nJours <= MONTH31 * ++cpt31 + MONTH30 * cpt30 - 1) month = 11;
			
			System.out.println("Résultat : " + dateBuilder[0][month]);
			
			System.out.print("Voulez-vous recommencer ? [On] ");
			sc.nextLine();
			reponse = sc.nextLine();
			
		} while (!reponse.equals("n"));
		
		System.out.println("Aurevoir");
		sc.close();

		
		
//		System.out.println(dateBuilder[1][nSemaine- 1]);
				
		
						
	}
}
