import java.util.*;

class Parent{
    int p = 105;
    String q = "MB";
}
class child extends Parent{
    int r = super.p;
    String s = super.q;
}
class Demo011{
    public static void main(String[] args) {
        child chld = new child();
        System.out.println(chld.p);
        System.out.println(chld.q);
        System.out.println(chld.r);
        System.out.println(chld.s);
    }
}