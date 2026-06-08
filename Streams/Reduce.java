package Streams;
import java.util.*;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(10,20,30);
        int sum= num.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
        
    }
  
    
}
