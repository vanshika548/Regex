package RegularExpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPttern {
	//^([0-9]*[a-zA-Z]){3}[0-9a-zA-Z]*$
	public static void main(String[]args) {
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("111");
		emails.add("1aaa");
		emails.add("aa11");
		emails.add("bcc");
		emails.add("1a1aab");
		emails.add("1abb23a");
		String regex = "^([0-9]*[a-zA-Z]){3}[0-9a-zA-Z]*$";
		Pattern pattern = Pattern.compile(regex);
		for(String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email+": "+matcher.matches()+"\n");
		}
	}
}
