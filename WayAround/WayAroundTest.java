public class WayAroundTest {

	public static void main(String[] args) {
		
		
		
		Point[] points = {new Point(4,5,0),new Point(-6,4,1),
							new Point(3,3,2),new Point(2,-1,3),
							new Point(1,-6,4),new Point(-2,-1,5),
							new Point(1,1,6)};
		int NUM_POINTS = points.length;
		
		int[] path = new int[NUM_POINTS];
		for(int i = 0; i < path.length;i++) {
			path[i] = -1;
		}
		
		Point lowestP = findLowestPoint(points);
		path[0] = lowestP.getIndex();
		
		
		double[] slopes = new double[NUM_POINTS];
		double slopeTemp = 0;
		boolean isDone = false;
		Point currentP = lowestP;
		
		slopes = findSlopes(points, currentP.getIndex(),slopeTemp);
		
		
		int next = -1;
		int count = 0;
		
		while(!isDone) {
			count++;
			next = findNextIndex(currentP.getIndex(), slopes);
			slopeTemp = slopes[next];
			slopes = findSlopes(points, next,slopeTemp);
			currentP = points[next];
			path[count] = next;
			if(next == lowestP.getIndex()) {
				isDone = true;
			}
			
		}
		
		for(int i = 0; i < path.length;i++) {
			if(path[i] != -1) {
				System.out.println(path[i]);
			}
			
		}
		
		
		
	}
	
	public static int findNextIndex(int curIndex, double[] sl) {
		int indexValue = 0;
		
		if(hasPositive(sl)) {
			
			for(int i = 1; i < sl.length;i++) {
				if((sl[i] > 0) && (sl[i] < sl[indexValue])) {
					indexValue = i;
				}
			}
		} else{
			for(int i = 1;i < sl.length;i++) {
				if(sl[i] < sl[indexValue]) {
					indexValue = i;
				}
			}
		}
		
		return indexValue;
	}
	
	public static boolean hasPositive(double[] slo) {
		for(int i = 0; i < slo.length;i++) {
			if(slo[i] > 0) {
				return true;
			}
		}
		return false;
	}
	
	public static double[] findSlopes(Point[] arr, int curIndex,double slope) {
		double[] returnArr = new double[arr.length];
		
		for(int i = 0;i < arr.length;i++) {
			double curX = (double)(arr[curIndex].getX());
			double curY = (double)(arr[curIndex].getY());
			double iX = (double)(arr[i].getX());
			double iY = (double)(arr[i].getY());
			
			if ((arr[i] != arr[curIndex] && (curX - iX) != slope)) {
				returnArr[i] = ((curY - iY) / (curX - iX)) + slope;
			} else if (arr[i] != arr[curIndex] && (curX - iX) == slope) {
				returnArr[i] = 20;
			} else {
				returnArr[i] = 21;
			}
		}
		return returnArr;
	}
	
	public static Point findLowestPoint(Point[] arr) {
		Point low = arr[0];
		
		for(int i = 1;i < arr.length;i++) {
			if(arr[i].getY() < low.getY()) {
				low = arr[i];
			}
		}
		return low;
	}
}
