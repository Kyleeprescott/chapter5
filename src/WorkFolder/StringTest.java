package WorkFolder;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String city1;
	String city2;
	String city3;
	String city4;
	String city5;
	String temp;
	//user prompt city one
	System.out.println("Enter the first city:");
	
	// user input city one
	city1 = input.nextLine();
	
	//user prompt city 2
	System.out.println("Enter the second city:");
	
	// user input city 2 
	city2 = input.nextLine();
	
	//user prompt city three
		System.out.println("Enter the third city:");
		
	// user input city one
		city3 = input.nextLine();
		
	//user prompt city four
				System.out.println("Enter the fourth city:");
				
	// user input city 4
				city4 = input.nextLine();
	//user prompt city fifth
				System.out.println("Enter the fifth city:");
	// user input city 4
				city5 = input.nextLine();
				
// if city one compared to city 2 <0(less that zero) 
	if (city1.compareTo(city2)<0) {
		temp = city1;
		city1= city2;
		city2=temp;
	}
	else if (city2.compareTo(city3)<0){ 
				temp= city2;
				city2= city3;
				city3= temp;
	}
	else if (city3.compareTo(city4)<0) {
		temp = city3;
		city3=city4;
		city4=temp;
		
	}
	else if (city4.compareTo(city5)<0) {
		temp=city4;
		city4=city5;
		city5=temp;
	}
	else if (city5.compareTo(city1)<0) {
	   temp=city5;
	   city5=city1;
	   city1=temp;

	}
System.out.println("The alphabetical order of your cities are "+city1+""+city2+""+city3+""+city4+""+city5);
}
}