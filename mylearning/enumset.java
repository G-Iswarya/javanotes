import java.util.EnumSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
enum enum1 {name,sno,dept,demo1}
public class enumset {

	public static void main(String[] args) {
		EnumSet<enum1> s1,s2,s3,s4;
		SortedSet<String> ss = new TreeSet<String>();
		ss.add("Ishu");
		ss.add("Anu");
		System.out.println(ss); //sort and print

		
		//-------------------map------------------
		
		Map<Integer,Integer> m1 = new HashMap<>();
		m1.put(1, 101);
		m1.put(3, 34);
		System.out.println(m1);
	}

}
