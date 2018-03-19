package com.zhangyihao.designpattern.observer;

public class Client {

	public static void main(String[] args) {
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();
		
		ConcreteSubject subject = new ConcreteSubject();
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		
		subject.doSomething();
	}
}
