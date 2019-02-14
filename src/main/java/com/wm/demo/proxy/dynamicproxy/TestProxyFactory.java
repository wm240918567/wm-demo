package com.wm.demo.proxy.dynamicproxy;

import com.wm.demo.proxy.interfaces.MyInterface;
import com.wm.demo.proxy.interfaces.impl.MyInterfaceImpl;

public class TestProxyFactory {

	public static void main(String[] args) {
		ProxyFactory<MyInterface> pf = new ProxyFactory<MyInterface>(new MyInterfaceImpl());
		MyInterface proxyInstance = (MyInterface)pf.getProxyInstance();
		proxyInstance.doSomeThing();
		proxyInstance.saySomeThing();
		String eatSomeThing = proxyInstance.eatSomeThing();
		System.out.println(eatSomeThing);
		String buy = proxyInstance.buy("电脑");
		System.out.println(buy);
	}
}
