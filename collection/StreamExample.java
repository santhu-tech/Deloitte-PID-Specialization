package com.day3.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum=numbers.stream()   //created the stream
                .filter(x->x%2==0)  //Intermediate operators
                .mapToInt(x->x*x) //Intmrediate operators
                .sum();
                //.forEach(System.out::println); //output  Terminal operators
        System.out.println(sum);
    }

    //List<Integer> list=List.of( 1,2,3);
    list.add(4)
    Map.of()
    map.put()
}

