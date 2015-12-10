package org.shawnana.headfirst.designpattern.ch1.exercise.characters;

import org.shawnana.headfirst.designpattern.ch1.exercise.weapons.Knife;
import org.shawnana.headfirst.designpattern.ch1.exercise.weapons.WeaponBehavior;

public class Character {
	private WeaponBehavior weapon;
	
	public Character() {
		weapon = new Knife();
	}
	
	public void fight() {
		weapon.useWeapon();
	}

	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
}
