public class LinkedListUtils {
  public static ListNode createLinkedList(int[] nums) {
    if (nums == null || nums.length == 0) {
      return null;
    }

    ListNode head = new ListNode(nums[0]);
    ListNode curr = head;

    for (int i = 1; i < nums.length; i++) {
      curr.next = new ListNode(nums[i]);
      curr = curr.next;
    }

    return head;
  }
}
