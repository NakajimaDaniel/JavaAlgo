public class BubbleSort {

  private int[] array;

  public BubbleSort(int[] array) {
    this.array = array;

    for (int i = 0; i < this.array.length; i++) {
      for (int j = 0; j < this.array.length - 1; j++) {
        if (this.array[j] > this.array[j + 1]) {
          int temp = this.array[j + 1];
          this.array[j + 1] = this.array[j];
          this.array[j] = temp;
        }
      }
    }

  }

  public int[] getResult() {
    return this.array;
  }

}
