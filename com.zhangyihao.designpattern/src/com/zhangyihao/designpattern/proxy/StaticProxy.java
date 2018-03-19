package com.zhangyihao.designpattern.proxy;

public class StaticProxy implements Subject {

	private Subject subject = null;
	
	public StaticProxy(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void doSomething() {
		System.out.println("before do something.");
		this.subject.doSomething();
		System.out.println("before do something.");
	}
	
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		StaticProxy proxy = new StaticProxy(subject);
		proxy.doSomething();
	}

}
