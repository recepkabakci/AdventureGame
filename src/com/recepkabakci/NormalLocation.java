package com.recepkabakci;

public abstract class NormalLocation extends Location {

	NormalLocation(Player player,String name) {
		super(player);
		this.name= name;
	}

	@Override
	public  boolean getLocation() {	
		return true;
	}
	
	
	

}
