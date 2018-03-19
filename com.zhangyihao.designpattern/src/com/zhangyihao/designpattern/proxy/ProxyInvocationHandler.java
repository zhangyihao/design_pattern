package com.zhangyihao.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {

	private Subject subject = null;

	public ProxyInvocationHandler(Subject subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before dynamic proxy");
		Object o = method.invoke(this.subject, args);
		System.out.println("after dynamic proxy");
		return o;
	}
}
