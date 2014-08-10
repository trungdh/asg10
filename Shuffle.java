import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
	
		String str1 = "CHO";
		String str2 = "MAY";
		String str3 = "CHET";
        Collection<String> list = new ArrayList<String>();
            list.add("a");
			list.add("b");
			list.add("c");
			list.add("d");
			list.add("e");
			list.add("f");
		Iterator<String> i = list.iterator();
		while (i.hasNext()){
			String s = i.next();
			if (s == "a")i.remove();
			System.out.println(s);
		}
    }
}