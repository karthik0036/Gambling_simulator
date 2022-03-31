package com.bridge;

public class GamblingSImulator {
	private static final int Amt = 100;
	private static final int bet =1;
	public int stake =0;
	
	
	public void game() {
		double game = Math.floor(Math.random()*10)%2;
		
		if (bet == game ) {
			System.out.println("won 1 dollar");
			stake++;
		}
		else {
			System.out.println("lost 1 dollar");
			stake--;
		}
		System.out.println("stake :"+ stake);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gambler simulation");
		GamblingSImulator a = new GamblingSImulator();
		a.game();
	}
}
		
		
		
		
		
		

