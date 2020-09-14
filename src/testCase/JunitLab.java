package testCase;

public class JunitLab {

	private String[] strValue = { "one", "two", "three" };
	private String[] strCopy = { "one", "two", "three" };
	private String emptyStr = null;
	
	public String[] getStrArrayValue() {
		return strValue;
	}

	public String[] getStrArrayCopyValue() {
		return strCopy;
	}

	public String getStr() {
		return emptyStr;
	}
	
	// --------------Below used method without declared variables above -----------------------

	public int add(int first, int second) {
		return first + second;
	}

	public int sub(int first, int second) {
		return first - second;
	}

	public boolean greatest(int first, int second) {
		return first > second;
	}

	public boolean isPalindrome(String str) {
		String word = str.replaceAll("\\s+", "");
		String reverse = new StringBuffer(word).reverse().toString();
		return reverse.equalsIgnoreCase(word);
	}
}
