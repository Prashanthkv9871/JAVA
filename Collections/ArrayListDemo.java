import java.util.*;

public class ArrayListDemo{
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>(5);

        for(int i=1;i<=5;i++){
            arrayList.add(i);
        }
            
        // Printing elements
        System.out.println(arrayList);

        //Remove element at index 3
        arrayList.remove(3);

        // Displaying the ArrayList
        // After deletion
        System.out.println(arrayList);

        // priting elements one by one
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println();
        for(int i : arrayList){
            System.out.print(i + " ");
        }
    }
}