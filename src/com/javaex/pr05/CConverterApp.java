package com.javaex.pr05;

import java.util.Scanner;

public class CConverterApp {

	public static void main(String[] args) {
		// 원하는 값 받아서 환전하기
		/*
		1. 원하는 값을 받는다.
		2. 정해진 값이 아닐 경우 문구를 출력하고 다시 입력하게 한다.
		3. 2를 메소드를 불러서 돌린다.
		*/
		
		double won, dollar;
		
		CConverter converter=new CConverter();
		converter.setRate(1118.70); //고정 환율 대입
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("1.달러 환전 | 2.원화 환전 | 3.종료\n선택>");
			int num=sc.nextInt();
			
			if(num==1) {
				System.out.print("원화: ");
				won=sc.nextDouble();
				converter.toDollar(won);
				
			}else if(num==2){
				System.out.print("달러: ");
				dollar=sc.nextDouble();
				converter.toWon(dollar);
				
			}else if(num<0||num>3) {
				System.out.println("올바른 숫자를 입력해주세요.");
				
			}else {
				System.out.println("종료");
				break;
			}
		}
		
	
		
		sc.close();

	}

}
