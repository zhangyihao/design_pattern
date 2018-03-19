package com.zhangyihao.designpattern.observer;

public class ConcreteObserver1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 update....");
	}

}
