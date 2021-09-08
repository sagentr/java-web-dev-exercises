package exercises;

import java.util.Scanner;

public class MilesPerGallon {

  public static void main(String[] args) {
      //call to run later
      MilesPerGallon milesPerGallon = new MilesPerGallon();
      milesPerGallon.calculateMilesPerGallon();
  }

  public void calculateMilesPerGallon() {
      Scanner scanner = new Scanner(System.in);

      System.out.println("How many miles have you driven? ");
      Double milesDriven = scanner.nextDouble();

      System.out.print("How many gallons of gas has your vehicle consumed?");
      Double gallonsConsumed = scanner.nextDouble();

      // Miles per gallon = miles / gallons;

      Double milesPerGallon = milesDriven / gallonsConsumed;
      System.out.println("your mileage per gallon is: " + milesPerGallon.toString());

  }
}
