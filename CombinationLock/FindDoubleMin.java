import java.util.Scanner;
public class FindDoubleMin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] testArr = new double[10];
		System.out.println("Enter 10 numbers: ");
		
		for(int i = 0; i < 10;i++) {
			testArr[i] = input.nextDouble();
		}
		
		System.out.println("the minimum number is: " + minDouble(testArr));
		
	}
	
	public static double minDouble(double[] arr) {
		double val = arr[0];
		for(int i = 1;i < arr.length;i++) {
			if(arr[i] < val) {
				val = arr[i];
			}
		}
		return val;
	}

}
