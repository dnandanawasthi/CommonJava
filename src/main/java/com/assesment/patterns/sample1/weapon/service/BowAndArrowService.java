package com.assesment.patterns.sample1.weapon.service;

import com.assesment.patterns.sample1.weapon.Weapon;
import com.assesment.patterns.sample1.weapon.WeaponFactory;
import com.assesment.patterns.sample1.weapon.impl.Revolver;

public class BowAndArrowService extends WeaponFactory {

	@Override
	public Weapon getWeapon() {
		return new Revolver();
	}

}