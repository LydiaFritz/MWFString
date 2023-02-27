/**
 * 
 */
package string_files;

/**
 * @author a4432_asu
 *
 */
public class MyString {
	private char [] arr;
	private int curr_len;
	
	public MyString(){
		arr = null;
		curr_len = 0;
	}
	
	public MyString(String str) {
		//make the array
		arr = new char[str.length()];
		//put the characters from str into the array
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		curr_len = str.length();
	}
	
	public MyString(MyString str) {
		//make the new array
		arr = new char[str.curr_len];
		//copy the chars
		for(int i = 0; i < str.curr_len; i++) {
			arr[i] = str.arr[i];
		}
		//update the length
		curr_len = str.curr_len;
	} 
}
