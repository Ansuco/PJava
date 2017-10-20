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
		
	
		
		

	}

}
