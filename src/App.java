import java.util.Arrays;
import java.util.LinkedList;

public class App {
  public static void main(String[] args) throws Exception {

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int[] unsortedArr = { 3, 2, 1, 4, 10, 6 };
    int needle = 2;
    // LinearSearch linear = new LinearSearch(arr, needle);
    // System.out.println(linear.getResult());
    
    // BinarySearch binary = new BinarySearch(arr, needle);
    // System.out.println(binary.getResult());

    // BubbleSort bubble = new BubbleSort(unsortedArr);
    // System.out.println(Arrays.toString(bubble.getResult()));     
      

    // int number = 5;
    // Recursion rec = new Recursion();
    // System.out.println(rec.sum(number));

    //int target = 1;
    //int hi = arr.length - 1;

    //BinarySearchRecursion binaryRecursion = new BinarySearchRecursion();
    //System.out.println(binaryRecursion.binarySearch(arr, target, 0, hi));
  
    
    int[] nums = {1, 2, 3, 4, 5};
    ListNode head = LinkedListUtils.createLinkedList(nums);
    //ListNode current = head;
    //while (current != null) {
    //  System.out.print (current.val + " ");
    //  current = current.next;
    //}
    ReverseLinkedList reverseLL = new ReverseLinkedList(head);
    reverseLL.getResult();
  }
}
