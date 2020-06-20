package p2;

import p1.Main;
import p1.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test2 {

    public static void main(String... dali) {

       String s = "hello";
       String t = new String(s);

       if("hello".equals(s)) System.out.println("one");
       if(t==s) System.out.println("two");
       if(t.equals(s)) System.out.println("3");
       if("hello" == s) System.out.println("4");
       if("hello" == t) System.out.println("5");

        System.out.println(s.hashCode());
        System.out.println(t.hashCode());

        StringBuilder sb = new StringBuilder();
    }


}