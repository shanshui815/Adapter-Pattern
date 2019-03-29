package com.zhangxixian.classAdapter;
/**
 * 这是一种亡羊补牢的模式，已存在Deer类和Target,但是两者不匹配而且不可以修改，怎么办
 * 
 * @fun 使用继承来实现适配器模式，耦合度高 
 * @author Zhangxixian
 * @Date 19/3/29
 *
 */
public class Test {

	public static void main(String[] args) {
		//环境：游戏中的坐骑——五彩神鹿；第一世界它的行走方式为奔跑，第二世界它的行走方式为飞！
		FlyAdapterImpl fly = new FlyAdapterImpl();
		fly.move();
		RunAdapterImpl run = new RunAdapterImpl();
		run.move();
		
	}

}
