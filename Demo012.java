import java.util.*;
class DOG {
    void display() {
        System.out.println("DOG BARKS.");
    }
}
class ChildDOG extends DOG {
    @Override
    void display() {
        System.out.println("CHILD DOG ");
    }
}
class Demo012 {
    public static void main(String[] args) {
        DOG DOG = new DOG(); 
        DOG ChildDOG = new ChildDOG();
        DOG.display();
        ChildDOG.display(); 
    }
}
