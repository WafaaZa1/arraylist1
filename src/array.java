import java.util.ArrayList;
public class array {

    public static void main(String[] args){
        int simple_array[] = new int[5];

        ArrayList<Integer> myList = new ArrayList<Integer>(5);
        myList.add(1);
        myList.add(5);
        myList.add(3);

        int size = 10;
        int[] data = new int[size];
        for (int i= 0; i < size; ++i){
            data[i] = (int)(Math.random() * 100);
        }
        System.out.println("Before sorting: ");
        for (int i = 0; i < size; ++i){
            System.out.println(data[i]);
        }
        for (int i= 0; i < size; ++i){
            for (int j = i; j > 0; --i){
                if (data[j-1] > data[j]){
                    int temp = data [j];
                    data[j] = data[j-1];
                    data[j-i] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting: ");
        for (int i = 0; i < size; ++i) {
            System.out.println(data[i]);
        }
    }

}
