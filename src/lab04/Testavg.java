package lab04;
import java.util.Scanner;




public class Testavg {
	public static void main(String[] args)
	{ 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number grade you received on the first test: ");
		double test1 = input.nextDouble();
		System.out.println("Enter the number grade you received on the Second test: ");
		double test2 = input.nextDouble();
		double avgtest = (test1 + test2)/2;
		char grade;
		if(avgtest<100 && avgtest>89.50) {
			grade='A';
			System.out.println("Great job! You received an A");
		}
		else if(avgtest<89 && avgtest>79.50) {
		
			grade='B';
			System.out.println("Good work! You received a B");
		}
		else if (avgtest<=79 && avgtest>=69.50) {
			
			grade='C';
			System.out.println("You passed. You received a C/D");
		}
		else if (avgtest<=69 && avgtest>=59.50) {
			grade='D';
			System.out.println("You passed. You received a C/D");
		}
		else {
			grade ='F';
			System.out.println("You have to retake the class. You received a F");
		}
		
		


		
		
		
			
		
		
	}

}
