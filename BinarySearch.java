/**
 * This is a Binary Search Algorithm Written by Mushaffa Huda change the input
 * or target number for different results
 * 
 * This Example check an array of integers to see if contains value of x, but it
 * could be implemented for other values as well ( ex. String, Long, etc)
 */
public class BinarySearch {
    public static void main(String[] args) {

        // Array to be checked ( must be sorted )
        int[] Array = new int[] { 1, 3, 6, 8, 11, 24, 36 };

        // Printing output calling the search method
        System.out.println(BinarySearchMethod(Array, 10));
    }

    /**
     * Binary Search method for calling the method recursively or iteratively
     * 
     * @param array
     * @param x
     * @return
     */
    static boolean BinarySearchMethod(int[] array, int x) {
        return BinarySearchRecursive(array, x, 0, array.length - 1);
        // return BinarySearchRecursive(array, x);
    }

    /**
     * Binary Search using Recursive
     * 
     * @param array
     * @param x
     * @param start
     * @param end
     * @return
     */
    static boolean BinarySearchRecursive(int[] array, int x, int start, int end) {

        // check best case if the start have exceed the end of the array
        if (start > end) {
            return false;
        }

        // Defining mid
        int mid = start + ((end - start) / 2);

        // if number equals mid return true
        if (array[mid] == x) {
            return true;
        }
        // if number is smaller than mid then return the lower part of the array
        else if (array[mid] > x) {
            return BinarySearchRecursive(array, x, start, mid - 1);
        }
        // if number is greater than mid then return the top part of the array
        else {
            return BinarySearchRecursive(array, x, mid + 1, end);
        }
    }

    /**
     * Binary Search using Iterative
     * 
     * @param array
     * @param x
     * @return
     */
    static boolean BinarySearchIterative(int[] array, int x) {
        // Defining Start and end of array
        int start = 0;
        int end = array.length - 1;

        // defining mid
        int mid = start + ((end - start) / 2);

        // while loop
        while (start <= end) {

            // if number equals mid return true
            if (array[mid] == x) {
                return true;
            }
            // if number smaller than mid then set the end to one element before mid
            else if (array[mid] > x) {
                end = mid - 1;
            }
            // if number is bigger than mid then set the start to one element after mid
            else {
                start = mid + 1;
            }
        }
        // return false if no number of equal value exist in the array
        return false;
    }
}