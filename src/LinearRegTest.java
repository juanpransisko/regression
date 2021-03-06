
import regression.LinearRegression;

public class LinearRegTest {
	
	public static void main(String[] args) {
	
		double[] x = {2, 0, 1, 2, 4, 5, 5, 4, 0, 1, 0, 3, 2, 4, 2, 5, 4, 4, 1, 0, 5, 3, 0, 2, 4, 1, 1, 4, 2, 0, 3, 5, 0, 2, 4, 4, 3, 4, 5, 0, 0, 3, 0, 2, 5, 0, 4, 3, 5, 3, 4, 0, 5, 2, 1, 5, 5, 2, 4, 5, 4, 4, 0, 4, 5, 5, 0, 3, 0, 1, 5, 1, 4, 0, 5, 3, 5, 4, 4, 2, 2, 4, 5, 5, 4, 0, 4, 5, 5, 3, 0, 0, 4, 0, 3, 1, 0, 0, 3, 1};
		double[] y = {0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

		LinearRegression linearRegression = new LinearRegression(x, y);
		
		linearRegression.train();
		System.out.println("done.");
	}
	
}