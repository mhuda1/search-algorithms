/**
 * This is an algorithm to search the GCD of numbers Written by Mushaffa Huda
 */
public class GCD {
  public static void main(String[] args) {
    // Input array
    int[] arr = new int[] { 4, 3, 12, 144, 288 };

    // Printing out the result
    System.out.print(cariFpb(arr));
  }

  /**
   * Recursive Function to return the GCD of two numbers
   * 
   * @param a
   * @param b
   * @return
   */
  public static int fpb(int a, int b) {

    // best case
    if (a == 0) {
      return b;
    }

    // recursive
    else {
      return fpb(b % a, a);
    }
  }

  /**
   * method to search GCD of list of numbers
   * 
   * @param x
   * @return
   */
  public static int cariFpb(int[] x) {

    // set the start int
    int mulai = x[0];

    // looping through the array
    for (int i = 1; i < x.length; i++) {
      mulai = fpb(mulai, x[i]);
    }

    // return result
    return mulai;
  }
}
