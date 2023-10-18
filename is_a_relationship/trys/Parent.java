package is_a_relationship.trys;

public class Parent {
    static int sp = 12;
    int np = 10;
    Parent(){}

    static {
        System.out.println("I am from Static !! ");
    }
    {
        System.out.println("I am from Non-Static !! ");
    }

    public static void parentStatic(){
        System.out.println("I am from Parent and I am Static !! ");
    }
    public void parent(){
        System.out.println("I am from Parent and I am non-Static !! ");
    }

};

