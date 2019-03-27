package com.google.restaurant;

import java.util.Scanner;

public class FoodInput {

	public Food [] makeFood() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴의 개수를 입력하세요.");
		int num = sc.nextInt();
		
		Food [] foods = new Food[num];
		for(int i =0; i<foods.length;i++) {
			Food food = new Food();
			
			System.out.println("이름 입력");
			food.menu = sc.next();
			
			System.out.println("가격 입력");
			food.price = sc.nextInt();
			
			System.out.println("재고 입력");
			food.total= sc.nextInt();
			
			foods[i]=food;			
		}
		
		return foods;









	}

}
