package com.zhangyihao.designpattern.proxy;

public class DynamicProxyTest {
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		ProxyInvocationHandler handler = new ProxyInvocationHandler(subject);

//		Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
//				subject.getClass().getInterfaces(), handler);
		
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);

		proxy.doSomething();
	}
	
}
