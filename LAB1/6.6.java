

import java.util.*;
import static java.lang.System.*;

public class MatrixAddition {

	public static void main(String[] args) {
		var keyboard = new Scanner(in);
		
		
		out.println("Dim: ");
		out.print(" rows :");
		int k = keyboard.nextInt();
		out.println();
		out.print("columns: ");
		int l = keyboard.nextInt();
		
		
		int arra1[][] = new int [k][l];
		int arra2[][] = new int [k][l];
		
		out.println("Input entries of 1st matrix: ");
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < l; j++) {
				arra1[i][j] = keyboard.nextInt();
			}
		}
		
		out.println("Input entries of 2st matrix: ");
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < l; j++) {
				arra2[i][j] = keyboard.nextInt();
			}
		}
		
		
		int arraSum[][] = new int[k][l];
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < l; j++) {
				arraSum[i][j] = arra1[i][j] + arra2[i][j];
			}
		}
		
		
		out.println("Addition results: ");
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < l; j++) {
				out.print(arraSum[i][j] + " ");
			}
			out.println();
		}
		
		keyboard.close();
	}
}