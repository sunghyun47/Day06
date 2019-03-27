package com.google.restaurant;

public class MenuView { //결산 출력

	public void orderView(Menu[] menus, int [] counts) { //영수증 출력, 제품명, 몇개샀냐
		
		int sum = 0;
		for(int i=0; i>counts.length; i++) {
			if(counts[i]>0) {
				System.out.println("구매내역");
				System.out.println("메뉴명 : " + menus[i].name);
				System.out.println("단가 : " + menus[i].price);
				System.out.println("구매수량 : " + counts[i]);
				System.out.println("합계 : " + menus[i].price*counts[i]);
				sum = sum + menus[i].price * counts[i];
				menus[i].count = menus[i].count+counts[i];
				System.out.println("==============================");
			}
		}
		System.out.println("총 합계 : " + sum );
		
		
		System.out.println("영수증 출력");
	}
	
	public void count(Menu [] menus) {
		int sum = 0;
		for(int i=0; i<menus.length; i++) {
			System.out.println("메뉴명 : " + menus[i].name);
			System.out.println("판매수 : " + menus[i].count);
			System.out.println("판매액 : " + menus[i].count*menus[i].price);
			sum = sum+menus[i].count * menus[i].price;
			System.out.println("==============================");
			
		}
		System.out.println("총 판매액 : " + sum);
	}
	
	
	
}
