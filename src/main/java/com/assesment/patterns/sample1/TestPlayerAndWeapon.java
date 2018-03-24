package com.assesment.patterns.sample1;


import com.assesment.patterns.sample1.action.CharacterHandler;
import com.assesment.patterns.sample1.player.BaseCharacter;
import com.assesment.patterns.sample1.player.SimpleCharacter;
import com.assesment.patterns.sample1.player.TopCharacter;
import com.assesment.patterns.sample1.weapon.WeaponFactory;
import com.assesment.patterns.sample1.weapon.service.BaseballBatWrappedInBarbWireService;
import com.assesment.patterns.sample1.weapon.service.BowAndArrowService;
import com.assesment.patterns.sample1.weapon.service.KatanaService;
import com.assesment.patterns.sample1.weapon.service.RevolverService;

public class TestPlayerAndWeapon {

	public static void main(String[] args) {
		WeaponFactory bowAndArrow = new BowAndArrowService();
		WeaponFactory revolver = new RevolverService();
		WeaponFactory katana = new KatanaService();
		WeaponFactory baseBall = new BaseballBatWrappedInBarbWireService();
		
		/*TopCharacter daryl = new BaseCharacter();
		TopCharacter rick = new BaseCharacter();
		TopCharacter negan = new BaseCharacter();
		TopCharacter michonne = new BaseCharacter();*/
		
		BaseCharacter baseCharacter = new BaseCharacter();
		
		TopCharacter daryl = new SimpleCharacter(baseCharacter);
		TopCharacter rick = new SimpleCharacter(baseCharacter);
		TopCharacter negan = new SimpleCharacter(baseCharacter);
		TopCharacter michonne = new SimpleCharacter(baseCharacter);
		
		CharacterHandler handler = new CharacterHandler();
		handler.play(bowAndArrow, daryl);
		handler.play(revolver, rick);
		
		handler.play(bowAndArrow, rick);
		handler.play(katana, daryl);
		
		handler.play(revolver, negan);
		
		handler.play(baseBall, michonne);
		
		handler.play(bowAndArrow, michonne);
	}

}
