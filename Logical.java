import java.util.Scanner;
public class Logical {
	

	public class LogicalOperator {

		public static void main(String[] args) {
			
			int val;
			
			Scanner scObj = new Scanner(System.in);
			
			System.out.println("Enter the number : ");
			
			val=scObj.nextInt();
			
			scObj.close();
			
			//AND operator
			
			if((val>=10)&&(val%2==0))
				
				System.out.println("Number is greater than 10 and also an even number");
			
			else
				
				System.out.println("Condition matches ");
			
			//OR Operator
			
			if((val>=10)||(val%2==0))
			
				System.out.println("Either of the condition is true or both is true");
			
			else
				
				System.out.println("Conditions rejected  ");
			

		}

	}
}
