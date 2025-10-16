package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Today {

	public static void main(String[] args) {
		sorting();

	}

	static void reverse() {

		String name = "Nikhil Rayate";
		// StringBuffer rev = "";

		StringBuffer buffer = new StringBuffer(name);
		StringBuffer reverse = buffer.reverse();

		System.out.println(reverse);
//		for (int i = name.length()-1; i >=0; i--) {
//			 rev += name.charAt(i);
//			
//		}

		// System.out.println(rev);
	}

	static void palindrome() {
//		String name = "madam";
//		String check = "";
//
//		for (int i = name.length()-1; i >= 0; i--) {
//
//			check += name.charAt(i);
//
//		}
//		
//		if (name.equals(check)) {
//			System.out.println(name +" is a palindrome");
//		}

		int number = 171;
		int oring = number;
		int check = 0;

		while (number != 0) {
			check = check * 10 + number % 10;
			number = number / 10;
		}

		if (oring == check) {
			System.out.println(oring);
		}
	}

	static void findDublicates() {

		String name = "Nikhil Rayatnee";
		name = name.toLowerCase();
		String remove = "";
		int[] count = new int[256];

		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			count[ch]++;

			if (count[ch] == 1) {

				remove += ch;

			}
		}

		System.out.println(remove);

	}

	static void numberSwap() {

		int a = 10;
		int b = 20;

		a = a + b; // a =30
		b = a - b; // b = 10

		a = a - b; // a = 20

		System.out.println(a + "," + b);

	}

	static void factorial() {

		int a = 10;
		int b = 1;

		for (int i = 1; i <= a; i++) {

			b = b * i;

		}

		System.out.println(b);
	}

	static void series() {

		int n = 10;

		int a = 0, b = 1;

		System.out.print(a + "," + b);

		for (int i = 3; i <= n; i++) {

			int c = a + b;

			System.out.print(", " + c);
			a = b;
			b = c;

		}

		System.out.println();
	}

	static void smallndlarge() {

		int[] num = { 10, 20, 25, 3, 25, 44, 52, 45, 23 };

		int max = num[0];
		int min = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i] < min) {
				min = num[i];

			} else if (num[i] > max) {
				max = num[i];

			}

		}

		System.out.println("max " + max + "," + "min " + min);
	}

	static void reverseNumber() {

		int number = 12345;
		int rev = 0;

		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}

		System.out.println(rev);
	}

	static void findFactorial() {

		int number = 7;
		int sum = 1;

		for (int i = 1; i <= 7; i++) {

			sum = sum * i;

		}

		System.out.println(sum);
	}

	static void countVowels() {
		String name = "Hello World";
		name = name.toLowerCase();

		int vowels = 0, consonants = 0, space = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
				vowels++;
				System.out.println("Vowels in a string =" + ch);
			} else if (ch >= 'a' && ch <= 'z') {
				consonants++;
				System.out.println("Consonants are " + ch);

			} else if (ch == ' ') {
				space++;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Spaces: " + space);

	}

	static void dublicatesWord() {

		String name = "Java is good and is java";
		name = name.toLowerCase();
		String[] words = name.split(" ");
		int count[] = new int[256];

		for (int i = 0; i < words.length; i++) {

			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equals(words[j])) {

					System.out.println(words[i]);
				}

			}

		}

	}

	static void UniqueValues() {

		String name = "Hello";
		name = name.toLowerCase();

		String result = "";

		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			if (result.indexOf(ch) == -1) {

				result += ch;

			}

		}

		System.out.println(result);

	}

	static void uniquenumber() {

		int array[] = { 1, 2, 3, 4, 4, 5, 5, 5, 2, 3 };

//		HashSet<Integer> set = new HashSet<Integer>();
//		
//		for (int i = 0; i < array.length; i++) {
//			
//			set.add(array[i]);
//			
//		}
//		
//		System.out.println(set);

//		 int result[] = new int[array.length];
//		 int k=0;

		for (int i = 0; i < array.length; i++) {

			boolean dublicate = false;

			for (int j = 0; j < i; j++) {

				if (array[i] == array[j]) {
					dublicate = true;
					break;
				}

			}

			if (dublicate == false) {

				System.out.println(array[i]);
			}

		}

	}

	static void isPrime() {

		int num = 7;
		boolean isPrime = true;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				isPrime = false;
				break;
			}

		}

		if (isPrime == true) {
			System.out.println(num + "is a prime");
		} else {
			System.out.println(num + " is not a prime");
		}

	}

	static void Hash() {

		String[][] data = {

				{ "Jan", "2021", "1000" }, { "Feb", "2022", "2000" }, { "Jan", "2023", "4000" },
				{ "Feb", "2025", "500" }, { "March", "2024", "100" },

		};

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < data.length; i++) {

			String month = data[i][0];
			String amount = data[i][2];
			int amount1 = Integer.parseInt(amount);

			if (map.containsKey(month)) {
				map.put(month, map.get(month) + amount1);
			} else {
				map.put(month, amount1);
			}

		}

		System.out.println(map);
	}

	static void reverseWord() {

		String name = "Welcome to testing word";

		String rev2 = "";

		String[] Words = name.split(" ");

		for (String word : Words) {
			String rev = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				char ch = word.charAt(i);
				int length = word.length();

				if (i == length - 1) {
					rev += Character.toUpperCase(ch);

				} else {

					rev += ch;
				}

			}
			rev2 += rev + " ";

		}
		System.out.print(rev2);
	}

	static void checkVowelsConsonats() {

		String name = "Hello Nikhil Rayate";
		name = name.toLowerCase();

		String vowels = "";
		String Consonants = "";

		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
				vowels += ch;
				// System.out.println("Vowels are: " + ch);
			} else if (ch >= 'a' && ch <= 'z') {
				// System.out.println("Consonants are:" + ch);

				Consonants += ch;

			}

		}

		System.out.println("Vowels are: " + vowels + " and the consonants are: " + Consonants);
	}

	static void secondLargest() {

		int number[] = { 5, 6, 4, 10, 2, 48 };

		int secondLargest = 0;
		int max = number[0];

		for (int i = 0; i < number.length; i++) {

			if (number[i] > max) {

				secondLargest = max;
				max = number[i];

			} else if (number[i] > secondLargest && number[i] != max) {

				secondLargest = number[i];

			}

		}
		System.out.println(secondLargest);
	}

	static void sorting() {

		int numbers[] = { 3, 4, 1, 2, 5, 4, 5, 4, 6, 8 };

		for (int i = 0; i < numbers.length; i++) {
			int count = 1;
			boolean counted = false;

			for (int k = 0; k < i; k++) {

				if (numbers[i] == numbers[k]) {
					counted = true;
				}

			}

			if (counted == false) {
				for (int j = i + 1; j < numbers.length; j++) {

					if (numbers[i] == numbers[j]) {

						count++;
						counted = true;

					}

				}
			}

			if (count > 1) {
				System.out.println(numbers[i] + "=" + count);
			}

		}

//
//		for (int i : numbers) {
//			System.out.println(i);
//		}

//		Arrays.sort(numbers);

		// List<Integer> list = new ArrayList<Integer>();
////		
//		for (int i : numbers) {
//			
//			
//			list.add(i);
//			
//		}
//		
//		Collections.sort(list);
//		System.out.print(list+" ");
//		
//	}}
	}
}