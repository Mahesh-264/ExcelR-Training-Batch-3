import java.util.*;

public class Demo030 {
public static void main(String[] args) {
ArrayList<Integer> arrayList1 = new ArrayList<>();
arrayList1.add(100);
arrayList1.add(200);
arrayList1.add(100);
arrayList1.add(0);
arrayList1.add(900);
arrayList1.add(600);

    System.out.println("Elements of the list: ");
    Iterator<Integer> iterator = arrayList1.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
}

}