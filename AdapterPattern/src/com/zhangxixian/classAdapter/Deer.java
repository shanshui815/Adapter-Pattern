package com.zhangxixian.classAdapter;

public class Deer {
	/*
	 * 实际情况 Deer类里应该只有move方法，就比如插头和插座，一个插头只对应一个电压，
	 * Deer写完后为满足开闭原则，就不应该进行修改
	 * 这里有两个功能，就对应两个适配器
	 */
	private void move() {
		System.out.println("");
	}
	
	protected void run() {
		System.out.println("I am running~");
	}
	protected void fly() {
		System.out.println("I am flying~");
	}
}
