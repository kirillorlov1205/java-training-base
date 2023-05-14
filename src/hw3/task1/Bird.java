package hw3.task1;

public class Bird {
	private final String type;
	private double weight;
	private static double sumOfBirdsWeight;

	{
		this.weight = 1;
	}

	public Bird(String type, double weight) {
		this.type = type;
		this.weight = weight;
		sumOfBirdsWeight += weight;
	}

	public Bird(String type) {
		this.type = type;
	}

	public double getWeight() {
		return this.weight;
	}

	public String getType() {
		return this.type;
	}

	public void setWeight(double weight) {
		sumOfBirdsWeight -= this.weight;
		this.weight = weight;
		sumOfBirdsWeight += weight;
	}

	public static double getSumOfBirds() {
		return sumOfBirdsWeight;
	}
}