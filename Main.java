import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0;
		Vector<String> v = new Vector<String>();
		String str = "";
		while (!((str = in.next()).equals("###"))) {
			n++;
			v.add(str);
		}
		HashMap<String, String> m = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				String str1 = in.next();
				m.put(v.get(i) + v.get(j), str1);
				m.put(v.get(j) + v.get(i), str1);
			}
		}
		String a = in.next();
		String b = in.next();
		System.out.println(m.get(a + b));
	}
}