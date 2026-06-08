package Streams;
// import java.util.ArrayList;
import java.util.*;

public class EvenNum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,5,6,8);

        list.stream().filter(x-> x%2==0).forEach(System.out::println);
        
    }

    
}