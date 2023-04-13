public class DoublyLinkedList {

  class Node {
    public int value;
    public Node previous;
    public Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  public int length;
  private Node head; //
  private Node tail;

  public DoublyLinkedList() {
    this.length = 0;
    this.head = null;
    this.tail = null;
  }

  public void prepend(int item) {
    Node node = new Node(item);
    this.length++;
    if (this.head == null) {
      this.head = this.tail = node;
      return;
    }

    node.next = this.head;
    this.head.previous = node;
    this.head = node;
  }

  public void insertAt(int item, int idx) {
    if (idx > this.length) {
      throw new IndexOutOfBoundsException();
    }

    else if (idx == this.length) {
      this.append(item);
    } else if (idx == 0) {
      this.prepend(item);
    }

    this.length++;

    Node curr = this.getAt(idx);

    Node node = new Node(item);
    node.next = curr;
    node.previous = curr.previous;
    curr.previous = node;

    if (node.previous != null) {
      node.previous.next = curr;
    }
  }

  public void append(int item) {
    this.length++;

    Node node = new Node(item);

    if (this.tail == null) {
      this.head = this.tail = node;
      return;
    }

    node.previous = this.tail;
    this.tail.next = node;
    this.tail = node;

  }

  public int remove(int item) {
    Node curr = this.head;

    for (int i = 0; i < this.length; i++) {
      if (curr.value == item) {
        break;
      }

      curr = curr.next;
    }

    if (curr == null) {
      return 0;
    }

    return this.removeNode(curr);

  }

  public int get(int idx) {
    return this.getAt(idx).value;
  }

  public int removeAt(int idx) {
    Node node = this.getAt(idx);

    if (node == null) {
      return 0;
    }

    return this.removeNode(node);

  }

  private int removeNode(Node node) {
    this.length--;

    if (this.length == 0) {
      int out = this.head.value;
      this.head = this.tail = null;
      return out;
    }

    if (node.previous != null) {
      node.previous.next = node.next;
    }

    if (node.next != null) {
      node.next.previous = node.previous;
    }

    if (node == this.head) {
      this.head = node.next;
    }

    if (node == this.tail) {
      this.tail = node.previous;
    }

    node.previous = node.next = null;
    return node.value;

  }

  private Node getAt(int idx) {
    Node curr = this.head;

    for (int i = 0; i < idx; i++) {
      curr = curr.next;
    }
    return curr;

  }

}
