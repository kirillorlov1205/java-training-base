package practise.oop.task7;

public class Account {
	private int id;
	private String name;
	private double amount;

	public Account(String name, double amount) {
		this.id += id;
		this.name = name;
		this.amount = amount;
		id++;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account: " + "{"
				+ "id: " + this.id
				+ ", name: " + this.name
				+ ", amount: " + this.amount +
				"}";
	}
}