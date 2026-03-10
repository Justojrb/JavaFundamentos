package datastructure.list;

import java.time.chrono.IsoChronology;

public class LinkedListImpl<E> implements List<E> {

	private Node<E> first;
	private Node<E> last;

	@Override
	public void add(E data) {
		// 1 create a new node
		Node<E> newNode = new Node<>(data);
		//2 add the new node to the list
		System.out.println(first);
		System.out.println(last);
		System.out.println(newNode);

		if (first == null) {
			// point to the new node with the first and the last
			first = last = newNode;
		}
		// 2.1 if the list is not empty, add the new node to the end of the list
		else {
			last.setNext(newNode);
			// set the last node to the new node
			last = newNode;

		}
	}

	@Override
	public E removeLast() {
		return null;
	}

	@Override
	public void clear() {

	}

	@Override
	public void printList() {

	}
}
