package DS.doubly_Linked_List;

public class Node <T> {
    T value;
    Node <T> next;
    Node<T> previous;

    public Node (T value) {
        this.value = value;
        this.next = null;
        this.previous = null;

    }


}
