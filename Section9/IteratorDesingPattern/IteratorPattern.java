package Section9.IteratorDesingPattern;

public class IteratorPattern {

	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList(new Object[] {1,3,5,67,8}); 
		
		list.forEach(System.out::println);

	}

}
