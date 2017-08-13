package easy;

public class FindtheDifference {
	public char findTheDifference(String s, String t) {
		//由于字符串t只比字符串s多了一个字符，那么直接用t中所有字符值的和减去字符串s中字符值的和即可
	    int ret = 0;
	    for (int i = 0; i < s.length(); i++) {
	        ret -= (int)s.charAt(i);
	    }
	    for (int i = 0; i < t.length(); i++) {
	        ret += (int)t.charAt(i);
	    }
	    return (char)ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindtheDifference findtheDifference = new FindtheDifference();
		String s = "abcd";
		String t = "abcde";
		System.out.println(findtheDifference.findTheDifference(s, t));

	}

}
