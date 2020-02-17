package Streams;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class StreamClass {

    @Test
    public void getCount()
    {
        ArrayList<String> name = new ArrayList<String>();

        name.add("Ajhjh");
        name.add("Dkjjk");
        name.add("add");
        name.add("Asdf");
        name.add("ttt");
        name.add("Asifa");

        Long c=name.stream().filter(s->s.startsWith("A")).count();
        name.stream().filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
        System.out.println(c);
    }
}
