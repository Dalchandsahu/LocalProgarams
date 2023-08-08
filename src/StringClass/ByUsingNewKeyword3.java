package StringClass;

public class ByUsingNewKeyword3 extends Object{

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("dalchand");
		StringBuffer sb2 = new StringBuffer("dalchand");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}
}
