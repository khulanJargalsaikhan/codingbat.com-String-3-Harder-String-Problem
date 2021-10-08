package string_3;

public class GHappy {
	/*
	 * 
	We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. 
	Return true if all the g's in the given string are happy.


	gHappy("xxggxx") 	-- true
	gHappy("xxgxx") 	-- false
	gHappy("xxggyygxx") -- false
	 */


	public static boolean gHappy(String str) {

		int len = str.length();
		
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'g'
				&& !(i > 0 && str.charAt(i-1) == 'g')
				&& !(i < len-1 && str.charAt(i+1) == 'g')) 
				return false;
		}
		return true;
	}


	public static void main(String[] args) {

		System.out.println(gHappy("xxggxx"));
		System.out.println(gHappy("gagg"));
		System.out.println(gHappy("xxgxx"));
		System.out.println(gHappy("xxggyygxx"));
		System.out.println(gHappy(""));

	}

}
