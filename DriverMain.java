import java.util.Scanner;
public class DriverMain {
	/**
	 * 
	 * @author SM Nazibullah Touhid
	 * Prof. Tanes Kanchanawanchai
	 * CSC 200
	 * April 17, 2017
	 * License: GMU
	 * Program:
	 * Create another class name PersonDriver, a driver class (test) program that demonstrates each method,  including main method to instantiate two Person object and perfrom the following tests:
	 * Test whether two Person objects are equal (have the same name and age).
	 * Test whether two Person objects have the same name
	 * Test whether two Person objects are the same age
	 * Test whether one Person object is older than another
	 * Test whether one Person object is younger than another
	 * 
	 *Purpose of the program:
	 *To understand use of Class
	 */

	public static void main(String[] args) {
		Driver driver= new Driver();
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter first driver's name: ");
		String driver1Name=keyboard.nextLine();
		driver.getdriver1Name(driver1Name);
		
		System.out.println("Enter second driver's name: ");
		String driver2Name=keyboard.nextLine();
		driver.getdriver2Name(driver2Name);
		
		
		System.out.println("Enter first driver's age: ");
		int driver1Age=keyboard.nextInt();
		driver.getdriver1Age(driver1Age);
		
		System.out.println("Enter second driver's age: ");
		int driver2Age=keyboard.nextInt();
		driver.getdriver1Age(driver2Age);
		keyboard.close();
		
		System.out.println("\nThe name of both drivers are same: "+driver.CompareName(driver1Name, driver2Name));
		
		System.out.println("\nThe age of the both drivers are same: "+driver.CompareAge(driver1Age, driver2Age));

		System.out.println("\nThe name and the age of both drivers are same: "+driver.CompareNameandAge(driver1Name, driver2Name, driver1Age, driver2Age));
		
		System.out.println("\nWho is older: "+driver.WhoIsOlder(driver1Age, driver2Age));
		
		System.out.println("\nWho is Younger: "+driver.WhoIsYounger(driver1Age, driver2Age));
	}

}
