import java.util.*;
import java.util.stream.Collectors;

public class StreamFilter{
    public static void main(String[] args){
        List<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("python");
        languages.add("Scala");

        // List<String> filterResult = new ArrayList<>();
        // for(String s : languages){
        //     if(s.startsWith("p")){
        //         filterResult.add(s);
        //     }
        // }

        List<String> filterResult = languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());

        System.out.println("Languages starting with 'p' : " + filterResult);
        
    }
}