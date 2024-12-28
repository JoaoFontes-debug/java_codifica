import DS.doubly_Linked_List.*;

public class Main {
    public static void main(String[] args) {
    	DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    	
    	System.out.println("Adicionar elementos no final: ");
    	
    	list.addLast(1);
    	list.addLast(2);
    	list.addLast(3);
    	
    	list.addFirst(7);    	
    	list.display();
    	System.out.println(list.size());
    	
    	
    	
    }
}