package Streams;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

    //@Test
//    public void getCount()
//    {
//        ArrayList<String> name = new ArrayList<String>();
//
//        name.add("Ajhjh");
//        name.add("Dkjjk");
//        name.add("add");
//        name.add("Asdf");
//        name.add("ttt");
//        name.add("Asifa");
//
//        Long c=name.stream().filter(s->s.startsWith("t")).count();
////        name.stream().filter(s->s.startsWith("t")).forEach(s->System.out.println(s));
//
//
//        name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
////        name.stream().filter(s->s.length()<4).max(2)
//        System.out.println(c);
//    }


    @Test
    public void upperCase()
    {
//        System.out.println("Hello");
//        Stream.of("Ajhjh","Dkjjk","add","Asdf","ttt","Asifa").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

        List<String> names= Arrays.asList("Ajhjh","Dkjjk","add","Asdf","ttt","Asifa");
//        names.stream().filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s));

        boolean pre=names.stream().anyMatch(s->s.contains("Asfa"));

//        System.out.println(pre);


       List<String> ls= Stream.of("Ajhjh","Dkjjk","add","Asdf","ttt","Asifa","Asma").filter(s->s.endsWith("a")).collect(Collectors.toList());
       System.out.println(ls.get(1));
       System.out.println(ls.size());


    }
}
