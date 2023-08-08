package WrapperClasses;

public class AutoBoxingAndAutounBoxing {

	public static void main(String[] args) {
		int a =234;
		System.out.println("Primitive dataType = "+a);
		
		// AutoBoxing
		Integer i = a; // Integer.ValueOf(a);
		System.out.println("Wrapper Object = "+i);
		
		// AutoUnboxing
		
		int i1 = i; // i.intValue();
		System.out.println("Primitive Dattype  = "+i1);
	}
}
