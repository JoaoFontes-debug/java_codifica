package stack;

public class Node <T> {
    T value;
    Node<T> top;
    Node<T> next;
    int size;

    public Node (T value) {
        this.value = value;
        this.top = null;
  
   }
    
    
    
}