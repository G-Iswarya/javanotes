class Area<T> //T is dynamic datatype. It can be Integer or String
{
	private T t1;
	public void add(T t)
	{
		this.t1 = t;
	}
	public T get()
	{
		return t1;
	}
}
public class generic_class {

	public static void main(String[] args) {
		Area<Integer> a1 = new Area<Integer>();
		Area<String> a2 = new Area<String>();
		a1.add(12);
		a2.add("kavi");
		System.out.println(a1.get());
		System.out.println(a2.get());
	}

}
