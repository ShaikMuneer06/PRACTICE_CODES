package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameMatcher {

	public static void main(String[] args) {
	      String s = "I have to go to school";
	      String pattern = "(^ [abc]d., ad9)";
	      Pattern r = Pattern.compile(pattern);
	      Matcher m = r.matcher(s);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	      }else {
	      System.out.println("NOT FOUND ");
	      }
	}

}
