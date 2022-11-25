package com.snakeladder;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome To Snake And Ladder Program");

		int position = 0;
		int dice = 0;
		System.out.println("Single Player Starting Position :" + position);

		dice = rolldice();
		mapTo(dice,position);
	}

	private static int rolldice() { 		// here im defining rolldice method
		Random random = new Random(); 		// to take random number from 1 to 6
		int dice = random.nextInt(6);
		dice = dice + 1;
		System.out.println("Dice Number :" + dice);
		return dice;
	}
	
	private static void mapTo(int dice, int position) {
		Random random = new Random();
		int map = random.nextInt(2);
		map = map + 1;
		System.out.println("Mapping Method:" + map);

		switch (map) {
			case 1:
				System.out.println("No Play You are in the same position");
				break;
			case 2:
				position = position + dice;
				System.out.println("Your position after Ladder is : " + position);
				break;
			case 3:
				position = position - dice;
				System.out.println("Your position after Ladder is : " + position);
				break;
			}
		}
}