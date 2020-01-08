//made by Jack Legate
import java.util.Scanner;

public class RandomNumGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 0;
		System.out.println("choose between 1 and 10");
		boolean exit = false;
		while(!exit) {
			int guess = (int)(Math.random() * 10) + 1;
			System.out.println("is " + guess + " your number");
			String answer = in.nextLine();
			if(answer.contains("yes"))
			{
				exit = true;
				count++;
				System.out.println("we guessed " + count + " times");
			} else {count++;}
			
		}
	}
}
