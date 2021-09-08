package exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        //to add values inside ArrayList, you can directly initialize inside the original parentheses with adding Arrays.asList method(list numbers)
        //ArrayList<Integer> numbersToSum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //long method of initializing integers into an array list with .add method
        /*numbersToSum.add(1);
        numbersToSum.add(2);
        numbersToSum.add(3);
        numbersToSum.add(4);
        numbersToSum.add(5);
        numbersToSum.add(6);
        numbersToSum.add(7);
        numbersToSum.add(8);
        numbersToSum.add(9);
        numbersToSum.add(10);*/

        //Integer theSum = ArrayListPractice.sumAllEvenValues(numbersToSum);
        //System.out.println("The sum is: " + theSum.toString());
        //import the class and assign variable to the method and what it returns to use in our input feature
        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.splitAGivenString();

        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList(returnedWords));
        //add on to modify to catch user input: ask user to give input and then assign method to class and method with a variable
        System.out.println("What word length are you looking for: ");
        Integer searchLength = ArrayListPractice.getUserSearchInput();
        ArrayListPractice.printWordsWithFiveLetters(wordsToSearch, searchLength);

    }

    //Modify the code to prompt user to enter the word length for the search
    public static Integer getUserSearchInput() {
        //to collect input we need to use scanner and create variable to hold info
        Scanner scanner = new Scanner(System.in);
        Integer myUsersInt = scanner.nextInt();
        scanner.close();
        return myUsersInt;

    }

//write a static method to print out each word in a list that has 5 letters exactly
    public static void printWordsWithFiveLetters(ArrayList<String> words, Integer searchLength) {
        //first loop through the ArrayList
        for (int i = 0; i < words.size(); i++) {
            //next get the word out of the array list with ArrayList methods ).get
            if (words.get(i).length() == searchLength) {
            System.out.println(words.get(i));
             }
            }
        }

    //write a static method to find the sum of all even numbers in ArrayList
    public static Integer sumAllEvenValues(ArrayList<Integer> valuesToSum) {
    //loop through ArrayList and print value using .get method
        //create a variable outside loop to remember sum as it loops
        Integer sum = 0;
        for (int i = 0; i < valuesToSum.size(); i++) {
            //check if number is even with modulus
            if (valuesToSum.get(i) % 2 == 0) {
                sum = sum + valuesToSum.get(i);
                //shorter method: sum += valuesTosum.get(i)
            }
        }
        return sum;

    }
}

//in bonus, we have already created a variable to split string into words in another class.