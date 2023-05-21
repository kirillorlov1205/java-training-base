package practise;

import practise.oop.task1.Person;
import practise.oop.task2.Dog;

import practise.oop.task5.Book;
import practise.oop.task6.Employee;
import practise.oop.task7.Account;
import practise.oop.task7.Bank;

public class Main {
	public static void main(String[] args) {

		//Task1--------------------------------------------
		Person person1 = new Person("Kirill", 24);
		Person person2 = new Person("Denis", 23);

		System.out.println(person1.getName());
		System.out.println(person2.getAge());

		//Task2--------------------------------------------
		Dog dog1 = new Dog("Bobby", "labrador");
		Dog dog2 = new Dog("Dobby", "ratweller");

		dog1.setName("notDobby");
		dog2.setBreed("doberman");
		System.out.println(dog1.getName());
		System.out.println(dog2.getBreed());

		//Task 5 Books collection--------------------------------------------
		Book book1 = new Book("Harry", "Rouling", "978-2-266-11156-0");
		Book book2 = new Book("War and Peace", "Tolstoy", "978-2-266-11151-0");
		Book book3 = new Book("Advantage of Gulliver", "Zhule Vern", "910-2-266-11151-0");

		Book.addBookToCollection(book1);
		Book.addBookToCollection(book2);
		Book.addBookToCollection(book3);
		System.out.println(Book.showBookCollection());

		//Task 6 Employee salary--------------------------------------------
		Employee David = new Employee("David", "QA", 3000);
		System.out.println(David.getSalary());
		David.promoteEmployee(3100.55);
		System.out.println(David.getSalary());

		//Task 7 Bank--------------------------------------------
		System.out.println("----------");
		Bank tinkoff = new Bank("tinkoff");
		Account account1 = new Account("Kirill", 20000);
		Account account2 = new Account("Lisa", 10000);
		Account account3 = new Account("Kate", 15000);

//		add to list and remove
		Account [] accounts = {account2,account3};
		tinkoff.addAccountToList(account1);
		tinkoff.addAccountsToList(accounts);
		System.out.println(tinkoff.getAccountsList().toString());

//		withdraw
		System.out.println(account1.getAmount());
		tinkoff.withdrawMoneyFromAccount(account1,250);
		System.out.println(account1.getAmount());

//		deposit
		System.out.println(account2.getAmount());
		tinkoff.depositMoneyToAccount(account2,250);
		System.out.println(account2.getAmount());

		//Task8--------------------------------------------

	}
}