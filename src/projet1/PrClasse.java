package projet1;

import java.util.Arrays;
import java.util.Scanner;

public class PrClasse {

	public static void main(String[] args) {

		// use of array and variables and concatinate
		String arrayToi[] = {"Tu as ", " ans"};
		int age = 18;
		System.out.println(arrayToi[0] + age + arrayToi[1]);
		
		for(String you : arrayToi) {
			if (you == " ans") {
				System.out.print(age);	
			}
			System.out.println(you);
		}
		
		// La condition ternaire
		
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		String reply = (3 < age) ? (age >= 18) ? "adult": "enfant" : "bébé";
		System.out.println(reply);
		
	
		
		String dateBuilder[][] = {
				{"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "decembre"},
				{"lundi","mardi","mecredi", "jeudi", "vendredi", "samedi","dimanche"}
		};
		
		int nJours = sc.nextInt();
		
			if (nJours <= 31) {
				System.out.println(dateBuilder[0][0]);
			}else if (nJours <= 31+30) {
				System.out.println(dateBuilder[0][1]);
			}else if (nJours <= 31+30+30) {
				System.out.println(dateBuilder[0][2]);
			}else if (nJours <= 31+30+30+30) {
				System.out.println(dateBuilder[0][3]);
			}else if (nJours <= 31+30+30+30+30) {
				System.out.println(dateBuilder[0][4]);
			}else if (nJours <= 31+30+30+30+30+30) {
				System.out.println(dateBuilder[0][5]);
			}else if (nJours <= 31+30+30+30+30+30+30) {
				System.out.println(dateBuilder[0][6]);
			}else if (nJours <= 31+30+30+30+30+30+30+30) {
				System.out.println(dateBuilder[0][7]);
			}else if (nJours <= 31+30+30+30+30+30+30+30+30) {
				System.out.println(dateBuilder[0][8]);
			}else if (nJours <= 31+30+30+30+30+30+30+30+30+30) {
				System.out.println(dateBuilder[0][9]);
			}else if (nJours <= 31+30+30+30+30+30+30+30+30+30+30) {
				System.out.println(dateBuilder[0][10]);
			}else if (nJours <= 31+30+30+30+30+30+30+30+30+30+30+30) {
				System.out.println(dateBuilder[0][11]);
			}else if (nJours <= 31+30+30+30+30+30+30+30+30+30+30+30+30) {
				System.out.println(dateBuilder[0][12]);
			}
				
			
		
	}
}
