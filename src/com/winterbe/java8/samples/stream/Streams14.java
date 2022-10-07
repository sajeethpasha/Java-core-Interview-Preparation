package com.winterbe.java8.samples.stream;

import java.util.stream.Stream;

public class Streams14 {

    public static void main(String[] args) {
        Stream<?> inp = Stream.of(1, 2, 3, 4, 5);
        Stream subStream = Stream.of(1, 2, 3, 4, 5).filter(i -> i < 4 );
        long count = subStream.count();
        System.out.println(count);

       Stream.of(1, 2, 3, 4, 5)
                .filter(i -> i <4) // Intermediate Operation filter
                .count(); // Terminal Operation count
    }
}
