package is_a_relationship.trys;

public class Child extends Parent{

    static int sc = 22;
    int nc = 20;
    static Child c= new Child();

    public static void main(String[] args) {
        childStatic();
        c.child();
    }
    public static void childStatic(){
        System.out.println(sp);
        System.out.println(sc);
        parentStatic();
    }
    public void child(){
        System.out.println(np);
        System.out.println(sp);
        System.out.println(nc);
        System.out.println(sc);
        parentStatic();
        parent();
    }

    {
        System.out.println(np);
        System.out.println(sc);
    }

}
