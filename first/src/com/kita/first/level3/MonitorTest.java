package com.kita.first.level3;

public class MonitorTest {
	public static void main(String[] args) {
		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();

		m1.brand = "삼성";
		m1.inch = 30;
		m1.printInfo();
		
//		Monitor.brand = "LG";
		//static은 클래스로 접근, 인스턴스로 접근 X
		m2.inch = 35;
		m2.printInfo();
		m1.printInfo();
		
		
	}
	
	
}
