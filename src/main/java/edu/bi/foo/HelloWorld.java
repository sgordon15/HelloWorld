package edu.bi.foo;

public class HelloWorld {
    public static void main(String ...args){
        String name = (args.length > 0) ? args [0] :"bob"
        System.out.println("hello, " + name + "from the world");

        }

    }
}
