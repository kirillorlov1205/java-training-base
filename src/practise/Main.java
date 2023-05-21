package practise;

import practise.oop.task1.Person;
import practise.oop.task2.Dog;

import practise.oop.task5.Book;
import practise.oop.task6.Employee;

public class Main {
	public static void main(String[] args) {
		//Task1--------------------------------------------
		Person person1 = new Person("Kirill", 24);
		Person person2 = new Person("Denis", 23);

		System.out.println(person1.getName());
		System.out.println(person2.getAge());
		//Task2--------------------------------------------
		Dog dog1 = new Dog("Boby", "labrador");
		Dog dog2 = new Dog("Dobby", "ratweller");

		dog1.setName("notDoby");
		dog2.setBreed("doberman");
		System.out.println(dog1.getName());
		System.out.println(dog2.getBreed());
		//Task5--------------------------------------------
	/*5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN,
and methods to add and remove books from a collection.*/

//!!!! TBD
		Book book1 = new Book("Harry", "Rouling", "978-2-266-11156-0");
		Book book2 = new Book("War and Peace", "Tolstoy", "978-2-266-11151-0");
		Book book3 = new Book("Advantage of Gulliver", "Zhule Vern", "910-2-266-11151-0");

//		Book.addBookToCollection(book1);
//		Book.addBookToCollection(book2);
//		Book.addBookToCollection(book3);
//		System.out.println(Book.getBookCollection());

		//Task6--------------------------------------------
		Employee David = new Employee("David", "QA", 3000);
		System.out.println(David.getSalary());
		David.promoteEmployee(3100.55);
		System.out.println(David.getSalary());

		//Task7--------------------------------------------
/*7. Write a Java program to create a class called "Bank" with a collection of accounts
and methods to add and remove accounts, and to deposit and withdraw money.
Also define a class called "Account" to maintain account details of a particular customer. */


	}
}