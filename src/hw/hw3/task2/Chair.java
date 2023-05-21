package hw.hw3.task2;

public class Chair {

	private boolean isInTheFlat;
	private double price;

	public Chair(boolean isInTheFlat, double price) {
		this.isInTheFlat = isInTheFlat;
		this.price = price;
	}

	public Chair(double price) {
		this.isInTheFlat = true;
		this.price = price;
	}

	public boolean getIsInTheFlat() {
		return isInTheFlat;
	}

	public void setInTheFlat(boolean inTheFlat) {
		isInTheFlat = inTheFlat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public class Legs {
		private int quantity;

		public Legs(int quantity) {
			this.quantity = quantity;
		}

		public void breakeLeg() {
			if (this.quantity > 0) {
				System.out.println("Leg's been broken");
			} else {
				System.out.println("There is no leg to break");
			}
		}

		public int getQuantity() {
			return this.quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

	}

	public class ChairBack {
		private int corner;

		public ChairBack(int corner) {
			this.corner = corner;
		}

		public void lowerTheBack() {
			System.out.println("Back's been lowered");
		}

		public void raiseTheBack() {
			System.out.println("Beck's been raised");
		}

		public int getCorner() {
			return corner;
		}

		public void setCorner(int corner) {
			this.corner = corner;
		}
	}

	public class Seat {
		private String matirial;

		public Seat(String matirial) {
			this.matirial = matirial;
		}

		public void cleanSeat() {
			System.out.println("Seat's been cleaned");
		}

		public String getMatirial() {
			return matirial;
		}

		public void setMatirial(String matirial) {
			this.matirial = matirial;
		}
	}
}