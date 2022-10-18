package harmonicaverage;

public class HarmonicSeries {

	public static double HarmonicSum(int[] arr) {
		
		double result = 0;
		for (int element: arr) {
			result += 1.0/element;
		}
		
		return result;
	}
	
	public static double HarmonicAverage(int[] arr) {
		
		return (double)(arr.length / HarmonicSum(arr));
	}
}
