package MainPackage;

import java.util.Scanner;

public class TuitionCost {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Initial Tuition Cost: ");
		double InitialTuition = input.nextDouble();
		
		System.out.print("Percentage Increase: ");
		double Increase = input.nextDouble();
		
		// FV = InitialTuition(1 + Increase)^i
		double total= 0;
		Increase = Increase / 100; //Converts in percentage
		
		for(int i = 0; i < 4; i++){
			total += (InitialTuition * Math.pow((1+Increase), i));
		}
		
		System.out.printf("Total Cost of Tuition: $");
		System.out.printf("%.2f", total);
		input.close();


	}

}
