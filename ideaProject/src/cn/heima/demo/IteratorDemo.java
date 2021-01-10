package cn.heima.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("12");
        coll.add("11");

        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
