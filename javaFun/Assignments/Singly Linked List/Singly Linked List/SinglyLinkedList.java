public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public SinglyLinkedList(int value) {
        this.head = new Node(value);
        // your code here
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(this.head == null) {
            this.head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove() {
        if(this.head.next == null) {
            this.head = null;
        } else {
            Node runner = this.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner = null;
        }
    }
    public void printValues() {
        if(this.head == null) {
            System.out.println("No nodes in list");
        } else {
            Node runner = this.head;
            int counter = 1;
            while(runner != null){
                System.out.println("Node " + counter + ": " + runner.val);
                counter ++;
                runner = runner.next;
            }
        }
    }
}