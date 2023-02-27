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
	
	public int getLength() {return curr_len;}
	
	private void ensureCapacity() {
		
		//if arr is null, make a new array
		if(arr == null) {
			arr = new char[5];
		}
		//else if arr is full, make a larger array
		else if(arr.length == curr_len){
			char [] newArr = new char[arr.length * 2];
			//copy chars from arr to newArr
			int i = 0;
			for(Character c : arr) {
				newArr[i++] = c;
			}
			//update arr
			arr = newArr;
			System.out.println(arr.length);
		}
	}
	
	public char get(int index) {
		return arr[index];		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MyString))
			return false;
		MyString other = (MyString) obj;
		//check the length
		if(other.getLength()!=this.getLength())
			return false;
		//compare the two strings
		for(int i = 0; i < other.getLength(); i++) {
			if(other.get(i)!=this.get(i))
				return false;
		}
		return true;
	}
	
	public MyString toUpper() {
		return new MyString(this.toString().toUpperCase());		
	}
	
	public MyString toLower() {
		return new MyString(this.toString().toLowerCase());
	}
	
	public MyString concat(MyString rhs) {
		MyString result = new MyString(this);
		for(int i = 0; i < rhs.getLength(); i++)
			result.addChar(rhs.get(i));
		return result;
	}
	
	private void addChar(char ch) {
		ensureCapacity();
		this.arr[curr_len++] = ch;
	}
	
	//implement today
	public int indexOf(MyString s) {
		return -1;
	}
	
	//implement today
//	@Override
//	public int compareTo(Object o) {		
//		return 0;
//	}
}
