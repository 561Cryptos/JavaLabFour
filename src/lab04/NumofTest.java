package lab04;
import java.util.Scanner;

public class NumofTest 
{
	enum LetterGrade {A, B, C, D, F};
	
	public static void main(String[] args) {
		LetterGrade studentGrade;
		int i, numtest, avg, score = 0;
		System.out.println("How many tests did you take this semester?");
		Scanner input = new Scanner(System.in);
		numtest = input.nextInt();
		for (i = 1; i <= numtest; i++)
		{
			System.out.println("Enter grade you recieved in test " + i);
			score += input.nextInt();
		}
		avg = score / numtest;
		if ((avg < 101) && (avg > 89))
			studentGrade = LetterGrade.A;
		else if((avg < 90) && (avg > 79))
			studentGrade = LetterGrade.B;
		else if ((avg < 80) && (avg > 69))
			studentGrade = LetterGrade.C;
		else if ((avg < 70) && (avg > 59))
			studentGrade = LetterGrade.D;
		else
			studentGrade = LetterGrade.F;
			
		switch(studentGrade)
		{
		case A:
			System.out.println("Great job! You received an A");
			break;
		case B:
			System.out.println("Good work! You received a B");
			break;
		case C:
			System.out.println("You passed. You received a C/D");
			break;
		case D:
			System.out.println("You passed. You received a C/D");
			break;
		case F:
			System.out.println("You have to retake the class. You received a F");
			break;
		default:
			break; 
		}
	}
}

