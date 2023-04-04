public class BinarySearch {

  private int[] array;
  private int needle;
  private boolean result = false;

  public BinarySearch(int[] array, int needle) {
    this.array = array;
    this.needle = needle;

    int lo = 0;
    int hi = this.array.length - 1;

    while (lo <= hi) {

      int m = (lo + (hi - lo) / 2);
      int v = this.array[m];
      if (this.needle < v) {
        hi = m - 1;
      } else if (this.needle > v) {
        lo = m + 1;
      } else if (this.needle == v) {
        this.result = true;
        break;
      }

    }

  }

  public boolean getResult() {
    return this.result;
  }

}
