package StringClass;

public class StringClassMethod {
	public static void main(String[] args) {
		 String s = new String("Dalchandsahu");
		 System.out.println(s);
		 
//		 System.out.println(s.length()); // find length of string
//		 System.out.println(s.substring(4));  // findOut substring in string
//		 System.out.println(s.substring(5, 8)); 
//		 System.out.println(s.replace('s','f' ));  // replace the word in string
		 
		 
		 System.out.println(s.indexOf('d')); // find the index of string
		 System.out.println(s.lastIndexOf('a'));  // find last index 
		 
		 // CharAt()
		 
		 System.out.println(s.charAt(2)); // find char using index number
		 System.out.println(s.charAt(5));
		 System.out.println(s.charAt(9));
		 
		 // concat
		 
		 String  s1 = s.concat(" Raipur"); // concat means add the string in last string
		 System.out.println(s1);
		 
		 String s3 = "Dalchand";
		 String s4 =  "dalchand";
		 System.out.println(s3 ==  s4);  // check equality
		 System.out.println(s3.equals(s4));
		 System.out.println(s3.equalsIgnoreCase(s4)); // Ignore case sensitive char
		 
		 // upper and lower case method
		 String s5 = "Maheshwaray";
		 System.out.println(s5);
		 System.out.println(s5.toUpperCase());
		 
		String s6 = "SOMNATHAY";
		System.out.println(s6);
		System.out.println(s6.toLowerCase()); // change char in lower case
		 
		// trim
		 String s7 = "     Jagnnathay    ";
		 System.out.println(s7);
		 System.out.println(s7.trim());  // trim method ignore Spaces in string
		 
	}

}
