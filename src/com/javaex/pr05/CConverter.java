package com.javaex.pr05;

public class CConverter {
	
	public static double rate;
	
	public void setRate(double rate) {
		CConverter.rate=rate; //전역변수에 값대입
	}
	
	//달러환전
	/*
	public double toDollar(double won) {
		return won / rate; 
	}
	*/
	public void toDollar(double won) {
		if(won>0) {
			System.out.println(won/rate+"달러");
		}else {
			System.out.println("올바른 액수를 입력하세요.");
		}
	}
	
	//원화환전
	/*
	public double toWon(double dollar) {
		return dollar * rate; 
	}
	*/
	public void toWon(double dollar) {
		if(dollar>0) {
			System.out.println(dollar*rate+"원");
		}else {
			System.out.println("올바른 액수를 입력하세요.");
		}
	}

	
}
