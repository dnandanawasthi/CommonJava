package com.assesment;

public class PatternMatcher {

	public boolean expressionMatches(final String text, final String pattern) {
		return text.matches(pattern.replace("?", ".?").replace("*", ".*?"));
	}

	// Pair class "PatternMatcherTest" is available under src/test/java/com.bluetree.assesment
}

/*
	System.out.println(PatternMatcher.expressionMatches("This is a test string", "T*test*string"));
	System.out.println(PatternMatcher.expressionMatches("This is a test string", "*test*"));
	System.out.println(PatternMatcher.expressionMatches("This is a test string", "*"));
	System.out.println(PatternMatcher.expressionMatches("This is a test string", "*This is *"));
	System.out.println(PatternMatcher.expressionMatches("This is a test string", "A*string"));
	System.out.println(PatternMatcher.expressionMatches("This is a test string", "This is a test string"));
	System.out.println(PatternMatcher.expressionMatches("This is a test string", "This is a test"));
	System.out.println(PatternMatcher.expressionMatches("This is a test string", "This is***"));
	System.out.println(PatternMatcher.expressionMatches("test testing", "*testin*"));
 */