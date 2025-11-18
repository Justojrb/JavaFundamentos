package datastructure;



public class FlexibleArrayTest {
    public static void main(String[] args) {
        FlexibleArray<Integer> flexibleArray = new FlexibleArray<>();
        new FlexibleArray<>(0);
        System.out.println("the current size = " + flexibleArray.size());

        for (int i = 0; i < 60; i++){
            flexibleArray.add(3 + i);
        }
        System.out.println("the current size = " + flexibleArray.size());


        flexibleArray.remove(4);
    }
}
