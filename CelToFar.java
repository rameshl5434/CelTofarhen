import java.util.Scanner;

public class CelToFar {

	public static void main(String[] args) {
		double celsius;
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter temperature in Celsius : ");
		celsius = s.nextDouble();
		double fahrenheit = (9.0/5.0)*celsius + 32;
		System.out.println("Temperature in Fahrenheit is : "+fahrenheit);
	}

}
