package StringClass;

public class StringClassConst {
 public static void main(String[] args) {
	String s1 = new String();
	System.out.println(s1);
	
	String s2 = new String("Dalchand");
	System.out.println(s2);
	
	StringBuffer sb = new StringBuffer();
	sb.append("Dalchand");
	System.out.println(sb);
	
	String s3 = new String(sb);
	System.out.println(s3);
	
	StringBuilder sb1 = new StringBuilder();
	sb1.append("dalchand");
	System.out.println(sb1);
	
	String s4 = new String(sb1);
	System.out.println(s4);
	
	
	char ch[] = {'a', 'b', 'c','d'};
	for(char c :ch) {
		System.out.println(c);
	}
	
	String s5  = new String(ch);
	System.out.println(s5);
			
 
 }
}
