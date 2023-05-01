
public class ReverseLinkedList  {

  ListNode result;

  public ReverseLinkedList (ListNode head) {
    ListNode curr = head;
    ListNode next = null;
    ListNode prev = null;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    curr = prev;
    this.result = curr;
     
  }

  public void getResult() {
    while (this.result != null) {
      System.out.print(this.result.val + " ");
      this.result = this.result.next;
    }
  }
}
