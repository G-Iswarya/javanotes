import java.util.*;
public class strings {

	public static void main(String[] args) {
		//____________________________ String_____________________
		String ss = "abc";
		System.out.println("hashcode of string before change: "+ss.hashCode());
		ss = "hi"+ss;
		System.out.println("hashcode of string after change: "+ss.hashCode());
		System.out.println(ss);
		
		//________________buffer_________________________
		
		StringBuffer buf = new StringBuffer();
		System.out.println(buf.capacity()); //default size of stringbuffer is 16
		StringBuffer buf1 = new StringBuffer(25); //we can explicitly give size 
//		buf.ensureCapacity(10);
		System.out.println("buffer length : "+buf.length());
		System.out.println("buffer capacity: "+buf.capacity()); //18+16
		buf.append("java");
		buf.append(" ");
		buf.append("welcome");
		buf.setLength(18);
		System.out.println(buf);
		buf.replace(1, 4, "hella");
		System.out.println("buffer codepoint: "+buf.codePointAt(1)); //ascii val at the gn index
		System.out.println(buf);
		buf.insert(3,"hello");
		System.out.println(buf);
		buf.reverse();
		System.out.println(buf);
		String info = buf.toString(); 
		info.replace("he","ka"); //string is immutable
		System.out.println(info);
		
		
		//____BUILDER______________________________
		
		StringBuilder build = new StringBuilder(40); //default 16
		build.ensureCapacity(12);
		System.out.println(build.capacity());
		build.append("hii hello "+ "");
		System.out.println(build);
		char a = build.charAt(1);
		System.out.println(a);
		int n = build.codePointAt(0); //ascii val of char at index 0
		System.out.println(n);
		int n1 = build.codePointCount(2, 5); //no. of unicode chars
		System.out.println(n1);
		
		
		//___________TOKENIZER________________________
		
		StringTokenizer tok = new StringTokenizer("welcome:to:world",":",false); //false print without separator token (:)
		while(tok.hasMoreTokens()) //or hasMoreElements
		{
			System.out.println(tok.nextToken()); //or nextElement
		}
		
		
		//_____________ARRAYLIST__________________________
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("hello");
		a1.add("class");
		a1.add("for");
		Collections.reverse(a1);
		System.out.println("reversed list: "+a1);
		StringJoiner sj = new StringJoiner(" ");
		sj.add(a1.get(1)).add(a1.get(0));
		sj.add(a1.get(1));
		sj.add(a1.get(2));
		System.out.println(sj);
		
		//________________________________________
		
		
		String s1 = String.format("|%-7d|", 101234);//insert space if len<given no. 
		System.out.println(s1);
		
		
		String s = "abcdefgh";
		byte b[] = s.getBytes();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		String b2 = new String(b); //convert bytes to string
		System.out.println(b2);
		
		//________________________________________________
		
		String str = "java";
		String strr = "java".intern();
		String strrr = "java".intern();
		String str1 = new String("java");
		String str11 = new String("java");
		String str2 = str.intern();
		String str22 = str1.intern();
		System.out.println(str==strr);
		System.out.println(str1==str11);
		System.out.println(str1==str22);
		System.out.println(str1==str2);
		System.out.println(strr==strrr);
		System.out.println(str2==str22);
		
	}

}
