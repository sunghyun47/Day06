package com.google.restaurant;

import java.util.Scanner;

public class MenuController { //메뉴선택

	public void start() { 	// start 메서드 생성

		// 1.메뉴 등록

		MenuAdd menuAdd = new MenuAdd();
		// System.out.println("메뉴 등록");

		boolean check = true;
		Scanner sc = new Scanner(System.in);
		MenuView menuCount = new MenuView();

		Menu [] menus = menuAdd.add();
		int [] counts = new int[menus.length]; //몇개를 주문했는지 알수있는 배열

		while(check) {
			System.out.println("1. 음식 주문");
			System.out.println("2. 최종 결산");
			int select = sc.nextInt();

			if(select == 1) {
				while(check) {
					for(int i=0; i<menus.length; i++) {
						System.out.println(i+1 +". " + menus[i].name + " : " + menus[i].price);
					}
					System.out.println(menus.length+1 + ".주문하기");
					select = sc.nextInt();
					if(select<=menus.length) {
						System.out.println("수량 입력");
						counts[select-1] = sc.nextInt(); //0번 인덱스
					}
					else {
						//영수증 출력
						menuCount.orderView(menus, counts);
						break;
					}
				}

			}
			else {
				menuCount.count(menus); // 아랫줄 대신 씀
				// System.out.println("결산");
				//check = false, check =!check 이거들 써도 무방함
				break;
			}

		}






	}

}
