package exercises.ch3;


public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        //arrayPractice.printOddNumbers();
        arrayPractice.splitAGivenString();
    }

    public void printOddNumbers() {
        //1, 1, 2, 3, 5, 8
        //create and initialize an array
        int[] myArrayOfInts = {1, 1, 2, 3, 5, 8};

        //loop through the array and print out each value
        for (int i = 0; i < myArrayOfInts.length; i++) {
            //if number is not divisible by 2 then number is odd
            //can check for even/odd with modulus (%)
            if (myArrayOfInts[i] % 2 == 1) {
                System.out.println(myArrayOfInts[i]);
            }
        }
    }

    //use a string and the split method to divide the string at each space
    // and then store words in an array
    public String[] splitAGivenString() {
        String myProvidedString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        //giving .split method a delimiter of a empty space will split sentence at the spaces
        String[] mySplitStrings = myProvidedString.split(" ");
        //print the array of words to verify its correct
        //System.out.println(Arrays.toString(mySplitStrings));

        //adjust above method to split a given string into sentences
        //String myProvidedString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        //String[] mySplitStrings = myProvidedString.split("\\.");
        //System.out.println(Arrays.toString(mySplitStrings));

        return mySplitStrings;

    }
}
