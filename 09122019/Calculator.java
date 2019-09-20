package kalkulator;

public class Calculator {
	private double value;

	public Calculator add(double i) {
		value += i;
		return this;
	}

	public Calculator div(double i) {
		value /= i;
		return this;
	}

	public Calculator sub(double i) {
		value -= i;
		return this;
	}

	public Calculator mul(double i) {
		value *= i;
		return this;
	}

	public double value() {
		return value;
	}
}