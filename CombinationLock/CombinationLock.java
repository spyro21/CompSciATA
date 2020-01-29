
public class CombinationLock {

	private String combo;
	
	public CombinationLock(String comboLock) {
		combo = comboLock;
	}
	
	public void getClue(String guess) {
		for(int i = 0; i < 4; i++) {
			if(guess.charAt(i) == combo.charAt(i)) {
				System.out.print(guess.charAt(i));
			} else if(checkForIndex(guess.charAt(i))){
				System.out.print("+");
			} else {
				System.out.print('*');
			}
		}
		System.out.println();
	}
	
	public boolean checkForIndex(char guessChar) {
		for(int i = 0; i < 4;i++) {
			if(guessChar == combo.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
