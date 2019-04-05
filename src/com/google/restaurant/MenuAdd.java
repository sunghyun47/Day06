package com.google.restaurant;

import java.util.Scanner;

public class MenuAdd { //음식등록

	public Menu [] add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 갯수 입력");
		int count = sc.nextInt();
		Menu[] menus = new Menu[count]; //menu를 담을수 있는 메뉴판
		
		for(int i=0; i<menus.length; i++) {	//숫자 만큼 입력
			Menu menu = new Menu();
			
			System.out.println("음식명 입력");
			menu.name = sc.next();
			
			System.out.println("가격 입력");
			menu.price = sc.nextInt();
			
			System.out.println("재고 입력");
			menu.amount = sc.nextInt();
			
			menus[i] = menu;//menu 배열에 한칸씩 넣어야됨

			
		}
		
		return menus;
	}
	
	
}
