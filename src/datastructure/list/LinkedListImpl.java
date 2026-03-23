package datastructure.list;

import java.time.chrono.IsoChronology;

public class LinkedListImpl<E> implements List<E> {

	// used to point to the first node of the list so we can go to the next one and
	// the next one and so on
	private Node<E> first;
	/**
	 * this reference is used to point to the last node of the list, so we can add
	 * new nodes to the end of the list without having to go through the whole list
	 */
	private Node<E> last;
	/**
	 * number of the elements in the list.
	 */
	private int size;

	public void add(Node<E> node) throws Exception {
		// 1 check the parameter if it is valid
		if (node == null) {
			throw new Exception("You can not pass a null node to the list");
		}
		// 2 add the node to the tail of the list
		// 2.1 Check first if the head element is null,
		// in the case of null, it means the list is empty
		if (first == null) {// if the list is empty
			// the list is empty
			last = node;
			first = node;
		} else {
			last.setNext(node);
			last = node;
		/**
		 * The problem is that you never link the new node 
		 * to the previous last node, so the list gets broken after the first element.
		 * To fix this, you need to set the next reference of the current last node to the new node before updating the last reference.
		 */
		}
		size++;
	}

	@Override
	public void add(E data) {

		System.out.println("size = " + size);
		// 1 create a new node
		Node<E> newNode = new Node<>(data);
		// 2 add the new node to the list
		// System.out.println(first);
		// System.out.println(last);
		// System.out.println(newNode);
		size++;
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
		first = last = null;
		size = 0;

	}

	@Override
	public void printList() {
		if (first == null) {
			System.out.println("La lista está vacía");
			return;
		}
		
		Node<E> current = first;
   }
}
