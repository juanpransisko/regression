
package regression;

import java.util.Arrays;

public class LinearRegression {
	
	final int MAX = 10000;
        
	private int idx = 0;
	private int len = 0;
	private double[] data_x;
	private double[] data_y;

	public LinearRegression(double[] x, double[] y) {
		if (x.length != y.length) {
			System.err.println("Invalid. Inputs must be of same length.");
			System.exit(0);
		}			

		this.len = x.length;
		this.data_x = Arrays.copyOfRange(x, 0, x.length);
		this.data_y = Arrays.copyOfRange(y, 0, y.length);
                System.out.println(len);
	}

	public LinearRegression() {
		this.data_x = new double[MAX];
		this.data_y = new double[MAX];
	}


	public double[] train() {
		double Ex = 0.0;
		double Ey = 0.0;
		double Ex2 = 0.0;
		double Exy = 0.0;

		// Check size if the same
		if (data_x.length != data_y.length) {
			System.err.println("Invalid. Inputs must be of same length.");
			System.exit(0);
		}

		// Compute for sum of x, y, x^2, and x*y
		while(idx != len) {
			Ex += data_x[idx];
			Ey += data_y[idx];
			Ex2 += data_x[idx] * data_x[idx];
			Exy += data_x[idx] * data_y[idx];

			idx ++;
		}

		System.out.println("Ex = " + Ex);
		System.out.println("Ey = " + Ey);
		System.out.println("Ex2 = " + Ex2);
		System.out.println("Exy = " + Exy);

		// Compute for a and b
		double a = (((Ey * Ex2) - (Ex * Exy)) / ((len * Ex2) - Math.pow(Ex, 2)));
		double b = (((len * Exy) - (Ex * Ey)) / ((len * Ex2) - Math.pow(Ex, 2)));

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		return new double[]{a, b};
	}


	// Getters and Setters ------------------------
	public void set_x(double[] x) {
		this.data_x = Arrays.copyOfRange(x, 0, x.length);
	}

	public double[] get_x() {
		return this.data_x;
	}

	public void set_y(double[] y) {
		this.data_y = Arrays.copyOfRange(y, 0, y.length);
	}

	public double[] get_y() {
		return this.data_y;
	}

}