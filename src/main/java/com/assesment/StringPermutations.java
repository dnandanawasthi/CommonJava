package com.assesment;

public class StringPermutations {

	// permutation("ABC");

	private static void permutation(final String str) { 
	    permutation("", str); 
	}

	private static void permutation(final String prefix, final String str) {  
	    int n = str.length();
	    if (n == 0) { 
	    	System.out.println(prefix);
    	} else {
	        for (int i = 0; i < n; i++) {
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        }
	    }
	}
}
