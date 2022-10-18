package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassExample {
    private static Pattern pattern;
	private Matcher matcher;

	private static final String PASS_REGEX =   "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{7,15}$";

	public PassExample() {
		pattern = Pattern.compile(PASS_REGEX);
	}

	public boolean validatePass(String regex) {
		matcher = pattern.matcher(regex);
		return matcher.matches();
	}
}
