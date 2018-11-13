package WorkFolder;
import java.util.Scanner;
public class ConvertLetterGrade {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		// prompt the user 
		System.out.println(" Enter your letter grade");
		char letter = input.nextLine().charAt(0);
		if (letter =='a') {
			System.out.println("90");
	      }
	 if (letter =='b') {
		 System.out.println("80");
	 }
	if (letter =='c') {
		System.out.println("70");
	}
     if (letter =='d') {
    	 System.out.println("60");
     }
     if (letter =='f') {
    	 System.out.println("50");
     }
     
	}

}
