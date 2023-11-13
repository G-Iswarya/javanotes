import java.util.*;
import java.io.*;
public class iteratebles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l1 = new LinkedList<>();
		for(int i=0;i<5;i++)
		{
			l1.add(sc.nextInt());
		}
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//---------------------------------------------------------
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.iterator().forEachRemaining(System.out::println);
		
		//-------------------------------------------------------------
		
		OptionalLong op1 = OptionalLong.empty();
		op1.ifPresentOrElse(value
			-> {
				System.out.println(value);
			}, ()->{
				System.out.println("empty");
			});

		//----------------------abstract list------------------------
		
		AbstractList<Integer> ab1 = new ArrayList<Integer>();
		ab1.add(121);
		ab1.add(134);
		ab1.add(456);
		System.out.println(ab1);
		
		//-----------------abstract sequentiallist-------------------
		
		AbstractSequentialList<Integer> as = new LinkedList<Integer>(); //takes only linkedlist
		as.add(121);
		as.add(134);
		as.add(456);
		System.out.println(as);
		
		//------------------arraylist----------------------------------
		
		ArrayList<Integer> al = new ArrayList<Integer>(2); //takes values irrespective of size
		al.add(121);
		al.add(134);
		al.add(456);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		Random r = new Random();
		for(int i=0;i<al.size();i++)
		{
			int x = r.nextInt(al.size());
		System.out.println(al.get(x));
		}
		for(int i=0;i<al.size();i++)
		{
			int x = (int)(Math.random()*al.size());
		System.out.println(al.get(x));
		}
		
		//----------------------vector--------------------------
		
		Vector<Integer> v1 = new Vector<Integer>();
		Vector v2 = new Vector(2,3);
		v2.add(123);
		v1.add(1);
		v1.add(345);
		System.out.println(v2);
		System.out.println(v1);
		
		//--------------------------stack--------------------------------
		
		Stack st = new Stack<>();
		Stack<Integer> st1 = new Stack<>(); //-->type specified
		st.push(12);
		st.push('a');
		st.push("hii");
		st.pop();
		System.out.println(st);
		System.out.println(st.peek()); //-> top element
		Object o1 = st.clone(); //->deep copy (different references)
		System.out.println(o1);
		st.insertElementAt(3, 1); //->3 is val and 1 is index
		System.out.println(o1);
		System.out.println(st);
		
		
	}

}
