package WorkFolder;
import java.util.Scanner;
public class HexToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// user input
		System.out.println("Enter a hex digit");
		
		final int num128 = 128;
		 final int num64 = 64;
		 final int num32 = 32;
		 final int num16 = 16;
		 final int num8 = 8;
		 final int num4 = 4;
		 final int num2 = 2;
		 final int num1 = 1;
		 //
		 String set1="";
		 String set2="";
		 String set3="";
		 String set4="";
		 String set5="";
		 String mset1="";
		 String mset2="";
		 String mset3="";
		 String mset4="";
		 
		 //input numbers
		 int inputnum=input.nextLine();
		 
		 int whatsLeft;
		 
		 
		 for(int i=0; i<31;i++) {
			 String biannum ="";
			 
			 inputnum = inputnum+1;
			 
			 
			 
			 whatsLeft=inputnum;
			 
			 if(inputnum >+num128) {
				 whatsLeft= inputnum -num128;
				 biannum = biannum+"1";
			 }
			 else {
				 biannum = biannum+"0";
			 }
			 if(whatsLeft>=num64) {
				 whatsLeft=  whatsLeft-64;
				 biannum=biannum+"1";
				 
			 }
			 else {
				 biannum=biannum+"0";
			 }
			 if(whatsLeft>=num32) {
				 whatsLeft=  whatsLeft-32;
				 biannum=biannum+"1";
				 
			 }
			 else {
				 biannum=biannum+"0";
			 }
			 if(whatsLeft>=num16) {
				 whatsLeft=  whatsLeft-16;
				 biannum=biannum+"1";
				 
			 }
			 else {
				 biannum=biannum+"0";
			 }
			 if(whatsLeft>=num8) {
				 whatsLeft=  whatsLeft-8;
				 biannum=biannum+"1";
				 
			 }
			 else {
				 biannum=biannum+"0";
			 }
			 if(whatsLeft>=num4) {
				 whatsLeft= whatsLeft-4;
				 biannum=biannum+"1";
				 
			 }
			 else {
				 biannum=biannum+"0";
			 }
			 if(whatsLeft>=num2) {
				 whatsLeft=  whatsLeft-2;
				 biannum=biannum+"1";
				 
			 }
			 else {
				 biannum=biannum+"0";
			 }
			 if(whatsLeft>=num1) {
				 whatsLeft=  whatsLeft-1;
				 biannum=biannum+"1";
				 
			 }
			 else {
				 biannum=biannum+"0";
			 }
			 
			 //check indexing of bianary numbers
			 char xnum7 = biannum.charAt(7);
			 char xnum6 = biannum.charAt(6);
			 char xnum5 = biannum.charAt(5);
			 char xnum4 = biannum.charAt(4);
			 char xnum3 = biannum.charAt(3);
			 char mnum7 = biannum.charAt(7);
			 char mnum6 = biannum.charAt(6);
			 char mnum5 = biannum.charAt(5);
			 char mnum4 = biannum.charAt(4);
			 //assign to sets
			 if(xnum7=='1') {
				 set1=set1+inputnum+" ";
			 }
			 if(xnum6=='1') {
				 set2=set2+inputnum+" ";
			 }
			 if(xnum5=='1') {
				 set3=set3+inputnum+" ";
			 }
			 if(xnum4=='1') {
				 set4=set4+inputnum+" ";
			 }
			 if(xnum3=='1') {
				 set5=set5+inputnum+" ";
			 }
			 if(inputnum <=12) {
				 if(mnum7=='1') {
					 mset1=mset1+inputnum+" ";
				 }
				 if(mnum6=='1') {
					 mset2=mset2+inputnum+" ";
				 }
				 if(mnum5=='1') {
					 mset3=mset3+inputnum+" ";
				 }
				 if(mnum4=='1') {
					 mset4=mset4+inputnum+" ";
				 }
			 }
			 
		 }
		 

	}

}
