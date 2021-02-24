package switchprogram;
import java.util.Scanner;

public class Switchcase {
               
	public static void main(String args[]){
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a Character:");
     char ch = ((in.nextLine()).charAt(0));

	    switch(ch)
	{
		case 'a' : 
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println(ch + " is a vowel ");
			break;
		default:	
			System.out.println(ch + " is a consonant ");
	}
	 
}
}
