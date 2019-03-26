package com.google.restaurant;

import java.util.Scanner;

public class FoodInput {

	public void makeFood() {
	Scanner sc = new Scanner(System.in);
	System.out.println("메뉴수 입력");
	int select = sc.nextInt();
	
	Food[] foods = new Food[select];
	
	for(int i=0; i<foods.length; i++) {
		Food food = new Food();
		
		System.out.println("1. 주문");
		System.out.println("2. 결산");
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
