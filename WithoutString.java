package string_3;

public class WithoutString {
	
	/*
	Given two strings, base and remove, return a version of the base string 
	where all instances of the remove string have been removed (not case sensitive). 
	You may assume that the remove string is length 1 or more. 
	Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


	withoutString("Hello there", "llo") -- "He there"
	withoutString("Hello there", "e") -- "Hllo thr"
	withoutString("Hello there", "x") -- "Hello there"
	 * 
	 */

	public static String withoutString(String base, String remove) {

		int blen = base.length();
		int rlen = remove.length();
		String lowbase = base.toLowerCase();
		String lowrem = remove.toLowerCase();
		String result = "";

		for (int i = 0; i < blen; i++) {
			if (i <= blen - rlen) {
				String tmp = lowbase.substring(i,i+rlen);
				if (!tmp.equals(lowrem))
					result += base.substring(i,i+1);
				else {
					i += rlen-1;
				}
			}
			else {
				String tmp2 = lowbase.substring(i,i+1);
				if (!tmp2.equals(lowrem))
					result += base.substring(i,i+1);
			}
		}
		return result;
	}


	public static void main(String[] args) {
		
		System.out.println(withoutString("Hello there", "llo"));
		System.out.println(withoutString("Hello there", "e"));
		System.out.println(withoutString("Hello there", "x"));

		
		
	}

}
