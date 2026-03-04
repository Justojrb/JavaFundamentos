package datastructure.list;

/**
 * 
 *@author Justo
 *4 mar 2026
 */

public interface List <E> {
/**
 * Add an element to the list
 * @param e
 */
	
	public void add (E e);
	
	public E removeLast ();
}
