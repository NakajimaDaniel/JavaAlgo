public class LinearSearch {

  private int[] array;
  private int needle;
  private boolean result = false;

  public LinearSearch(int[] array, int needle) {
    this.array = array;
    this.needle = needle;

    for (int i = 0; i < this.array.length; i++) {
      if (this.array[i] == this.needle) {
        this.result = true;
      }
    }

  }

  public boolean getResult() {
    return this.result;
  }

  public void setArray(int[] array) {
    this.array = array;
  }

  public int[] getArray() {
    return this.array;
  }

}
