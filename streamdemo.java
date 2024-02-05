import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

class streamdemo{
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(5,6,1,2,4,8,9,3,3);
        long c = ls.stream()
        .filter(e->e%2!=0).distinct().count();
        System.out.println("Odd no in stream are :- "+c);
    }
}