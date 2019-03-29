package com.zhangxixian.objectAdapter;
/**
 * @fun 使用传递对象的方法
 * @author ASUS
 *
 */
public class Test {

	public static void main(String[] args) {

		AdapterImpl adapter = new AdapterImpl(new Deer());
		adapter.move();
 	}

}
