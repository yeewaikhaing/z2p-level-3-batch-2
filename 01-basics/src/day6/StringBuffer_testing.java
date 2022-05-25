package day6;

public class StringBuffer_testing {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Java Programming");
		buffer.append(" Language");
		
		System.out.println("append: " + buffer);
		
		buffer.insert(5, "is a ");
		System.out.println("insert: " + buffer.toString());
		buffer.replace(0, 4, "PHP");
		System.out.println("replace: " + buffer);
		System.out.println("index of 'language': " + buffer.indexOf("Language"));
		System.out.println("Length: " + buffer.length());
		System.out.println("substr: " + buffer.substring(4));
		buffer.delete(0, 4);
		System.out.println("length: " + buffer.length());
		System.out.println("content: " + buffer);
	}
}
