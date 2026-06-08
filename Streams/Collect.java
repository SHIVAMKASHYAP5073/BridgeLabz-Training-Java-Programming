package Streams;
import java.util.*;
import java.util.stream.Collectors;


public class Collect {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(2,3,4,5,6,7,8);
        List<Integer> list= nums.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(list);
        


        
    }
    
}
