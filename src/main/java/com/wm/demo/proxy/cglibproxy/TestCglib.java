package com.wm.demo.proxy.cglibproxy;

public class TestCglib {

	public static void main(String[] args) {
		MyClass m = CglibProxyFactory.instance(new MyClass()).getProxy();
		m.doSomeThing("打篮球");
	}
}
