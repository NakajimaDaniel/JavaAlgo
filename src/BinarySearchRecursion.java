public class BinarySearchRecursion {

  public boolean binarySearch(int[] arr, int target, int lo, int hi) {

    int middle = (lo + hi) / 2;
    int value = arr[middle];

    if (lo > hi) {
      return false;
    }

    if (value == target) {
      return true;
    }

    if (value > target) {
      return binarySearch(arr, target, lo, middle);
    } else {
      return binarySearch(arr, target, middle + 1, hi);
    }

  }

}
