import java.util.*;
import java.util.stream.Collectors;

public class StreamForEachDemo{
    public static void main(String[] args){
        List<String> languages = new ArrayList<>();
        languages.add("scala");
        languages.add("java");
        languages.add("python");
        languages.add("basic");
        
        List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());

        System.out.println("Language sorted alphabetically : "+ sortedList);

        System.out.println("Printing all elements one by one : ");
        languages.stream().forEach(y->System.out.println("element is : " + y));

    }
}