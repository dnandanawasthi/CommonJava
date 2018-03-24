package com.assesment.patterns.sample1.weapon.service;

import com.assesment.patterns.sample1.weapon.Weapon;
import com.assesment.patterns.sample1.weapon.WeaponFactory;
import com.assesment.patterns.sample1.weapon.impl.Katana;

public class KatanaService extends WeaponFactory {

	@Override
	public Weapon getWeapon() {
		return new Katana();
	}

}
