package com.snakeladder;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome To Snake And Ladder Program");

		int position = 0;

		System.out.println("Single Player Starting Position :" + position);

		rolldice();
	}

	private static void rolldice() {			/* here im defining rolldice method to take random number from 1 to 6 */
		Random random = new Random();
		int dice = random.nextInt(6);
		dice = dice + 1;
		System.out.println("Dice Number :" + dice);

	}
}