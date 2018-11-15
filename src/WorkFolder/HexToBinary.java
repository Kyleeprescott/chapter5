package WorkFolder;
import java.util.Scanner;
public class HexToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit");
		String num1 = input.nextLine();
		if( num1.equals(0)) {
			System.out.println("0000");
		}
		else if (num1.equals(1))	{
			System.out.println("0001");
		}
		else if (num1.equals(2))	{
			System.out.println("0010");
		}else if (num1.equals(3))	{
			System.out.println("0011");
		}else if (num1.equals(4))	{
			System.out.println("0100");
		}else if (num1.equals(5))	{
			System.out.println("0101");
		}else if (num1.equals(6))	{
			System.out.println("0110");
		}else if (num1.equals(7))	{
			System.out.println("0111");
		}else if (num1.equals(8))	{
			System.out.println("1000");
		}else if (num1.equals(9))	{
			System.out.println("1001");
		}else if (num1.equals('a'))	{
			System.out.println("1010");
		}else if (num1.equals('b'))	{
			System.out.println("1011");
		}else if (num1.equals('c'))	{
			System.out.println("1100");
		}else if (num1.equals('d'))	{
			System.out.println("1101");
		}else if (num1.equals('e'))	{
			System.out.println("1110");
		}else if (num1.equals('f'))	{
			System.out.println("1111");
		}
		
	}

}
