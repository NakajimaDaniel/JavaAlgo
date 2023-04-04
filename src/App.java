import java.util.Arrays;

public class App {
  public static void main(String[] args) throws Exception {

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int[] unsortedArr = { 3, 2, 1, 4, 10, 6 };
    int needle = 2;
    // LinearSearch linear = new LinearSearch(arr, needle);

    // BinarySearch binary = new BinarySearch(arr, needle);

    BubbleSort bubble = new BubbleSort(unsortedArr);

    // System.out.println(linear.getResult());

    // System.out.println(binary.getResult());

    System.out.println(Arrays.toString(bubble.getResult()));

  }
}
