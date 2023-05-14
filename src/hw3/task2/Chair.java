package hw3.task2;

public class Chair {

	public boolean isInTheFlat = true;
	public double price;

	public Chair(boolean isInTheFlat, double price) {
		this.isInTheFlat = isInTheFlat;
		this.price = price;
	}

	public Chair(double price) {
		this.price = price;
	}

	public class Legs {
		public int quantity;

		public Legs(int quantity) {
			this.quantity = quantity;
		}

		public void breakeLeg() {
			if (this.quantity > 0){
				System.out.println("Leg's been broken");
			}else {
				System.out.println("There is no leg to break");
			}
		}
	}

	public class ChairBack {
		public int corner;

		public ChairBack(int corner) {
			this.corner = corner;
		}

		public void lowerTheBack() {
			System.out.println("Back's been lowered");
		}

		public void raiseTheBack() {
			System.out.println("Beck's been raised");
		}
	}

	public class Seat {
		public String matirial;

		public Seat(String matirial) {
			this.matirial = matirial;
		}

		public void cleanSeat() {
			System.out.println("Seat's been cleaned");
		}
	}
}