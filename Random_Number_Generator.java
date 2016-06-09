import java.lang.Math;

import java.util.Scanner;

public class Random_Number_Generator {
	
	private static Scanner input;

	public static void main(String args[])
    {
        
		int number;
		input = new Scanner(System.in);
		System.out.println("Enter the Number:" );  
		number = input.nextInt();
       
        double randomNumber = Math.random();
        int randomInt = (int)(number * randomNumber);
        System.out.println(randomInt);
 
    }
}
