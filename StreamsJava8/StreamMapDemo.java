
import java.util.*;
import java.util.stream.Collectors;

public class StreamMapDemo{
    public static void main(String[] args){
        List<Integer> numbersList =new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);

        // List<Integer> squaresList = new ArrayList<>();
        // for(Integer i: numbersList){
        //     squaresList.add(i*i);
        // }

        List<Integer> squaresList = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("List of squared numbers : "+ squaresList);

        // Set<Integer> squareSet1 = new HashSet<>();
        // for(Integer i : numbersList){
        //     squareSet1.add(i*i);
        // }

        Set<Integer> squareSet1 = numbersList.stream().map(x->x*x).collect(Collectors.toSet());

        System.out.println("Set of  squared numbers : "+ squareSet1);
    }
}