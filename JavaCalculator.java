import java.util.Scanner;

public class JavaCalculator{

	public static int square(int number)
	{
		return number * number;
	
	}
	
	public static int add(int number, int number7)

	{
		return number + number7;
	}
		
	public static int Subtract(int numb1, int numb2)
	{
		return numb1 - numb2;
	}
	
	public static int Multi(int numb3, int numb4)
	{
		return numb3 * numb4;
	}
	
	public static int Divide(int numb5, int numb6) {
		
		return numb5/numb6;
	}
	
	public static void main(String[ ]arg) {
		
		int iNumb1;
		int iNumb2 ;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter 2 numbers:");
		iNumb1 = keyboard.nextInt();
		iNumb2 = keyboard.nextInt();
		
		System.out.println("The sum of the 2 numbers is: " + " " + JavaCalculator.add(iNumb1, iNumb2));
		System.out.println("The subtraction of the numbers you entered:" +  " " + JavaCalculator.Subtract(iNumb1, iNumb2));
		System.out.println("The multiplication of the numbers you entered:" +  " " + JavaCalculator.Multi(iNumb1, iNumb2));
		System.out.println("The division answer :" +  " " + JavaCalculator.Divide(iNumb1, iNumb2));
		System.out.println("That 1st number's square is:" +  " " + JavaCalculator.square(iNumb1));
	
		
	}


	}

		
	      
	  

