package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main_Collections {

	public static void main(String[] args) {
		//usando arraylist
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("C");
		
		list.remove("C");
		
		Collections.sort(list);
		list.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		//usando linkedList
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("joão");
		linkedList.add("eliana");
		
		linkedList.addFirst("carlos");
		linkedList.addLast("debora");
		
		System.out.println("primeiro elemento " + linkedList.getFirst());
		linkedList.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		//USANDO FILA DE PRIORIDADE
		
		priorityQueue.add(30);
		priorityQueue.add(10);
		priorityQueue.add(1);
		
		System.out.println("PriorityQueue " + priorityQueue);
		System.out.println("PriorityQueue(cabeça da fila) " + priorityQueue.peek());
		
		while(!priorityQueue.isEmpty()) {
			//removendo da cabeça para o final
			System.out.println("Removendo " + priorityQueue.poll());
		}
		
		Queue<String> linkedListQueue = new LinkedList<>();
		
	}

}
