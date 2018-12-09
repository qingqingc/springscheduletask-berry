package com.profile.designpattern.dynamicproxy;

import java.lang.reflect.Proxy;

public class ClientTest {

	public static void main(String[] args) {
		Life w = new WriterLife();
		Life d = new DevelopLife();
		DynamicProxyLife proxyW = new DynamicProxyLife(w);
		DynamicProxyLife proxyD = new DynamicProxyLife(d);
		
		Life lw = (Life)Proxy.newProxyInstance(proxyW.getClass().getClassLoader(), new Class[] {Life.class}, proxyW);
		Life ld = (Life)Proxy.newProxyInstance(proxyD.getClass().getClassLoader(), new Class[] {Life.class}, proxyD);
		System.out.println(lw.live());
		System.out.print(ld.live());
	}

}
