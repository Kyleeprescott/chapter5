package WorkFolder;
import java.util.Scanner;
public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//user input
		System.out.println("Enter a letter");
		
		char letter = input.nextLine().charAt(0);
		
		
		if(letter == 'A'|| letter =='E'||letter =='I'|| letter =='O'||letter =='U'||letter =='Y'
				||letter == 'a'|| letter == 'e'|| letter =='i'||letter=='o'||letter =='u'||letter=='y') {
			System.out.println(letter+ " is a vowel");
		}
		else {
			

	System.out.println(letter+ " is a consonant");
		}
	
	
	
		

	}

}
