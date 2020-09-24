import java.util.ArrayList;
import java.util.Arrays;

public class KList {
	
	public static void insertionSort(double[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			double key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j -1;
			}
			arr[j + 1] = key;
		}
	}
	
	public static double[] mergeKLists (double[][] outerArray) {
		ArrayList<Double> flattened = new ArrayList<>();
		
		for (int i = 0; i < outerArray.length; i++) {
	        for (int j = 0; j < outerArray[i].length; j++) { 
	        	flattened.add(outerArray[i][j]); 
	        }
	    }
		double[] finalArr = new double[flattened.size()];
		for (int k = 0; k < flattened.size(); k++) {
			finalArr[k] = flattened.get(k);
		}
		insertionSort(finalArr);
		return (finalArr);
	}
	
	public static void print2DArray(double[][] outerArray) {
		System.out.println("Result for example " + Arrays.deepToString(outerArray) + " :");	
	}
	
	public static void print1DArray(double[] finalArr) {
		System.out.println(Arrays.toString(finalArr));
	}
	
	public static void main(String[] args) {
		double[][] outerArray1 = {{1.1, 4.4, 5.5}, {1.1, 3.3, 4.4}, {2.2, 6.6}};
		print2DArray(outerArray1);
		print1DArray(mergeKLists(outerArray1));
		
		double[][] outerArray2 = {};
		print2DArray(outerArray2);
		print1DArray(mergeKLists(outerArray2));
		
		double[][] outerArray3 = {{}};
		print2DArray(outerArray3);
		print1DArray(mergeKLists(outerArray3));
		
		double[][] outerArray4 = {{9.7, 17.1}, {15.8}, {12.7, 18.5, 21.27}};
		print2DArray(outerArray4);
		print1DArray(mergeKLists(outerArray4));
	}
}