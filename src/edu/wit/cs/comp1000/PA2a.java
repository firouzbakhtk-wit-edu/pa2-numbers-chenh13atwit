package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sumPositive = 0, sumNonPositive = 0, sumAll = 0;
		int countPositive = 0, countNonPositive = 0;
		
		System.out.print("Enter five whole numbers: ");
		
		for (int i = 0; i < 5; i++) {
			int num = scanner.nextInt();
			sumAll += num;
			
			if (num > 0) {
				sumPositive += num;
				countPositive++;
			} else {
				sumNonPositive += num;
				countNonPositive++;
			}
		}
		
		double averagePositive = (countPositive > 0) ? (double) sumPositive / countPositive : 0.0;
		double averageNonPositive = (countNonPositive > 0) ? (double) sumNonPositive / countNonPositive : 0.0;
		double averageAll = (double) sumAll / 5;
		
		 System.out.printf("The sum of the %d positive number%s: %d%n",
                 countPositive, countPositive == 1 ? "" : "s", sumPositive);
		
         System.out.printf("The sum of the %d non-positive number%s: %d%n",
                 countNonPositive, countNonPositive == 1 ? "" : "s", sumNonPositive);
         
         System.out.printf("The sum of the 5 numbers: %d%n", sumAll);
         
         System.out.printf("The average of the %d positive number%s: %.2f%n",
                 countPositive, countPositive == 1 ? "" : "s", averagePositive);
        
         System.out.printf("The average of the %d non-positive number%s: %.2f%n",
                 countNonPositive, countNonPositive == 1 ? "" : "s", averageNonPositive);
         
         System.out.printf("The average of the 5 numbers: %.2f%n", averageAll);
		
		scanner.close();
	}

}
