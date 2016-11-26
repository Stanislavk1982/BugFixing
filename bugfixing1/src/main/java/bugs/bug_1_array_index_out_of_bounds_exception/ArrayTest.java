package bugs.bug_1_array_index_out_of_bounds_exception;

import java.util.Scanner;

public class ArrayTest {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int numberArray[] = new int[4];
        System.out.println(numberArray);
        int findLowest;

        for (int i = 0; i <= numberArray.length-1; i++) {
            System.out.println("Enter a value for slot " + (i + 1) + ":");
            numberArray[i] = input.nextInt();
        }
        findLowest = getMin(numberArray);
        displayOutput(findLowest);
    }

    public static int getMin(int num[]) {

        int lowestNum = 999;
        for (int j = 0; j <= num.length-2; j++) {
            if (num[j] < lowestNum) {

                lowestNum = num[j];
            }
        }
        return lowestNum;
    }

    public static void displayOutput(int lowest) {
        System.out.println("The lowest number is: " + lowest);
    }
}
