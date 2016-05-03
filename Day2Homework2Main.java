import java.util.Scanner;

public class Day2Homework2Main {

	public static void main(String[] args) {
		// write a program that calculates wheter or not a year is a leap year
		//every 4th year is a leap year execpt if it is a century
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		
		if ((year < 1580) && (year % 4 == 0)){
			System.out.println("Leap year: " + year);
			
		} else {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
				System.out.println("Leap year is: " + year);
				
			} else {
				System.out.println(year + " not a leap year!");
			}
		}

	}

}
