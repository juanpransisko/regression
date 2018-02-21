
package regression;

import regression.LinearRegression;

public class LinearRegTest {
	
	public static void main(String[] args) {
	
		double[] x = {43, 21, 25, 42, 57, 59};
		double[] y = {99, 65, 79, 75, 87, 81};

		LinearRegression linearRegression = new LinearRegression(x, y);
		
		linearRegression.train();
                System.out.println("done.");
	}
	
}