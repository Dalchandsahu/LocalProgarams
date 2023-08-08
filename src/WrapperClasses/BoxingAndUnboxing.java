package WrapperClasses;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		int a = 11;
		System.out.println("Primitive datatype = "+a);
		
		Integer i = Integer.valueOf(a);
		System.out.println("Wrapper object = "+i);
		
		short s = 12; 
		System.out.println("Primitive datatype = "+s);
		
		Short s1 = Short.valueOf(s);
		System.out.println("wrapper Object = "+s1);
		
		int b =4000;
		System.out.println("primitive data type = "+b);
		
		// boxing
		Integer i1 = new Integer(b);
		System.out.println("wrapper object = "+i1);
		
		// Unboxing
		int i2 = i1.intValue();
		System.out.println("Primitive datatype = "+i2 );
	}
}
