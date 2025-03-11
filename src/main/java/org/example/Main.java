package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public  static  void usingIntStream(){

        System.out.println("printing steams using Intstream");

        IntStream s= IntStream.of(1,2,3,4);
        IntStream s1=IntStream.range(1,5);
        s.forEach(System.out::print);
        s1.forEach(System.out::print);



    }

    public  static  void  usingIterate(){
        System.out.println("generating streams using iterate function ");
//        Stream<Integer> s= Stream.iterate(1,n->n*n).limit(10);
//        s.forEach(System.out::println);
        Stream<Integer> powersOfTwo = Stream.iterate(1, n -> n+2).limit(10);
        powersOfTwo.forEach(System.out::println);

    }

    public  static void  generateStream(){
        System.out.println("using generate stream function");
              Stream<String> s =Stream.generate(()->"hello").limit(3);
              s.forEach(System.out::println);

    }


    public static  void  flatmapAndMap(){

//        List<String> names = List.of("John", "Jane", "Jack");
//
//                 names.stream().flatMap(word->word.chars().mapToObj(c->(char) c)).forEach(System.out::println);

        List<String> names = List.of("John", "Jane", "Jack");
        List<Integer> nameLengths = names.stream()
                .map(word->word.length())
                .collect(Collectors.toList());
        System.out.println(nameLengths);


        List<String> words = List.of("apple", "banana", "cherry");
        List<Stream<Character>> charStreams = words.stream()
                .map(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println(charStreams);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Stream<Integer> s= Stream.of(1,3,4);
        s.forEach(System.out::println);


        String[] fruits = {"Mango", "Peach", "Grapes"};

        Stream<String> f= Arrays.stream(fruits);
        f.forEach(n-> System.out.println(n));

//        generateStream();
//        usingIterate();
//        usingIntStream();
        flatmapAndMap();


    }
}