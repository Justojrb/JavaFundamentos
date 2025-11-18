package datastructure;



public class FlexibleArrayTest {
    public static void main(String[] args) {
        FlexibleArray<Integer> flexibleArray = new FlexibleArray<>();
<<<<<<< HEAD
        new FlexibleArray<>(0);
        System.out.println("the current size = " + flexibleArray.size());

        for (int i = 0; i < 60; i++){
            flexibleArray.add(3 + i);
        }
        System.out.println("the current size = " + flexibleArray.size());


=======
        System.out.println("the current size = " + flexibleArray.size());
        flexibleArray.add(3);
>>>>>>> dcc151a00a04fb1ae123c7b5d4a6f7d7e8c8e5bd
        flexibleArray.remove(4);
    }
}
