package com.assesment.patterns.sample1.weapon;

public abstract class WeaponFactory {
	
	public void weaponAction(){
		Weapon parser = getWeapon();
		String msg = parser.action();
		System.out.println(msg);
	}
	
	protected abstract Weapon getWeapon();

}
