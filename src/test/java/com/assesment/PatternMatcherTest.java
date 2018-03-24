package com.assesment;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PatternMatcherTest extends TestCase {

	public void testPatternMatcher() {
		PatternMatcher patternMatcher = new PatternMatcher();
		
		Assert.assertFalse(patternMatcher.expressionMatches("This is a test string", "est"));
		Assert.assertFalse(patternMatcher.expressionMatches("This is a test string", "TEST"));
		Assert.assertFalse(patternMatcher.expressionMatches("This is a test string", "*TEST"));
		Assert.assertFalse(patternMatcher.expressionMatches("This is a test string", "This is a test string2"));
		Assert.assertFalse(patternMatcher.expressionMatches("This is a test string", "This is a test strin"));
		Assert.assertFalse(patternMatcher.expressionMatches("This is a test string", "This is a test String"));
		Assert.assertFalse(patternMatcher.expressionMatches("This is a test string", "A*string"));
		Assert.assertFalse(patternMatcher.expressionMatches("This is a test string", "This is a test"));
		
		Assert.assertTrue(patternMatcher.expressionMatches("This is a test string", "*test*"));
		Assert.assertTrue(patternMatcher.expressionMatches("This is a test string", "This*"));
		Assert.assertTrue(patternMatcher.expressionMatches("This is a test string", "*test*"));
		Assert.assertTrue(patternMatcher.expressionMatches("This is a test string", "This is a test string"));
		Assert.assertTrue(patternMatcher.expressionMatches("This is a test string", "T*test*string"));
		Assert.assertTrue(patternMatcher.expressionMatches("This is a test string", "*"));
		Assert.assertTrue(patternMatcher.expressionMatches("This is a test string", "*This is *"));
		Assert.assertTrue(patternMatcher.expressionMatches("This is a test string", "This is a test string"));
		Assert.assertTrue(patternMatcher.expressionMatches("This is a test string", "This is***"));
		Assert.assertTrue(patternMatcher.expressionMatches("test testing", "*testin*"));
	}
}
