package com.zhangxixian.objectAdapter;

public class AdapterImpl implements ITarget {

	private Deer Deer ;
	
	
	public AdapterImpl(com.zhangxixian.objectAdapter.Deer deer) {
		super();
		Deer = deer;
	}


	@Override
	public void move() {
			//一般情况下，只需要调用一个方法，就像电脑只有一个确定的电压
		Deer.fly();
		Deer.run();
		
	}

}
