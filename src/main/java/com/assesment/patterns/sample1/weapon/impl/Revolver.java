package com.assesment.patterns.sample1.weapon.impl;

import com.assesment.patterns.sample1.weapon.Weapon;

public class Revolver implements Weapon {

	@Override
	public String action() {
		return " Shoot bullet from revolver";
	}

}

