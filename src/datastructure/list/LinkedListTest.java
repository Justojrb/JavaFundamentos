package datastructure.list;

import oopmodeling.Planet;

public class LinkedListTest {

	public static void main(String[] args) {

		Node<Planet> first = new Node<Planet>(new Planet(1, "Earth"));
		Node<Planet> second = new Node<Planet>(new Planet(2, "Mars"));
		Node<Planet> third = new Node<Planet>(new Planet(3, "Venus"));
		Node<Planet> fourth = new Node<Planet>(new Planet(4, "Mercury"));

		first.setNext(second);
		second.setNext(third);
		third.setNext(fourth);

		LinkedListImpl<Integer> list = new LinkedListImpl<>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);

	}
}