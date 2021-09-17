package RegularExpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[]args) {
		
		ArrayList<String> emails  = new ArrayList<String>();
		emails.add("abc.");
		emails.add("0232whjdj");
		emails.add(" ");
		emails.add("advh6628@");
		emails.add("ab#");
		String regex = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+
                "@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
		Pattern pattern = Pattern.compile(regex);
		for(String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email+": "+matcher.matches());
		}
	}
}
