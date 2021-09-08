package exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        //What data types should the dimensions be?
        //Double

        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateAreaOfRectangle();
    }

    public void calculateAreaOfRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the rectangle? ");
        Double myRectLength = scanner.nextDouble();

        System.out.println("What is the width of the rectangle? ");
        Double myRectWidth = scanner.nextDouble();

        //Area = width * length
        Double area = myRectLength * myRectWidth;

        System.out.println("The area of your rectangle is: " + area.toString());
    }
}
