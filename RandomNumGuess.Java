//made by Jack Legate
import java.util.Scanner;

/* 
 *	Program Asks user to think of a number between 1-10
 *	Program guesses
 *	User Inputs either yes or no
 *	if yes program tells user how many times the program guessed 
 */

public class RandomNumGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 0;
		System.out.println("choose between 1 and 10");
		while(count < 3) {
			count++;
			int guess = (int)(Math.random() * 10) + 1;
			
			System.out.println("is " + guess + " your number");
			String answer = in.nextLine();
			
			if(answer.contains("yes"))
			{
				System.out.println("we guessed " + count + " times");
			}
			
		}
	}
}
