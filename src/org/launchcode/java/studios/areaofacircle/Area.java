package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


//ask the user for radius
//calculate the area
//print the result to screen

public class Area {

    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }
//declare class variables here

    //create constructors here
    public Area() {

    }

    //create other methods
    public void calculateArea() {
        //ask for the radius
        Scanner input = new Scanner(System.in);
        try {
            boolean keepOnLooping = true;
            while (keepOnLooping) {
                Double myUsersRadius = input.nextDouble();

                //add validation in case there is a negative number
                if (myUsersRadius < 0) {
                    System.out.println("You can not enter a negative number!");
                    //re-prompt the user

                } else {

                    //calculate area
                    //area = pi * radius * radius
                    Double area = Circle.getArea(myUsersRadius);

                    //print the result
                    System.out.println(area);
                    //continue business as normal
                    //tell the while loop to exit by setting the flag to false
                    keepOnLooping = false;
                }
            }
            } catch(Exception error){
                System.out.println("you must provide a numeric input.");
            }
        //close the scanner
        input.close();
    }

}
