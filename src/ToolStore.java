
public class ToolStore extends NormalLocation {
	
	ToolStore(Player player) {
		super(player, "Shop");
		
	}
	public boolean getLocation() {
		System.out.println("Money : "+player.getMoney());
		System.out.println("1-Weapons");
		System.out.println("2-Armors");
		System.out.println("3-Exit");
		System.out.print("Your selection: ");
		int selectTool = scan.nextInt();
		int selectItemID;
		switch(selectTool) {
		case 1:
			selectItemID= weaponMenu();
			buyWeapon(selectItemID);
			break;
		case 2:
			selectItemID=armorMenu();
			buyArmor(selectItemID);
			break;
		case 3:
			break;
		}
		return true;
	}
	public int weaponMenu() {
		System.out.println("1-Gun-->\tPrice:25\tHasar:2");
		System.out.println("2-Sword-->\tPrice:35\tHasar:3");
		System.out.println("3-Rifle-->\tPrice:45\tHasar:7");
		System.out.println("4-Exit");
		System.out.print("Your selection: ");
		int selectWeaponID=scan.nextInt();
		return selectWeaponID;
	}
	public void buyWeapon(int itemID) {
		int damage = 0,price=0;
		String weaponName=null;
		switch(itemID) {
		case 1:
			damage=2;
			weaponName="Gun";
			price=25;
			break;
		case 2:
			damage=3;
			weaponName="Sword";
			price=35;
			break;
		case 3:
			damage=7;
			weaponName="Rifle";
			price=45;
			break;
		case 4:
			System.out.println("You are exiting the shop...");
			break;
		
		default:
			System.out.println("Invalid selection!");
			break;
		}
		if(price>0) {
			if(player.getMoney()>=price  ) {
				player.getInv().setDamage(damage);
				player.getInv().setWeaponName(weaponName);
				player.setMoney(player.getMoney()-price);
				System.out.println("You bought "+weaponName+"."+" New damage: "+player.getTotalDamage());
				System.out.println("New Money: "+player.getMoney());
				}else {
					System.out.println("You don't have enough money!");
				}
			}
		}
		public int armorMenu() {
			System.out.println("1-Easy-->\tPrice:15\tHasar:1");
			System.out.println("2-Medium-->\tPrice:25\tHasar:3");
			System.out.println("3-Heavy-->\tPrice:40\tHasar:5");
			System.out.println("4-Exit");
			System.out.print("Your selection: ");
			int selectArmorID=scan.nextInt();
			return selectArmorID;		
		}
		public void buyArmor(int selectItemID) {
			int armor = 0,price=0;
			String armorName=null;
			switch(selectItemID) {
			case 1:
				armor=1;
				armorName="Easy Shield";
				price=15;
				break;
			case 2:
				armor=3;
				armorName="Medium Shield";
				price=25;
				break;
			case 3:
				armor=5;
				armorName="Heavy Shield";
				price=40;
				break;
			case 4:
				System.out.println("You are exiting the shop...");
				break;
			
			default:
				System.out.println("Invalid selection!");
				break;		
		}
			if(price>0) {
				if(player.getMoney()>=price  ) {
					player.getInv().setArmor(armor);
					player.getInv().setShieldName(armorName);
					player.setMoney(player.getMoney()-price);
					System.out.println("You bought "+armorName+"."+" Block damage: "+player.getInv().getArmor());
					System.out.println("New Money: "+player.getMoney());
					}else {
						System.out.println("You don't have enough money!");
					}
				}
}
}