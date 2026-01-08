package module4;

import java.util.Scanner;
public class LoopingConstruct {

	public static void main(String[] args) {
		
		 
		        Scanner scanner = new Scanner(System.in);

		        int i= 0;
		        final int NUM_VALUES = 5;

		        double value;
		        double total = 0.0;
		        double max = Double.MIN_VALUE;
		        double min = Double.MAX_VALUE;

		        while (i< NUM_VALUES) {
		            System.out.print("Enter floating-point value " + (i + 1) + ": ");
		            value = scanner.nextDouble();

		            total += value;

		            if (value > max) {
		                max = value;
		            }

		            if (value < min) {
		                min = value;
		            }

		            i++;
		        }

		        double average = total / NUM_VALUES;
		        double interest = total * 0.20;

		        System.out.println("\nResults:");
		        System.out.println("Total: " + total);
		        System.out.println("Average: " + average);
		        System.out.println("Maximum: " + max);
		        System.out.println("Minimum: " + min);
		        System.out.println("Interest at 20%: " + interest);

		scanner .close();
	}

}
