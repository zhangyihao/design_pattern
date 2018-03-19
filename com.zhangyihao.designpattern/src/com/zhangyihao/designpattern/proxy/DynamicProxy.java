package com.zhangyihao.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {

	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
		System.out.println("Dynamic proxy before.");
		return (T)Proxy.newProxyInstance(loader, interfaces, h);
	}
}
