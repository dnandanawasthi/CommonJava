package com.assesment.patterns.sample1.player;

public class CharacterDecorator implements TopCharacter {

	TopCharacter topCharacter;

	public CharacterDecorator(TopCharacter topCharacter) {
		this.topCharacter = topCharacter;
	}

	@Override
	public String getCapabilityDescription() {
		return this.topCharacter.getCapabilityDescription();
	}
	
	
}
