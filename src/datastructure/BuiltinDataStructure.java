package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BuiltinDataStructure {
	public static void main(String[] args) {
		//Create two objects of class String {@link String}
		String string1 = new String("pepe");
		String string2 = new String("juan");
		//Create an object of array with a fixed size
		String[] strings = new String[5];
		strings[0] = string1;
		strings[0] = string2;
		//Create an object of class {@link ArrayList}
		ArrayList<String> stringsArrayList = new ArrayList<>();
		//add an object to position 0
		stringsArrayList.add(string1);
		//add an object to position 1
		stringsArrayList.add(string2);
		//retrieve the value at index 1
		stringsArrayList.get (1);
		//create an object of linked list and add some objects
		LinkedList<String> names = new LinkedList <> ();
		names.add("pablo");
		names.add("justo");
		//less efficient than accessing elements inside an array when using its index
		names.get(1);
		
		Stack<Integer> callstack = new Stack<>();
		//add an element to the top of the stack
		callstack.push(34);
		callstack.push(56);
		callstack.push(78);
		//peek is used to read the element on top of the stack without removing it–
		System.out.println(callstack.peek());
		//Removes the object at the top of this stack and returns that object as the value of this function.
		System.out.println(callstack.pop());
		System.out.println(callstack.peek());
		
		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.add(123);
		queue.add(213);
		queue.add(332);
		queue.add(454);
		System.out.println(queue.poll());
		//poll is used to read the element at the head of the queue without removing it–
		
		TreeMap<String, Integer> tree;
		
		HashMap<String, Integer> users = new HashMap<>();

	}
}
