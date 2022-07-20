
public class SafeHouse extends NormalLocation {

	SafeHouse(Player player) {
		super(player, "Safe House");
		
	}
	
	
	public boolean getLocation() {
		player.setHealthy(player.getRealHealth());
		System.out.println("Your health is full now..");
		System.out.println("You are in safe house ..");
		return true;
		
	}
	

}
