
public class App {
  public static void main(String[] args) throws Exception {

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int needle = 2;
    LinearSearch linear = new LinearSearch(arr, needle);

    BinarySearch binary = new BinarySearch(arr, needle);

    System.out.println(linear.getResult());

    System.out.println(binary.getResult());

  }
}
