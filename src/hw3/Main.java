package hw3;

import hw3.task1.Bird;
import hw3.task2.Chair;
import hw3.task3.Car;
import hw3.task3.Cycle;
import hw3.task3.Snail;

public class Main {

	public static void main(String[] args) {
		//Task1 testing--------------------------------------------
		System.out.println("Task1-------------");
		Bird tommy = new Bird("eagle", 25.2);
		Bird rob = new Bird("raven", 15.4);
		System.out.println(Bird.getSumOfBirds());
		tommy.setWeight(23.3);
		System.out.println(tommy.getWeight());
		System.out.println(rob.getType());
		System.out.println(Bird.getSumOfBirds());

		//Default weight
		Bird newBird = new Bird("type");
		System.out.println(newBird.getWeight());

		//Task2 testing--------------------------------------------
		System.out.println("Task2-------------");
		Chair newChair = new Chair(false, 10.2);
		Chair oldChair = new Chair(10.2);

		//Legs
		Chair.Legs oldCheirLegs = oldChair.new Legs(4);
		System.out.println(oldCheirLegs.quantity);
		oldCheirLegs.breakeLeg();

		//Chair-back
		Chair.ChairBack oldChairBack = oldChair. new ChairBack(15);
		System.out.println(oldChairBack.corner);
		oldChairBack.lowerTheBack();
		oldChairBack.raiseTheBack();

		//Seat
		Chair.Seat oldChairSeat = oldChair.new Seat("leather");
		System.out.println(oldChairSeat.matirial);
		oldChairSeat.cleanSeat();

		//Task3 testing--------------------------------------------
		System.out.println("Task3-------------");
		Car.Actions.move();
		Cycle.Actions.move();
		Snail.Actions.move();
	}
}