package projet1;

import java.util.Arrays;

public class PrClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ");
		System.err.print("go go go");
		System.out.print("bonjour ");
		System.out.print("à tous ");
		
		// Use of variables
		String nom = "salut ";
		String prenom = "yo yo";
		System.out.println(nom + prenom);
		
		//Use of Array	
		String arrayHi[] = {"bonjour", "à tous"};
		
		System.out.println(arrayHi[0]);
		System.out.println(arrayHi[1]);
		System.out.println(arrayHi[0] + " " + arrayHi[1]);
		
		// Use of Loop for
		for(int i=0; i<arrayHi.length; i++) {
			System.out.println(arrayHi[i]);
		}
		
		// Use of loop foreach
		for(String test : arrayHi) {
			System.out.println(test);
		}
		System.out.println(Arrays.asList(arrayHi));
		System.out.println(Arrays.toString(arrayHi));




	}

}
