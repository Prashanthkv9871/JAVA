import java.util.*;
import java.util.stream.Collectors;

public class StreamReduceDemo{
    public static void main(String[] args){
        List<Integer> numbersList =new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);

        // demonstration of reduce method 

        // Identity – an element that is the initial value of the reduction operation and the default result if the stream is empty
        
        // Accumulator – a function that takes two parameters: a partial result of the reduction operation and the next element of the stream
        
        // Combiner – a function used to combine the partial result of the reduction operation when the reduction is parallelized or when there's a mismatch between the types of the accumulator arguments and the types of the accumulator implementation
        
        int sum = numbersList.stream().reduce(0,(ans,i)-> ans + i);

        System.out.println("Sum of all elements in the numberList : " +sum);
    }
}