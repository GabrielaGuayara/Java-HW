package UserInput;
import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter a number a star number: ");
		int inp1 = inp.nextInt();

			   
		System.out.println("Enter a number a end number: ");
		int inp2 = inp.nextInt();
		
		inp.close();
		
		int num1 = 0;
		int num2 = 1;
		
		for( int i=inp1; i<=inp2; i++)
		{
			System.out.print(num1+ ", ");
			int nextnum = num1+num2;
			num1=num2;
			num2=nextnum;
			

		}

	}

}
