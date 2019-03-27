package com.google.restaurant;

import java.util.Scanner;

public class FoodMenu {

	public void start() {
		Scanner sc = new Scanner(System.in);
		
		FoodInput fi = new FoodInput();
		FoodView fv = new FoodView();
		boolean check = true;
		
		while(true) {
			System.out.println("1. 주문");
			System.out.println("2. 결산");
			int select =sc.nextInt();
			
			
		}
	}
}

