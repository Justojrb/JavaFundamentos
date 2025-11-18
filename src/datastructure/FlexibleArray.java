package datastructure;

/**
This is a class that represent an extensible array.
An array has a fixed capacity, when reaching the end
of the array, we have to expand it.
 * We use this constructor to create an array when we know
 * how many elements to store in the array
 * @param "size"
 */

public class FlexibleArray<T> {
<<<<<<< HEAD
    private static final int EXPANSION_FACTOR = 40;
=======
>>>>>>> dcc151a00a04fb1ae123c7b5d4a6f7d7e8c8e5bd
    //An array with fixed size
    private T [] elements;
    private static final int  INITIAL_CAPACITY = 5;
    //the variable to store how many elements we have added to the array
    private int size =0;

    /**
     * we use this constructor to create an array when we know
     * how many elements to store in the array
     * @param size
     */
    public FlexibleArray(int size){
<<<<<<< HEAD
        if(size <= 0){

        }
=======
>>>>>>> dcc151a00a04fb1ae123c7b5d4a6f7d7e8c8e5bd
        elements = (T[])new Object [size];
    }
    /**
     * Use this constructor to create an array with a default capacity.
     */
    public FlexibleArray(){
        elements = (T[])new Object [INITIAL_CAPACITY];


    }
    /**
     *add an element to the array at its last partition
     * @param t
     */
    public void add(T t) {
<<<<<<< HEAD
        elements[size] = t;
        //paso 0 : check if we have reached to the last position,
        //if true, we have to expand the capacity of the array
        //paso 1: add the element to the last position of the array
        if(size == elements.length) {
            //first we create a new array with mayor capacity
            T[] newArr = (T[])new Object[elements.length + EXPANSION_FACTOR];
        }
    }

    public void remove(int t) {
    	elements[t] = null;
    	size--;
=======
        //paso 0 : check if we have reached to the last position,
        //if true, we have to expand the capacity of the array
        //paso 1: add the element to the last position of the array
    }

    public void remove(int t) {
>>>>>>> dcc151a00a04fb1ae123c7b5d4a6f7d7e8c8e5bd
    }

    public int size (){
        return 0;
    }
}
