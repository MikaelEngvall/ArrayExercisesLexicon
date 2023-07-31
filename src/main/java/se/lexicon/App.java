package se.lexicon;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Array exercises
 */
public class App {
    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        // ex4();
        // ex5();
        // ex10();
        // ex11();
        // ex12();
        ex13();
    }

    public static void ex13() {
        int size = 10; // Arbitrary size of the arrays
        int[] originalArray = new int[size];
        int[] rearrangedArray = new int[size];

        // Fill the originalArray with random numbers
        fillWithRandomNumbers(originalArray);

        // Rearrange the elements
        rearrangeArray(originalArray, rearrangedArray);

        // Print the originalArray
        System.out.println("Original Array:");
        printIntArray(originalArray);

        // Print the rearrangedArray
        System.out.println("Rearranged Array:");
        printIntArray(rearrangedArray);
    }
    public static void ex12() {
        int[][] twoDimArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int rows = twoDimArray.length;
        int columns = twoDimArray[0].length;

        // Check if the array is square (rows == columns) to have a diagonal
        if (rows != columns) {
            System.out.println("The array is not square, so it doesn't have a diagonal.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            System.out.print(twoDimArray[i][i] + " ");
        }
        System.out.println();
        System.out.println("Diagonal elements of the two-dimensional array:");
    }

    public static void ex11() {
        final int specificValue = -1; // Specific value to stop the input loop
        int[] array = new int[100]; // Initialize an array to store user input
        int size = 0; // Variable to keep track of the number of elements entered

        Scanner scanner = new Scanner(System.in);

        // Input integers from the user until the specific value is entered
        while (true) {
            System.out.print("Enter an integer (or " + specificValue + " to stop): ");
            int input = scanner.nextInt();

            if (input == specificValue) {
                break;
            }

            array[size] = input;
            size++;
        }

        // Print the original array
        System.out.println("Original array:");
        printIntArraySize(array, size);

        // Reverse the array elements
        reverseArray(array, size);

        // Print the reversed array
        System.out.println("Reversed array:");
        printIntArraySize(array, size);

    }

    public static void ex10() {
        int[][] multiplicationTable = new int[10][10];

        // Fill the multiplication table array with values
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the multiplication table
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void ex5() {
        // Create a 2-dimensional string array [2][2]
        String[][] countryCityArray = new String[2][2];

        // Assign values to the 2-dimensional array
        countryCityArray[0][0] = "France";
        countryCityArray[0][1] = "Paris";
        countryCityArray[1][0] = "Sweden";
        countryCityArray[1][1] = "Stockholm";

        // Print the values from the 2-dimensional array
        for (int i = 0; i < countryCityArray.length; i++) {
            for (int j = 0; j < countryCityArray[i].length; j++) {
                System.out.print(countryCityArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ex4() {
        int[] firstArray = {1, 15, 20};
        int[] secondArray = new int[firstArray.length];

        // Copy elements from the first array to the second array
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }

        // Print the elements from the first array
        System.out.print("Elements from first array: ");
        printIntArray(firstArray);

        // Print the elements from the second array
        System.out.print("Elements from second array: ");
        printIntArray(secondArray);
    }


    public static void ex3() {
        String[] strArray = {"Paris", "London", "New York", "Stockholm"};

        // Print the original string array
        System.out.print("Original string array: ");
        printArray(strArray);

        // Sort the string array
        Arrays.sort(strArray);

        // Print the sorted string array
        System.out.print("Sorted string array: ");
        printArray(strArray);
    }

    public static void ex2() {
        final int maxSize = 10; // Maximum size of the array
        int[] arr = new int[maxSize]; // Declare an array to store integers
        int size; // Variable to store the size of the array

        // Input the size of the array from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array (maximum " + maxSize + "): ");
        size = scanner.nextInt();

        // Input the elements into the array
        System.out.print("Enter " + size + " elements separated by spaces: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the number to find its index
        System.out.print("Enter the number to find its index: ");
        int numToFind = scanner.nextInt();

        // Call the indexOf method to find the index of the number
        int index = indexOf(arr, size, numToFind);

        // Print the result
        if (index != -1) {
            System.out.println("Index position of number " + numToFind + " is: " + index);
        } else {
            System.out.println("Number " + numToFind + " not found in the array.");
        }
    }

    public static void ex1() {
        final int maxSize = 10; // Maximum size of the array
        int[] arr = new int[maxSize]; // Declare an array to store integers
        int size; // Variable to store the size of the array

        // Input the size of the array from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array (maximum " + maxSize + "): ");
        size = scanner.nextInt();

        // Input the elements into the array
        System.out.print("Enter " + size + " elements separated by spaces: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the elements of the array
        System.out.print("Elements in the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to print an array
    public static void printIntArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }

    // Method to print an array
    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Method to find the index of an element in the array
    public static int indexOf(int[] arr, int size, int numToFind) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == numToFind) {
                return i;
            }
        }
        return -1; // Element not found in the array
    }
    // Method to reverse the array elements
    public static void reverseArray(int[] arr, int size) {
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
    }
    // Method to print an array
    public static void printIntArraySize(int[] arr, int size) {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    // Method to fill an array with random numbers
    public static void fillWithRandomNumbers(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // Generate random numbers between 0 and 99
        }
    }

    // Method to rearrange the elements
    public static void rearrangeArray(int[] original, int[] rearranged) {
        int leftIndex = 0;
        int rightIndex = rearranged.length - 1;

        for (int i = 0; i < original.length; i++) {
            if (original[i] % 2 == 0) {
                rearranged[rightIndex] = original[i];
                rightIndex--;
            } else {
                rearranged[leftIndex] = original[i];
                leftIndex++;
            }
        }
    }
}
