package com.wm.demo.proxy.staticproxy;

import com.wm.demo.proxy.interfaces.MyInterface;
import com.wm.demo.proxy.interfaces.impl.MyInterfaceImpl;

public class TestStaticProxy {

	public static void main(String[] args) {
		MyInterface mi = Proxy.instance(new MyInterfaceImpl());
		mi.doSomeThing();
		mi.saySomeThing();
		String eatSomeThing = mi.eatSomeThing();
		System.out.println(eatSomeThing);
		String buy = mi.buy("球鞋");
		System.out.println(buy);
	}
}
