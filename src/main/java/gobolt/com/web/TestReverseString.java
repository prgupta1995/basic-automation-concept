package gobolt.com.web;

public class TestReverseString {
	
	public static void testReverseStr(String str1) {
		
		for(int i = str1.length()-1; i>=0; i--) {
			System.out.print(str1.charAt(i));
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String str1= "My name is Test";
		testReverseStr(str1);
	}

}





