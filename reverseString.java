//Reserves string s


	public static String reverse(String s) {
		char[] c = s.toCharArray(); // calling an array
		// work with char array.
		String result = ""; //to store the result
		for (int i = c.length - 1; i >= 0; i--) {
			result+=c[i];
		}
		return result;
	}
