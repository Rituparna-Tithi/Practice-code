package Number5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

//collections
//List-> ArrayList,LinkedList
//Set-> HashSet
//Map-> HashMap
//Stack-> LIFO
//Queue-> FIFO

public class List {
	public static void main(String[] args) {
		
		ArrayList<String> fruitList= new ArrayList();
		fruitList.add("Mango");
		fruitList.add("apple");
		fruitList.add("PineApple");
		fruitList.add("Strawberry");
		fruitList.add("Mango");
		fruitList.add("PineApple");
		fruitList.remove("Mango");
		fruitList.remove("Strawberry");
		//fruitList.remove("Watermelon");
		
		
		System.out.println(fruitList);
		
	Set<String> numberSet= new HashSet<>();
		numberSet.add("one");
		numberSet.add("two");
		numberSet.add("one");
		
		System.out.println(numberSet);
		
		
		Map<String, String> address= new HashMap<>();
		address.put("Name", "Ritu");
		address.put("dob","1997");
		address.put("pw", "ritu");
		
		System.out.println(address.get("pw"));
		System.out.println(address.get("dob"));
	System.out.println(address.size());
	System.out.println(address.isEmpty());
	System.out.println(address.containsKey("Name"));
	
	Stack<String> book= new Stack<>();
	book.push("Panther Pnchali");
	book.push("Shesher Kabita");
	
	System.out.println(book.pop());// Shesher Kabita cause last In first out.
	System.out.println(book.peek());
	
	Queue<String> number= new LinkedList<>();
	number.add("One");
	number.add("two");
	number.add("Third");
	
	System.out.println(number.poll());//one cause First in first out
	System.out.println(number.poll());
	System.out.println(number.poll());
	System.out.println(number.poll());
	System.out.println(number.peek());

		
	}

}
