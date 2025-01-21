import java.util.*;
class HashSetDemo2 {
    void HashsetMethod(){
        HashSet <String>hashSet = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 String Values:");
		String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        String e = sc.next();
		hashSet.add(a);
		hashSet.add(b);
		hashSet.add(c);
		hashSet.add(d);
		hashSet.add(e);
		System.out.println(hashSet);
    }	
}

public class Demo032 {
    public static void main(String[] args) {
		HashSetDemo2 obj = new HashSetDemo2();
        obj.HashsetMethod();
	}
}
