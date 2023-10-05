public class Node {
    public Integer element;
    public Node next;
    public Node prev;

    public Node(Integer element) {
        this.element = element;
        next = null;
        prev = null;
    }

    public Node(Integer element, Node next) {
        this.element = element;
        this.next=next;
    }
}