package Testing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		test2();

		String name = "Hello Word";

		int count[] = new int[256];

		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			if (ch == ' ') {
				continue;
			}
			count[ch]++;

			// System.out.println(ch);

		}

		for (int i = 0; i < count.length; i++) {

			if (count[i] >= 1) {
				System.out.println((char) i + "=" + count[i]);

			}

		}

	}

	static void test() {

		String[][] data = {

				{ "Jan", "2021", "1000" }, { "Feb", "2022", "2000" }, { "Jan", "2023", "4000" },
				{ "Feb", "2025", "500" }, { "March", "2024", "100" },

		};

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < data.length; i++) {

			String month = data[i][0]; // jan
			String value = data[i][2];
			int amount = Integer.parseInt(value);

			// jan

			if (map.containsKey(month)) {

				map.put(month, map.get(month) + amount);

			} else {
				map.put(month, amount);
			}

		}

		System.out.println(map);

	}

	static void test2() {

		
		String[] arr = {"Jan", "Feb", "Jan", "Mar", "Feb"};
		String months = arr.toString();
		
		
		
		StringBuffer buffer = new StringBuffer(months);
		StringBuffer newmonths = buffer.reverse();
		
		for (int i = 0; i < newmonths.length(); i++) {
			char ch = newmonths.charAt(i);
			
			System.out.println(ch);
			
		}
		
		
		
		
		HashSet<String> data = new HashSet<String>();
		
		
		
		
	
//		for (String month : arr) {
//			
//			if (data.add(month)) {
//				
//			}else {
//				System.out.println(month);
//			}
//			
//		}
		

	}

}
