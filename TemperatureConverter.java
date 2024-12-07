import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       // Menu to take in user input
       System.out.println("Welcome to my temperature converter!");
       System.out.println("Choose your conversion");
       System.out.println("1. Celsius to Fahrenheit");
       System.out.println("2. Fahrenheit to Celsius");

       // Storing the menu option for the user
       int input = sc.nextInt();

       if(input == 1) {
           //Taking in temperature in Celsius, converting it to Fahrenheit and displaying it
           System.out.println("Enter temperature in Celsius");
           int celsius = sc.nextInt();
           int fahrenheit = (celsius * 9/5) + 32;
           System.out.println(fahrenheit + "°F");
       } else if (input == 2) {
           //Taking in temperature in Fahrenheit, converting it to Celsius and displaying it
           System.out.println("Enter temperature in Fahrenheit");
           int fahrenheit = sc.nextInt();
           int celsius = (fahrenheit - 32) * 5/9;
           System.out.println(celsius + "°C");
       } else {
           System.out.println("Invalid input");
       }

    }
}
