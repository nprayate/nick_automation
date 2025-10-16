package Testing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class New {

	public static void main(String[] args) {

		array();
		int numbers[] = { -9, 9, 5, -5, 1, -1 };
		// int result []= new int [256];
		Arrays.sort(numbers);
		int min = numbers[0];
		int max = numbers[numbers.length - 1];
		int j = 0;

		for (int i = min; i <= max; i++) {
			boolean present = false;

			for (int num : numbers) {

				if (num == i) {
					present = true;
					break;
				}

			}
			if (present == false) {
				System.out.print(i + " ");
			}

		}

	}

	static void array() {

//		List<Object> list = Arrays.asList("Java", "Pyhton", 15, ".Net", 100, 20);
//
//		Object[] array = list.toArray(new Object[0]);

		Object[] array1 = { 'a', 'b', "c", 1, 5, 6 };
		
		String numbers = "";
		String characters ="";

		for (Object object : array1) {
			String string = object.toString();
			char ch = string.charAt(0);

			if (Character.isAlphabetic(ch)) {
				characters +=ch;
			} else if (Character.isDigit(ch)) {
				 numbers += ch;
			}

		}
		
		System.out.println(numbers +"="+characters);

	}
}
