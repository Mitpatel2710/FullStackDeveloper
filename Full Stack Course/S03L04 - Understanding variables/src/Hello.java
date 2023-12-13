import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		int value1 = 1, value2 = 2;
		int value3 = value1* value2 * value2;
		Scanner myObj = new Scanner(System.in);
		String userName;

		// Enter username and press Enter
		System.out.println("Enter username");
		userName = myObj.nextLine();
		System.out.println("Username is: " + userName);

		System.out.println(value3);

	}

}
//value1 = 1 * value2 = 2 * value2 = 2
//1 * 2 * 2 = 4
//1 * 2 - 2 = 0