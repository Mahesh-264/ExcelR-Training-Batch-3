import java.util.*;

class HashSetDemo1 {
	void HSetMethod() {
		HashSet<Object> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age, and Name and Contact: ");
        int a = sc.nextInt();
        String b = sc.next();
        Long c = sc.nextLong();
		hashSet.add(a);
		hashSet.add(b);
		hashSet.add(c);
		System.out.println(hashSet);		
		for(Object x: hashSet) {
			System.out.println(x);
		}
	}
}
public class Demo031 {
	public static void main(String[] args) {
		HashSetDemo1 obj = new HashSetDemo1();
		obj.HSetMethod();
	}
}