package com.bridge;

public class GamblingSImulator {
	private  int Amt = 100;
	private  int bet = 1;
	public int stake = 0;

	public void game() {
		while (Amt > 50 && Amt < 150) {
			double game = Math.floor(Math.random() * 10) % 2;

			if (bet == game) {
				System.out.println("won 1 dollar");
				Amt++;
			} else {
				System.out.println("lost 1 dollar");
				Amt--;
			}

		}
			System.out.println("Amount :" + Amt);
			
			if(Amt == 50) {
				System.out.println("player lost and resigned");
			}
			else {
				System.out.println("player won and resigned");
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gambler simulation");
		GamblingSImulator a = new GamblingSImulator();
		a.game();
	}

}
