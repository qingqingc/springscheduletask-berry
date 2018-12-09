package com.profile.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyLife implements InvocationHandler{
	private Life life;
	
	public DynamicProxyLife(Life life) {
		this.life = life;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before real life.");
		Object rlt = method.invoke(life, args);
		System.out.println("after real life.");
		return rlt;
	}

}
