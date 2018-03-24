package com.assesment.patterns.sample1.player;

public class SimpleCharacter extends CharacterDecorator {

	public SimpleCharacter(TopCharacter topCharacter) {
		super(topCharacter);
	}

	@Override
	public String getCapabilityDescription() {
		String capability = super.getCapabilityDescription();
		return capability + " Enabled with simple capability";
	}
}
