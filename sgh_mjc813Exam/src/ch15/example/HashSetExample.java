package ch15.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("Java",30));
        set.add(new Member("JDBC",40));
        set.add(new Member("JSP",50));
        set.add(new Member("Java",30));
        set.add(new Member("Spirng",40));
        int size1=set.size();

        System.out.println(size1);
        Iterator<Member> iterator = set.iterator();
        while(iterator.hasNext()){
            String a=iterator.next().toString();
            System.out.println(a);
            iterator.remove();
        }
        int size2=set.size();

        System.out.println(size2);
    }
}
