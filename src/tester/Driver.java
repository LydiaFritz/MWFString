/**
 * 
 */
package tester;

import string_files.MyString;

/**
 * @author a4432_asu
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyString str = new MyString("chuckwagon");
		for (int i = 0; i < str.getLength(); i++) {
			System.out.print(str.get(i) + " ");
		}
		System.out.println();
		System.out.println(str.toUpper());
		System.out.println(str.toLower());
		System.out.println(str);

	}

}
