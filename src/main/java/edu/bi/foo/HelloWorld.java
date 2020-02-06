package edu.bi.foo;

public class HelloWorld {
    public static void main(String ...args){
        String name = "bob";
        if(args.length > 0){
            name = args [0];

        }
        System.out.println("hello, " + name + "from the world");
    }
}
