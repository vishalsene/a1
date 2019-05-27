//Access to needed libraries
import java.io.*;
import java.lang.*;
import java.util.*;

public class BinFib {

	/**
	 * Binary Fibonacci recursion method by calling recursively twice. The first
	 * two results return 1 or 0 and the rest will be added and subtracted
	 * recursively till it reaches the base case.
	 * 
	 * @param n
	 * @return
	 */
	public static long bfib(int n) {
		
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return (bfib(n - 1) + bfib(n - 2));
	}

	public static void main(String[] args) {
		// Start variable stores the initial general time
		long start = System.currentTimeMillis();

		// Try catch block, using PrintStream class to write in text file named
		// java.

		try {
			PrintStream myconsole = new PrintStream(new File(
					"C:/Users/Owner/Documents/Fibo/src/java.txt"));
			System.setOut(myconsole);

			/**
			 * While loop iterated by 5 till 100 in order to get the Fibonacci
			 * numbers. There is also a recursive call to bfib() which
			 * calculates the numbers. The currentTimeMillis method is used to
			 * calculate the runtime for each iteration by creating a start time
			 * variable and a end time variable.
			 */

			int index = 0;
			myconsole.println("Fib#-Time");
			while (index <=25) {
				myconsole.print(bfib(index) + "-  ");
				index = 5 + index;
				long end = System.currentTimeMillis();
				System.out.println(end - start);
			}

		} catch (Exception e) {
			System.out.println("File not found vish");

		}

	}

}
