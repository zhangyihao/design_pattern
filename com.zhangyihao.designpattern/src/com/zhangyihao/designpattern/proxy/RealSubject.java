package com.zhangyihao.designpattern.proxy;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println("real subject do somethings.");
	}

}
