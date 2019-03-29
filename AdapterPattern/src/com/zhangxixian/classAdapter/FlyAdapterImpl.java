package com.zhangxixian.classAdapter;

public class FlyAdapterImpl extends Deer implements ITarget {

	@Override
	public void move() {
		//调用Deer方法
		fly();
	}
	
}
