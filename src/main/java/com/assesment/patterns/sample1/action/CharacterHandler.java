package com.assesment.patterns.sample1.action;

import com.assesment.patterns.sample1.player.TopCharacter;
import com.assesment.patterns.sample1.weapon.WeaponFactory;

public class CharacterHandler {

	public void play(WeaponFactory bowAndArrow, TopCharacter character) {
		System.out.print(character.getCapabilityDescription());
		action(bowAndArrow);
	}
	
	private void action(WeaponFactory bowAndArrow) {
		bowAndArrow.weaponAction();
	}
}
