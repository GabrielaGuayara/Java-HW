package UserInput;
import java.util.Scanner;

public class Polidrome {

	public static void main(String[] args) {
		
		Scanner inp =new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String strinp = inp.nextLine();
		inp.close();
		
		int len=strinp.length();
		String reverstr="";
		
		for (int i=len-1; i>=0; i--)
		{
			 reverstr= reverstr + strinp.charAt(i);
		}
		
	
	if(strinp.equals(reverstr)) 
		System.out.println("The word "+strinp+ " is a palidrome");
	
	else 
		System.out.println("The word "+strinp+ " is NOT a palidrome");
	
	
	}

}
