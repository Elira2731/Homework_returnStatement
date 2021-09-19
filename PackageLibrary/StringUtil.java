package PackageLibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtil {
	public static void main(String[] args) {

		String a = "abdcdkrfdsfdd";
		/*
		 * 1.returns the frequency of given char from the given string, as int
		 */

		char A = 'd';

		int num = frequencyOfChar(a, A);

		System.out.println(num);

		/*
		 * 2.returns the unique characters for the given string
		 */
		System.out.println(uniqueString(a));
		/*
		 *3. reverses the given string object and returns it
		 */
		System.out.println(reverseString(a));

		/*
		 * 4.removes the duplicates from the string and returns it
		 */
		System.out.println(removeDuplicates(a));

		/*
		 * 5.returns the frequency of characters
		 */

		System.out.println(frequncyOfCharacter(a));
		/*
		 * 6.verify if the string palindrome
		 * 
		 */
		System.out.println("is the aba a palindrome? " + palindrome("aba"));

//		civic

		/*
		 * 7.takes a sentence and word, then returns the frequency of the word
		 */
		
		String sentece = "Find the third vowel in the string and how many times this vowel occurs.";

		String lookingFor = "vowel";

		System.out.println(frequencyOfWord(sentece, lookingFor));

	}

	public static int frequencyOfChar(String str, char Char) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Char == (str.charAt(i))) {
				count++;
			}
		}
		return count;

	}

	public static String uniqueString(String str) {

		String uniqueCharacter = "";

		for (int i = 0; i < str.length(); i++) {

			if (!uniqueCharacter.contains(Character.toString(str.charAt(i)))) {

				uniqueCharacter += Character.toString(str.charAt(i));
			}
		}
		return uniqueCharacter;
	}

	public static String reverseString(String str) {

		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverseStr += Character.toString(str.charAt(i));
		}
		return reverseStr;
	}

	public static String removeDuplicates(String str) {

		String removedString = "";

		for (int i = 0; i < str.length(); i++) {

			int count = 0;

			for (int k = 0; k < str.length(); k++) {

				if (str.charAt(i) == str.charAt(k)) {
					count++;
				}
			}
			if (count == 1) {

				removedString += Character.toString(str.charAt(i));
			}
		}
		return removedString;
	}

	public static String frequncyOfCharacter(String str) {

		String value = " ";

		String frequencyStr = " ";

		int frequency = 0;

		for (int i = 0; i < str.length(); i++) {

			int count = 0;

			for (int k = 0; k < str.length(); k++) {

				if (str.charAt(i) == str.charAt(k)) {

					count++;
				}

			}
			if (count > 0) {

				value = Character.toString(str.charAt(i));

				if (!frequencyStr.contains(value)) {

					frequencyStr += value + " " + count + ", ";
				}

			}

		}

		return frequencyStr;

	}

	public static boolean palindrome(String str) {

		boolean palindrome = false;

		if (reverseString(str).equals(str)) {

			palindrome = true;

		}
		return palindrome;
	}

	public static String frequencyOfWord(String str, String find) {

		String Str = str.replace(" ", ",");

		String[] word = Str.split(",");

		int count = 0;

		String value = "";

		String frequencyWord = "";

		List<String> Sentece = new ArrayList<String>(Arrays.asList(word));

		for (String str1 : Sentece) {

			if (find.equals(str1)) {

				count++;

			}

		}
		if (count > 0) {

			value = find;

			if (!frequencyWord.contains(value)) {

				frequencyWord += value + " " + count + ", ";
			}

		}

		return frequencyWord;
	}

}
