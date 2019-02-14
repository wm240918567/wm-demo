package com.wm.demo.proxy.interfaces.impl;

import com.wm.demo.proxy.interfaces.MyInterface;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void doSomeThing() {
		System.out.println("做了XXXXXX事");
	}

	@Override
	public void saySomeThing() {
		System.out.println("说了========话");
	}

	@Override
	public String eatSomeThing() {
		return "吃了好多东西";
	}

	@Override
	public String buy(String something) {
		return "买了"+something;
	}

}
