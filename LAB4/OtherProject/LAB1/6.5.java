

import static java.lang.System.*;

public class ArrayAnalysis {

	public static void main(String[] args) {
		int m[] = {1789, 2035, 1889, 1456, 2013};
		
		insertionSort(m);
		
		int sum = 0;
		
		out.print("Sorted array: ");
		for (int i = 0; i < m.length; i++) {
			out.print(Integer.toString(m[i]) + " ");
			sum += m[i];
		}
		out.println();
		
		out.println("Sum:" + sum);
		out.println("Average value: " + sum/m.length);
		
	}
	
	public static void insertionSort(int m[]) { 
		for (int i = 0; i < m.length; i++) {
			int start = arra[i];
			int vitri = i;
			
			while (vitri > 0 && m[vitri - 1] > entry) { 
				int tempo = m[vitri];
				m[vitri] = m[vitri - 1];
				m[vitri - 1] = tempo;
				vitri--;
			}
		}
	}

}
