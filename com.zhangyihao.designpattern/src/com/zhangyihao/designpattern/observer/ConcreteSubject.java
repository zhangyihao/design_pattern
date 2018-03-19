package com.zhangyihao.designpattern.observer;

public class ConcreteSubject extends Subject {

	public void doSomething() {
		System.out.println(" subject do something.");
		super.notifyObservers();
	}
	
}
