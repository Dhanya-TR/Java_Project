import java.util.Scanner;
public class temperature_converter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double temperature;
		char unit;
		System.out.println("Enter the temperature: ");
		temperature=sc.nextDouble();
		System.out.println("Enter unit(C/F/K): ");
		unit=sc.next().charAt(0);
		switch(unit) {
		case 'C':
		case 'c':
			System.out.printf("%.2f C=%.2f F%n", temperature,celsiusToFahrenheit(temperature));
			System.out.printf("%.2f C=%.2f K%n", temperature,celsiusToKelvin(temperature));
            break;
		case 'F':
		case 'f':
			System.out.printf("%.2f C=%.2f C%n", temperature,fahrenheitToCelsius(temperature));
			System.out.printf("%.2f C=%.2f K%n", temperature,fahrenheitToKelvin(temperature));
            break;
		case 'K':
		case 'k':
			System.out.printf("%.2f C=%.2f C%n", temperature,kelvinToCelsius(temperature));
			System.out.printf("%.2f C=%.2f F%n", temperature,kelvinToFahrenheit(temperature));
            break;
        default:
        	System.out.println("Invalid unit. Please enter C,F,Or K.");
        
		}
		sc.close();
	}
    
}
