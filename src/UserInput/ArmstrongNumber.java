package UserInput;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 to 999: ");
		
		int inp1= inp.nextInt();
		
		int rem, sum=0, num = inp1;
		
		while(num!= 0)
		{
		 rem=num%10;
		 sum=sum+rem*rem*rem;
		 num=num/10;
		}
		
		if(sum==inp1)
			 System.out.println(inp1 + " is an Armstrong number");
        else
            System.out.println(inp1 + " is NOT an Armstrong number");
		inp.close();
		
	}

}
