package projet1;

import java.util.Arrays;

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
			System.out.print(you);
		}

	}

}
