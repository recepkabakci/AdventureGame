package com.recepkabakci;
import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);
	
	
	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the adventure game!!");
		System.out.println("Please enter your name before you start!!");
		//String playerName = scan.nextLine();
		player = new Player("recep");
		player.selectCha();
		start();
	}
	public void start() {
		while(true) {
			System.out.println();
			System.out.println("=================");
			System.out.println();
			System.out.println("Please select a place to play");
			System.out.println("1-Safe House --> You can rest in here,no enemy!!");
			System.out.println("2-Shop --> You may buy weapon or shield!.");
			System.out.println("3-Cave --> You may encounter vampires!.");
			System.out.println("4-Forest --> You may encounter zombies!.");
			System.out.println("5-River --> You may encounter bears!.");
			System.out.print("Where you want to visit or fight??");
			System.out.println();
			int selectLocation = scan.nextInt();
			while(selectLocation<0 || selectLocation>5) {
				System.out.print("Please enter a place");
				selectLocation = scan.nextInt();
			}
			switch(selectLocation) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new ToolStore(player);
				break;
			case 3:
				location= new Cave(player);
				break;
			case 4:
				location= new Forest(player);
				break;
			case 5:
				location= new River(player);
				break;	
			default:
				location = new SafeHouse(player);
				break;
			}
			if(location.getClass().getName().equals("SafeHouse")) {
				if(player.getInv().isRockStone()&&player.getInv().isWoodStone()&&player.getInv().isWaterStone()) {
					System.out.println("Congrulations.You won the game!!");
					break;
				}
			}
			if(!location.getLocation()) {
				System.out.println("Game over!");
				break;
			}
			
		}
	}

}
