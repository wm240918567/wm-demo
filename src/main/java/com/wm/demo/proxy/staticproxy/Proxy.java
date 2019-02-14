package com.wm.demo.proxy.staticproxy;

import com.wm.demo.proxy.interfaces.MyInterface;

/**
 * 静态代理
 * 代理优点：再不更改原方法的情况下，对功能进行扩展。
 * 静态代理缺点：随着接口功能的增加，代理类也需要维护。
 * @ClassName: com.wm.demo.proxy.staticproxy.Proxy
 * @author: wm
 * @date: 2019年2月12日 上午9:09:48
 * @version : 1.0
 */
public class Proxy implements MyInterface {

	private MyInterface myInterface;
	
	private Proxy(MyInterface myInterface) {
		this.myInterface = myInterface;
	}

	public static Proxy instance(MyInterface myInterface) {
		return new Proxy(myInterface);
	}
	
	@Override
	public void doSomeThing() {
		System.out.println("====proxy代理doSomeThing前");
		myInterface.doSomeThing();
	}

	@Override
	public void saySomeThing() {
		System.out.println("proxy代理saySomeThing前====");
		myInterface.doSomeThing();
	}

	@Override
	public String eatSomeThing() {
		System.out.println("proxy代理：吃饭前洗手");
		return myInterface.eatSomeThing();
	}

	@Override
	public String buy(String something) {
		System.out.println("proxy代理：先挣钱");
		return myInterface.buy(something);
	}

}
