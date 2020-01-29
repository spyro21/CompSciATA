import java.util.Scanner;
public class CombinationLockTester{
	public static void main(String[] args){
		CombinationLock combo = new CombinationLock("frog");
		combo.getClue("oooo");
		combo.getClue("flip");
		combo.getClue("frag");
		combo.getClue("frog");
	}
}
